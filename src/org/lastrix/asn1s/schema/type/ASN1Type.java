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

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Schema;
import org.lastrix.asn1s.schema.ASN1Tag;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Abstract type handler class for all ASN.1 types defined by specification
 *
 * @author lastrix
 * @version 1.0
 */
public abstract class ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1Type.class);
	protected String     name;
	protected ASN1Module module;
	protected Class      handledClass;
	protected boolean exported = false;

	public final ASN1Module getModule() {
		return module;
	}

	public final void setModule(final ASN1Module module) {
//		logger.warn(String.format("Module set for %s (%s)", this, module));
		this.module = module;
	}

	public final String getName() {
		return name;
	}

	public final String getTypeId() {
		return makeTypeId(getName(), module.getName());
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
	 * @param value    - the object which should be used for modifying
	 * @param is       - the input stream
	 * @param tag      - the ASN.1 tag
	 * @param tagCheck - force type reader to check tag validity
	 *
	 * @return an Object or null
	 *
	 * @throws IOException   thrown from I/O
	 * @throws ASN1Exception if selected type reader can not acquire data
	 */
	public abstract Object read(final Object value, final InputStream is, final ASN1Tag tag, final boolean tagCheck) throws
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
	public final Object read(final InputStream is) throws IOException, ASN1Exception {
		return read(null, is, null, false);
	}

	public abstract boolean isConstructed();

	/**
	 * Called when type should be installed in module.
	 *
	 * @param module - the module, where type should be
	 *
	 * @throws IllegalStateException if type already installed
	 */
	public abstract void onInstall(ASN1Module module) throws IllegalStateException;

	/**
	 * Called when type should be exported. This method could be called only after #onInstall(ASN1Module)
	 *
	 * @param schema - the schema, where type should be.
	 *
	 * @throws IllegalStateException if type already exported
	 */
	public abstract void onExport(ASN1Schema schema) throws IllegalStateException;

	/**
	 * Called when type should be imported to module
	 *
	 * @param module - the module
	 *
	 * @throws IllegalStateException if type already imported
	 */
	public abstract void onImport(ASN1Module module) throws IllegalStateException;

	/**
	 * This method called when type is installed, exported if needed, and all imports for this module have been satisfied.
	 * This method should replace all {@see ASN1UnresolvedType} with valid types.
	 */
	public abstract void resolveTypes();

	/**
	 * Returns true if this type is valid: all types resolved, handled classes found.
	 *
	 * @return an boolean
	 */
	public abstract boolean isValid();

	/**
	 * Return tag
	 *
	 * @return an ASN1Tag
	 */
	public abstract ASN1Tag getTag();

	public Class getHandledClass() {
		return handledClass;
	}
}
