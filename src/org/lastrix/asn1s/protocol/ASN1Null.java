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
 * Time: 7:20 PM
 */
public class ASN1Null implements ValueHandler {

	public static final long TAG_NULL = 0x05;

	@Override
	public Object decodeValue(final Header header, final ASN1InputStream bis) throws IOException, ASN1Exception {
		if (header.getLength() != 0 || header.getTag() != getTag() || header.getTagClass() != getTagClass()) {
			throw new ASN1Exception("Invalid header for 'null' object");
		}
		return null;
	}

	@Override
	public long getTag() {
		return TAG_NULL;
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
		if (object != null) {
			throw new ASN1Exception(String.format("Object '%s' is not null.", object));
		}
		bos.write(new byte[]{0x05, 0x00});
	}
}
