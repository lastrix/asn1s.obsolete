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

package org.lastrix.asn1s.schema.type.x690;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1ModuleId;
import org.lastrix.asn1s.schema.SymbolsFromModule;
import org.lastrix.asn1s.schema.TaggingMethod;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UserType;

import java.util.Vector;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1X690Module extends ASN1Module {
	private final static Logger logger      = Logger.getLogger(ASN1X690Module.class);
	public final static  String MODULE_NAME = "__DEFAULT__";
	/**
	 * Holds all types that should be imported in any module
	 */
	public final static SymbolsFromModule IMPORTS;

	static {
		Vector<String> items = new Vector<String>();
		items.add(ASN1Integer.NAME);
		items.add(ASN1Integer.NAME + "-Byte");
		items.add(ASN1Integer.NAME + "-Short");
		items.add(ASN1Integer.NAME + "-Integer");
		items.add(ASN1Real.NAME);
		items.add(ASN1Real.NAME + "-Float");
		items.add(ASN1UTF8String.NAME);
		items.add(ASN1OctetString.NAME);
		items.add(ASN1Null.NAME);
		items.add(ASN1Boolean.NAME);
		items.add(ASN1BitString.NAME);
		items.add(ASN1ObjectID.NAME);
		items.add(ASN1RelativeOID.NAME);
		IMPORTS = new SymbolsFromModule(MODULE_NAME, items);
	}

	/**
	 * Create ASN1 module that holds all default ASN.1 types.
	 */
	public ASN1X690Module() {
		super(new ASN1ModuleId(MODULE_NAME, null), TaggingMethod.EXPLICIT, false, true, null, null, null);
		//only ASN1UserType could act as root type, and only this kind could be exported or imported.
		addType(createTypeFor(new ASN1Integer(Long.class)));
		addType(createTypeFor(new ASN1Integer(Integer.class)));
		addType(createTypeFor(new ASN1Integer(Integer.class)));
		addType(createTypeFor(new ASN1Integer(Short.class)));
		addType(createTypeFor(new ASN1Integer(Byte.class)));
		addType(createTypeFor(new ASN1Real(Float.class)));
		addType(createTypeFor(new ASN1Real(Double.class)));
		addType(createTypeFor(new ASN1UTF8String()));
		addType(createTypeFor(new ASN1OctetString()));
		addType(createTypeFor(new ASN1Null()));
		addType(createTypeFor(new ASN1Boolean()));
		addType(createTypeFor(new ASN1BitString()));
		addType(createTypeFor(new ASN1ObjectID()));
		addType(createTypeFor(new ASN1RelativeOID()));
	}

	private ASN1UserType createTypeFor(ASN1Type type) {
		return new ASN1UserType(type.getName(), type, type.getHandledClass());
	}

	/**
	 * Private helper method to perform same operations on each type.
	 *
	 * @param type - the ASN1Type
	 */
	private void addType(ASN1UserType type) {
		types.put(type.getName(), type);
	}

	@Override
	public void importType(final ASN1Type type) {
		// no type could be imported to this module
	}
}
