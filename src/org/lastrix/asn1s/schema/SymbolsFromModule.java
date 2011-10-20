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

import java.util.Vector;

/**
 * @author lastrix
 * @version 1.0
 */
public class SymbolsFromModule {
	private final String moduleName;

	private final Vector<String> symbols;

	public SymbolsFromModule(final String moduleName, final Vector<String> symbols) {
		this.moduleName = moduleName;
		this.symbols = symbols;
	}

	public String getModuleName() {
		return moduleName;
	}

	public Vector<String> getSymbols() {
		return symbols;
	}

	@Override
	public String toString() {
		return "SymbolsFromModule{" + symbols +
		       " FROM " + moduleName +
		       '}';
	}
}
