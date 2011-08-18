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

package org.lastrix.asn1s.protocol;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.util.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * See X.690-0207 8.5 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public final class ASN1RealCoder implements PrimitiveEncoder, PrimitiveDecoder {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1RealCoder.class);

	public static final  byte   TAG                             = 0x09;
	private static final Header HEADER                          = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 10);
	private static final int    REAL_BASE_MASK                  = 0x30;
	private static final int    REAL_BASE_8                     = 0x10;
	private static final int    REAL_BASE_16                    = 0x20;
	private static final int    REAL_BASE_2                     = 0;
	private static final int    SPECIAL_REAL_VALUE              = 0x40;
	private static final int    SPECIAL_REAL_VALUE_NEGATIVE_INF = 0x41;
	private static final int    SPECIAL_REAL_VALUE_POSITIVE_INF = 0x40;
	private static final int    SCALE_MASK                      = 0x0C;
	private static final int    EXPONENT_TYPE                   = 0x3;
	private static final int    EXPONENT_MASK                   = 0x7FF;
	private static final long   MANTIS_MASK                     = 0xFFFFFFFFFFFFFL;
	private static final int    REAL_BINARY_MASK                = 0x80;
	private static final int    BASE_2                          = 2;
	private static final int    BASE_8                          = 8;
	private static final int    BASE_16                         = 16;
	private static final int    REAL_SIGN_MASK                  = 0x40;
	private static final int    DOUBLE_EXPONENT_POSITION        = 52;
	private static final long   DOUBLE_SIGN_MASK                = 0x8000000000000000L;

	public ASN1RealCoder() {}

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

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {

		//test for zero value
		if (header.getLength() == 0) {
			return 0d;
		}

		final int info = is.read();
		long mantisLength = header.getLength() - 1;

		//bad news
		final long base;
		//binary base
		if ((info & REAL_BINARY_MASK) > 0) {
			if ((info & REAL_BASE_MASK) == REAL_BASE_2) {
				base = BASE_2;
			} else if ((info & REAL_BASE_MASK) == REAL_BASE_8) {
				base = BASE_8;
			} else if ((info & REAL_BASE_MASK) == REAL_BASE_16) {
				base = BASE_16;
			} else {
				//this should not happen
				throw new ASN1ProtocolException("Invalid value for binary base (11)");
			}
		} else {
			//decimal or something special
			if ((info & SPECIAL_REAL_VALUE) > 0) {
				if (header.getLength() > 1) {
					throw new ASN1ProtocolException("'SpecialRealValues' section, but length is not '1' ( has '" + header.getLength() + "').");
				}
				if (info == SPECIAL_REAL_VALUE) { return Double.POSITIVE_INFINITY; } else if (info == SPECIAL_REAL_VALUE_NEGATIVE_INF) {
					return Double.NEGATIVE_INFINITY;
				} else {
					throw new ASN1ProtocolException("Invalid real format for -inf/+inf");
				}
			} else {
				//TODO: check this, code is copy-pasted.
				ByteArrayOutputStream bos = new ByteArrayOutputStream((int) mantisLength);

				Utils.transfer(is, bos, (int) mantisLength);
				// IA5 == ASCII...?
				String nrRep = new String(bos.toByteArray(), "US-ASCII");
				// this will swallow NR(1-3) and give proper double :)
				return Double.parseDouble(nrRep);
			}
		}
		//calculate scale
		final long scale = (long) Math.pow(base, (info & SCALE_MASK) >> 2);

		//extract exponent
		long exponent = 0;
		int exponentType = info & EXPONENT_TYPE;
		if (exponentType == 0) {
			exponent = is.read();
			mantisLength--;
		} else if (exponentType == 1 || exponentType == 2) {
			int temp;
			for (int i = 0; i < 2 + exponentType - 1; i++) {
				temp = is.read();
				exponent = (exponent << 8) | (temp & Utils.BYTE_MASK);
			}
			if (exponent > EXPONENT_MASK) {
				throw new ASN1ProtocolException("Exponent overflow.");
			}
			mantisLength -= 2 + exponentType - 1;
		}

		//extract mantis
		if (mantisLength > 7) {
			throw new ASN1ProtocolException("Mantis overflow.");
		}
		long mantis = 0;
		int temp;
		for (int i = 0; i < mantisLength; i++) {
			temp = is.read();
			mantis = (mantis << 8) | (temp & Utils.BYTE_MASK);
		}
		mantis <<= (7 - mantisLength) * 8;
		mantis *= scale;
		if (mantis > MANTIS_MASK) {
			throw new ASN1ProtocolException(String.format("Mantis overflow (%X)", mantis));
		}
		long rawDouble = ((info & REAL_SIGN_MASK) != 0) ? DOUBLE_SIGN_MASK : 0;
		rawDouble |= (exponent & EXPONENT_MASK) << DOUBLE_EXPONENT_POSITION;
		rawDouble |= mantis & MANTIS_MASK;
		return Double.longBitsToDouble(rawDouble);
	}

	@Override
	public void encode(final OutputStream os, final Object object) throws IOException {

		final double value = numberToDouble(object);

		//write the header
		os.write(HEADER.tagToByteArray());

		// we don't need to make anything else
		if (value == 0d) {
			//write length
			os.write(0x00);
			return;

		} else if (Double.isInfinite(value)) {
			//write length
			os.write(0x01);
			//write info octet
			os.write(((value < 0) ? SPECIAL_REAL_VALUE_NEGATIVE_INF : SPECIAL_REAL_VALUE_POSITIVE_INF));
			return;
		}

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
