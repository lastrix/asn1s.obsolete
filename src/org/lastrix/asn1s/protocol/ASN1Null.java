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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Null value encoder/decoder
 *
 * @author: lastrix
 * Date: 8/14/11
 * Time: 7:20 PM
 */
public class ASN1Null implements PrimitiveDecoder, PrimitiveEncoder {

	public static final byte   TAG_NULL    = 0x05;
	public final static Header NULL_HEADER = new Header(TAG_NULL, (byte) Tag.CLASS_UNIVERSAL, false, 0);

	/**
	 * Create default null value encoder/decoder
	 */
	public ASN1Null() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		if (!NULL_HEADER.equals(header)) {
			throw new ASN1ProtocolException("Header is not valid for 'null'.");
		}
		return null;
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws ASN1ProtocolException, IOException {
		if (value != null) {
			throw new ASN1ProtocolException("Supplied value is not null.");
		}
		//just write the header
		os.write(NULL_HEADER.toByteArray());
	}
}
