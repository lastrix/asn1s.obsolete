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
import org.lastrix.asn1s.exception.ASN1Exception;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 3:18 PM
 */
public class ASN1Real implements ValueHandler {
	private final static Logger logger = Logger.getLogger(ASN1Real.class);

	public static final long TAG_REAL = 0x09;

	public enum BaseType {
		DECIMAL,
		BINARY,
		SPECIAL
	}


	@Override
	public Object decodeValue(final Header header, final ASN1InputStream bis) throws IOException, ASN1Exception {
		//test for zero value
		if (header.getLength() == 0) {
			return new Double(0d);
		}

		final int info = bis.read();
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
				throw new ASN1Exception("Invalid value for binary base (11)");
			}
		} else {
			//decimal or something special
			if ((info & 0x40) > 0) {
				if (info == 0x40) { return Double.POSITIVE_INFINITY; } else if (info == 0x41) { return Double.NEGATIVE_INFINITY; } else {
					throw new ASN1Exception("Invalid real format for -inf/+inf");
				}
			} else {
				ByteArrayOutputStream bos = new ByteArrayOutputStream((int) mantisLength);
				bis.fillOutputStream(bos, (int) mantisLength);
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
			exponent = bis.read();
			mantisLength--;
		} else if (exponentType == 1 || exponentType == 2) {
			int temp;
			for (int i = 0; i < 2 + exponentType - 1; i++) {
				temp = bis.read();
				exponent = (exponent << 8) | (temp & 0xFF);
			}
			if (exponent > 0x7FF) {
				throw new ASN1Exception("Exponent overflow.");
			}
			mantisLength -= 2 + exponentType - 1;
		}

		//extract mantis
		if (mantisLength > 7) {
			throw new ASN1Exception("Mantis overflow.");
		}
		long mantis = 0;
		int temp;
		for (int i = 0; i < mantisLength; i++) {
			temp = bis.read();
			mantis = (mantis << 8) | (temp & 0xFF);
		}
		mantis *= scale;
		if (mantis > 0xFFFFFFFFFFFFFL) {
			throw new ASN1Exception("Mantis overflow");
		}
		long rawDouble = ((info & 0x40) != 0) ? (0x1L << 64) : 0;
		rawDouble |= (exponent & 0x7FFL) << 52;
		rawDouble |= (mantis & 0x0FL) << 48;
		rawDouble |= ((mantis >> 8) & 0xFFL) << 40;
		rawDouble |= ((mantis >> 16) & 0xFFL) << 32;
		rawDouble |= ((mantis >> 24) & 0xFFL) << 24;
		rawDouble |= ((mantis >> 32) & 0xFFL) << 16;
		rawDouble |= ((mantis >> 40) & 0xFFL) << 8;
		rawDouble |= ((mantis >> 48) & 0xFFL);
		return Double.longBitsToDouble(rawDouble);
	}

	@Override
	public long getTag() {
		return TAG_REAL;
	}

	@Override
	public PC getPC() {
		return PC.PRIMITIVE;
	}

	@Override
	public TagClass getTagClass() {
		return TagClass.UNIVERSAL;
	}

	@Override
	public void encodeValue(final Object object, final ASN1OutputStream bos) throws ASN1Exception, IOException {
		// TODO: unimplemented method stub

	}
}
