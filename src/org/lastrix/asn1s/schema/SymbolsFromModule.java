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

import java.io.PrintWriter;
import java.util.List;

/**
 * This class used to hold data about import block, as described in ITU-T X.680 paragraph 12.1
 *
 * @author lastrix
 * @version 1.0
 */
public class SymbolsFromModule implements ASN1SchemaObject {
	/**
	 * full module name as declared in ITU-T X.680
	 */
	private final String moduleName;

	/**
	 * List of typereferences as declared in ITU-T X.680
	 */
	private final List<String> symbols;

	/**
	 * Create new SymbolsFromModule
	 *
	 * @param moduleName - name of module
	 * @param symbols    - list of symbols
	 */
	public SymbolsFromModule(final String moduleName, final List<String> symbols) {
		this.moduleName = moduleName;
		this.symbols = symbols;
	}

	public String getModuleName() {
		return moduleName;
	}

	public List<String> getSymbols() {
		return symbols;
	}

	@Override
	public String toString() {
		return "SymbolsFromModule{" + symbols +
		       " FROM " + moduleName +
		       '}';
	}

	@Override
	public void toASN1(final PrintWriter pw, final boolean typeAssignment) {
		int i = 0;
		for (String name : getSymbols()) {
			pw.append(name);
			if (++i < getSymbols().size()) {
				pw.append(", ");
			}
		}
		pw.append(" FROM ");
		pw.append(getModuleName());
	}
}
