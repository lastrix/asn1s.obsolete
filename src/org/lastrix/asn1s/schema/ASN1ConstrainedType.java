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

import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.protocol.Header;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1ConstrainedType extends ASN1Type {
	private final Constraint constraint;
	private       ASN1Type   type;

	public ASN1ConstrainedType(final ASN1Type type, final Constraint constraint) {
		this.type = type;
		this.constraint = constraint;
		//constrained type can not have it's own name, so get it from base
		this.name = type.getName();
	}

	public Constraint getConstraint() {
		return constraint;
	}

	public ASN1Type getType() {
		return type;
	}

	void setType(final ASN1Type type) {
		this.type = type;
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

	/**
	 * Read object of type from input stream
	 *
	 * @param o                   - the object which should be used for modifying
	 * @param is                  - the input stream
	 * @param header              - the header, non null values prevents method to read header from stream
	 * @param forceHeaderChecking - force type reader to check header
	 *
	 * @return an Object or null
	 *
	 * @throws IOException   thrown from I/O
	 * @throws ASN1Exception if selected type reader can not acquire data
	 */
	@Override
	public Object read(Object o, final InputStream is, final Header header, final boolean forceHeaderChecking) throws
	                                                                                                           IOException,
	                                                                                                           ASN1Exception {
		o = type.read(o, is, header, forceHeaderChecking);
		//TODO: constraint checks?
		return o;
	}

	@Override
	public boolean isConstructed() {
		return type.isConstructed();
	}

	@Override
	void setModule(final ASN1Module module) {
		super.setModule(module);
		if (type.getModule() == null) {
			type.setModule(module);
		}
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		if (type instanceof ASN1UnresolvedType) {
			type = module.getType(type.getName(), ((ASN1UnresolvedType) type).getModuleName());
		} else {
			type.validate(module);
		}
	}
}
