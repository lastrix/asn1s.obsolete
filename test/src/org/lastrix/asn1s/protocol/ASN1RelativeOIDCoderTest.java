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
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class ASN1RelativeOIDCoderTest extends CustomTestCase {

	@Test
	public void testDecode() throws Exception {
		final byte[] data = new byte[]{(byte) 0xC2, 0x7B, 0x03, 0x02};
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		final ASN1RelativeOIDCoder oidCoder = new ASN1RelativeOIDCoder();
		long[] result = (long[]) oidCoder.decode(is, new Header(ASN1RelativeOIDCoder.TAG, Tag.CLASS_UNIVERSAL, false, 0x04));
		assertNotNull(result);
		assertTrue(Arrays.equals(result, new long[]{8571, 3, 2}));
	}

	@Test
	public void testEncode() throws Exception {
		final ByteArrayOutputStream os = new ByteArrayOutputStream(6);
		final ASN1RelativeOIDCoder coder = new ASN1RelativeOIDCoder();
		coder.encode(os, new long[]{8571, 3, 2});
		assertTrue(Arrays.equals(os.toByteArray(), new byte[]{ASN1RelativeOIDCoder.TAG, 0x04, (byte) 0xC2, 0x7B, 0x03, 0x02}));
	}
}
