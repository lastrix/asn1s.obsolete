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

package org.lastrix.asn1s.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * @author lastrix
 *         Date: 8/15/11
 *         Time: 2:14 PM
 * @version 1.0
 */
@SuppressWarnings({"StaticMethodOnlyUsedInOneClass", "ClassWithoutConstructor"})
public class Utils {

	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(Utils.class);

	@SuppressWarnings({"WeakerAccess"})
	public final static double LOG_255        = Math.log(255);
	public static final int    BYTE_MASK      = 0x00FF;
	public static final int    BYTE_SIGN_MASK = 0x80;

	/**
	 * Returns minimum bytes required to hold value
	 *
	 * @param value - the value
	 *
	 * @return number of bytes
	 */
	public static int getMinimumBytes(long value) {
		return Math.max((int) (Math.ceil(Math.log(Long.highestOneBit(value)) / Utils.LOG_255)), 1);
	}

	/**
	 * Returns minimum bytes required to hold value
	 *
	 * @param value - the value
	 *
	 * @return number of bytes
	 */
	public static int getMinimumBytes(int value) {
		return Math.max((int) (Math.ceil(Math.log(Integer.highestOneBit(value)) / Utils.LOG_255)), 1);
	}

	/**
	 * Returns minimum bytes required to hold value
	 *
	 * @param value - the value
	 *
	 * @return number of bytes
	 */
	public static int getMinimumBytes(short value) {
		return Math.max((int) (Math.ceil(Math.log(Integer.highestOneBit(value)) / Utils.LOG_255)), 1);
	}

	/**
	 * Transfers {@code length} bytes from {@code is} to {@code os}
	 * Please note: count is amount of memory to use by buffer. This function uses NIO channels.
	 *
	 * @param is    - the input
	 * @param os    - the output
	 * @param count - bytes count
	 *
	 * @throws IOException - from read() calls
	 */
	@SuppressWarnings({"AssignmentToMethodParameter", "NestedAssignment"})
	public static void transfer(InputStream is, OutputStream os, int count)
	throws IOException {
		final ReadableByteChannel in = Channels.newChannel(is);
		final WritableByteChannel out = Channels.newChannel(os);
		//create buffer with save size as count, so we won't miss anything
		final ByteBuffer buffer = ByteBuffer.allocateDirect(count);
		int read;
		//readAs the required amount of data to buffer
		while (count > 0 && (read = in.read(buffer)) != -1) {
			count -= read;
		}
		buffer.flip();
		//write all of it to output stream
		while (buffer.hasRemaining()) {
			out.write(buffer);
		}
	}


	/**
	 * Converts byte array to hex string (example: {0x01, 0x12} -> [ 01 12 ])
	 *
	 * @param array - the byte array
	 *
	 * @return hex string in form of [ 00 01 12 ]
	 */
	public static String toHexString(byte... array) {
		if (array == null || array.length == 0) { return "[]"; }
		StringWriter sw = new StringWriter(array.length * 2 + 2);
		sw.append("[");
		for (byte anArray : array) {
			sw.append(String.format(" %02X", anArray));
		}
		sw.append(" ]");
		return sw.toString();
	}

	/**
	 * Extracts bytes from {@code value}, you may specify from > to and to > from to choose LE or BE
	 *
	 * @param value - the value
	 * @param from  - start point
	 * @param to    - end point
	 *
	 * @return the byte array
	 */
	public static byte[] extractBytes(long value, int from, int to) {
		final int bCount = Math.abs(to - from);
		final byte[] bytes = new byte[bCount];
		if (from > to) {
			for (int i = from - 1; i >= to; i--) {
				bytes[from - i - 1] = (byte) ((value >> i * 8) & BYTE_MASK);
			}
		} else {
			for (int i = from; i < to; i++) {
				bytes[to - i - 1] = (byte) ((value >> i * 8) & BYTE_MASK);
			}
		}
		return bytes;
	}

	/**
	 * Converts Byte, Short, Integer or Long to long
	 *
	 * @param o - the number object
	 *
	 * @return long
	 */
	public static long numberToLong(final Object o) {
		//noinspection ChainOfInstanceofChecks
		if (o instanceof Byte) {
			return (Byte) o;
		} else if (o instanceof Short) {
			return (Short) o;
		} else if (o instanceof Integer) {
			return (Integer) o;
		}
		return (Long) o;
	}
}
