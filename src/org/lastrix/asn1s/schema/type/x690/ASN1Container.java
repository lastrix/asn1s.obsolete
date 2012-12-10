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
import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1NoSuchFieldException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.exception.ASN1UniquenessViolationException;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.type.ASN1ComponentType;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.schema.type.ASN1UnresolvedType;
import org.lastrix.asn1s.schema.type.ASN1UserType;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * This class made to handle componentType's installing.
 *
 * @author lastrix
 * @version 1.0
 */
abstract class ASN1Container extends ASN1X690Type {
	private final HashMap<ASN1Tag, ASN1ComponentType> tag2type   = new HashMap<ASN1Tag, ASN1ComponentType>();
	private final HashMap<Class, ASN1ComponentType>   class2type = new HashMap<Class, ASN1ComponentType>();
	private final Logger                              logger     = Logger.getLogger(ASN1Container.class);
	private final Map<ASN1ComponentType, Boolean>     readState  = new HashMap<ASN1ComponentType, Boolean>();
	protected final ASN1ComponentType[] componentType;
	protected final boolean             of;
	private final   boolean             tagsUnique;

	/**
	 * Create an abstract container
	 *
	 * @param componentType
	 * @param of
	 * @param name
	 * @param tag
	 * @param tagsUnique
	 */
	protected ASN1Container(
	                       final ASN1ComponentType[] componentType,
	                       final boolean of,
	                       final String name,
	                       final ASN1Tag tag,
	                       final boolean tagsUnique
	                       ) {
		this.componentType = componentType;
		this.of = of;
		this.tagsUnique = tagsUnique;
		this.name = name;
		this.tag = tag;
		this.typeId = name;
	}


	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException(getTypeId());
		}

		setModule(module);

		registerComponentTypeListenters(module);

		for (int i = 0; i < componentType.length; i++) {
			final ASN1Type type = componentType[i];
			if (type instanceof ASN1UnresolvedType) {
				final ASN1ComponentType t = (ASN1ComponentType) module.resolveType((ASN1UnresolvedType) type);
				if (t == null) {
					new MyPropertyChangeListener((ASN1UnresolvedType) type, module, i);
				} else {
					componentType[i] = t;
					doInstall(module, componentType[i]);
				}
			} else {
				//now we should add self to index base
				doInstall(module, componentType[i]);
			}
		}
	}

	private void doInstall(final ASN1Module module, final ASN1Type type) throws ASN1Exception {
		if (!(type instanceof ASN1UserType) && (type.getModule() == null)) {
			type.onInstall(module);
		}
	}


	/**
	 * @param clazz
	 *
	 * @return
	 *
	 * @throws ASN1NoSuchFieldException
	 */
	private Field findField(final ASN1ComponentType type, final Class clazz) throws ASN1NoSuchFieldException {
		Field f = null;
		Class c = clazz;
		while (c != null) {
			try {
				f = c.getDeclaredField(type.getFieldName());
				f.setAccessible(true);
			} catch (NoSuchFieldException e) {
			}
			c = c.getSuperclass();
		}
		if (f == null) { throw new ASN1NoSuchFieldException(String.format("No %s in %s.", type.getFieldName(), clazz)); }
		return f;
	}

	private void registerComponentTypeListenters(final ASN1Module module) {
		final PropertyChangeListener pcl = new PropertyChangeListener() {
			@Override
			public void propertyChange(final PropertyChangeEvent evt) {
				if (Boolean.TRUE.equals(evt.getNewValue())) {
					for (ASN1Type type : componentType) {
						if (!type.isValid()) {
							return;
						}
					}
					for (ASN1Type type : componentType) {
						type.removePropertyChangeListener(VALID, this);
					}

					valid();
				}
			}
		};

		for (ASN1Type t : componentType) {
			t.addPropertyChangeListener(VALID, pcl);
		}
	}

	protected void checkRead() throws ASN1ProtocolException {
		for (ASN1ComponentType t : componentType) {
			if (!readState.get(t) && !t.isOptional()) {
				throw new ASN1ProtocolException(String.format("Data corruption possible. Not all fields had been read."));
			}
		}
	}

	protected void cleanState() {
		for (final ASN1ComponentType t : componentType) {
			readState.put(t, Boolean.FALSE);
		}
	}


	/**
	 * Helper function to get field's value
	 *
	 * @param parent
	 * @param type
	 *
	 * @return
	 *
	 * @throws ASN1Exception
	 */
	protected Object getField(final Object parent, final ASN1ComponentType type) throws ASN1Exception {
		if (parent instanceof Map) {
			return ((Map) parent).get(type.getFieldName());
		} else {
			final Field f = findField(type, parent.getClass());
			try {
				return f.get(parent);
			} catch (IllegalAccessException e) {
				throw new ASN1Exception("Can not set field value", e);
			}
		}
	}

	protected ASN1ComponentType getTypeByTag(ASN1Tag tag) throws ASN1UniquenessViolationException {
		if (tag2type.size() == 0 || class2type.size() == 0) {
			for (ASN1ComponentType _type : componentType) {
				if (tag2type.containsKey(_type.getTag()) && tagsUnique) {
					throw new ASN1UniquenessViolationException();
				}
				tag2type.put(_type.getTag(), _type);
				class2type.put(_type.getHandledClass(), _type);
			}
		}
		return tag2type.get(tag);
	}

	protected ASN1ComponentType getTypeFor(Object o) throws ASN1UniquenessViolationException {
		if (o == null) {
			return null;
		}
		if (tag2type.size() == 0 || class2type.size() == 0) {
			for (ASN1ComponentType _type : componentType) {
				if (tag2type.containsKey(_type.getTag()) && tagsUnique) {
					throw new ASN1UniquenessViolationException();
				}
				tag2type.put(_type.getTag(), _type);
				class2type.put(_type.getHandledClass(), _type);
			}
		}
		return class2type.get(o.getClass());
	}

	protected void indefiniteCheck(ASN1Tag tag, ASN1InputStream asn1is) throws ASN1ProtocolException, IOException {
		int _byte;
		if (tag == null) {
			_byte = asn1is.read();
			if (_byte != 0) {
				throw new ASN1ProtocolException(String.format("Zero value expected, got %d", _byte));
			}
		}
		_byte = asn1is.read();
		if (_byte != 0) {
			throw new ASN1ProtocolException(String.format("Zero value expected, got %d", _byte));
		}
	}

	protected boolean isRead(ASN1ComponentType t) {
		return readState.get(t);
	}


	/**
	 * Helper function to set field's value
	 *
	 * @param parent
	 * @param type
	 * @param value
	 *
	 * @throws ASN1Exception
	 */
	protected void setField(final Object parent, final ASN1ComponentType type, final Object value) throws ASN1Exception {
		if (parent instanceof Map) {
			((Map) parent).put(type.getFieldName(), value);
		} else {
			final Field f = findField(type, parent.getClass());
			try {
				f.set(parent, value);
				readState.put(type, Boolean.TRUE);
			} catch (IllegalAccessException e) {
				throw new ASN1Exception("Can not set field value", e);
			}
		}
	}


	private class MyPropertyChangeListener implements PropertyChangeListener {
		private final ASN1Module module;
		private final ASN1Type   type;
		private final int        index;

		public MyPropertyChangeListener(final ASN1UnresolvedType type, final ASN1Module module, final int index) {
			this.type = type;
			this.module = module;
			this.index = index;
			module.addPropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
		}


		@Override
		public void propertyChange(final PropertyChangeEvent evt) {
			if (evt.getNewValue() instanceof ASN1Type) {
				final ASN1ComponentType _type = (ASN1ComponentType) evt.getNewValue();
				if (_type.getName().equals(type.getName()) &&
				    (type.getModuleName() == null
				     || _type.getModule().getModuleId().equals(type.getModuleName()))) {
					module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
					componentType[index] = _type;
					try {
						doInstall(module, componentType[index]);
					} catch (ASN1Exception e) {
						logger.error("Exception:", e);
					}
				}
			}
		}
	}
}