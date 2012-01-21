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
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UserType;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;

/**
 * ASN1 ASN1Module with type definitions
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Module {
	private final static Logger logger         = Logger.getLogger(ASN1Module.class);
	public static final  String TYPE_INSTALLED = "typeInstalled";

	private       ASN1Schema              schema;
	private final String                  moduleId;
	private final TaggingMethod           defaultTaggingMethod;
	private final boolean                 extensibilityImplied;
	private final boolean                 exportAll;
	private final List<String>            exports;
	private final List<SymbolsFromModule> imports;
	protected final Map<String, ASN1Type> typesExported = new HashMap<String, ASN1Type>();


	protected final Map<ASN1Tag, ASN1Type> tag2type = new HashMap<ASN1Tag, ASN1Type>();

	/**
	 * Defines which ASN1Type should handle specified class
	 */
	protected final Map<Class, ASN1Type> class2type = new HashMap<Class, ASN1Type>();

	protected final Map<String, Map<String, ASN1Type>> importedTypes = new HashMap<String, Map<String, ASN1Type>>();

	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	/**
	 * Storage for all exports where key is [TypeName]
	 */
	protected final Map<String, ASN1Type> types = new HashMap<String, ASN1Type>();

	/**
	 * Create new module
	 *
	 * @param moduleId             - the module ID
	 * @param defaultTaggingMethod - default tagging method
	 * @param extensibilityImplied - the boolean value
	 * @param exportAll            - the boolean value
	 * @param imports              - vector with symbols from module
	 * @param types                - vector with types
	 */
	public ASN1Module(
	                 final String moduleId,
	                 final TaggingMethod defaultTaggingMethod,
	                 final boolean extensibilityImplied,
	                 final boolean exportAll,
	                 final Vector<SymbolsFromModule> imports,
	                 final Vector<ASN1UserType> types
	                 ) {
		this(moduleId, defaultTaggingMethod, extensibilityImplied, exportAll, null, imports, types);
	}

	/**
	 * Create new module
	 *
	 * @param moduleId             - the module ID
	 * @param defaultTaggingMethod - default tagging method
	 * @param extensibilityImplied - the boolean value
	 * @param exports              - vector with symbols
	 * @param imports              - vector with symbols from module
	 * @param types                - vector with types
	 */
	public ASN1Module(
	                 final String moduleId,
	                 final TaggingMethod defaultTaggingMethod,
	                 final boolean extensibilityImplied,
	                 final Vector<String> exports,
	                 final Vector<SymbolsFromModule> imports,
	                 final Vector<ASN1UserType> types
	                 ) {
		this(moduleId, defaultTaggingMethod, extensibilityImplied, false, exports, imports, types);
	}

	/**
	 * Private constructor
	 *
	 * @param moduleId             - the module ID
	 * @param defaultTaggingMethod - default tagging method
	 * @param extensibilityImplied - the boolean value
	 * @param exportAll            - the boolean value
	 * @param exports              - vector with symbols
	 * @param imports              - vector with symbols from module
	 * @param types                - vector with types
	 */
	protected ASN1Module(
	                    final String moduleId,
	                    final TaggingMethod defaultTaggingMethod,
	                    final boolean extensibilityImplied,
	                    final boolean exportAll,
	                    final Vector<String> exports,
	                    final Vector<SymbolsFromModule> imports,
	                    final Vector<ASN1UserType> types
	                    ) {
		if (moduleId == null) throw new NullPointerException();

		this.moduleId = moduleId;
		this.defaultTaggingMethod = defaultTaggingMethod;
		this.extensibilityImplied = extensibilityImplied;
		this.exportAll = exportAll;
		this.imports = (imports == null) ? new ArrayList<SymbolsFromModule>() : imports;
		this.exports = (exports == null) ? new ArrayList<String>() : exports;

		//and add all the types
		if (types != null) {
			for (ASN1UserType t : types) {
				this.types.put(t.getName(), t);
			}
		}
	}

	/**
	 * Returns module id, currently only name supported.
	 * TODO: add here OID support and make complete ModuleID class.
	 *
	 * @return an String
	 */
	public String getModuleId() {
		return moduleId;
	}

	@Override
	public String toString() {
		return "ASN1Module{" +
		       "moduleId='" + moduleId + '\'' +
		       ", defaultTaggingMethod=" + defaultTaggingMethod +
		       ", extensibilityImplied=" + extensibilityImplied +
		       ", exportAll=" + exportAll +
		       ", definedTypes=" + types.keySet() + '}';
	}

	/**
	 * Validate this module and find all unresolved externals
	 */
	void validate() {


	}

	/**
	 * Get schema
	 *
	 * @return schema
	 */
	public ASN1Schema getSchema() {
		return schema;
	}

	/**
	 * Setup schema for this module, you can not set schema if it is already not null.
	 * Validation called inside.
	 *
	 * @param schema - the schema
	 */
	public void setSchema(final ASN1Schema schema) {
		if (this.schema != null) {
			throw new IllegalStateException();
		}
		this.schema = schema;
		for (ASN1Type t : typesExported.values()) {
			t.onExport(schema);
		}
	}

	/**
	 * Returns name of this module
	 *
	 * @return an String
	 */
	public String getName() {
		return moduleId;
	}

	public TaggingMethod getDefaultTaggingMethod() {
		return defaultTaggingMethod;
	}

	/**
	 * Resolves type by its name and moduleId
	 *
	 * @param name     - an String
	 * @param moduleId - an String
	 *
	 * @return an ASN1Type or null
	 */
	public ASN1Type resolveType(final String name, final String moduleId) {
		// if module id is set, then we should check import lists
		if (!getModuleId().equals(moduleId) && moduleId != null) {
			Map<String, ASN1Type> map = importedTypes.get(moduleId);
			return map.get(name);
		}
		// get from internal type list
		ASN1Type type = types.get(name);

		if (type == null && moduleId == null) {
			//if nothing found, try to find it in imported symbols
			for (Map<String, ASN1Type> map : importedTypes.values()) {
				final ASN1Type t = map.get(name);
				if (t != null) { return t; }
			}
		}
		return type;
	}

	private void firePropertyChange(final PropertyChangeEvent evt) {pcs.firePropertyChange(evt);}

	public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(
		                                propertyName,
		                                listener
		                                );
	}

	public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(
		                             propertyName,
		                             listener
		                             );
	}

	public void firePropertyChange(final String propertyName, final Object oldValue, final Object newValue) {
		pcs.firePropertyChange(
		                      propertyName,
		                      oldValue,
		                      newValue
		                      );
	}


	/**
	 * Adds specified type to imports
	 *
	 * @param type
	 */
	public void importType(ASN1Type type) {
		Map<String, ASN1Type> map = importedTypes.get(type.getModule().getModuleId());
		if (map == null) {
			map = new HashMap<String, ASN1Type>();
			importedTypes.put(type.getModule().getModuleId(), map);
		}
		map.put(type.getName(), type);
		firePropertyChange(TYPE_INSTALLED, null, type);
	}

	/**
	 * Installs type in this Module
	 *
	 * @param type
	 */
	public void install(ASN1Type type) {
		//register signatures
		tag2type.put(type.getTag(), type);
		this.class2type.put(type.getHandledClass(), type);
//		types.put(type.getName(), type);
		firePropertyChange(TYPE_INSTALLED, null, type);
	}
}
