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

import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Boolean extends ASN1X690Type {

	public static final ASN1Tag TAG   = new ASN1Tag(0x01, TagClass.UNIVERSAL, false);
	public static final int     TRUE  = 0xFF;
	public static final int     FALSE = 0x00;
	public static final String  NAME  = "BOOLEAN";

	public ASN1Boolean() {
		this.tag = TAG;
		this.name = NAME;
		this.handledClass = Boolean.class;
		this.typeId = getName();
		valid();
	}

	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		final Boolean value = (Boolean) o;
		if (header) {
			os.write(getTag().asBytes());
			os.write(ASN1Length.asBytes(1));
		}
		os.write((value) ? TRUE : FALSE);
	}

	@Override
	public Object read(final Object nullValue, final ASN1InputStream asn1is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1Real does not allow non null parameter 'nullValue'");
		}

		// tag should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(asn1is);
			tagCheck = true;
		}
		// if we should check tag, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(asn1is);
		if (length != 1) {
			throw new ASN1ReadException("Length expected to be 1, got " + length);
		}

		final int value = asn1is.read();
		switch (value) {
			case TRUE:
				return Boolean.TRUE;

			case FALSE:
				return Boolean.FALSE;

			default:
				throw new ASN1ProtocolException("Incorrect coding found " + value);
		}
	}
}
