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
import java.nio.ByteBuffer;

/**
 * Integer encoder/decoder
 *
 * @author lastrix
 *         Date: 8/14/11
 *         Time: 2:22 PM
 * @version 1.0
 */
public final class ASN1Integer implements PrimitiveDecoder, PrimitiveEncoder {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1Integer.class);

	public final static byte TAG = 0x02;

	/**
	 * Integer has default header as any primitive
	 */
	@SuppressWarnings({"WeakerAccess"})
	public final static Header HEADER = new Header(TAG, (byte) Tag.CLASS_UNIVERSAL, false, 2);

	/**
	 * Create default integer encoder/decoder
	 */
	public ASN1Integer() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		if (!HEADER.isSame(header)) {
			throw new ASN1ProtocolException("Supplied header is not valid Integer header.");
		}
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
	public void encode(final OutputStream os, final Object object) throws ASN1ProtocolException, IOException {
		if (!(object instanceof Integer)
		    && !(object instanceof Byte)
		    && !(object instanceof Long)
		    && !(object instanceof Short)) {
			throw new ASN1ProtocolException("Object is not byte, short, integer or long.");
		}
		long value = Utils.numberToLong(object);

		boolean negative = value < 0;
		if (negative) {
			value = -value;
		}


		//write the header
		int size = Utils.getMinimumBytes(value);


		ByteBuffer bb = ByteBuffer.allocate(8);
		if (negative) {
			value = -value;
		}
		bb.putLong(value);
		bb.flip();
		for (int i = 0; i < 8 - size; i++) {
			bb.get();
		}
		byte[] data = new byte[size];
		bb.get(data);

		if (!negative && (data[0] & Utils.BYTE_SIGN_MASK) > 0) {
			size++;
		}
		if (HEADER.getLength() != size) {
			//handle them separated
			os.write(HEADER.tagToByteArray());
			Header.writeLength(os, size);
		} else {
			//yeah! we could use cached one
			os.write(HEADER.toByteArray());
		}


		//write data now
		if (!negative) {
			//we should check, that our data won't be counted as negative, so add trailing 0x00 octet
			if ((data[0] & Utils.BYTE_SIGN_MASK) > 0) {
				os.write(0x00);
			}
		}
		os.write(data);
	}


}
