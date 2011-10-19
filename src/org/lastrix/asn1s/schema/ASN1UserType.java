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

import org.lastrix.asn1s.exception.ASN1ConstraintUsageException;

/**
 * Used to handle user defined types.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserType extends ASN1Type {

	private Constraint constraint = null;
	private ASN1Type baseType;
	private String   name;
	private Module   module;

	/**
	 * Create user type with name and baseType
	 *
	 * @param name     - the name of user type
	 * @param baseType - the base type which should handle loading/saving
	 */
	public ASN1UserType(final String name, final ASN1Type baseType) {
		this(name, baseType, null);
	}

	/**
	 * Create user type with name, baseType and constraint
	 *
	 * @param name       - the name of user type
	 * @param baseType   - the base type which should handle loading/saving
	 * @param constraint - the test parameter, which should check object sanity when loading/saving
	 *
	 * @throws NullPointerException if name or baseType is null
	 */
	public ASN1UserType(final String name, final ASN1Type baseType, final Constraint constraint) throws NullPointerException {
		if (name == null || baseType == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.baseType = baseType;
		this.constraint = constraint;
	}

	/**
	 * Setup constraint for this type
	 *
	 * @param constraint - the constraint to use
	 *
	 * @throws ASN1ConstraintUsageException - if constraint can not be applied
	 */
	@Override
	public void setConstraint(final Constraint constraint) throws ASN1ConstraintUsageException {
		this.constraint = constraint;
	}

	@Override
	public String toString() {
		return "ASN1UserType{" +
		       '\'' + ((module == null) ? "" : module.getModuleId() + ".") +
		       name + '\'' +
		       ", baseType=" + baseType +
		       ", constraint=" + constraint +
		       '}';
	}

	/**
	 * Get module where this type is lying
	 *
	 * @return an Module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * Set type module
	 *
	 * @param module - the module
	 */
	public void setModule(final Module module) {
		this.module = module;
	}
}