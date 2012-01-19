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
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.protocol.Tag;

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
public abstract class ASN1OctetString extends ASN1Type {

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
	public abstract void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception;


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
		if (length == Tag.FORM_INDEFINITE) {
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
	public abstract boolean isConstructed();

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public abstract void validate(final ASN1Module module);
}
