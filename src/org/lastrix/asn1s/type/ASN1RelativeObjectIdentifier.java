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

package org.lastrix.asn1s.type;

/**
 * Class that used for storing and processing ASN.1 type named OBJECT IDENTIFIER, see specification for more info.
 * TODO: references
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1RelativeObjectIdentifier {

	private final long[] oids;
	private final String text;

	public ASN1RelativeObjectIdentifier(final long[] oids) {
		this.oids = oids;
		final StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (final long oid : oids) {
			sb.append(" ");
			sb.append(oid);
		}
		sb.append(" }");
		text = sb.toString();
	}

	@Override
	public String toString() {
		return text;
	}

	public long[] getOids() {
		return oids;
	}
}
