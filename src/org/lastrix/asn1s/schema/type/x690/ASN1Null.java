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
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1Type;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public final class ASN1Null extends ASN1Type implements ASN1X690Type {

	public final static ASN1Tag TAG  = new ASN1Tag(0x05, TagClass.UNIVERSAL, false);
	public final static String  NAME = "NULL";

	public ASN1Null() {
		this.tag = TAG;
		this.name = NAME;
		this.handledClass = null;
		valid();
	}

	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		if (o != null) {
			throw new ASN1Exception("ASN1Null accepts only null values.");
		}
		if (header) {
			os.write(TAG.asBytes());
			os.write(ASN1Length.asBytes(0));
		}
	}

	@Override
	public Object read(final Object value, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (value != null) {
			throw new ASN1Exception("ASN1Null accepts only null values.");
		}

		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		//length should be zero
		if (ASN1Length.readLength(is) != 0) {
			throw new ASN1ReadException("Zero length expected.");
		}
		return null;
	}
}
