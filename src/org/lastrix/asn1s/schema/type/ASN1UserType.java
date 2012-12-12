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

package org.lastrix.asn1s.schema.type;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.schema.ASN1KeyStrings;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Schema;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.type.x690.ASN1X690Type;
import org.lastrix.asn1s.type.ASN1ObjectIdentifier;
import org.lastrix.asn1s.type.ASN1RelativeObjectIdentifier;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;

/**
 * Used to handle user defined types. This type SHOULD be created only in typeAssignment structure.
 * This class should work as a box.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1UserType.class);
	protected ASN1Type baseType;

	/**
	 * Flag that shows if type as exported.
	 * Actually this variable has no real use in project.
	 */
	protected boolean exported = false;

	/**
	 * Create user type with name, baseType
	 *
	 * @param name     - the name of user type
	 * @param baseType - the base type which should handle loading/saving
	 * @param clazz
	 *
	 * @throws NullPointerException if name or baseType is null
	 */
	public ASN1UserType(final String name, final ASN1Type baseType, final Class clazz) throws NullPointerException {
		handledClass = clazz;
		if (name == null || baseType == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.baseType = baseType;
		this.typeId = getName();
		invalid();
	}


	@Override
	public ASN1Tag getTag() {
		//we should override this, because base type is tag supplier
		return baseType.getTag();
	}


	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		if (baseType instanceof ASN1UnresolvedType) {
			final ASN1Type t = module.resolveType((ASN1UnresolvedType) baseType);
			if (t == null) {
				new InstallPropertyChangeListener(this, (ASN1UnresolvedType) baseType, getModule());
			} else {
				this.baseType = t;
				doInstall(module);
			}
		} else {
			//now we should add self to index base
			doInstall(module);
		}
	}


	@Override
	public Object read(Object value, final ASN1InputStream asn1is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null) {
			value = makeInstance();
		}
		return baseType.read(value, asn1is, tag, tagCheck);
	}


	@Override
	public void toASN1(final PrintWriter printWriter, final boolean typeAssignment) {
		if (typeAssignment) {
			if (getHandledClass() != null && !(baseType instanceof ASN1X690Type)) {
				printWriter.append(ASN1KeyStrings.ASN1S_class_handling_open);
				printWriter.append(getHandledClass().getName());
				printWriter.append(ASN1KeyStrings.ASN1S_class_handling_close);
			}
			printWriter.append(name);
			printWriter.append(ASN1KeyStrings.ASN1_assignment);
			baseType.toASN1(printWriter, false);
		} else {
			printWriter.append(getName());
		}
	}


	@Override
	public String toString() {
		return "ASN1UserType{" +
		       '\'' + ((module == null) ? "" : module.getModuleId() + ".") +
		       name + '\'' +
		       ", baseType=" + baseType +
		       '}';
	}


	@Override
	public void typeResolved(
	                        final ASN1UnresolvedType unresolved, final ASN1Type resolved
	                        ) {
		if (unresolved == baseType) {
			baseType = resolved;
			try {
				doInstall(getModule());
			} catch (ASN1Exception e) {
				logger.warn("Exception:", e);
			}
		}
	}

	@Override
	public void moduleDeployed() throws ASN1Exception {
		baseType.moduleDeployed();
	}


	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		baseType.write(o, os, header);
	}

	private void doInstall(ASN1Module module) throws ASN1Exception {
		module.install(this);
		if (!(baseType instanceof ASN1UserType) && (baseType.getModule() == null)) {
			baseType.onInstall(module);
		}
		typeId = makeTypeId(getName(), getModuleName());
		valid();
	}

	private Object makeInstance() throws ASN1ReadException {
		if (handledClass == ASN1ObjectIdentifier.class
		    || handledClass == ASN1RelativeObjectIdentifier.class
		    || handledClass.getName().startsWith("java.lang.")
		    || handledClass.isArray()) {
			return null;
		} else {
			try {
				Constructor c = handledClass.getDeclaredConstructor();
				if (!c.isAccessible()) {
					c.setAccessible(true);
				}
				return c.newInstance();
			} catch (Exception e) {
				throw new ASN1ReadException("Can not instantiate handled class.");
			}
		}
	}


	/**
	 * Called when type should be exported. This method could be called only after #onInstall(ASN1Module)
	 *
	 * @param schema - the schema, where type should be.
	 *
	 * @throws IllegalStateException if type already exported
	 */
	public void onExport(ASN1Schema schema) throws IllegalStateException {
		if (exported) {
			throw new IllegalStateException("Type already exported.");
		}
		exported = true;
		schema.install(this);
	}


	/**
	 * Called when type should be imported to module
	 *
	 * @param module - the module
	 *
	 * @throws IllegalStateException if type already imported
	 */
	public void onImport(ASN1Module module) throws IllegalStateException {
		module.importType(this);
	}
}