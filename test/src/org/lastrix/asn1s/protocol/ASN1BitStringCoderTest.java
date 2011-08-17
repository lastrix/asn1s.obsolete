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
import java.util.BitSet;

/**
 * Test for {@link ASN1BitStringCoder}.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class ASN1BitStringCoderTest extends CustomTestCase {
	@Test
	public void testDecode() throws Exception {
		final byte[] data = new byte[]{0x02, (byte) 0xC4, 0x04, (byte) 0x89, (byte) 0x80};
		final ASN1BitStringCoder bs = new ASN1BitStringCoder();
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		Object o = bs.decode(is, new Header(ASN1BitStringCoder.TAG, Tag.CLASS_UNIVERSAL, false, 2));
		assertNotNull(o);
		assertTrue(o instanceof BitSet);
		BitSet b = new BitSet(8);
		b.set(0);
		b.set(4);
		b.set(5);
		assertTrue(b.equals(o));
		o = bs.decode(is, new Header(ASN1BitStringCoder.TAG, Tag.CLASS_UNIVERSAL, false, 3));
		assertNotNull(o);
		assertTrue(o instanceof BitSet);
		b = new BitSet(16);
		b.set(0);
		b.set(3);
		b.set(7);
		b.set(11);
		assertTrue(b.equals(o));
	}

	@Test
	public void testEncode() throws Exception {
		BitSet b = new BitSet(8);
		b.set(0);
		b.set(4);
		b.set(5);
		final ASN1BitStringCoder bs = new ASN1BitStringCoder();
		final ByteArrayOutputStream os = new ByteArrayOutputStream(2);
		bs.encode(os, b);
		b = new BitSet(16);
		b.set(0);
		b.set(3);
		b.set(7);
		b.set(11);
		bs.encode(os, b);
		assertTrue(
		          Arrays.equals(
		                       os.toByteArray(), new byte[]{
		                                                   ASN1BitStringCoder.TAG, 0x02, 0x02, (byte) 0xC4,
		                                                   ASN1BitStringCoder.TAG, 0x03, 0x04, (byte) 0x89, (byte) 0x80
		          }
		                       )
		          );
	}
}
