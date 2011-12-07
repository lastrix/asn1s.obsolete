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
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1ProtocolException;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

/**
 * Class for writing/reading specified object's field to/from ASN.1 notation.
 * This class doesn't check object class, just tries to get a field
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1ComponentType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1ComponentType.class);

	private final String   name;
	private       ASN1Type type;
//	private boolean optional;
//	private final Object defaultValue;


	public ASN1ComponentType(final String name, final ASN1Type type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		//let's find field with name in object class
		Field f = null;
		Class c = o.getClass();
		while (c != null) {
			try {
				f = c.getDeclaredField(name);
				f.setAccessible(true);
			} catch (NoSuchFieldException e) {
			}
			c = c.getSuperclass();
		}
		if (f == null) { throw new ASN1ProtocolException("Object 'o' have got no field named " + name); }

		Object value = null;
		try {
			value = f.get(o);
		} catch (IllegalAccessException e) {
			throw new ASN1Exception(e);
		}
		type.write(value, os, true);
	}

	@Override
	public boolean isConstructed() {
		// TODO: unimplemented method stub
		return false;
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		if (type instanceof ASN1UnresolvedType) {
			type = module.getType(type.getName(), ((ASN1UnresolvedType) type).getModuleName());
		} else {
			type.validate(module);
		}
	}

	@Override
	public String toString() {
		return name + " " + type;
	}
}
