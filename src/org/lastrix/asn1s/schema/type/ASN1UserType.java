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
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;

/**
 * Used to handle user defined types.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserType extends ASN1Type {

	private final static Logger logger = Logger.getLogger(ASN1UserType.class);
	private ASN1Type baseType;

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
		invalid();
	}

	@Override
	public String toString() {
		return "ASN1UserType{" +
		       '\'' + ((module == null) ? "" : module.getModuleId() + ".") +
		       name + '\'' +
		       ", baseType=" + baseType +
		       '}';
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

	@Override
	public Object read(Object value, final InputStream is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		if (value != null) {
			throw new IllegalArgumentException("ASN1Integer does not allow non null parameter 'value'");
		}
		// we does not have any headers here, so leave it for underlying type reader.

		// does not allow java. objects instantiation.
		//FIXME: find a better way here.
		if (handledClass.getName().startsWith("java.")) {
			return baseType.read(null, is, tag, tagCheck);
		} else {
			value = makeInstance();
			return baseType.read(value, is, tag, tagCheck);
		}
	}

	private Object makeInstance() throws ASN1ReadException {
		try {
			Constructor c = handledClass.getConstructor();
			return c.newInstance();
		} catch (Exception e) {
			throw new ASN1ReadException("Can not instantiate handled class.");
		}
	}

	@Override
	public void onInstall(final ASN1Module module, final boolean register) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		if (baseType instanceof ASN1UnresolvedType) {
			final ASN1Type t = module.resolveType((ASN1UnresolvedType) baseType);
			if (t == null) {
				module.addPropertyChangeListener(
				                                ASN1Module.TYPE_INSTALLED, new PropertyChangeListener() {
					@Override
					public void propertyChange(final PropertyChangeEvent evt) {
						if (evt.getNewValue() instanceof ASN1Type) {
							final ASN1Type type = (ASN1Type) evt.getNewValue();
							if (type.getName().equals(baseType.getName()) &&
							    (((ASN1UnresolvedType) baseType).getModuleName() == null
							     || type.getModule().getName().equals(((ASN1UnresolvedType) baseType).getModuleName()))) {
								module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
								baseType = type;
								try {
									doInstall(module, register);
								} catch (ASN1Exception e) {
									logger.error("Exception:", e);
								}
							}
						}
					}
				}
				                                );
			} else {
				this.baseType = t;
				doInstall(module, register);
			}
		} else {
			//now we should add self to index base
			doInstall(module, register);
		}
	}

	private void doInstall(ASN1Module module, final boolean register) throws ASN1Exception {
		if (register) {
			module.install(this);
		}
		if (!(baseType instanceof ASN1UserType) && (baseType.getModule() == null)) {
			baseType.onInstall(module, false);
		}
		valid();
	}

	@Override
	public ASN1Tag getTag() {
		//we should override this, because base type is tag supplier
		return baseType.getTag();
	}

	@Override
	public String getTypeString(final String prefix) {
		return prefix + name + " " + baseType.getTypeString(prefix);
	}
}
