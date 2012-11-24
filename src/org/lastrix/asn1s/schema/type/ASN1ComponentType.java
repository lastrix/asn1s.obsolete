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
import org.lastrix.asn1s.exception.*;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

/**
 * Class for writing/reading specified object's field to/from ASN.1 notation.
 * This class doesn't check object class, just tries to get a field
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1ComponentType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1ComponentType.class);

	private final String   fieldName;
	private       ASN1Type type;
	private final boolean optional = false;
	private Field field;
//	private final Object defaultValue;


	public ASN1ComponentType(final String fieldName, final ASN1Type type) {
		this.name = type.getName();
		this.type = type;
		this.fieldName = fieldName;
		this.typeId = getName();
		invalid();
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
		//let's find field with name in object class
		field = findField(o.getClass());
		Object value = null;
		try {
			value = field.get(o);
		} catch (IllegalAccessException e) {
			throw new ASN1Exception(e);
		}
		type.write(value, os, true);
	}

	private Field findField(final Class clazz) throws ASN1Exception {
		Field f = null;
		Class c = clazz;
		while (c != null) {
			try {
				f = c.getDeclaredField(fieldName);
				f.setAccessible(true);
			} catch (NoSuchFieldException e) {
			}
			c = c.getSuperclass();
		}
		if (f == null) { throw new ASN1NoSuchFieldException(String.format("No %s in %s.", name, clazz)); }
		return f;
	}

	@Override
	public String getTypeString(final String prefix) {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(fieldName);
		sb.append("\t");
		sb.append(type.getTypeId());
		return sb.toString();
	}

	@Override
	public Object read(final Object value, final InputStream is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null || tag == null) {
			throw new NullPointerException();
		}
		field = findField(value.getClass());
		// type should know about which class to make and etc, so it should return valid object... probably. I hope so.
		try {
			// underlying type reader should always test header.
			final Object ro = type.read(null, is, tag, true);
			try {
				field.set(value, ro);
			} catch (Exception e) {
				//we should catch everything, i don't trust it.
				e.printStackTrace();
				throw new ASN1ReadException("Unable to setup new value of field '" + name + "'.");
			}
		} catch (ASN1IncorrectTagException e) {
			//we can allow state when object is not read only if it optional
			if (optional) {
				throw new ASN1OptionalComponentSkippedException();
			} else {
				//if not, so throw it again! :)
				throw e;
			}
		}
		//we should always return null here. Since we're not type readers, we are auxiliary modifier.
		return null;
	}

	@Override
	public String toString() {
		return name + " " + type;
	}

	@Override
	public void onInstall(final ASN1Module module, final boolean register) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		if (type instanceof ASN1UnresolvedType) {
			final ASN1Type t = module.resolveType((ASN1UnresolvedType) type);
			if (t == null) {
				module.addPropertyChangeListener(
				                                ASN1Module.TYPE_INSTALLED, new PropertyChangeListener() {
					@Override
					public void propertyChange(final PropertyChangeEvent evt) {
						if (evt.getNewValue() instanceof ASN1Type) {
							final ASN1Type _type = (ASN1Type) evt.getNewValue();
							if (_type.getName().equals(type.getName()) &&
							    (type.getModuleName() == null
							     || _type.getModuleName().equals(type.getModuleName()))) {
								module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
								try {
									ASN1ComponentType.this.type = _type;
									doInstall(module, register);
								} catch (ASN1Exception e) {
									logger.warn("Exception:", e);
								}
							}
						}
					}
				}
				                                );
			} else {
				this.type = t;
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
		if (!(type instanceof ASN1UserType) && (type.getModule() == null)) {
			type.onInstall(module, false);
		}
		typeId = makeTypeId(getName(), getModuleName());
		valid();
	}

	@Override
	public ASN1Tag getTag() {
		return type.getTag();
	}

	@Override
	public void toASN1(final StringBuilder sb) {
		sb.append(fieldName);
		sb.append(" ");
		sb.append(type.getTypeId());
	}
}
