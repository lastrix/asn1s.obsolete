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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Defines octet string. This class should be used by other String-related types.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1OctetString extends ASN1Type implements ASN1X690Type {

	public final static  String  NAME = "OCTET STRING";
	private final static ASN1Tag TAG  = new ASN1Tag(0x04, TagClass.UNIVERSAL, false);

	protected ASN1OctetString() {
		this.tag = TAG;
		this.name = NAME;
		this.handledClass = new byte[0].getClass();
		valid();
	}


	/**
	 * Protected method to encode octet strings
	 *
	 * @param os   - the output stream
	 * @param data - the data to write
	 *
	 * @throws IOException   thrown by I/O
	 * @throws ASN1Exception
	 */
	protected final void encode(final OutputStream os, byte[] data) throws IOException, ASN1Exception {
		//infinite
		os.write(data);
	}

	/**
	 * Protected method for decoding octet strings
	 *
	 * @param is     - the input stream
	 * @param length - the amount of bytes to read
	 *
	 * @return the byte array
	 *
	 * @throws ASN1Exception
	 * @throws IOException   thrown by I/O
	 */
	protected final byte[] decode(final InputStream is, final int length) throws ASN1Exception, IOException {
		if (length == ASN1Length.FORM_INDEFINITE) {
			//damn infinite form
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int b;
			int b0 = -1;
			while (true) {
				b = is.read();
				if (b == 0x00 && b0 == 0x00) {
					break;
				}
				bos.write(b);
				b0 = b;
			}
			byte[] result = new byte[bos.size() - 1];

			System.arraycopy(bos.toByteArray(), 0, result, 0, result.length);
			return result;
		}

		//defined
		final byte[] data = new byte[length];
		if (is.read(data) != length) {
			throw new ASN1ReadException("Can not read all byte for oct string.");
		}
		return data;
	}

	@Override
	public void write(final Object value, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		byte[] array = (byte[]) value;
		if (header) {
			os.write(getTag().asBytes());
			os.write(ASN1Length.asBytes(array.length));
		}
		encode(os, array);
	}

	@Override
	public Object read(Object nullValue, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1Real does not allow non null parameter 'nullValue'");
		}

		// tag should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check tag, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		return decode(is, ASN1Length.readLength(is));
	}
}
