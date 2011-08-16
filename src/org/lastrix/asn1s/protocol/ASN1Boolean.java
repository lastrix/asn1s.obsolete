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
 * Boolean value encoder/decoder
 *
 * @author: lastrix
 * Date: 8/14/11
 * Time: 1:30 PM
 */
public final class ASN1Boolean implements PrimitiveDecoder, PrimitiveEncoder {

	/**
	 * Boolean type id (tag)
	 */
	public static final byte TAG_BOOLEAN = 0x01;
	public static final byte TRUE        = (byte) 0xFF;
	public static final byte FALSE       = 0x00;


	/**
	 * No point in generation header many times, so just make default one.
	 * It also helps sometimes.
	 */
	public final static Header BOOLEAN_HEADER = new Header(TAG_BOOLEAN, (byte) Tag.CLASS_UNIVERSAL, false, 1);

	/**
	 * Create ber boolean handler
	 */
	public ASN1Boolean() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		if (!BOOLEAN_HEADER.equals(header)) {
			throw new ASN1ProtocolException("Incompatible header.");
		}
		//just read one octet which is actually the value
		return new Boolean(is.read() > 0);
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws ASN1ProtocolException, IOException {
		if (!(value instanceof Boolean)) {
			throw new ASN1ProtocolException(String.format(getClass().getSimpleName() + ": can not handle object '%s'", value));
		}
		//write header
		os.write(BOOLEAN_HEADER.toByteArray());
		//and value
		os.write(((Boolean) value) ? TRUE : FALSE);
	}
}
