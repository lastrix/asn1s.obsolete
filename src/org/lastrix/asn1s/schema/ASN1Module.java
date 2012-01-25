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
import org.lastrix.asn1s.schema.type.ASN1TaggedType;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UnresolvedType;
import org.lastrix.asn1s.schema.type.ASN1UserType;
import org.lastrix.asn1s.schema.type.x690.ASN1X690Module;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;

/**
 * Declares ASN.1 module as expected in ITU-T X.680 and ITU-T X.690.
 * Holds all types and local index table to easy search and deploy.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Module {
	private final static Logger logger         = Logger.getLogger(ASN1Module.class);
	/**
	 * Constant used in property change support to notify about new type installation.
	 */
	public static final  String TYPE_INSTALLED = "typeInstalled";

	/**
	 * Link to schema which uses this module.
	 */
	private ASN1Schema schema;

	/**
	 * This module id. Any module should have its module id, see ITU-T X.680 paragraph 12.1
	 */
	private final ASN1ModuleId moduleId;

	/**
	 * Default tagging method in this module.
	 * This variable primarily used in {@link ASN1TaggedType}
	 */
	private final TaggingMethod defaultTaggingMethod;

	/**
	 * Flag that allows user to extend types as it wants.
	 * IS NOT SUPPORTED YET.
	 */
	private final boolean extensibilityImplied;

	/**
	 * Flag to tell exporter, whether all types or only listed should be exported.
	 */
	private final boolean exportAll;

	/**
	 * List of references to types and etc, that should be exported.
	 * This list could be overriden by setting {@link #exportAll}, if set to true this list will not be used.
	 */
	private final List<String> exports;

	/**
	 * List of imports that would be loaded from global type base (Schema)
	 */
	private final List<SymbolsFromModule> imports;

	/**
	 * List of types that exactly exported.
	 */
	protected final Map<String, ASN1Type> typesExported = new HashMap<String, ASN1Type>();

	/**
	 * List of types beeing actually imported and registered in this module.
	 */
	protected final Map<String, Map<String, ASN1Type>> importedTypes = new HashMap<String, Map<String, ASN1Type>>();

	/**
	 * The property change support used to notify users about installation of new types
	 */
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
	                 final ASN1ModuleId moduleId,
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
	                 final ASN1ModuleId moduleId,
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
	                    final ASN1ModuleId moduleId,
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
	 * Returns module id.
	 *
	 * @return an ASN1ModuleId
	 */
	public ASN1ModuleId getModuleId() {
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
	 * Setup schema for this module, you can not set schema if it is already not null.
	 * Validation called inside.
	 *
	 * @param schema - the schema
	 */
	private void setSchema(final ASN1Schema schema) {
		if (this.schema != null) {
			throw new IllegalStateException();
		}
		this.schema = schema;
	}

	/**
	 * Returns name of this module
	 *
	 * @return an String
	 */
	public String getName() {
		return getModuleId().getModuleName();
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
		if (!getName().equals(moduleId) && moduleId != null) {
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

	/**
	 * Resolves an unresolved type and returns null or valid one.
	 *
	 * @param type - an ASN1UnresolvedType instance
	 *
	 * @return null or ASN1Type object
	 */
	public ASN1Type resolveType(ASN1UnresolvedType type) {
		return resolveType(type.getName(), type.getModuleName());
	}

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
		if (type != null) {
			Map<String, ASN1Type> map = importedTypes.get(type.getModuleName());
			if (map == null) {
				map = new HashMap<String, ASN1Type>();
				importedTypes.put(type.getModuleName(), map);
			}
			map.put(type.getName(), type);
			firePropertyChange(TYPE_INSTALLED, null, type);
		} else {
			logger.warn("Someone imports null type.");
		}
	}

	/**
	 * Installs type in this Module
	 *
	 * @param type
	 */
	public void install(ASN1Type type) {
//		types.put(type.getName(), type);
		firePropertyChange(TYPE_INSTALLED, null, type);
	}

	/**
	 * Deploy module to target schema, this includes:
	 * 1. fetching imports from schema
	 * 2. installing types in this module as it should be.
	 * 3. exporting types to schema
	 *
	 * @param schema
	 */
	public void deploy(final ASN1Schema schema) throws ASN1Exception {
		logger.warn("Deploying module " + getModuleId());
		//if schema already set, this will fail
		// preventing further execution
		setSchema(schema);

		//get default imports
		getImports(schema, ASN1X690Module.IMPORTS);
		//get imports
		for (SymbolsFromModule sfm : imports) {
			getImports(schema, sfm);
		}

		//first install types
		for (ASN1Type t : types.values()) {
			t.onInstall(this, true);
		}

		for (String typeName : exports) {
			final ASN1Type type = types.get(typeName);
			if (type == null) {
				throw new NullPointerException();
			}
			typesExported.put(typeName, type);
		}
		//now we could export types
		for (final ASN1Type t : (exportAll) ? types.values() : typesExported.values()) {
			if (t.isValid()) {
				t.onExport(schema);
			} else {
				//setup listener, which should export type later
				t.addPropertyChangeListener(
				                           ASN1Type.VALID, new PropertyChangeListener() {
					@Override
					public void propertyChange(final PropertyChangeEvent evt) {
						if (Boolean.TRUE.equals(evt.getNewValue())) {
							t.removePropertyChangeListener(ASN1Type.VALID, this);
							t.onExport(schema);
						}
					}
				}
				                           );
			}
		}
	}

	/**
	 * Retrieves imports from schema
	 *
	 * @param schema - the schema
	 * @param sfm    - the SymbolsFromModule object
	 */
	private void getImports(final ASN1Schema schema, final SymbolsFromModule sfm) {
		for (final String typeName : sfm.getSymbols()) {
			final ASN1Type type = schema.getType(typeName, sfm.getModuleName());
			if (type != null) {
				importType(type);
			} else {
				//if no such type - then add a listener and wait. it's all we could do here.
				schema.addPropertyChangeListener(
				                                ASN1Schema.TYPE_INSTALLED, new PropertyChangeListener() {
					@Override
					public void propertyChange(final PropertyChangeEvent evt) {
						if (evt.getNewValue() instanceof ASN1Type) {
							final ASN1Type type = (ASN1Type) evt.getNewValue();
							if (typeName.equals(type.getName()) && sfm.getModuleName().equals(type.getModuleName())) {
								importType(type);
								schema.removePropertyChangeListener(ASN1Schema.TYPE_INSTALLED, this);
							}
						}
					}
				}
				                                );
			}
		}
	}

	public void printDebugInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Types:\n");
		for (ASN1Type t : types.values()) {
			sb.append(String.format("%s%s\n", t.isValid() ? "" : "*", t.getTypeId()));
		}
		sb.append("Imported types:\n");
		for (Map<String, ASN1Type> map : importedTypes.values()) {
			sb.append(map + "\n");
		}
		logger.info(sb);
	}
}
