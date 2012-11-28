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

import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.type.ASN1Type;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * TODO: implementation
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Choice extends ASN1Container {
	/**
	 * Create an abstract container
	 *
	 * @param componentType
	 */
	public ASN1Choice(final ASN1Type[] componentType) {
		super(componentType, false, "CHOICE", null);
	}

	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		// TODO: unimplemented method stub

	}

	@Override
	public Object read(final Object value, final InputStream is, final ASN1Tag tag, final boolean tagCheck) throws IOException, ASN1Exception {
		// TODO: unimplemented method stub
		return null;
	}

}
