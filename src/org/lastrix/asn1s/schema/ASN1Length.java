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

package org.lastrix.asn1s.schema;

import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.util.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Handles ASN1 length field, as described in ASN.1 specification ITU-T X.690 paragraph 8.1.3
 *
 * @author lastrix
 * @version 1.0
 * @see #readLength(InputStream) - to read length from stream
 * @see #asBytes(int) - to get byte array representation of and int
 */
public final class ASN1Length {

	public static final int FORM_INDEFINITE = 0x80;

	/**
	 * Construct ASN1Length
	 */
	private ASN1Length(final int length) {
	}

	/**
	 * Converts length field to byte array that could be written to ASN.1 stream
	 *
	 * @param length - the value to be written
	 *
	 * @return an byte array
	 */
	public static byte[] asBytes(int length) {
		final ByteArrayOutputStream bos = new ByteArrayOutputStream(1);
		if (length == FORM_INDEFINITE) {
			bos.write(FORM_INDEFINITE);
		} else if (length > Utils.UNSIGNED_BYTE_MASK) {
			final int bytesCount = Utils.getMinimumBytes(length);
			//as 8.1.3.5 in X.690-0207 says in 1st content octet bit 8 should be 1 and 7 to 1 should encode amount of bytes,
			// the others - length as unsigned integer LE!
			bos.write(bytesCount | FORM_INDEFINITE);
			for (int i = bytesCount - 1; i >= 0; i--) {
				bos.write((length >> (i * 8)) & Utils.BYTE_MASK);
			}
		} else {
			bos.write(length & Utils.UNSIGNED_BYTE_MASK);
		}
		return bos.toByteArray();
	}

	/**
	 * Read ASN.1 length field from input stream
	 *
	 * @param is - the input stream
	 *
	 * @return an ASN1Length
	 *
	 * @throws ASN1ReadException if I/O errors occur
	 */
	public static int readLength(final InputStream is) throws ASN1ReadException {

		int temp;
		// Read the length and create header
		try {
			temp = is.read();
		} catch (IOException e) {
			throw new ASN1ReadException("I/O error.", e);
		}

		int length = 0;

		if (temp == FORM_INDEFINITE) {
			// this is an indefinite form
			length = 0;
		} else if ((temp & Utils.BYTE_SIGN_MASK) == 0) {
			// this is short definite form
			length = temp & Utils.UNSIGNED_BYTE_MASK;
		} else {
			// this is an definite long form
			final int count = temp & Utils.UNSIGNED_BYTE_MASK;
			if (count > 4) {
				throw new ASN1ReadException("int overflow");
			}
			try {
				for (int i = 0; i < count; i++) {
					temp = is.read();
					length = (length << 8) | (temp & Utils.BYTE_MASK);
				}
			} catch (IOException e) {
				throw new ASN1ReadException("I/O error.", e);
			}
		}
		return length;
	}

}
