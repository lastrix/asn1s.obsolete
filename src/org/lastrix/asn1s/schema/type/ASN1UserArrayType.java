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

package org.lastrix.asn1s.schema.type;

import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.schema.ASN1Tag;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserArrayType extends ASN1UserType {
	/**
	 * Create user type with name, baseType
	 *
	 * @param name     - the name of user type
	 * @param baseType - the base type which should handle loading/saving
	 * @param clazz
	 *
	 * @throws NullPointerException if name or baseType is null
	 */
	public ASN1UserArrayType(final String name, final ASN1Type baseType, final Class clazz) throws NullPointerException {
		super(name, baseType, clazz);
	}

	@Override
	public Object read(
	                  final Object value, final ASN1InputStream asn1is, final ASN1Tag tag, final boolean tagCheck
	                  ) throws IOException, ASN1Exception {
		final List list = (List) baseType.read(new ArrayList(), asn1is, tag, tagCheck);
		return list.toArray((Object[]) Array.newInstance(getHandledClass().getComponentType(), list.size()));
	}

	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		baseType.write(Arrays.asList((Object[]) o), os, header);
	}
}
