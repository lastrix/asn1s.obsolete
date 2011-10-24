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
import org.lastrix.asn1s.schema.compiler.ASN1TreeWalker;

import java.util.*;

/**
 * ASN1 ASN1Module with type definitions
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Module {
	private final static Logger     logger        = Logger.getLogger(ASN1Module.class);
	/**
	 * Default module that holds all basic objects present in ASN.1, this module automatically injected into any ASN1Schema. This module name contains
	 * some characters that not allowed in ASN.1 spec, so no one would hide it.
	 */
	static final         ASN1Module defaultModule = new ASN1Module(
	                                                              "--DEFAULT--", ASN1TreeWalker.TaggingMethod.IMPLICIT, false, true, null,
	                                                              new Vector()
	);

	static {
		registerType(new ASN1Integer(), defaultModule);
	}

	/**
	 * Registers type in module, sets type's module to module
	 *
	 * @param type   - the type
	 * @param module - the module
	 */
	private static void registerType(ASN1Type type, ASN1Module module) {
		type.setModule(module);
		module.types.put(type.getName(), type);
		if (module.exportAll || module.exports.contains(type.getName())) {
			module.typesExported.put(type.getName(), type);
		}
//		logger.warn(String.format("Registered type %s in %s.", type.getTypeId(), module.getModuleId()));
	}

	private       ASN1Schema                   schema;
	private final String                       moduleId;
	private final ASN1TreeWalker.TaggingMethod defaultTaggingMethod;
	private final boolean                      extensibilityImplied;
	private final boolean                      exportAll;
	private final List<String>                 exports;
	private final List<SymbolsFromModule>      imports;
	private final Map<String, ASN1Type> typesExported = new HashMap<String, ASN1Type>();

	/**
	 * Defines which ASN1Type should handle specified class
	 */
	private final Map<Class, ASN1Type> class2type = new HashMap<Class, ASN1Type>();

	/**
	 * Defines which class handled by ASN1Type
	 */
	private final Map<ASN1Type, Class> type2class = new HashMap<ASN1Type, Class>();

	/**
	 * Storage for all exports where key is [TypeName]
	 */
	private final Map<String, ASN1Type> types = new HashMap<String, ASN1Type>();

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
	                 final ASN1TreeWalker.TaggingMethod defaultTaggingMethod,
	                 final boolean extensibilityImplied,
	                 final boolean exportAll,
	                 final Vector<SymbolsFromModule> imports,
	                 final Vector<ASN1Type> types
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
	                 final ASN1TreeWalker.TaggingMethod defaultTaggingMethod,
	                 final boolean extensibilityImplied,
	                 final Vector<String> exports,
	                 final Vector<SymbolsFromModule> imports,
	                 final Vector<ASN1Type> types
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
	private ASN1Module(
	                  final String moduleId,
	                  final ASN1TreeWalker.TaggingMethod defaultTaggingMethod,
	                  final boolean extensibilityImplied,
	                  final boolean exportAll,
	                  final Vector<String> exports,
	                  final Vector<SymbolsFromModule> imports,
	                  final Vector<ASN1Type> types
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
			for (ASN1Type t : types) {
//				logger.warn("Registering type " + t);
				registerType(t, this);
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
		// TODO: unimplemented method stub
		//check exports
		for (String s : exports) {
			if (!(typesExported.get(s) instanceof ASN1Type) || typesExported.get(s) instanceof ASN1UnresolvedType) {
				logger.warn(String.format("Symbols '%s' declared in exports, but type is not found in this module.", s));
			}
		}
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
			schema.addType(t);
		}
		validate();
	}

	/**
	 * Returns name of this module
	 *
	 * @return an String
	 */
	public String getName() {
		return moduleId;
	}

	ASN1Type getHandler(Object o) {
		ASN1Type result = class2type.get(o.getClass());
		if (result == null) {
			return getSchema().getHandler(o);
		}
		return result;
	}
}
