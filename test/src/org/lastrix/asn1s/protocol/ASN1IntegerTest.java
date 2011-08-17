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
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author: lastrix
 * Date: 8/16/11
 * Time: 11:46 AM
 */
@SuppressWarnings({"ALL"})
public class ASN1IntegerTest extends TestCase {
	@Test
	public void testDecode() throws Exception {
		final int size = 4;
		byte[] data = new byte[]{
		                        0x0F, (byte) 0xA0,
		                        0x01, 0x11, 0x11,
		                        0x7F, 0x5D,
		                        (byte) 0xF0, 0x0F
		};
		ByteArrayInputStream is = new ByteArrayInputStream(data);
		final ASN1Integer integer = new ASN1Integer();
		long[] result = new long[size];
		int[] sizes = new int[]{2, 3, 2, 2};
		for (int i = 0; i < size; i++) {
			Object o = integer.decode(is, new Header(ASN1Integer.TAG, Tag.CLASS_UNIVERSAL, false, sizes[i]));
			if (o instanceof Long) {
				result[i] = (Long) o;
			} else {
				fail("Type is not Long.");
			}
		}
		assertTrue(Arrays.equals(result, new long[]{0x0FA0L, 0x011111L, 0x7F5DL, 0xFFFFFFFFFFFFF00FL}));
	}

	@Test
	public void testEncode() throws Exception {
		final ASN1Integer integer = new ASN1Integer();
		final ByteArrayOutputStream os = new ByteArrayOutputStream(2);
		integer.encode(os, 0);
		integer.encode(os, -(byte) 1);
		integer.encode(os, (short) 2);
		integer.encode(os, 255);
		integer.encode(os, 1024);
		integer.encode(os, 1024 * 1024L);

		assertTrue(
		          Arrays.equals(
		                       os.toByteArray(),
		                       new byte[]{
		                                 ASN1Integer.TAG, 0x01, 0x00,
		                                 ASN1Integer.TAG, 0x01, (byte) 0xFF,
		                                 ASN1Integer.TAG, 0x01, 0x02,
		                                 ASN1Integer.TAG, 0x02, 0x00, (byte) 0xFF,
		                                 ASN1Integer.TAG, 0x02, 0x04, 0x00,
		                                 ASN1Integer.TAG, 0x03, 0x10, 0x00, 0x00
		                       }
		                       )
		          );

	}
}
