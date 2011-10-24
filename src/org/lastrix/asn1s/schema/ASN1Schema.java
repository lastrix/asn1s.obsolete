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
import org.lastrix.asn1s.schema.compiler.ASN1Lexer;
import org.lastrix.asn1s.schema.compiler.ASN1Parser;
import org.lastrix.asn1s.schema.compiler.ASN1TreeWalkerImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Base class that should be used to save/load data from binary ASN1 notation format (*.asn1bin)
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Schema {
	private static final Logger logger = Logger.getLogger(ASN1Schema.class);

	private final List<Module>   modules = new ArrayList<Module>();
	/**
	 * List that holds every type exported from modules
	 *
	 * @see #modules
	 */
	private final List<ASN1Type> types   = new ArrayList<ASN1Type>();

	public static ASN1Schema loadSchema(String fileName) {
		return loadSchema(fileName, null);
	}

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
			for (Module m : schema.modules) {
				sb.append(m + "\n");
			}
			logger.info(sb);
			return schema;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private ASN1Schema() {
		logger.info("Created new schema.");
	}

	private ASN1Schema(Collection<Module> modules) {
		this.modules.addAll(modules);
		StringBuilder sb = new StringBuilder();
		sb.append("Created schema with starting modules:\n");
		for (Module m : modules) {
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
	public void addModule(final Module module) {
		modules.add(module);
	}
}
