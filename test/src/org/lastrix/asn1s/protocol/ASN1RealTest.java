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

import org.junit.Test;
import org.lastrix.asn1s.CustomTestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Tests for {@link ASN1Real}.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class ASN1RealTest extends CustomTestCase {
	@Test
	public void testDecode() throws Exception {
		final int COUNT = 4;
		//we don't need headers, because of arch
		byte[] data = new byte[]{/*0x09, 0x05,*/ (byte) 0xC1, 0x04, 0x0C, 0x03, (byte) 0x88,//-10000d
		                         /*0x09, 0x04,*/ (byte) 0x81, 0x04, 0x02, 0x04,//10d
		                         /*0x09, 0x01,*/ 0x41,//-inf
		                         /*0x09, 0x01,*/ 0x40//+inf
		};
		byte[] sizes = new byte[]{5, 4, 1, 1};
		final ASN1Real real = new ASN1Real();
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		double doubles[] = new double[COUNT];
		for (int i = 0; i < COUNT; i++) {
			final Object o = real.decode(is, new Header(ASN1Real.TAG, Tag.CLASS_UNIVERSAL, false, sizes[i]));
			if (o instanceof Double) {
				doubles[i] = (Double) o;
			} else {
				fail("Double expected.");
			}
		}
		assertTrue(Arrays.equals(doubles, new double[]{-10000d, 10d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}));
	}

	@Test
	public void testEncode() throws Exception {
		final double[] values = new double[]{-10000d, 10d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		final ASN1Real real = new ASN1Real();
		for (double d : values) {
			real.encode(os, d);
		}
		assertTrue(
		          Arrays.equals(
		                       os.toByteArray(), new byte[]{
		                                                   0x09, 0x05, (byte) 0xC1, 0x04, 0x0C, 0x03, (byte) 0x88,//-10000d
		                                                   0x09, 0x04, (byte) 0x81, 0x04, 0x02, 0x04,//10d
		                                                   0x09, 0x01, 0x41,//-inf
		                                                   0x09, 0x01, 0x40//+inf
		          }
		                       )
		          );
	}
}
