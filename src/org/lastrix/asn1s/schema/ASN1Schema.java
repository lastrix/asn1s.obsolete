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

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.schema.compiler.ASN1TreeWalkerImpl;
import org.lastrix.asn1s.schema.compiler.generated.ASN1Lexer;
import org.lastrix.asn1s.schema.compiler.generated.ASN1Parser;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.x690.ASN1X690Module;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * This class performs Module management, index control and user helping via methods {@link #read(InputStream)}
 * and {@link #write(Object, OutputStream)}. Those methods help you read or write objects from or to streams.
 * This process uses preloaded data, stored in ASN.1 schemas as defined in ITU-T X.680. Each loaded schema contains
 * some modules, which give you a list of exported types. Only exported types could be seen from ASN1Schema, and,
 * of course, used by {@link #read(InputStream)} and {@link #write(Object, OutputStream)} methods.
 * To get starting with ASN1Schema you may make a clean copy of it by calling empty constructor. This clean schema
 * contains only basic types defined in ITU-T X.680 and ITU-T X.690, except sequences, sets and other complex
 * objects that can not be "just loaded".
 * The complete list of allowed types listed in {@link ASN1X690Module.IMPORTS};
 *
 * @author lastrix
 * @version 1.0
 */
public final class ASN1Schema {

	/**
	 * Constant used in property change firing to let listeners know about new type installation.
	 */
	public final static String TYPE_INSTALLED = "typeInstalled";

	/**
	 * Create new schema and load modules into it
	 *
	 * @param fileName - the schema file
	 *
	 * @return ASN1Schema or null
	 */
	public static ASN1Schema loadSchema(String fileName) throws ASN1Exception {
		return loadSchema(fileName, null);
	}

	/**
	 * Create new schema (if necessary) and load modules into it
	 *
	 * @param fileName - the schema file
	 * @param s        - the schema where modules  should be stored
	 *
	 * @return ASN1Schema or null
	 */
	public static ASN1Schema loadSchema(String fileName, ASN1Schema s) throws ASN1Exception {
		final ASN1Schema schema = (s == null) ? new ASN1Schema() : s;
		try {
			// please read more about this in ANTLR documentation and tutorials.
			ASN1Lexer lex = new ASN1Lexer(new ANTLRFileStream(fileName, "UTF8"));
			CommonTokenStream tokens = new CommonTokenStream(lex);


			ASN1Parser parser = new ASN1Parser(tokens);
			ASN1Parser.parse_return r = parser.parse();


			CommonTree t = (CommonTree) r.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);


			ASN1TreeWalkerImpl walker = new ASN1TreeWalkerImpl(nodes, schema);
			walker.downup(t);

			// schema already contain all fetched modules
			return schema;
		} catch (Exception e) {
			throw new ASN1Exception(e);
		}
	}

	/**
	 * Modules in this schema
	 */
	private final Map<String, ASN1Module> modules = new HashMap<String, ASN1Module>();

	/**
	 * Defines which ASN1Type should handle specified class
	 */
	private final Map<Class, ASN1Type> class2type = new HashMap<Class, ASN1Type>();

	/**
	 * Each type has it's own tag, and it should be unique
	 */
	private final Map<ASN1Tag, ASN1Type> tag2type = new HashMap<ASN1Tag, ASN1Type>();

	/**
	 * Stores all types sorted by their module
	 */
	private final Map<String, Map<String, ASN1Type>> types = new HashMap<String, Map<String, ASN1Type>>();

	/**
	 * Property change support to let listeners know about new type installation.
	 */
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	/**
	 * Default constructor. Makes schema with default types.
	 */
	public ASN1Schema() throws ASN1Exception {
		addModule(new ASN1X690Module());
	}

	/**
	 * Add module to this schema, module should invalidated for schema after that.
	 *
	 * @param module - the module to be added
	 */
	public void addModule(final ASN1Module module) throws ASN1Exception {
		//if it fail, no module would be added.
		module.deploy(this);
		modules.put(module.getName(), module);
	}

	/**
	 * Returns type by its full type id (moduleName.name)
	 *
	 * @param name     - type name
	 * @param moduleId - module id
	 *
	 * @return
	 */
	public ASN1Type getType(final String name, final String moduleId) {
		Map<String, ASN1Type> map = types.get(moduleId);
		if (map != null) {
			return map.get(name);
		}
		return null;
	}


	/**
	 * Install type in this schema, this will make specified type as global type
	 * that could be used in {@link #read(InputStream)} and {@link #write(Object, OutputStream)}
	 *
	 * @param type - the type to be installed
	 */
	public void install(final ASN1Type type) {
		if (type == null) {
			throw new NullPointerException();
		}
		// get module's map which holds exports for type's module
		Map<String, ASN1Type> map = types.get(type.getModule().getName());
		if (map == null) {
			map = new HashMap<String, ASN1Type>();
			types.put(type.getModule().getName(), map);
		}
		map.put(type.getName(), type);

		// build index
		tag2type.put(type.getTag(), type);
		class2type.put(type.getHandledClass(), type);

		// notification
		firePropertyChange(TYPE_INSTALLED, null, type);
	}

	/**
	 * Read object from InputStream decoding it with ASN.1
	 *
	 * @param is - the InputStream
	 *
	 * @return an Object
	 */
	public Object read(InputStream is) throws ASN1Exception, IOException {
		final ASN1Tag tag = ASN1Tag.readTag(is);
		return getHandler(tag).read(null, is, tag, true);
	}

	/**
	 * Write object into OutputStream encoding it with ASN.1
	 *
	 * @param o  - the object to be saved
	 * @param os - the output stream
	 */
	public void write(Object o, OutputStream os) throws ASN1Exception, IOException {
		getHandler(o).write(o, os, true);
	}

	public String getModulesString() {
		StringBuilder sb = new StringBuilder();
		for (String s : modules.keySet()) {
			sb.append(s);
			sb.append("\n");
		}
		return sb.toString();
	}

	public String getTypesString() {
		StringBuilder sb = new StringBuilder();
		for (String module : types.keySet()) {
			sb.append("From module '");
			sb.append(module);
			sb.append("':\n");
			final Map<String, ASN1Type> tl = types.get(module);
			for (String typeName : tl.keySet()) {
				sb.append("\t");
				sb.append(typeName);
				sb.append(" of type '");
				sb.append(tl.get(typeName).getClass().getSimpleName());
				sb.append("':\n");
				sb.append(tl.get(typeName).getTypeString("\t\t"));
				sb.append("\n");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	// ------------------------------------------------------------------------ //
	// ----------------------- PRIVATE METHODS -------------------------------- //
	// ------------------------------------------------------------------------ //

	/**
	 * Returns handler for certain tag
	 *
	 * @param tag - an ASN1Tag
	 *
	 * @return an ASN1Type
	 *
	 * @see #read(InputStream)
	 */
	private ASN1Type getHandler(final ASN1Tag tag) {
		return tag2type.get(tag);
	}

	/**
	 * Returns handler for certain class
	 *
	 * @param o - the object
	 *
	 * @return an ASN1Type
	 *
	 * @see #write(Object, OutputStream)
	 */
	private ASN1Type getHandler(final Object o) {
		if (o == null) {
			return class2type.get(null);
		}
		return class2type.get(o.getClass());
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
	public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
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
	public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
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
	protected void firePropertyChange(final String propertyName, final Object oldValue, final Object newValue) {
		pcs.firePropertyChange(
		                      propertyName,
		                      oldValue,
		                      newValue
		                      );
	}

}
