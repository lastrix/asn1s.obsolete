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

package org.lastrix.asn1s.schema.type.x690;

import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UnresolvedType;

import java.io.PrintWriter;

/**
 * Simple interface to make types in this package identifiable.
 *
 * @author lastrix
 * @version 1.0
 */
public abstract class ASN1X690Type extends ASN1Type {

	@Override
	public void typeResolved(
	                        final ASN1UnresolvedType unresolved, final ASN1Type resolved
	                        ) {
		throw new UnsupportedOperationException("Not allowed for X690 types.");
	}

	@Override
	public void toASN1(final PrintWriter pw, final boolean typeAssignment) {
		pw.append(getName());
	}
}
