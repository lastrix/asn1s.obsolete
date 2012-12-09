/******************************************************************************
 * Copyright (C) 2010-2012 Lastrix                                            *
 * This file is part of ASN1S.                                                *
 *                                                                            *
 * ASN1S is free software: you can redistribute it and/or modify              *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation, either version 2 of the License, or          *
 * (at your option) any later version.                                        *
 *                                                                            *
 * ASN1S is distributed in the hope that it will be useful,                   *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the               *
 * GNU General Public License for more details.                               *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with ASN1S. If not, see <http://www.gnu.org/licenses/>.              *
 ******************************************************************************/

package org.lastrix.asn1s.schema.type.x690;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.*;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1ComponentType;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Class to handle sequences and sequences of values.
 * This class uses definite length form (buffers elements before writing them into output stream)
 * It supposed to write in indefinite form ALWAYS.
 * TODO: definite/indefinite length forms on user request.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Sequence extends ASN1Container {
	public final static ASN1Tag TAG    = new ASN1Tag(16, TagClass.UNIVERSAL, true);
	private final       Logger  logger = Logger.getLogger(ASN1Sequence.class);

	public ASN1Sequence(
	                   final ASN1ComponentType[] componentType,
	                   final boolean of
	                   ) {
		super(componentType, of, "SEQUENCE@" + TAG.getTag(), TAG);
		valid();
	}


	@Override
	public Object read(Object value, final ASN1InputStream asn1is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null) {
			throw new ASN1EmptyContainerException();
		}
		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(asn1is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		if (of && !(value instanceof List)) {
			throw new IllegalArgumentException("ASN1SequenceOf does not allow any objects if it not implement java.util.List.");
		}

		final int length = ASN1Length.readLength(asn1is);
		cleanState();
		if (length == -1) {
			if (of) {
				value = readSequenceOfIndefinite(asn1is, (List) value);
			} else {
				value = readSequenceIndefinite(asn1is, value);
			}
		} else {
			if (of) {
				value = readSequenceOfDefinite(asn1is, (List) value, length);
			} else {
				value = readSequenceDefinite(asn1is, value, length);
			}
		}
		if (!of) {
			checkRead();
		}
		return value;
	}


	@Override
	public void toASN1(final PrintWriter printWriter, final boolean typeAssignment) {
		printWriter.append("SEQUENCE ");
		//FIXME: how the hell you gonna support constraint???
		if (of) {
			printWriter.append("OF ");
			printWriter.append(componentType[0].getName());
			printWriter.append(";");
		} else {
			printWriter.append("{\n");
			for (int i = 0; i < componentType.length; i++) {
				printWriter.append("      ");
				componentType[i].toASN1(printWriter, false);
				if (i + 1 < componentType.length) {
					printWriter.append(",");
				}
				printWriter.append("\n");
			}
			printWriter.append("}");
		}
	}


	@Override
	public String toString() {
		if (of) {
			return "SEQUENCE OF " + componentType[0];
		}
		return "SEQUENCE " + Arrays.toString(componentType);
	}


	@Override
	public void write(final Object value, final OutputStream os, boolean header) throws IOException, ASN1Exception {
		if (header) {
			//write header
			os.write(TAG.asBytes());
			os.write(ASN1Length.asBytes(ASN1Length.FORM_INDEFINITE));
		}

		if (of) {
			// SEQUENCE OF
			final List list = (List) value;
			for (Object lo : list) {
				componentType[0].write(lo, os, true);
			}
		} else {
			// SEQUENCE
			for (ASN1ComponentType t : componentType) {
				final Object o = getField(value, t);
				if (o != null || !t.isOptional()) {
					t.write(o, os, true);
				}
			}
		}
		if (header) {
			os.write(0x00);
			os.write(0x00);
		}
	}

	private Object readSequenceDefinite(final ASN1InputStream asn1is, final Object value, final int length) throws IOException, ASN1Exception {
		final int currentPosition = asn1is.getBytesRead();
		for (ASN1ComponentType type : componentType) {
			try {
				setField(value, type, type.read(null, asn1is, null, true));
			} catch (ASN1OptionalComponentSkippedException e) {
				continue;
			}
			if (length - (asn1is.getBytesRead() - currentPosition) <= 0) {
				break;
			}
		}
		if (length - (asn1is.getBytesRead() - currentPosition) != 0) {
			throw new ASN1ProtocolException(
			                               String.format(
			                                            "Data corruption possible. Expected to read %d, actually read: %d.", length,
			                                            asn1is.getBytesRead() - currentPosition
			                                            )
			);
		}
		return value;
	}

	private Object readSequenceIndefinite(final ASN1InputStream asn1is, final Object value) throws ASN1Exception, IOException {
		ASN1Tag tag = null;
		for (ASN1ComponentType type : componentType) {
			if (tag == null) {
				tag = ASN1Tag.readTag(asn1is);
				if (tag.isEOC()) {
					break;
				}
			}
			try {
				setField(value, type, type.read(null, asn1is, tag, true));
			} catch (ASN1OptionalComponentSkippedException e) {
				//type asn1is told that we can not read such component but it is optional, so simply skip it
				continue;
			}
			tag = null;
		}
		indefiniteCheck(tag, asn1is);
		return value;
	}

	private Object readSequenceOfDefinite(final ASN1InputStream asn1is, final List value, final int length) throws IOException, ASN1Exception {
		final int currentPosition = asn1is.getBytesRead();
		while (length - (asn1is.getBytesRead() - currentPosition) > 0) {
			value.add(componentType[0].read(asn1is));
		}
		if (length - (asn1is.getBytesRead() - currentPosition) != 0) {
			throw new ASN1ProtocolException(
			                               String.format(
			                                            "Data corruption possible. Expected to read %d, actually read: %d.", length,
			                                            asn1is.getBytesRead() - currentPosition
			                                            )
			);
		}
		return value;
	}

	private Object readSequenceOfIndefinite(final ASN1InputStream asn1is, final List value) throws IOException, ASN1Exception {
		ASN1Tag tag = ASN1Tag.readTag(asn1is);
		while (!tag.isEOC()) {
			value.add(componentType[0].read(null, asn1is, tag, true));
			tag = ASN1Tag.readTag(asn1is);
		}
		indefiniteCheck(tag, asn1is);
		return value;
	}
}