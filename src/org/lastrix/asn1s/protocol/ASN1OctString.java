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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * See X.690-0207 8.7 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public final class ASN1OctString implements PrimitiveEncoder, PrimitiveDecoder {

	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1OctString.class);
	public final static  byte   TAG    = 0x04;
	@SuppressWarnings({"WeakerAccess"})
	public final static  Header HEADER = new Header(TAG, (byte) Tag.CLASS_UNIVERSAL, false, 0);

	public ASN1OctString() {}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		if (header.getLength() == 0) {
			//noinspection ZeroLengthArrayAllocation
			return new byte[0];
		}

		//infinite
		if (header.getLength() == Tag.FORM_INDEFINITE) {
			//damn infinite form
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int b;
			int b0 = -1;
			while (true) {
				b = is.read();
				if (b == 0x00 && b0 == 0x00) {
					break;
				}
				bos.write(b);
				b0 = b;
			}
			byte[] result = new byte[bos.size() - 1];

			System.arraycopy(bos.toByteArray(), 0, result, 0, result.length);
			return result;
		}

		//defined
		ByteArrayOutputStream bos = new ByteArrayOutputStream((int) header.getLength());
		for (int i = 0; i < header.getLength(); i++) {
			bos.write(is.read());
		}

		return bos.toByteArray();
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws IOException {
		byte[] array = (byte[]) value;
		os.write(HEADER.tagToByteArray());
		os.write(array.length);
		os.write(array);
	}
}
