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
 * Class to handle object encoding and decoding
 *
 * @author: lastrix
 * Date: 8/14/11
 * Time: 1:39 PM
 */
public interface ValueHandler extends Tag, Length {

	/**
	 * Decode value
	 *
	 * @param header - the BER header
	 * @param bis    - the input stream
	 *
	 * @return an Object
	 *
	 * @throws ASN1Exception
	 * @throws IOException
	 */
	public Object decodeValue(Header header, ASN1InputStream bis) throws IOException, ASN1Exception;

	/**
	 * Get tag describing this type
	 *
	 * @return an long
	 */
	public long getTag();

	/**
	 * Return constructed
	 *
	 * @return constructed
	 */
	public boolean isConstructed();

	/**
	 * Return TagClass
	 *
	 * @return an TagClass
	 */
	public byte getTagClass();

	/**
	 * Encode value with BER standard
	 *
	 * @param object - the object to be encoded
	 * @param bos    - the output stream
	 *
	 * @throws ASN1Exception
	 */
	public void encodeValue(Object object, ASN1OutputStream bos) throws ASN1Exception, IOException;
}
