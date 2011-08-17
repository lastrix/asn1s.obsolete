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
import org.junit.Test;
import org.lastrix.asn1s.CustomTestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Tests for {@link ASN1OIDCoder}
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class ASN1OIDCoderTest extends CustomTestCase {

	private final static Logger logger = Logger.getLogger(ASN1OIDCoderTest.class);

	@Test
	public void testDecode() throws Exception {
		final byte[] data = new byte[]{ /*0x06, 0x01,*/ 0x2A,
		                                /*0x06, 0x0C,*/
		                                0x2A,
		                                (byte) 0x81,
		                                0x0C,
		                                (byte) 0x81,
		                                0x66,
		                                (byte) 0x88,
		                                0x00,
		                                (byte) 0xA0,
		                                0x00,
		                                (byte) 0x82,
		                                (byte) 0x80,
		                                0x00,
		                                /*0x06, 0x03,*/
		                                0x2A,
		                                (byte) 0x81,
		                                0x0C

		};
		final ASN1OIDCoder oid = new ASN1OIDCoder();
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		Object o;
		o = oid.decode(is, new Header(ASN1OIDCoder.TAG, Tag.CLASS_UNIVERSAL, false, 1));
		assertTrue(Arrays.equals((long[]) o, new long[]{1, 2}));
		o = oid.decode(is, new Header(ASN1OIDCoder.TAG, Tag.CLASS_UNIVERSAL, false, 0x0C));
		assertTrue(Arrays.equals((long[]) o, new long[]{1, 2, 140, 230, 1024, 4096, 32768}));
		o = oid.decode(is, new Header(ASN1OIDCoder.TAG, Tag.CLASS_UNIVERSAL, false, 0x03));
		assertTrue(Arrays.equals((long[]) o, new long[]{1, 2, 140}));
	}

	@Test
	public void testEncode() throws Exception {
		final Object[] objects = new Object[]{
		                                     new long[]{1, 2},
		                                     new long[]{1, 2, 140, 230, 1024, 4096, 32768},
		                                     new long[]{1, 2, 140}
		};
		final ASN1OIDCoder oid = new ASN1OIDCoder();
		final ByteArrayOutputStream os = new ByteArrayOutputStream(32);
		for (Object o : objects) {
			oid.encode(os, o);
		}
		assertTrue(
		          Arrays.equals(
		                       os.toByteArray(), new byte[]{
		                                                   0x06, 0x01, 0x2A,
		                                                   0x06,
		                                                   0x0C,
		                                                   0x2A,
		                                                   (byte) 0x81,
		                                                   0x0C,
		                                                   (byte) 0x81,
		                                                   0x66,
		                                                   (byte) 0x88,
		                                                   0x00,
		                                                   (byte) 0xA0,
		                                                   0x00,
		                                                   (byte) 0x82,
		                                                   (byte) 0x80,
		                                                   0x00,
		                                                   0x06,
		                                                   0x03,
		                                                   0x2A,
		                                                   (byte) 0x81,
		                                                   0x0C
		          }
		                       )
		          );
	}
}
