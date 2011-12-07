/******************************************************************************
 * Copyright (C) 2010-2011 Lastrix                                            *
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

package org.lastrix.asn1s.schema;

import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Real extends ASN1Type {

	public static final String NAME         = "REAL";
	public final static byte   TAG          = 0x09;
	private final       byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 1).tagToByteArray();

	private static final int  REAL_BASE_MASK                  = 0x30;
	private static final int  REAL_BASE_8                     = 0x10;
	private static final int  REAL_BASE_16                    = 0x20;
	private static final int  REAL_BASE_2                     = 0;
	private static final int  SPECIAL_REAL_VALUE              = 0x40;
	private static final int  SPECIAL_REAL_VALUE_NEGATIVE_INF = 0x41;
	private static final int  SPECIAL_REAL_VALUE_POSITIVE_INF = 0x40;
	private static final int  SCALE_MASK                      = 0x0C;
	private static final int  EXPONENT_TYPE                   = 0x3;
	private static final int  EXPONENT_MASK                   = 0x7FF;
	private static final long MANTIS_MASK                     = 0xFFFFFFFFFFFFFL;
	private static final int  REAL_BINARY_MASK                = 0x80;
	private static final int  BASE_2                          = 2;
	private static final int  BASE_8                          = 8;
	private static final int  BASE_16                         = 16;
	private static final int  REAL_SIGN_MASK                  = 0x40;
	private static final int  DOUBLE_EXPONENT_POSITION        = 52;
	private static final long DOUBLE_SIGN_MASK                = 0x8000000000000000L;

	public ASN1Real(final Class clazz) {
		if (clazz != Double.class && clazz != Float.class) {
			throw new UnsupportedOperationException("Only Double and Float supported.");
		}
		handledClass = clazz;
		this.name = NAME;
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
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {

		final double value = numberToDouble(o);

		if (header) {
			//write the header
			os.write(HEADER_BYTES);
			if (value == 0d) {
				//write length
				os.write(0x00);
				//it's all we need to do here
				return;
			} else if (Double.isInfinite(value)) {
				//write length
				os.write(0x01);
				//write info octet
				os.write(((value < 0) ? SPECIAL_REAL_VALUE_NEGATIVE_INF : SPECIAL_REAL_VALUE_POSITIVE_INF));
				return;
			}
		}

		if (Double.isInfinite(value)) {
			//write info octet
			os.write(((value < 0) ? SPECIAL_REAL_VALUE_NEGATIVE_INF : SPECIAL_REAL_VALUE_POSITIVE_INF));
			return;
		} else {

			// we don't need to make anything else
			long valueBits = Double.doubleToLongBits(value);

			//extract exponent
			long exponent = (valueBits >> DOUBLE_EXPONENT_POSITION) & EXPONENT_MASK;
			final int exponentBytesCount = Utils.getMinimumBytes(exponent);

			//extract mantis
			long mantis = valueBits & MANTIS_MASK;
			//to determine how much bytes we need, just shift to end and reverse bytes order, that's all!
			final int mantisBytesCount = Utils.getMinimumBytes(Long.reverseBytes(mantis << 12));

			//now we got all required information
			final byte[] exponentBytes = Utils.extractBytes(exponent, 0, exponentBytesCount);
			final byte[] mantisBytes = Utils.extractBytes(mantis, 7, 7 - mantisBytesCount);

			//write length octet
			os.write(mantisBytesCount + exponentBytesCount + 1);

			//write info octet (we could only have here 1 or 2 exponent octets)
			os.write(REAL_BINARY_MASK | ((exponentBytesCount == 1) ? 0x00 : 0x01) | ((int) (valueBits >> 57) & REAL_SIGN_MASK));
			os.write(exponentBytes);
			os.write(mantisBytes);
		}
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
		// TODO: unimplemented method stub

	}


	/**
	 * Convert Float or Double to double
	 *
	 * @param o - Float or Double value
	 *
	 * @return double value
	 */
	private static double numberToDouble(final Object o) {
		if (o == null) {
			throw new NullPointerException();
		}
		//noinspection ChainOfInstanceofChecks
		if (o instanceof Double) {
			return (Double) o;
		} else if (o instanceof Float) {
			return (Float) o;
		}
		throw new IllegalArgumentException(String.format("Object 'o' should be 'Float' or 'Double', has '%s'.", o.getClass().getSimpleName()));
	}
}
