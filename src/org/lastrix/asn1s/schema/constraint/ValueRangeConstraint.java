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
public class ValueRangeConstraint extends Constraint {

	public enum EndpointState {
		MIN,
		MAX,
		NONE
	}

	private final Object        lowerValue;
	private final Object        upperValue;
	private final boolean       lowerLess;
	private final boolean       upperLess;
	private final EndpointState lowerES;
	private final EndpointState upperES;

	public ValueRangeConstraint(
	                           final Object lowerValue,
	                           final boolean lowerLess,
	                           final EndpointState lowerES,
	                           final Object upperValue,
	                           final boolean upperLess,
	                           final EndpointState upperES
	                           ) {
		this.lowerValue = lowerValue;
		this.lowerLess = lowerLess;
		this.lowerES = lowerES;
		this.upperValue = upperValue;
		this.upperLess = upperLess;
		this.upperES = upperES;
	}

	@Override
	public String toString() {
		return "ValueRangeConstraint{" + ((lowerValue != null) ? lowerValue : lowerES) + ((lowerLess) ? " <" : "")
		       + " .. " + ((upperLess) ? "< " : "") + ((upperValue != null) ? upperValue : upperES) + '}';
	}

	@Override
	public void toASN1(final StringBuilder sb) {
//		sb.append("(");
		sb.append(((lowerValue != null) ? lowerValue : lowerES) + ((lowerLess) ? " <" : ""));
		sb.append(" .. ");
		sb.append(((upperLess) ? "< " : "") + ((upperValue != null) ? upperValue : upperES));
//		sb.append(")");
	}
}
