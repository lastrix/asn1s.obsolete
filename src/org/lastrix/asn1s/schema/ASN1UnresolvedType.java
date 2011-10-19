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
 * @author lastrix
 * @version 1.0
 */
public class ASN1UnresolvedType extends ASN1Type {

	public final String     name;
	private      Constraint constraint;

	/**
	 * Create unresolved type stub for later verification
	 *
	 * @param name
	 */
	public ASN1UnresolvedType(final String name, final Constraint constraint) {
		if (name == null) {
			throw new NullPointerException();
		}
		this.name = name;
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
}
