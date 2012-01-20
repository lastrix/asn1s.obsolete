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

package org.lastrix.asn1s;

/**
 * @author lastrix
 * @version 1.0
 */
public class SequenceOfTestClass {
	private long                       a;
	private long                       b;
	private double                     c;
	private String                     d;
	private SequenceOfTestClassAsField myField;

	public SequenceOfTestClass() {
	}

	public SequenceOfTestClass(final int a, final int b, final double c, final String d, final SequenceOfTestClassAsField myField) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.myField = myField;
	}

	@Override
	public String toString() {
		return "SequenceOfTestClass{" +
		       "a=" + a +
		       ", b=" + b +
		       ", c=" + c +
		       ", d=" + d +
		       ", myField=" + myField +
		       '}';
	}
}
