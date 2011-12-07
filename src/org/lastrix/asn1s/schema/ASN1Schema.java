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

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.schema.compiler.ASN1Lexer;
import org.lastrix.asn1s.schema.compiler.ASN1Parser;
import org.lastrix.asn1s.schema.compiler.ASN1TreeWalkerImpl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class that should be used to save/load data from binary ASN1 notation format (*.asn1bin)
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Schema {
	private static final Logger logger = Logger.getLogger(ASN1Schema.class);

	/**
	 * Modules in this schema
	 */
	private final Map<String, ASN1Module> modules = new HashMap<String, ASN1Module>();

	/**
	 * Storage for all exports where key is [ModuleName].[TypeName]
	 *
	 * @see #modules
	 */
	private final Map<String, ASN1Type> types = new HashMap<String, ASN1Type>();

	/**
	 * Defines which ASN1Type should handle specified class
	 */
	private final Map<Class, ASN1Type> class2type = new HashMap<Class, ASN1Type>();

	/**
	 * Defines which class handled by ASN1Type
	 */
	private final Map<ASN1Type, Class> type2class = new HashMap<ASN1Type, Class>();

	private Map<String, ASN1Type> simpleIndexedTypes = new HashMap<String, ASN1Type>();

	/**
	 * Create new schema and load modules into it
	 *
	 * @param fileName - the schema file
	 *
	 * @return ASN1Schema or null
	 */
	public static ASN1Schema loadSchema(String fileName) {
		return loadSchema(fileName, null);
	}

	/**
	 * Create new schema and load modules into it
	 *
	 * @param fileName - the schema file
	 * @param s        - the schema where modules  should be stored
	 *
	 * @return ASN1Schema or null
	 */
	public static ASN1Schema loadSchema(String fileName, ASN1Schema s) {
		final ASN1Schema schema = (s == null) ? new ASN1Schema() : s;
		try {
			ASN1Lexer lex = new ASN1Lexer(new ANTLRFileStream(fileName, "UTF8"));
			CommonTokenStream tokens = new CommonTokenStream(lex);


			ASN1Parser parser = new ASN1Parser(tokens);
			ASN1Parser.parse_return r = parser.parse();
			CommonTree t = (CommonTree) r.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);


			ASN1TreeWalkerImpl walker = new ASN1TreeWalkerImpl(nodes, schema);
			walker.downup(t);

			StringBuilder sb = new StringBuilder();
			sb.append("Created schema with starting modules:\n");
			for (ASN1Module m : schema.modules.values()) {
				sb.append(m + "\n");
			}
			logger.info(sb);

//			logger.warn(schema.type2class.keySet());
//			logger.warn(schema.class2type.keySet());
			schema.validate();
			return schema;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private ASN1Schema() {
		addModule(ASN1Module.defaultModule);
		logger.info("Created new schema.");
	}

	private ASN1Schema(Collection<ASN1Module> modules) {
		this();
		for (ASN1Module m : modules) {
			this.modules.put(m.getModuleId(), m);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("Created schema with starting modules:\n");
		for (ASN1Module m : modules) {
			sb.append(m + "\n");
		}
		logger.info(sb);
	}


	/**
	 * Validate schema so there would be no unresolved types in modules and generate type
	 *
	 * @return
	 */
	public boolean validate() {
		return false;
	}

	/**
	 * Add module to this schema, module should invalidated for schema after that.
	 *
	 * @param module - the module to be added
	 */
	public void addModule(final ASN1Module module) {
		modules.put(module.getModuleId(), module);
		module.setSchema(this);
	}

	/**
	 * Register new type in schema scope
	 *
	 * @param type - the ASN1Type
	 */
	void addType(ASN1Type type) {
		types.put(type.getTypeId(), type);
		class2type.put(type.getHandledClass(), type);
		type2class.put(type, type.getHandledClass());
		simpleIndexedTypes.put(type.getName(), type);
	}

	/**
	 * Write object into OutputStream encoding it with ASN.1
	 *
	 * @param o  - the object to be saved
	 * @param os - the output stream
	 */
	public void write(Object o, OutputStream os) throws ASN1Exception, IOException {
		//TODO: implement this
		ASN1Type type = getHandler(o);
		logger.warn(String.format("Selected '%s' for %s", type.getTypeId(), o));
		type.write(o, os, true);
	}

	/**
	 * Read object from InputStream decoding it with ASN.1
	 *
	 * @param is - the InputStream
	 *
	 * @return an Object
	 */
	public Object read(InputStream is) throws ASN1ProtocolException {
		//TODO: implement this
		return null;
	}

	public ASN1Type getHandler(final Object o) {
		return class2type.get(o.getClass());
	}

	public ASN1Type getType(final String name, final String moduleId) {
		ASN1Type t = simpleIndexedTypes.get(name);
		if (t != null) {
			return t;
		}
		return types.get(ASN1Type.makeTypeId(name, moduleId));
	}
}
