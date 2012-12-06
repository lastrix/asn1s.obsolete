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

import org.lastrix.asn1s.schema.ASN1SchemaObject;

import java.io.PrintWriter;
import java.util.Vector;

/**
 * @author lastrix
 * @version 1.0
 */
public class Union implements ASN1SchemaObject {

	private final boolean        except;
	private final Vector<Vector> unions;

	public Union(final boolean except, final Vector<Vector> intersections) {
		this.except = except;
		this.unions = intersections;
	}

	@Override
	public String toString() {
		return "Union{" +
		       "except=" + except +
		       ", unions=" + unions +
		       '}';
	}

	public boolean isExcept() {
		return except;
	}

	public Vector<Vector> getUnions() {
		return unions;
	}

	@Override
	public void toASN1(final PrintWriter printWriter, final boolean typeAssignment) {
		int i = 0;
		for (; i < unions.size() - 1; i++) {
			intersectionToASN1(printWriter, unions.get(i));
			printWriter.append(" | ");
		}
		intersectionToASN1(printWriter, unions.get(i));
	}

	private void intersectionToASN1(final PrintWriter pw, final Vector vector) {
		Vector<Intersection> inters = vector;
		int i = 0;
		for (; i < inters.size() - 1; i++) {
			inters.get(i).toASN1(pw, false);
			pw.append(" ^ ");
		}
		inters.get(i).toASN1(pw, false);
	}

}
