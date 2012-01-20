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
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectHeaderException;
import org.lastrix.asn1s.exception.ASN1OptionalComponentSkippedException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UnresolvedType;
import org.lastrix.asn1s.util.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to handle sequences and sequences of values.
 * This class uses definite length form (buffers elements before writing them into output stream)
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Sequence extends ASN1Type {
	private final Logger logger = Logger.getLogger(ASN1Sequence.class);

	private final ASN1Type[] componentType;
	private final static byte TAG = 16;
	private final boolean sequenceOf;
	/**
	 * Construct this thing so we could use it later.
	 */
	private final static byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, true, Tag.FORM_INDEFINITE).tagToByteArray();

	public ASN1Sequence(final ASN1Type[] componentType, final boolean sequenceOf) {
		this.componentType = componentType;
		this.name = generateName();
		this.sequenceOf = sequenceOf;
		this.headerBytes = HEADER_BYTES;
	}

	private String generateName() {
		if (componentType.length == 1) {
			return "SEQUENCE OF " + componentType[0].getName();
		}
		//TODO: make complete thing here
		return "SEQUENCE";
	}


	@Override
	public String toString() {
		if (componentType.length == 1) {
			return "SEQUENCE OF " + componentType[0];
		}
		return "SEQUENCE OF " + Arrays.toString(componentType);
	}

	@Override
	public void write(final Object o, final OutputStream os, boolean header) throws IOException, ASN1Exception {

		if (header) {
			//write header
			os.write(HEADER_BYTES);
		}

		ByteArrayOutputStream bos = new ByteArrayOutputStream(128);
		if (sequenceOf) {
			// SEQUENCE OF
			final List list = (List) o;
			for (Object lo : list) {
				componentType[0].write(lo, bos, true);
			}
		} else {
			// SEQUENCE
			for (ASN1Type t : componentType) {
				t.write(o, bos, true);
			}
		}
		final byte[] data = bos.toByteArray();

		//store size
		if (header) {
			Header.writeLength(os, data.length);
		}

		//and now we can save our data.
		os.write(data);
	}

	@Override
	public Object read(Object o, final InputStream is, Header header, final boolean forceHeaderChecking) throws IOException, ASN1Exception {
		if (header == null) {
			header = Header.readHeader(is, TAG, isConstructed(), Tag.CLASS_UNIVERSAL);
		} else if (forceHeaderChecking) {
			if (header.getTag() != TAG || header.getTagClass() != Tag.CLASS_UNIVERSAL || header.isConstructed() != isConstructed()) {
				throw new ASN1IncorrectHeaderException();
			}
		}

		if (sequenceOf) {
			final List list;
			if (o instanceof List) {
				list = (List) o;
			} else if (o == null) {
				list = new ArrayList();
			} else {
				throw new IllegalArgumentException("ASN1SequenceOf does not allow any objects if it not implement java.util.List.");
			}

			//read all data
			if (header.getLength() == Tag.FORM_INDEFINITE) {
				throw new ASN1ProtocolException("SequenceOf doesn't support indefinite form");
			}
			final ByteArrayOutputStream bos = new ByteArrayOutputStream(header.getLength());
			Utils.transfer(is, bos, header.getLength());
			final byte[] data = bos.toByteArray();
			final ByteArrayInputStream bis = new ByteArrayInputStream(data);
			while (bis.available() > 0) {
				list.add(componentType[0].read(bis));
			}
			return list;
		} else {
			if (o == null) {
				throw new NullPointerException();
			}
			//read first header, so we won't sent null
			Header h = null;
			for (ASN1Type t : componentType) {
				// read header, if it is null for any reason
				if (h == null) {
					h = Header.readHeader(is);
				}
				//now try to load field value into our o.
				try {
					t.read(o, is, h, true);
				} catch (ASN1OptionalComponentSkippedException e) {
					//type reader told that we can not read such component but it is optional, so simply skip it
					continue;
				}
				//set it to null, so next iteration would reread it.
				h = null;
			}

			//check for indefinite form.
			if (header.getLength() == Tag.FORM_INDEFINITE) {
				h = Header.readHeader(is);
				if (!h.isEOC()) {
					throw new ASN1ProtocolException("Indefinite encoding without EOC marker at end");
				}
			}
			return o;
		}
	}

	@Override
	public boolean isConstructed() {
		return true;
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		for (int i = 0; i < componentType.length; i++) {
			if (componentType[i] instanceof ASN1UnresolvedType) {
				componentType[i] = module.getType(componentType[i].getName(), ((ASN1UnresolvedType) componentType[i]).getModuleName());
			} else {
				componentType[i].validate(module);
			}
		}
	}
}
