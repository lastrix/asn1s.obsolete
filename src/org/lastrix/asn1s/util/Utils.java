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

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author: lastrix
 * Date: 8/15/11
 * Time: 2:14 PM
 */
public class Utils {

	private final static int CACHE_SIZE = 1024;

	public final static int getMinimumBytes(long value) {
		return (int) (Math.ceil(Long.highestOneBit(value) / 8) + 1);
	}

	public final static int getMinimumBytes(int value) {
		return (int) (Math.ceil(Integer.highestOneBit(value) / 8) + 1);
	}

	public final static int getMinimumBytes(short value) {
		return (int) (Math.ceil(Integer.highestOneBit(((int) value) & 0xFFFF) / 8) + 1);
	}

	/**
	 * Transfers <code>length</code> bytes from <code>is</code> to <code>os</code>
	 *
	 * @param is    - the input
	 * @param os    - the output
	 * @param count - bytes count
	 *
	 * @throws IOException
	 */
	public static final void fillOutputStream(InputStream is, OutputStream os, int count)
	throws IOException {
		byte[] dataBucket = new byte[CACHE_SIZE];
		int readCount;

		while (count != 0) {
			readCount = is.read(
			                   dataBucket, 0, count < CACHE_SIZE ? count
			                                                     : CACHE_SIZE
			                   );
			if (readCount == -1) { throw new EOFException(); }
			os.write(dataBucket, 0, readCount);
			count -= readCount;
		}
	}

}
