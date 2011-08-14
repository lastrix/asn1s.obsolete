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
import org.lastrix.asn1s.exception.ASN1Exception;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 2:22 PM
 */
public class ASN1Integer implements ValueHandler {
	private final static Logger logger = Logger.getLogger(ASN1Integer.class);

	public final static long TAG_INTEGER = 0x02;

	@Override
	public Object decodeValue(final Header header, final ASN1InputStream bis) throws IOException, ASN1Exception {
		if (header.getTag() != TAG_INTEGER || header.getLength() < 1) {
			throw new ASN1Exception("Not valid tag or length for integer type.");
		}
		long value = 0;
		//extract sign
		int temp = bis.read();
		if ((temp & 0x80) != 0) {
			//set value to all ones, so we get an negative value
			value = Long.MIN_VALUE | Long.MAX_VALUE;
		}
		//now we could extract all other octets
		value = (value << 8) | ((long) temp & 0x00FFL);
		for (int i = 1; i < header.getLength(); i++) {
			temp = bis.read();
			value = (value << 8) | ((long) temp & 0x00FFL);
		}
		return value;
	}

	@Override
	public long getTag() {
		return TAG_INTEGER;
	}

	@Override
	public PC getPC() {
		return PC.PRIMITIVE;
	}

	@Override
	public TagClass getTagClass() {
		return TagClass.UNIVERSAL;
	}

	@Override
	public void encodeValue(final Object object, final ASN1OutputStream bos) throws ASN1Exception, IOException {
		if (!(object instanceof Integer)
		    && !(object instanceof Byte)
		    && !(object instanceof Long)
		    && !(object instanceof Short)) {
			throw new ASN1Exception("Object is not byte, short, integer or long.");
		}
		long value = numberToLong(object);
		boolean negative = value < 0;
		if (negative) {
			value = -value;
		}

		//write the header
		bos.write((byte) getTag());

		final byte size = calculateSize(value);
		bos.write(size);

		//write data now
		if (!negative) {
			bos.write(0x00);
		} else {
			value = -value;
		}

		ByteBuffer bb = ByteBuffer.allocate(8);
		bb.putLong(value);
		bb.flip();
		for (int i = 0; i < 8 - size; i++) {
			bb.get();
		}
		byte[] data = new byte[size];
		bb.get(data);
		bos.write(data);
	}

	private byte calculateSize(final long value) {
		byte size = 0;
		long mask = 0xFF;
		while (size < 8 && (value & mask) > 0) {
			mask = mask << 8;
			size++;
		}
		return size;
	}

	/**
	 * Converts Byte, Short, Integer or Long to long
	 *
	 * @param o
	 *
	 * @return
	 */
	private long numberToLong(final Object o) {
		if (o instanceof Byte) {
			Byte b = (Byte) o;
			return b;
		} else if (o instanceof Short) {
			Short s = (Short) o;
			return s;
		} else if (o instanceof Integer) {
			Integer i = (Integer) o;
			return i;
		}
		Long l = (Long) o;
		return l;
	}
}
