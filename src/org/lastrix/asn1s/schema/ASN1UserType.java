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
 * Used to handle user defined types.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserType extends ASN1Type {

	private ASN1Type baseType;

	/**
	 * Create user type with name, baseType
	 *
	 * @param name     - the name of user type
	 * @param baseType - the base type which should handle loading/saving
	 * @param clazz
	 *
	 * @throws NullPointerException if name or baseType is null
	 */
	public ASN1UserType(final String name, final ASN1Type baseType, final Class clazz) throws NullPointerException {
		handledClass = clazz;
		if (name == null || baseType == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.baseType = baseType;
	}

	@Override
	public String toString() {
		return "ASN1UserType{" +
		       '\'' + ((module == null) ? "" : module.getModuleId() + ".") +
		       name + '\'' +
		       ", baseType=" + baseType +
		       '}';
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
		baseType.write(o, os, header);
	}

	@Override
	public boolean isConstructed() {
		return baseType.isConstructed();
	}

	@Override
	void setModule(final ASN1Module module) {
		super.setModule(module);
		if (baseType.getModule() == null) {
			baseType.setModule(module);
		}
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		if (baseType instanceof ASN1UnresolvedType) {
			baseType = module.getType(baseType.getName(), ((ASN1UnresolvedType) baseType).getModuleName());
		} else {
			baseType.validate(module);
		}
	}

}
