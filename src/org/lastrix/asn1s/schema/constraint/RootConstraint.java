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

package org.lastrix.asn1s.schema.constraint;

/**
 * @author lastrix
 * @version 1.0
 */
public class RootConstraint extends Constraint {
	private final Union union;

	public RootConstraint(final Union union) {
		this.union = union;
	}

	@Override
	public String toString() {
		return "RootConstraint{" + union +
		       '}';
	}

	@Override
	public void toASN1(final StringBuilder sb) {
		sb.append("( ");
		union.toASN1(sb);
		sb.append(" )");
//		super.toASN1(sb);
	}
}
