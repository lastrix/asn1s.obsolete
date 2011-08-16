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

/**
 * Constructed objects handler (like user objects or arrays, or something like that)
 * see 8.1.2.5 from X.690-0207 for more info
 *
 * @author: lastrix
 * Date: 8/15/11
 * Time: 1:54 PM
 */
public interface ConstructedDecoder {

	/**
	 * Decode constructed object from ASN1InputStream, this is the difference between {@link PrimitiveDecoder}, since this decoder
	 * may fetch additional data ( even constructed ).
	 *
	 * @param is     - the input stream
	 * @param header - the header fetched from <code>is</code>
	 *
	 * @return the object
	 *
	 * @throws ASN1ProtocolException
	 * @throws IOException
	 */
	public Object decode(ASN1InputStream is, Header header) throws ASN1ProtocolException, IOException;
}
