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

import java.io.PrintWriter;

/**
 * Interface which should implement every class that has an ASN.1 representation.
 * This interface is required for ASN.1 schema generation
 *
 * @author lastrix
 * @version 1.0
 */
public interface ASN1SchemaObject {

	/**
	 * Convert object to ASN.1 schema
	 *
	 * @param pw             - output device
	 * @param typeAssignment - true if type assignment form allowed
	 */
	public void toASN1(final PrintWriter pw, final boolean typeAssignment);
}
