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

import java.io.IOException;
import java.io.OutputStream;

/**
 * Interface for primitive encoder see X.690-0207 8.1.2.5 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public interface PrimitiveEncoder {

	/**
	 * Encode primitive value to output stream (with header)
	 *
	 * @param os    - the output stream
	 * @param value - the value
	 *
	 * @throws IOException              - from write() calls
	 * @throws IllegalArgumentException - if object is not acceptable
	 * @throws NullPointerException     - if object is null and null is not valid object for this encoder
	 */
	public void encode(OutputStream os, Object value) throws IOException, IllegalArgumentException, NullPointerException;
}