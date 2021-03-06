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
 * Holds special functions required for project
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ClassWithoutConstructor"})
public final class Utils {

	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(Utils.class);

	private final static double LOG_255            = Math.log(255);
	private final static double LOG_2              = Math.log(2);
	public static final  int    BYTE_MASK          = 0x00FF;
	public static final  int    BYTE_SIGN_MASK     = 0x0080;
	public static final  int    UNSIGNED_BYTE_MASK = 0x007F;
	private static final int    BYTES_PER_NEW_LINE = 16;
	private static final int    BYTES_PER_COLUMN   = 8;

	/**
	 * Returns minimum bytes required to hold value
	 *
	 * @param value - the value
	 *
	 * @return number of bytes
	 */
	public static int getMinimumBytes(long value) {
		//TODO: may be simple if-else clauses would be better than all that math?
		if (value > 0) {
			final double value_log = Math.log(Long.highestOneBit(value));
			int result = Math.max((int) (Math.ceil(value_log / Utils.LOG_255)), 1);
			final int pow = (int) Math.ceil(value_log / LOG_2);
			if (pow % 8 == 7) {
				result++;
			}
			return result;
		} else if (value == 0) {
			return 1;
		} else {
			long nValue = ~value;
			final double nValue_log = Math.log(Long.highestOneBit(nValue));
			int result = Math.max((int) (Math.ceil(nValue_log / Utils.LOG_255)), 1);
			final int pow = (int) Math.floor(nValue_log / LOG_2);
			if (pow % 8 == 7) {
				result++;
			}
			return result;
		}
	}

	/**
	 * Returns minimum bytes required to hold value
	 *
	 * @param value - the value
	 *
	 * @return number of bytes
	 */
	public static int getMinimumBytes(int value) {
		//TODO: may be simple if-else clauses would be better than all that math?
		if (value > 0) {
			final double value_log = Math.log(Integer.highestOneBit(value));
			int result = Math.max((int) (Math.ceil(value_log / Utils.LOG_255)), 1);
			final int pow = (int) Math.ceil(value_log / LOG_2);
			if (pow % 8 == 7) {
				result++;
			}
			return result;
		} else if (value == 0) {
			return 1;
		} else {
			int nValue = ~value;
			final double nValue_log = Math.log(Integer.highestOneBit(nValue));
			int result = Math.max((int) (Math.ceil(nValue_log / Utils.LOG_255)), 1);
			final int pow = (int) Math.floor(nValue_log / LOG_2);
			if (pow % 8 == 7) {
				result++;
			}
			return result;
		}
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
	 * Converts byte array to hex string (example: {0x01, 0x12} ->  01 12 ),
	 * it will add \n before each 16th byte and insert 3 whitespaces between columns of 8 bytes
	 *
	 * @param array - the byte array
	 *
	 * @return hex string in form of [ 00 01 12 ]
	 */
	public static String toHexString(byte... array) {
		if (array == null || array.length == 0) { return "[]"; }
		StringWriter sw = new StringWriter(array.length * 2 + 2);
		for (int i = 0; i < array.length; i++) {
			if (i % BYTES_PER_NEW_LINE == 0 && i != 0) {
				sw.append("\n");
			}
			if (i % BYTES_PER_COLUMN == 0 && i % BYTES_PER_NEW_LINE != 0 && i != 0) {
				sw.append("   ");
			}
			sw.append(String.format(" %02X", array[i]));
		}
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
	 * Extracts bytes from {@code value}, you may specify from > to and to > from to choose LE or BE
	 *
	 * @param value - the value
	 * @param from  - start point
	 * @param to    - end point
	 *
	 * @return the byte array
	 */
	public static byte[] extractBytes(int value, int from, int to) {
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
	 * Extracts bytes from {@code value}, you may specify from > to and to > from to choose LE or BE
	 *
	 * @param value - the value
	 * @param from  - start point
	 * @param to    - end point
	 *
	 * @return the byte array
	 */
	public static byte[] extractBytes(short value, int from, int to) {
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
	 * Make gaps between bytes, so if you got
	 * {@code 00000000 00000000 10100101 10010110} and you need to gap 3 bits, you'll get
	 * {@code 00000001 00001001 00001100 00010110}.
	 * Highest bits would be missed probably.
	 *
	 * @param value   - the value
	 * @param gapSize - an int between 1 and 7
	 * @param MASK    - mask to extract byte
	 *
	 * @return an long
	 */
	public static long makeByteGaps(long value, int gapSize, int MASK) {
		if (gapSize < 1 || gapSize > 7) { throw new IllegalArgumentException("Parameter 'gapSize' should be in [1,7]"); }
		long result = 0;
		for (int i = 0; i < 8; i++) {
			result |= (value >> (i * (8 - gapSize)) & MASK) << (i * 8);
		}
		return result;
	}
}
