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

import org.lastrix.asn1s.schema.compiler.ASN1TreeWalker;

import java.util.Vector;

/**
 * ASN1 Module with type definitions
 *
 * @author lastrix
 * @version 1.0
 */
public class Module {

	private       ASN1Schema                   schema;
	private final String                       moduleId;
	private final ASN1TreeWalker.TaggingMethod defaultTaggingMethod;
	private final boolean                      extensibilityImplied;
	private final boolean                      exportAll;
	private final Vector<String>               exports;
	private final Vector<SymbolsFromModule>    imports;
	private final Vector                       types;

	public Module(
	             final String moduleId,
	             final ASN1TreeWalker.TaggingMethod defaultTaggingMethod,
	             final boolean extensibilityImplied,
	             final boolean exportAll,
	             final Vector<SymbolsFromModule> imports,
	             final Vector types
	             ) {
		this.moduleId = moduleId;
		this.defaultTaggingMethod = defaultTaggingMethod;
		this.extensibilityImplied = extensibilityImplied;
		this.exportAll = exportAll;
		this.exports = null;
		this.imports = imports;
		this.types = types;
	}

	public Module(
	             final String moduleId,
	             final ASN1TreeWalker.TaggingMethod defaultTaggingMethod,
	             final boolean extensibilityImplied,
	             final Vector<String> exports,
	             final Vector<SymbolsFromModule> imports,
	             final Vector types
	             ) {
		this.moduleId = moduleId;
		this.defaultTaggingMethod = defaultTaggingMethod;
		this.extensibilityImplied = extensibilityImplied;
		this.exportAll = false;
		this.exports = exports;
		this.imports = imports;
		this.types = types;
	}

	public String getModuleId() {
		return moduleId;
	}

	@Override
	public String toString() {
		return "Module{" +
		       "moduleId='" + moduleId + '\'' +
		       ", defaultTaggingMethod=" + defaultTaggingMethod +
		       ", extensibilityImplied=" + extensibilityImplied +
		       ", exportAll=" + exportAll +
		       ", exports=" + exports +
		       ", imports=" + imports +
		       ", types=" + types +
		       '}';
	}

	void validate() {
		// TODO: unimplemented method stub

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
		validate();
	}
}
