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
 * Time: 11:30 AM
 */
public class ASN1BooleanTest extends TestCase {

	@Test
	public void testDecode() throws Exception {
		final ASN1Boolean b = new ASN1Boolean();
		byte[] data = new byte[]{ASN1Boolean.TRUE, ASN1Boolean.FALSE};
		ByteArrayInputStream is = new ByteArrayInputStream(data);
		Object result = b.decode(is, ASN1Boolean.HEADER);
		assertNotNull(result);
		assertTrue((Boolean) result);
		result = b.decode(is, ASN1Boolean.HEADER);
		assertNotNull(result);
		assertFalse((Boolean) result);
	}

	@Test
	public void testEncode() throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(16);
		final ASN1Boolean b = new ASN1Boolean();
		b.encode(bos, Boolean.TRUE);
		b.encode(bos, Boolean.FALSE);
		assertTrue(
		          Arrays.equals(
		                       bos.toByteArray(), new byte[]{
		                                                    (byte) ASN1Boolean.TAG, 0x01, ASN1Boolean.TRUE,
		                                                    (byte) ASN1Boolean.TAG, 0x01, ASN1Boolean.FALSE
		          }
		                       )
		          );
	}
}
