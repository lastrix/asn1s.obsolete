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
 * Constructed object encoder (like user objects or arrays, or something like that)
 * see 8.1.2.5 from X.690-0207 for more info
 *
 * @author lastrix
 * @version 1.0
 */
public interface ConstructedEncoder {

	/**
	 * Encode object to ASN.1, the difference why {@link ASN1OutputStream} is used - constructed object may contain another constructed object
	 * and is should contain primitives, so {@link ASN1OutputStream} could easily handle that job.
	 *
	 * @param os    - the output stream
	 * @param value - the value to encode
	 *
	 * @throws ASN1ProtocolException - if object can not be encoded
	 * @throws IOException           - from write() calls
	 */
	public void encode(ASN1OutputStream os, Object value) throws ASN1ProtocolException, IOException;
}
