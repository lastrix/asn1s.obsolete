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

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author: lastrix
 * Date: 8/16/11
 * Time: 4:40 PM
 */
public class UtilsTest extends TestCase {
	@Test
	public void testGetMinimumBytesShort() throws Exception {
		assertTrue(Utils.getMinimumBytes((short) 1) == 1);
		assertTrue(Utils.getMinimumBytes((short) 0x100) == 2);
	}

	@Test
	public void testGetMinimumBytesInt() throws Exception {
		assertTrue(Utils.getMinimumBytes(1) == 1);
		assertTrue(Utils.getMinimumBytes(0x100) == 2);
		assertTrue(Utils.getMinimumBytes(0x10000) == 3);
		assertTrue(Utils.getMinimumBytes(0x1000000) == 4);
	}

	@Test
	public void testGetMinimumBytesLong() throws Exception {
		assertTrue(Utils.getMinimumBytes(1L) == 1);
		assertTrue(Utils.getMinimumBytes(0x100L) == 2);
		assertTrue(Utils.getMinimumBytes(0x10000L) == 3);
		assertTrue(Utils.getMinimumBytes(0x1000000L) == 4);
		assertTrue(Utils.getMinimumBytes(0x100000000L) == 5);
		assertTrue(Utils.getMinimumBytes(0x10000000000L) == 6);
		assertTrue(Utils.getMinimumBytes(0x1000000000000L) == 7);
		assertTrue(Utils.getMinimumBytes(0x100000000000000L) == 8);
	}

	@Test
	public void testTransfer() throws Exception {
		final byte[] data = new byte[4096];
		for (int i = 0; i < 4096; i++) {
			data[i] = (byte) i;
		}
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		for (int i = 0; i < 16; i++) {
			is.read();
		}
		Utils.transfer(is, os, 1024);
		assertTrue(Arrays.equals(os.toByteArray(), Arrays.copyOfRange(data, 16, 16 + 1024)));
		final ByteArrayOutputStream os2 = new ByteArrayOutputStream();
		Utils.transfer(is, os2, 1024);
		assertTrue(Arrays.equals(os2.toByteArray(), Arrays.copyOfRange(data, 16 + 1024, 16 + 2 * 1024)));
	}
}
