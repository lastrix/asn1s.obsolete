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

import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.TaggingMethod;
import org.lastrix.asn1s.schema.type.ASN1Type;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1X690Module extends ASN1Module {

	/**
	 * Create ASN1 module that holds all default ASN.1 types.
	 */
	public ASN1X690Module() {
		super("", TaggingMethod.EXPLICIT, false, true, null, null, null);
		addType(new ASN1Integer(Long.class));
		addType(new ASN1Integer(Integer.class));
		addType(new ASN1Integer(Short.class));
		addType(new ASN1Integer(Byte.class));
		addType(new ASN1Real(Float.class));
		addType(new ASN1Real(Double.class));
		addType(new ASN1UTF8String());
	}

	/**
	 * Private helper method to perform same operations on each type.
	 *
	 * @param type - the ASN1Type
	 */
	private void addType(ASN1Type type) {
		types.put(type.getName(), type);
		type.onInstall(this);
	}
}
