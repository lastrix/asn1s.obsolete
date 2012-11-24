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
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Integer extends ASN1Type implements ASN1X690Type {

	private final static Logger logger = Logger.getLogger(ASN1Integer.class);

	public static final  String  NAME = "INTEGER";
	private final static ASN1Tag TAG  = new ASN1Tag(0x02, TagClass.UNIVERSAL, false);

	public ASN1Integer(Class<? extends Number> _class) {
		if (_class != Byte.class && _class != Short.class && _class != Integer.class && _class != Long.class) {
			throw new IllegalArgumentException("Only 'Byte', 'Short', 'Integer' and 'Long' allowed.");
		}
		handledClass = _class;
		if (_class == Long.class) {
			this.name = NAME;
		} else {
			this.name = NAME + "-" + _class.getSimpleName();
		}
		this.tag = TAG;
		this.typeId = getName();
		valid();
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
			os.write(TAG.asBytes());
			//write length
			os.write(ASN1Length.asBytes(size));
		}
		//write integer data
		os.write(Utils.extractBytes(value, 0, size));
	}

	@Override
	public Object read(final Object nullValue, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1Integer does not allow non null parameter 'nullValue'");
		}

		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(is);

		long value = 0;
		//extract sign
		int temp = is.read();
		if ((temp & Utils.BYTE_SIGN_MASK) != 0) {
			//set value to all ones, so we get an negative value
			value = Long.MIN_VALUE | Long.MAX_VALUE;
		}
		// now we could extract all other octets
		value = (value << 8) | ((long) temp & Utils.BYTE_MASK);

		if (length > 1) {
			// read the entire chunk of data
			final byte[] data = new byte[length - 1];
			if (is.read(data) != length - 1) {
				throw new ASN1ReadException("Can not read all required bytes");
			}
			// now convert it to valid form
			for (int i = 0; i < data.length; i++) {
				value = (value << 8) | (((long) data[i]) & Utils.BYTE_MASK);
			}
		}
		return handledClass.cast(value);
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
}
