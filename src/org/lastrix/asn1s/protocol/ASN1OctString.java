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

import org.lastrix.asn1s.exception.ASN1ProtocolException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author: lastrix
 * Date: 8/15/11
 * Time: 5:29 PM
 */
public class ASN1OctString implements PrimitiveEncoder, PrimitiveDecoder {

	public final static  byte   TAG_OCTET_STRING    = 0x04;
	private final static Header OCTET_STRING_HEADER = new Header(TAG_OCTET_STRING, (byte) Tag.CLASS_UNIVERSAL, false, 0);

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		if (!OCTET_STRING_HEADER.isSame(header)) {
			throw new ASN1ProtocolException("Parameter 'header' is not valid octet string header.");
		}
		if (header.getLength() == 0) {
			return new Byte[0];
		}

		//infinite
		if (header.getLength() == Length.FORM_MASK) {
			//damn infinite form
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int b = -1;
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
	public void encode(final OutputStream os, final Object value) throws ASN1ProtocolException, IOException {
		if (value == null) {
			throw new NullPointerException();
		}
		if (!value.getClass().isArray() || !byte.class.equals(value.getClass().getComponentType())) {
			throw new ASN1ProtocolException("Parameter 'value' should be byte array " + value.getClass());
		}
		byte[] array = (byte[]) value;
		os.write(OCTET_STRING_HEADER.tagToByteArray());
		os.write(array.length);
		os.write(array);
	}
}
