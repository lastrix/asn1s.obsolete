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
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.constraint.Constraint;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1ConstrainedType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1ConstrainedType.class);
	private final Constraint constraint;
	private       ASN1Type   type;

	public ASN1ConstrainedType(final ASN1Type type, final Constraint constraint) {
		this.type = type;
		this.constraint = constraint;
		//constrained type can not have it's own name, so get it from base
		this.name = type.getName() + "@" + hashCode();
		invalid();
	}

	public Constraint getConstraint() {
		return constraint;
	}

	@Override
	public String toString() {
		return "ASN1ConstrainedType{" + type + " " +
		       constraint +
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
		//this is simple?
		//FIXME: constraint checks?
		type.write(o, os, header);
	}


	@Override
	public Object read(Object value, final InputStream is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		value = type.read(value, is, tag, tagCheck);
		//TODO: constraint checks
		return value;
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
							if (_type.getName().equals(ASN1ConstrainedType.this.type.getName()) &&
							    (((ASN1UnresolvedType) type).getModuleName() == null
							     || _type.getModule().getName().equals(((ASN1UnresolvedType) type).getModuleName()))) {
								ASN1ConstrainedType.this.type = _type;
								module.removePropertyChangeListener(ASN1Module.TYPE_INSTALLED, this);
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
				this.type = t;
				doInstall(module, register);
			}
		} else {
			//now we should add self to index base
			doInstall(module, register);
		}
	}

	private void doInstall(ASN1Module module, final boolean register) throws ASN1Exception {
		module.install(this);
		if (!(type instanceof ASN1UserType) && (type.getModule() == null)) {
			type.onInstall(module, false);
		}
		valid();
	}

	@Override
	public ASN1Tag getTag() {
		return type.getTag();
	}
}
