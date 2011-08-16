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
 * @author: lastrix
 * Date: 8/14/11
 * Time: 3:18 PM
 */
public class ASN1Real implements PrimitiveEncoder, PrimitiveDecoder {
	private final static Logger logger = Logger.getLogger(ASN1Real.class);

	public static final  byte   TAG    = 0x09;
	private static final Header HEADER = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 10);

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		if (!HEADER.isSame(header)) {
			throw new ASN1ProtocolException("Parameter 'header' is not valid Real type header.");
		}

		//test for zero value
		if (header.getLength() == 0) {
			return new Double(0d);
		}

		final int info = is.read();
		long mantisLength = header.getLength() - 1;

		//bad news
		final long base;
		//binary base
		if ((info & 0x80) > 0) {
			if ((info & 0x30) == 0) {
				base = 2;
			} else if ((info & 0x30) == 0x10) {
				base = 8;
			} else if ((info & 0x30) == 0x20) {
				base = 16;
			} else {
				//this should not happen
				throw new ASN1ProtocolException("Invalid value for binary base (11)");
			}
		} else {
			//decimal or something special
			if ((info & 0x40) > 0) {
				if (header.getLength() > 1) {
					throw new ASN1ProtocolException("'SpecialRealValues' section, but length is not '1' ( has '" + header.getLength() + "').");
				}
				if (info == 0x40) { return Double.POSITIVE_INFINITY; } else if (info == 0x41) { return Double.NEGATIVE_INFINITY; } else {
					throw new ASN1ProtocolException("Invalid real format for -inf/+inf");
				}
			} else {
				ByteArrayOutputStream bos = new ByteArrayOutputStream((int) mantisLength);

				Utils.transfer(is, bos, (int) mantisLength);
				// IA5 == ASCII...?
				String nrRep = new String(bos.toByteArray(), "US-ASCII");
				// this will swallow NR(1-3) and give proper double :)
				return Double.parseDouble(nrRep);
			}
		}
		//calculate scale
		final long scale = (long) Math.pow(base, (info & 0x0C) >> 2);

		//extract exponent
		int exponent = 0;
		int exponentType = info & 0x3;
		if (exponentType == 0) {
			exponent = is.read();
			mantisLength--;
		} else if (exponentType == 1 || exponentType == 2) {
			int temp;
			for (int i = 0; i < 2 + exponentType - 1; i++) {
				temp = is.read();
				exponent = (exponent << 8) | (temp & 0xFF);
			}
			if (exponent > 0x7FF) {
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
			mantis = (mantis << 8) | (temp & 0xFF);
		}
		mantis = Long.reverseBytes(mantis);
		mantis >>= 12;
		mantis *= scale;
		if (mantis > 0xFFFFFFFFFFFFFL) {
			throw new ASN1ProtocolException(String.format("Mantis overflow (%X)", mantis));
		}
		long rawDouble = ((info & 0x40) != 0) ? (0x1L << 63) : 0;
		rawDouble |= (exponent & 0x7FFL) << 52;
		rawDouble |= mantis & 0xFFFFFFFFFFFFFL;
		return Double.longBitsToDouble(rawDouble);
	}

	@Override
	public void encode(final OutputStream os, final Object object) throws ASN1ProtocolException, IOException {
		if (object == null) {
			throw new NullPointerException("object == null.");
		}
		double value;
		if (object instanceof Double) {
			value = (Double) object;
		} else if (object instanceof Float) {
			Float f = (Float) object;
			value = f;
		} else {
			throw new ASN1ProtocolException("Only 'Double' and 'Float' supported by ASN1Real ( has '" + object + "').");
		}

		// we don't need to make anything else
		if (Double.isNaN(value) || value == 0d) {
			//write length (that is all)
			os.write(HEADER.tagToByteArray());
			//write length
			os.write(0x00);
			return;

		} else if (Double.isInfinite(value)) {
			//tag
			os.write(HEADER.tagToByteArray());
			//write length
			os.write(0x01);
			//write info octet
			os.write(0x40 | ((value < 0) ? 0x01 : 0x00));
			return;
		}

		os.write(HEADER.tagToByteArray());

		long valueBits = Double.doubleToLongBits(value);

		//extract exponent
		long exponent = (valueBits >> 52) & 0x7FF;
		final int exponentBytesCount = Utils.getMinimumBytes(exponent);

		//extract mantis
		long mantis = valueBits & 0xFFFFFFFFFFFFFL;
		mantis <<= 12;
		mantis = Long.reverseBytes(mantis);
		final int mantisBytesCount = Utils.getMinimumBytes(mantis);

		//now we got all required information
		final byte[] exponentBytes = extractBytes(exponent, exponentBytesCount);
		final byte[] mantisBytes = extractBytes(mantis, mantisBytesCount);

		//write length octet
		os.write(mantisBytesCount + exponentBytesCount + 1);

		//write info octet (we could only have here 1 or 2 exponent octets)
		os.write(0x80 | ((exponentBytesCount == 1) ? 0x00 : 0x01) | ((int) (valueBits >> 57) & 0x40));
		os.write(exponentBytes);
		os.write(mantisBytes);
	}

	private byte[] extractBytes(long value, int bCount) {
		final byte[] bytes = new byte[bCount];
		for (int i = 0; i < bCount; i++) {
			bytes[bCount - i - 1] = (byte) ((value >> i * 8) & 0xFF);
		}
		return bytes;
	}

}
