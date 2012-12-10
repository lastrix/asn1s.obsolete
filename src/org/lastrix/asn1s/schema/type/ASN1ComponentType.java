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

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Class for writing/reading specified object's field to/from ASN.1 notation.
 * This class doesn't check object class, just tries to get a field
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1ComponentType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1ComponentType.class);

	private final String fieldName;

	private final boolean optional = false;

	private ASN1Type type;

	//	private final Object defaultValue;
	public ASN1ComponentType(final String fieldName, final ASN1Type type) {
		this.name = type.getName();
		this.type = type;
		this.fieldName = fieldName;
		this.typeId = getName();
		invalid();
	}


	@Override
	public ASN1Tag getTag() {
		return type.getTag();
	}


	/**
	 * Returns optional
	 *
	 * @return
	 */
	public boolean isOptional() {
		return optional;
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


	@Override
	public Object read(final Object value, final ASN1InputStream asn1is, final ASN1Tag tag, final boolean tagCheck) throws
	IOException,
	ASN1Exception {
		return type.read(value, asn1is, tag, tagCheck);
	}


	@Override
	public String toString() {
		return name + " " + type;
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
		type.write(o, os, header);
	}


	/**
	 * @param module
	 *
	 * @throws ASN1Exception
	 */
	private void doInstall(ASN1Module module) throws ASN1Exception {
		if (!(type instanceof ASN1UserType) && (type.getModule() == null)) {
			type.onInstall(module);
		}
		typeId = makeTypeId(getName(), getModuleName());
		valid();
	}


	@Override
	public void typeResolved(
	                        final ASN1UnresolvedType unresolved, final ASN1Type resolved
	                        ) {
		if (unresolved == type) {
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
		pw.append(fieldName);
		pw.append(" ");
		type.toASN1(pw, false);
	}

	public String getFieldName() {
		return fieldName;
	}
}