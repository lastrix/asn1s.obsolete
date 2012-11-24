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
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Schema;
import org.lastrix.asn1s.schema.ASN1Tag;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Abstract type handler class for all ASN.1 types defined by ITU-T X.690
 * This class implements default behavior for any type.
 *
 * @author lastrix
 * @version 1.0
 */
public abstract class ASN1Type {
	/**
	 * Constant used in property change support to notify about validity state change.
	 */
	public final static String VALID = "valid";

	protected String typeId = null;

	/**
	 * Static method used to make a fully qualified type id.
	 *
	 * @param name     - type name
	 * @param moduleId - module id
	 *
	 * @return an String
	 */
	public static String makeTypeId(final String name, final String moduleId) {
		return moduleId + "." + name;
	}

	/**
	 * Name of this type
	 */
	protected String name;

	/**
	 * Module that holds this type
	 */
	protected ASN1Module module = null;

	/**
	 * Class used by this type, see {@link ASN1Schema} index HashMaps.
	 */
	protected Class handledClass;

	/**
	 * Flag that shows if type as exported.
	 * Actually this variable has no real use in project.
	 */
	protected boolean exported = false;

	/**
	 * Flag that show object validity state.
	 */
	private boolean valid;

	/**
	 * ASN1Tag used in index maps to choose valid handler for incoming object in
	 * an ASN1 binary stream.
	 */
	protected ASN1Tag tag = null;

	/**
	 * Property change support used to notify listeners about validity changes.
	 */
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	/**
	 * Returns class used by this type
	 *
	 * @return
	 */
	public Class getHandledClass() {
		return handledClass;
	}

	/**
	 * Returns module.
	 *
	 * @return an ASN1Module
	 */
	public final ASN1Module getModule() {
		return module;
	}

	/**
	 * Returns name of this type
	 *
	 * @return an String
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Return tag
	 *
	 * @return an ASN1Tag
	 */
	public ASN1Tag getTag() {
		return tag;
	}

	/**
	 * Returns fully qualified type name.
	 *
	 * @return an String
	 */
	public final String getTypeId() {
		return typeId;
	}

	/**
	 * Returns true if this type is constructed
	 *
	 * @return an boolean
	 */
	public final boolean isConstructed() {
		return getTag().isConstructed();
	}

	/**
	 * Returns true if this type is valid: all types resolved, handled classes found.
	 *
	 * @return an boolean
	 */
	public final boolean isValid() {
		return valid;
	}

	/**
	 * Called when type should be exported. This method could be called only after #onInstall(ASN1Module)
	 *
	 * @param schema - the schema, where type should be.
	 *
	 * @throws IllegalStateException if type already exported
	 */
	public void onExport(ASN1Schema schema) throws IllegalStateException {
		if (exported) {
			throw new IllegalStateException("Type already exported.");
		}
		exported = true;
		schema.install(this);
	}

	/**
	 * Called when type should be imported to module
	 *
	 * @param module - the module
	 *
	 * @throws IllegalStateException if type already imported
	 */
	public void onImport(ASN1Module module) throws IllegalStateException {
		module.importType(this);
	}

	/**
	 * Called when type should be installed in module.
	 *
	 * @param module   - the module, where type should be
	 * @param register - if true - type should call module.install(ASN1Type)
	 *
	 * @throws IllegalStateException if type already installed
	 * @throws ASN1Exception
	 */
	public void onInstall(ASN1Module module, boolean register) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException(getTypeId());
		}

		setModule(module);

		//now we should add self to index base
		if (register) {
			module.install(this);
		}
	}

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

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}


	// ------------------------------------------------------------------------ //
	// ----------------------- PROTECTED METHODS------------------------------- //
	// ------------------------------------------------------------------------ //

	/**
	 * Sets valid field to false, fires pcs to notify others about state change
	 */
	protected final void invalid() {
		firePropertyChange(VALID, this.valid, false);
		this.valid = false;
	}

	/**
	 * Setups new module for this type
	 *
	 * @param module - an ASN1Module
	 */
	protected void setModule(final ASN1Module module) {
		this.module = module;
	}

	/**
	 * Sets valid field to true, fires pcs to notify others about state change
	 */
	protected final void valid() {
		firePropertyChange(VALID, this.valid, true);
		this.valid = true;
	}

	// ------------------------------------------------------------------------ //
	// ----------------------- DELEGATES -------------------------------------- //
	// ------------------------------------------------------------------------ //

	/**
	 * Delegate from pcs
	 *
	 * @param propertyName
	 * @param listener
	 */
	public final void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(
		                             propertyName,
		                             listener
		                             );
	}

	/**
	 * Delegate from pcs
	 *
	 * @param propertyName
	 * @param listener
	 */
	public final void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(
		                                propertyName,
		                                listener
		                                );
	}

	/**
	 * Delegate from pcs
	 *
	 * @param propertyName
	 * @param oldValue
	 * @param newValue
	 */
	protected final void firePropertyChange(final String propertyName, final boolean oldValue, final boolean newValue) {
		pcs.firePropertyChange(
		                      propertyName,
		                      oldValue,
		                      newValue
		                      );
	}

	/**
	 * Delegate from Module
	 *
	 * @return
	 */
	public String getModuleName() {
		return getModule().getName();
	}

	/**
	 * Return debug string containing formatted type
	 *
	 * @param prefix - prefix for each string
	 *
	 * @return an String
	 */
	public String getTypeString(final String prefix) {
		return prefix + getTypeId();
	}

	// ------------------------------------------------------------------------ //
	// --------------------- ABSTRACT METHODS --------------------------------- //
	// ------------------------------------------------------------------------ //

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
	 * Convert type to ASN1 schema representation
	 *
	 * @param sb
	 */
	public void toASN1(final StringBuilder sb) {
		sb.append(name);
	}
}
