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
 * Tests for {@link ASN1OctString}.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class ASN1OctStringTest extends CustomTestCase {
	@Test
	public void testDecode() throws Exception {
		final byte[] oct = new byte[]{/*ASN1OctString.TAG, 0x04,*/ 0x11, 0x22, 0x33, 0x44};
		final ByteArrayInputStream is = new ByteArrayInputStream(oct);
		final ASN1OctString oStr = new ASN1OctString();
		Object o = oStr.decode(is, new Header(ASN1OctString.TAG, Tag.CLASS_UNIVERSAL, false, 0x04));
		assertNotNull(o);
		assertTrue(Arrays.equals((byte[]) o, new byte[]{0x11, 0x22, 0x33, 0x44}));
	}

	@Test
	public void testEncode() throws Exception {
		final byte[] oct = new byte[]{0x11, 0x22, 0x33, 0x44};
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		final ASN1OctString o = new ASN1OctString();
		o.encode(os, oct);
		assertTrue(Arrays.equals(os.toByteArray(), new byte[]{ASN1OctString.TAG, 0x04, 0x11, 0x22, 0x33, 0x44}));
	}
}
