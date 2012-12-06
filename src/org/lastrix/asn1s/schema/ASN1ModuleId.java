/******************************************************************************
 * Copyright (C) 2010-2012 Lastrix                                            *
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

import org.lastrix.asn1s.type.ASN1ObjectIdentifier;

import java.io.PrintWriter;

/**
 * ASN1ModuleId - special class to make modules unique and be described as it expected in ASN.1 specifications.
 * See ITU-T X.690 paragraph 8.19.
 *
 * @author lastrix
 * @version 1.0
 *          TODO: OID
 */
public class ASN1ModuleId implements ASN1SchemaObject {
	private final String               moduleName;
	private final ASN1ObjectIdentifier oID;

	public ASN1ModuleId(final String moduleName, final ASN1ObjectIdentifier oID) {
		if (moduleName == null) {
			throw new NullPointerException();
		}
		//TODO: add module name validation as described in spec?
		this.moduleName = moduleName;
		this.oID = oID;
	}

	@Override
	public int hashCode() {
		return getModuleName().hashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		} else if (obj instanceof ASN1ModuleId) {
			return getModuleName().equals(((ASN1ModuleId) obj).getModuleName());
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new ASN1ModuleId(moduleName, oID);
	}

	public String getModuleName() {
		return moduleName;
	}

	@Override
	public String toString() {
		return moduleName;
	}

	public void toASN1(final StringBuilder sb) {
	}

	@Override
	public void toASN1(final PrintWriter printWriter) {
		printWriter.append(moduleName);
		printWriter.append(" ");
		oID.toASN1(printWriter);
	}
}
