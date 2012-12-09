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
import java.util.Set;

/**
 * Class for handling set tag.
 * Problem is free order of component appearance.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Set extends ASN1Container {
	public final static ASN1Tag TAG    = new ASN1Tag(17, TagClass.UNIVERSAL, true);
	private final       Logger  logger = Logger.getLogger(ASN1Set.class);

	public ASN1Set(final ASN1ComponentType[] componentType, final boolean of) {
		super(componentType, of, "SET@" + TAG.getTag(), TAG);
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

		if (of && !(value instanceof Set)) {
			throw new IllegalArgumentException("ASN1SetOf does not allow any objects if it not implement java.util.Set.");
		}

		final int length = ASN1Length.readLength(asn1is);
		cleanState();
		if (length == -1) {
			if (of) {
				value = readSetOfIndefinite(asn1is, (Set) value);
			} else {
				value = readSetIndefinite(asn1is, value);
			}
		} else {
			if (of) {
				value = readSetOfDefinite(asn1is, (Set) value, length);
			} else {
				value = readSetDefinite(asn1is, value, length);
			}
		}
		if (!of) {
			checkRead();
		}
		return value;
	}


	@Override
	public void toASN1(final PrintWriter printWriter, final boolean typeAssignment) {
		printWriter.append("SET ");
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
			return "SET OF " + componentType[0].getName();
		}
		return "SET " + Arrays.toString(componentType);
	}


	@Override
	public void write(Object value, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		if (header) {
			//write header
			os.write(TAG.asBytes());
			os.write(ASN1Length.asBytes(ASN1Length.FORM_INDEFINITE));
		}

		if (of) {
			// SET OF
			final Set set = (Set) value;
			for (Object lo : set) {
				componentType[0].write(lo, os, true);
			}
		} else {
			// SET
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

	private Object readSetDefinite(final ASN1InputStream asn1is, final Object value, final int length) throws ASN1Exception, IOException {
		final int currentPosition = asn1is.getBytesRead();
		ASN1Tag tag = null;
		ASN1ComponentType type;
		while (true) {
			if (tag == null) {
				tag = ASN1Tag.readTag(asn1is);
			}
			type = getTypeByTag(tag);
			if (type == null) {
				throw new ASN1ProtocolException("Unknown tag found: " + tag.toString());
			}
			if (isRead(type)) {
				throw new ASN1ProtocolException(String.format("Field %s already read.", type.toString()));
			}
			try {
				setField(value, type, type.read(null, asn1is, null, true));
			} catch (ASN1OptionalComponentSkippedException e) {
				continue;
			}
			tag = null;
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

	private Object readSetIndefinite(final ASN1InputStream asn1is, final Object value) throws ASN1Exception, IOException {
		ASN1Tag tag = null;
		ASN1ComponentType type;
		while (true) {
			if (tag == null) {
				tag = ASN1Tag.readTag(asn1is);
				if (tag.isEOC()) {
					break;
				}
			}
			type = getTypeByTag(tag);
			if (type == null) {
				throw new ASN1ProtocolException("Unknown tag found: " + tag.toString());
			}
			if (isRead(type)) {
				throw new ASN1ProtocolException(String.format("Field %s already read.", type.toString()));
			}
			try {
				setField(value, type, type.read(null, asn1is, tag, false));
			} catch (ASN1OptionalComponentSkippedException e) {
				continue;
			}
			tag = null;
		}
		indefiniteCheck(tag, asn1is);
		return value;
	}

	private Object readSetOfDefinite(final ASN1InputStream asn1is, final Set value, final int length) throws ASN1Exception, IOException {
		final int currentPosition = asn1is.getBytesRead();
		while (length - (asn1is.getBytesRead() - currentPosition) > 0) {
			value.add(componentType[0].read(null, asn1is, null, true));
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

	private Object readSetOfIndefinite(final ASN1InputStream asn1is, final Set value) throws ASN1Exception, IOException {
		ASN1Tag tag = ASN1Tag.readTag(asn1is);
		while (!tag.isEOC()) {
			value.add(componentType[0].read(null, asn1is, tag, true));
			tag = ASN1Tag.readTag(asn1is);
		}
		indefiniteCheck(tag, asn1is);
		return value;
	}
}