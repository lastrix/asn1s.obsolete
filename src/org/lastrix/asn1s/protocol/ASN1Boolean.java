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

import org.lastrix.asn1s.exception.ASN1Exception;

import java.io.IOException;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 1:30 PM
 */
public final class ASN1Boolean implements ValueHandler {

	/**
	 * Create ber boolean handler
	 */
	public ASN1Boolean() {
	}

	public static final long TAG_BOOLEAN = 0x01;

	/**
	 * Decode value
	 *
	 * @param header - the BER header
	 * @param bis    - the input stream
	 *
	 * @return an Object
	 */
	@Override
	public Object decodeValue(final Header header, final ASN1InputStream bis) throws IOException {
		if (header.getTag() != TAG_BOOLEAN || header.getLength() != 1) {
			throw new IllegalStateException("This is not an boolean value");
		}
		final int octet = bis.read();
		return new Boolean(octet > 0);
	}

	/**
	 * Return PC
	 *
	 * @return an PC
	 */
	@Override
	public PC getPC() {
		return PC.PRIMITIVE;
	}

	/**
	 * Return TagClass
	 *
	 * @return an TagClass
	 */
	@Override
	public TagClass getTagClass() {
		return TagClass.UNIVERSAL;
	}

	/**
	 * Encode value with BER standard
	 *
	 * @param object - the object to be encoded
	 * @param bos    - the output stream
	 */
	@Override
	public void encodeValue(final Object object, final ASN1OutputStream bos) throws ASN1Exception, IOException {
		if (object instanceof java.lang.Boolean) {
			bos.write(new byte[]{0x01, 0x01, (byte) (((java.lang.Boolean) object) ? 0x00 : 0xFF)});
		} else { throw new ASN1Exception(String.format("Can not handle object '%s'", object)); }
	}

	@Override
	public long getTag() {
		return TAG_BOOLEAN;
	}
}
