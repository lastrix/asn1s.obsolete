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
 * Test for {@link ASN1BooleanCoder}.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class ASN1BooleanCoderTest extends CustomTestCase {

	@Test
	public void testDecode() throws Exception {
		final ASN1BooleanCoder b = new ASN1BooleanCoder();
		byte[] data = new byte[]{ASN1BooleanCoder.TRUE, ASN1BooleanCoder.FALSE};
		ByteArrayInputStream is = new ByteArrayInputStream(data);
		Object result = b.decode(is, ASN1BooleanCoder.HEADER);
		assertNotNull(result);
		assertTrue((Boolean) result);
		result = b.decode(is, ASN1BooleanCoder.HEADER);
		assertNotNull(result);
		assertFalse((Boolean) result);
	}

	@Test
	public void testEncode() throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(16);
		final ASN1BooleanCoder b = new ASN1BooleanCoder();
		b.encode(bos, Boolean.TRUE);
		b.encode(bos, Boolean.FALSE);
		assertTrue(
		          Arrays.equals(
		                       bos.toByteArray(), new byte[]{
		                                                    ASN1BooleanCoder.TAG, 0x01, ASN1BooleanCoder.TRUE,
		                                                    ASN1BooleanCoder.TAG, 0x01, ASN1BooleanCoder.FALSE
		          }
		                       )
		          );
	}
}
