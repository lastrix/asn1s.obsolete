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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * See X.690-0207 8.8 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public final class ASN1Null implements PrimitiveDecoder, PrimitiveEncoder {

	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1Null.class);
	public static final  byte   TAG    = 0x05;
	public final static  Header HEADER = new Header(TAG, (byte) Tag.CLASS_UNIVERSAL, false, 0);

	/**
	 * Create default null value encoder/decoder
	 */
	public ASN1Null() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		return null;
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws IOException {
		//just write the header
		os.write(HEADER.toByteArray());
	}
}
