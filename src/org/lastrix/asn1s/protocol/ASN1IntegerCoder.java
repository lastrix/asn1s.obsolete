/******************************************************************************
 * Copyright (C) 2010-2011 Lastrix                                            *
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

package org.lastrix.asn1s.protocol;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * See X.690-0207 8.3 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public final class ASN1IntegerCoder implements PrimitiveDecoder, PrimitiveEncoder {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1IntegerCoder.class);

	public final static byte TAG = 0x02;

	/**
	 * Integer has default header as any primitive
	 */
	@SuppressWarnings({"WeakerAccess"})
	public final static Header HEADER = new Header(TAG, (byte) Tag.CLASS_UNIVERSAL, false, 2);

	/**
	 * Create default integer encoder/decoder
	 */
	public ASN1IntegerCoder() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		long value = 0;
		//extract sign
		int temp = is.read();
		if ((temp & Utils.BYTE_SIGN_MASK) != 0) {
			//set value to all ones, so we get an negative value
			value = Long.MIN_VALUE | Long.MAX_VALUE;
		}
		//now we could extract all other octets
		value = (value << 8) | ((long) temp & Utils.BYTE_MASK);
		for (int i = 1; i < header.getLength(); i++) {
			temp = is.read();
			value = (value << 8) | ((long) temp & Utils.BYTE_MASK);
		}
		return value;
	}

	@Override
	public void encode(final OutputStream os, final Object object) throws IOException {
		final long value = Utils.numberToLong(object);

		int size = Utils.getMinimumBytes((value < 0) ? -value : value);

		//if highest bit of highest byte is 1 then we should increase size to add
		// trailing zero
		if (value > 0 && ((value >> ((size - 1) * 8 + 7)) & 0x01) > 0) {
			size++;
		}

		//write header
		os.write(HEADER.tagToByteArray());
		//write length
		Header.writeLength(os, size);
		//write integer data
		os.write(Utils.extractBytes(value, 0, size));
	}


}
