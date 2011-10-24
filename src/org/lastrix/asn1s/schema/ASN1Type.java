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

import org.apache.log4j.Logger;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1Type.class);

	public static ASN1Type createTypeFor(Object clazz) {
//		logger.info("Requested class for '" + clazz + "'.");
		if (clazz instanceof ASN1Type) {
			//if this thing already ASN1Type - just return it back
			return (ASN1Type) clazz;
		} else if (clazz == Long.class) {
			//create integer handler
			return new ASN1Integer();
		} else if (clazz != null && clazz instanceof String) {
			//just return unresolved type
			return new ASN1UnresolvedType((String) clazz, null);
		}
		//no type for such object
		return null;
	}
}
