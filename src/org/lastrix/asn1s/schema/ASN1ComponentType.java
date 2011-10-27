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

package org.lastrix.asn1s.schema;

import org.lastrix.asn1s.exception.ASN1Exception;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1ComponentType extends ASN1Type {

	private final String   name;
	private       ASN1Type type;
//	private boolean optional;
//	private final Object defaultValue;


	public ASN1ComponentType(final String name, final ASN1Type type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		// TODO: unimplemented method stub

	}

	@Override
	public boolean isConstructed() {
		// TODO: unimplemented method stub
		return false;
	}

	/**
	 * Validate this object
	 */
	@Override
	public void validate() {
		// TODO: unimplemented method stub

	}

	@Override
	public String toString() {
		return name + " " + type;
	}
}
