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

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.BitSet;

/**
 * @author: lastrix
 * Date: 8/16/11
 * Time: 7:41 PM
 */
public class ASN1InputStreamTest extends TestCase {

	static final byte[] data = new byte[]{
	                                     0x09, 0x05, (byte) 0xC1, 0x04, 0x0C, (byte) 0x80, 0x38, 0x09,
	                                     0x04, (byte) 0x81, 0x04, 0x02, 0x40, 0x09, 0x00, 0x09,
	                                     0x01, 0x41, 0x09, 0x01, 0x40, 0x02, 0x01, 0x00,
	                                     0x02, 0x04, 0x00, (byte) 0x98, (byte) 0x96, (byte) 0x80, 0x02, 0x03,
	                                     (byte) 0xF0, (byte) 0xBD, (byte) 0xC0, 0x01, 0x01, (byte) 0xFF, 0x01, 0x01,
	                                     0x00, 0x04, 0x07, 0x01, 0x02, 0x03, 0x04, 0x05,
	                                     0x06, 0x07, 0x05, 0x00, 0x03, 0x02, 0x00, (byte) 0xAA
	};

	private static final BitSet bs = new BitSet(8);

	static {
		bs.set(1);
		bs.set(3);
		bs.set(5);
		bs.set(7);
	}

	static final Object[] objects = new Object[]{
	                                            -10000d,
	                                            10d,
	                                            0d,
	                                            Double.NEGATIVE_INFINITY,
	                                            Double.POSITIVE_INFINITY,
	                                            0L,
	                                            10000000L,
	                                            -1000000L,
	                                            true,
	                                            false,
	                                            new byte[]{1, 2, 3, 4, 5, 6, 7},
	                                            null,
	                                            bs
	};

	@Test
	public void testWork() {
		final ASN1InputStream is = new ASN1InputStream(new ByteArrayInputStream(data));
		Object result;
		try {
			int i = 0;
			while (is.available() > 0) {
				final Header h = is.readHeader();
				assertNotNull(h);
				result = is.read(h);
				if (result != null) {
					if (result.getClass().isArray()) {
						assertTrue(Arrays.equals((byte[]) result, (byte[]) objects[i]));
					} else {
						assertTrue(
						          String.format("%s(%s) %s(%s)", result, result.getClass(), objects[i], objects[i].getClass()),
						          result.equals(objects[i])
						          );
					}
				} else if (objects[i] != null) {
					assertTrue(objects[i].equals(result));
				} else {
					//all good
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception occurred.");
		}
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		ASN1Types.init();
	}
}
