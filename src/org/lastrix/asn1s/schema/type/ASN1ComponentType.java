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
import org.lastrix.asn1s.schema.ASN1Schema;
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

	private final String   name;
	private       ASN1Type type;
	private final boolean optional = false;
//	private final Object defaultValue;


	public ASN1ComponentType(final String name, final ASN1Type type) {
		this.name = name;
		this.type = type;
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
		Field f = findField(o);

		Object value = null;
		try {
			value = f.get(o);
		} catch (IllegalAccessException e) {
			throw new ASN1Exception(e);
		}
		type.write(value, os, true);
	}

	private Field findField(final Object o) throws ASN1ProtocolException {
		Field f = null;
		Class c = o.getClass();
		while (c != null) {
			try {
				f = c.getDeclaredField(name);
				f.setAccessible(true);
			} catch (NoSuchFieldException e) {
			}
			c = c.getSuperclass();
		}
		if (f == null) { throw new ASN1ProtocolException("Object 'o' have got no field named " + name); }
		return f;
	}

	@Override
	public Object read(final Object value, final InputStream is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null || tag == null) {
			throw new NullPointerException();
		}
		Field f = findField(value);
		// type should know about which class to make and etc, so it should return valid object... probably. I hope so.
		try {
			// underlying type reader should always test header.
			final Object ro = type.read(null, is, tag, true);
			try {
				f.set(value, ro);
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
	public boolean isConstructed() {
		return type.isConstructed();
	}

	@Override
	public String toString() {
		return name + " " + type;
	}

	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		if (ASN1ComponentType.this.type instanceof ASN1UnresolvedType) {
			module.addPropertyChangeListener(
			                                ASN1Module.TYPE_INSTALLED, new PropertyChangeListener() {
				@Override
				public void propertyChange(final PropertyChangeEvent evt) {
					if (evt.getNewValue() instanceof ASN1Type) {
						final ASN1Type type = (ASN1Type) evt.getNewValue();
						if (type.getName().equals(ASN1ComponentType.this.type.getName())) {
							ASN1ComponentType.this.type = type;
							module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
							module.install(ASN1ComponentType.this);
						}
					}
				}
			}
			                                );
		} else {
			//now we should add self to index base
			module.install(this);
		}
	}

	@Override
	public void onExport(final ASN1Schema schema) throws IllegalStateException {
		// TODO: unimplemented method stub

	}

	@Override
	public void onImport(final ASN1Module module) throws IllegalStateException {
		module.importType(this);
	}

	@Override
	public void resolveTypes() {
		// TODO: unimplemented method stub

	}

	@Override
	public boolean isValid() {
		// TODO: unimplemented method stub
		return false;
	}

	@Override
	public ASN1Tag getTag() {
		return type.getTag();
	}
}
