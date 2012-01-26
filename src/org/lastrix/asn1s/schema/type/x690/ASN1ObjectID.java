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
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.type.ASN1ObjectIdentifier;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public final class ASN1ObjectID extends ASN1RelativeOID implements ASN1X690Type {
	private static final int     MULTIPLIER = 40;
	public final static  String  NAME       = "OBJECT IDENTIFIER";
	public final static  ASN1Tag TAG        = new ASN1Tag(0x06, TagClass.UNIVERSAL, false);

	public ASN1ObjectID() {
		this.name = NAME;
		this.tag = TAG;
		this.handledClass = ASN1ObjectIdentifier.class;
		valid();
	}

	@Override
	public Object read(final Object nullValue, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1RelativeOID does not allow non null parameter 'nullValue'");
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

		final int length = ASN1Length.readLength(is);
		final int fOid = is.read();
		final long[] oids = readOids(is, length - 1, 2);
		oids[0] = fOid / MULTIPLIER;
		oids[1] = fOid % MULTIPLIER;

		return new ASN1ObjectIdentifier(oids);
	}

	@Override
	protected void writeOids(final OutputStream os, final long[] oids) throws IOException {
		os.write((int) (oids[0] * MULTIPLIER + oids[1]));
		for (int i = 2; i < oids.length; i++) {
			writeOid(oids[i], os);
		}
	}
}
