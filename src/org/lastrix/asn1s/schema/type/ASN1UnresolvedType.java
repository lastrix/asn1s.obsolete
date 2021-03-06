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

import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.ASN1Tag;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UnresolvedType extends ASN1Type {

	private final String moduleId;

	public ASN1UnresolvedType(final String name, final String moduleId) {
		if (name == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.moduleId = moduleId;
		this.typeId = getName();
		invalid();
	}

	/**
	 * Create unresolved type stub for later verification
	 *
	 * @param name
	 */
	public ASN1UnresolvedType(final String name) {
		this(name, null);
	}

	@Override
	public String toString() {
		return "ASN1UnresolvedType{" + ((moduleId != null) ? moduleId + "." + name : name) + '}';
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
		throw new UnsupportedOperationException("You trying to use " + this);
	}

	@Override
	public Object read(final Object value, final ASN1InputStream asn1is, final ASN1Tag tag, final boolean tagCheck) throws
	IOException,
	ASN1Exception {
		throw new UnsupportedOperationException("You trying to use " + this);
	}

	public String getModuleName() {
		return moduleId;
	}

	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException {
		throw new UnsupportedOperationException("You trying to use " + this);
	}

	@Override
	public ASN1Tag getTag() {
		throw new UnsupportedOperationException("You trying to use " + this);
	}

	@Override
	public void toASN1(final PrintWriter pw, final boolean typeAssignment) {
		throw new UnsupportedOperationException("You trying to use " + this);
	}

	@Override
	public void typeResolved(
	                        final ASN1UnresolvedType unresolved, final ASN1Type resolved
	                        ) {
		throw new UnsupportedOperationException("You trying to use " + this);
	}

	@Override
	public void moduleDeployed() throws ASN1Exception {
		throw new UnsupportedOperationException("You trying to use " + this);
	}
}
