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
 * Tests for {@link ASN1NullCoder}.
 *
 * @version 1.0
 * @author: lastrix
 */
@SuppressWarnings({"ALL"})
public class ASN1NullCoderTest extends CustomTestCase {

	@Test
	public void testDecode() throws Exception {
		final ASN1NullCoder n = new ASN1NullCoder();
		byte[] data = new byte[]{};
		ByteArrayInputStream is = new ByteArrayInputStream(data);
		Object o = n.decode(is, ASN1NullCoder.HEADER);
		assertNull(o);
	}

	@Test
	public void testEncode() throws Exception {
		final ASN1NullCoder n = new ASN1NullCoder();
		final ByteArrayOutputStream os = new ByteArrayOutputStream(2);
		n.encode(os, null);
		assertTrue(Arrays.equals(os.toByteArray(), new byte[]{ASN1NullCoder.TAG, 0x00}));
	}
}
