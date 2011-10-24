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
public class ASN1UnresolvedType extends ASN1Type {

	private final String moduleName;

	public ASN1UnresolvedType(final String name, final String moduleName) {
		if (name == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.moduleName = moduleName;
	}

	/**
	 * Create unresolved type stub for later verification
	 *
	 * @param name
	 */
	public ASN1UnresolvedType(final String name) {
		this(name, null);
	}

	@Override
	public String toString() {
		return "ASN1UnresolvedType{" + ((moduleName != null) ? moduleName + "." + name : name) + '}';
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
		throw new UnsupportedOperationException();
	}

	public String getModuleName() {
		return moduleName;
	}

	@Override
	public boolean isConstructed() {
		return false;
	}

	/**
	 * Validate this object
	 */
	@Override
	public void validate() {
		// TODO: unimplemented method stub

	}
}
