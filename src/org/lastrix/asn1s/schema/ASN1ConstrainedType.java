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

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1ConstrainedType extends ASN1Type {
	private final Constraint constraint;
	private       ASN1Type   type;

	public ASN1ConstrainedType(final ASN1Type type, final Constraint constraint) {
		this.type = type;
		this.constraint = constraint;
	}

	public Constraint getConstraint() {
		return constraint;
	}

	public ASN1Type getType() {
		return type;
	}

	void setType(final ASN1Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ASN1ConstrainedType{" + type + " " +
		       constraint +
		       '}';
	}
}
