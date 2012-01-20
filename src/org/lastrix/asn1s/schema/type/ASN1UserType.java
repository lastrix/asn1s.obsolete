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

import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.schema.ASN1Module;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;

/**
 * Used to handle user defined types.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserType extends ASN1Type {

	private ASN1Type baseType;

	/**
	 * Create user type with name, baseType
	 *
	 * @param name     - the name of user type
	 * @param baseType - the base type which should handle loading/saving
	 * @param clazz
	 *
	 * @throws NullPointerException if name or baseType is null
	 */
	public ASN1UserType(final String name, final ASN1Type baseType, final Class clazz) throws NullPointerException {
		handledClass = clazz;
		if (name == null || baseType == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.baseType = baseType;
	}

	@Override
	public String toString() {
		return "ASN1UserType{" +
		       '\'' + ((module == null) ? "" : module.getModuleId() + ".") +
		       name + '\'' +
		       ", baseType=" + baseType +
		       '}';
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
		baseType.write(o, os, header);
	}

	/**
	 * Read object of type from input stream
	 *
	 * @param o                   - the object which should be used for modifying
	 * @param is                  - the input stream
	 * @param header              - the header, non null values prevents method to read header from stream
	 * @param forceHeaderChecking - force type reader to check header
	 *
	 * @return an Object or null
	 *
	 * @throws IOException   thrown from I/O
	 * @throws ASN1Exception if selected type reader can not acquire data
	 */
	@Override
	public Object read(Object o, final InputStream is, final Header header, final boolean forceHeaderChecking) throws
	                                                                                                           IOException,
	                                                                                                           ASN1Exception {
		// we does not have any headers here, so leave it for underlying type reader.

		// does not allow java. objects instantiation.
		//FIXME: find a better way here.
		if (handledClass.getName().startsWith("java.")) {
			return baseType.read(null, is, header, forceHeaderChecking);
		} else {
			o = makeInstance();
			return baseType.read(o, is, header, forceHeaderChecking);
		}
	}

	private Object makeInstance() throws ASN1ReadException {
		try {
			Constructor c = handledClass.getConstructor();
			return c.newInstance();
		} catch (Exception e) {
			throw new ASN1ReadException("Can not instantiate handled class.");
		}
	}

	@Override
	public boolean isConstructed() {
		return baseType.isConstructed();
	}

	@Override
	public void setModule(final ASN1Module module) {
		super.setModule(module);
		if (baseType.getModule() == null) {
			baseType.setModule(module);
		}
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		if (baseType instanceof ASN1UnresolvedType) {
			baseType = module.getType(baseType.getName(), ((ASN1UnresolvedType) baseType).getModuleName());
		} else {
			baseType.validate(module);
		}
	}

	@Override
	public byte[] getHeaderBytes() {
		return baseType.getHeaderBytes();
	}
}
