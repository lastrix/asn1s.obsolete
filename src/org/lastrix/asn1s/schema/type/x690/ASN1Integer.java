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
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Integer extends ASN1Type {

	private final static Logger logger = Logger.getLogger(ASN1Integer.class);

	public static final String NAME         = "INTEGER";
	public final static byte   TAG          = 0x02;
	private final       byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 1).tagToByteArray();

	public ASN1Integer() {
		handledClass = Integer.class;
		this.name = NAME;
		this.headerBytes = HEADER_BYTES;
	}

	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException {
		final long value = numberToLong(o);

		int size = Utils.getMinimumBytes((value < 0) ? -value : value);

		//if highest bit of highest byte is 1 then we should increase size to add
		// trailing zero
		if (value > 0 && ((value >> ((size - 1) * 8 + 7)) & 0x01) > 0) {
			size++;
		}

		if (header) {
			//write header
			os.write(HEADER_BYTES);
			//write length
			Header.writeLength(os, size);
		}
		//write integer data
		os.write(Utils.extractBytes(value, 0, size));
	}

	@Override
	public Object read(final Object o, final InputStream is, Header header, final boolean forceHeaderChecking) throws IOException, ASN1Exception {
		//read header if it is null
		if (header == null) {
			header = Header.readHeader(is, TAG, isConstructed(), Tag.CLASS_UNIVERSAL);
		} else if (forceHeaderChecking) {
			if (header.getTag() != TAG || header.getTagClass() != Tag.CLASS_UNIVERSAL || header.isConstructed() != isConstructed()) {
				throw new ASN1IncorrectHeaderException();
			}
		}

		if (o != null) {
			throw new IllegalArgumentException("ASN1Integer does not allow non null parameter 'o'");
		}

		long value = 0;
		//extract sign
		int temp = is.read();
		if ((temp & Utils.BYTE_SIGN_MASK) != 0) {
			//set value to all ones, so we get an negative value
			value = Long.MIN_VALUE | Long.MAX_VALUE;
		}
		// now we could extract all other octets
		value = (value << 8) | ((long) temp & Utils.BYTE_MASK);

		if (header.getLength() > 1) {
			// read the entire chunk of data
			final byte[] data = new byte[header.getLength() - 1];
			if (is.read(data) != header.getLength() - 1) {
				throw new ASN1ReadException("Can not read all required bytes");
			}
			// now convert it to valid form
			for (int i = 0; i < data.length; i++) {
				value = (value << 8) | (((long) data[i]) & Utils.BYTE_MASK);
			}
		}
		return value;
	}

	/**
	 * Converts Byte, Short, Integer or Long to long
	 *
	 * @param o - the number object
	 *
	 * @return long
	 */
	private static long numberToLong(final Object o) {
		if (o == null) {
			throw new NullPointerException();
		}
		//noinspection ChainOfInstanceofChecks
		if (o instanceof Byte) {
			return (Byte) o;
		} else if (o instanceof Short) {
			return (Short) o;
		} else if (o instanceof Integer) {
			return (Integer) o;
		} else if (o instanceof Long) {
			return (Long) o;
		}
		throw new IllegalArgumentException(
		                                  String.format(
		                                               "Object 'o' should be 'Byte', 'Short', 'Integer' or 'Long', has '%s'.",
		                                               o.getClass().getSimpleName()
		                                               )
		);
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public boolean isConstructed() {
		return false;
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
	}
}
