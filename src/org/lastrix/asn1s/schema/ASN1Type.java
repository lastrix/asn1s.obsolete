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

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.protocol.Header;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public abstract class ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1Type.class);
	protected String     name;
	protected ASN1Module module;
	protected Class      handledClass;
	protected byte[] headerBytes = null;


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

	ASN1Module getModule() {
		return module;
	}

	void setModule(final ASN1Module module) {
//		logger.warn(String.format("Module set for %s (%s)", this, module));
		this.module = module;
	}

	public String getName() {
		return name;
	}

	public String getTypeId() {
		return module.getName() + "." + name;
	}

	public static String makeTypeId(final String name, final String moduleId) {
		return moduleId + "." + name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
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
	public abstract void write(final Object o, final OutputStream os, boolean header) throws IOException, ASN1Exception;

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
	public abstract Object read(final Object o, final InputStream is, final Header header, final boolean forceHeaderChecking) throws
	                                                                                                                          IOException,
	                                                                                                                          ASN1Exception;

	/**
	 * Read object of type from input stream
	 *
	 * @param is - the input stream
	 *
	 * @return an Object or null
	 *
	 * @throws IOException   thrown from I/O
	 * @throws ASN1Exception if selected type reader can not acquire data
	 */
	public Object read(final InputStream is) throws IOException, ASN1Exception {
		return read(null, is, null, false);
	}

	public abstract boolean isConstructed();

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	public abstract void validate(ASN1Module module);


	public Class getHandledClass() {
		return handledClass;
	}

	public byte[] getHeaderBytes() {
		return headerBytes;
	}
}
