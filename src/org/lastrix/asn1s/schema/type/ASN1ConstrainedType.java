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
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.constraint.Constraint;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

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
		this.typeId = getName();
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
	public Object read(Object value, final ASN1InputStream asn1is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		value = type.read(value, asn1is, tag, tagCheck);
		//TODO: constraint checks
		return value;
	}

	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		if (type instanceof ASN1UnresolvedType) {
			final ASN1Type t = module.resolveType((ASN1UnresolvedType) type);
			if (t == null) {
				new InstallPropertyChangeListener(this, (ASN1UnresolvedType) type, module);
			} else {
				this.type = t;
				doInstall(module);
			}
		} else {
			//now we should add self to index base
			doInstall(module);
		}
	}

	private void doInstall(ASN1Module module) throws ASN1Exception {
		if (!(type instanceof ASN1UserType) && (type.getModule() == null)) {
			type.onInstall(module);
		}
		typeId = makeTypeId(getName(), getModuleName());
		valid();
	}

	@Override
	public ASN1Tag getTag() {
		return type.getTag();
	}

	@Override
	public void typeResolved(
	                        final ASN1UnresolvedType unresolved, final ASN1Type resolved
	                        ) {
		if (type == unresolved) {
			type = resolved;
			try {
				doInstall(module);
			} catch (ASN1Exception e) {
				logger.warn("Exception:", e);
			}
		}
	}

	@Override
	public void moduleDeployed() throws ASN1Exception {
		type.moduleDeployed();
	}

	@Override
	public void toASN1(final PrintWriter pw, final boolean typeAssignment) {
		type.toASN1(pw, false);
		pw.append(" ");
		constraint.toASN1(pw, false);
	}
}
