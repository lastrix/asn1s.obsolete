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
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * This is non-default type handler which should read/write Byte to ASN1 stream.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1IntegerByte extends ASN1X690Type {
	public static final  String  NAME = "INTEGER-Byte";
	private final static ASN1Tag TAG  = new ASN1Tag(0x302, TagClass.UNIVERSAL, false);

	public ASN1IntegerByte() {
		handledClass = Byte.class;
		this.tag = TAG;
		this.name = NAME;
		this.typeId = getName();
		valid();
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
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException {
		final byte value = (Byte) o;

		int size = Utils.getMinimumBytes((value < 0) ? -value : value);
		if (size > 1) {
			size = 1;
		}

		if (header) {
			//write header
			os.write(getTag().asBytes());
			//write length
			os.write(ASN1Length.asBytes(size));
		}
		//write integer data
		os.write(Utils.extractBytes(value, 0, size));
	}

	@Override
	public Object read(final Object nullValue, final ASN1InputStream asn1is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1Integer does not allow non null parameter 'nullValue'");
		}

		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(asn1is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!getTag().equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(asn1is);
		if (length > 1) {
			throw new ASN1ReadException("ASN1IntegerByte doesn't allow length to be more than 1.");
		}

		byte value = 0;
		//extract sign
		int temp = asn1is.read();
		if ((temp & Utils.BYTE_SIGN_MASK) != 0) {
			//set value to all ones, so we get an negative value
			value = Byte.MIN_VALUE | Byte.MAX_VALUE;
		}
		// now we could extract all other octets
		value = (byte) ((value << 8) | ((byte) temp & Utils.BYTE_MASK));
		return value;
	}
}
