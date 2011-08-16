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
 * Time: 5:07 PM
 */
public class HeaderTest extends TestCase {
	@Test
	public void testIsEOC() throws Exception {
		final byte[] data = new byte[]{0x00, 0x00};
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		Header h = Header.readHeader(is);
		assertTrue(h.isEOC());
	}

	@Test
	public void testTagToByteArray() throws Exception {
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		final long tag = 0x2150846502710L;
		os.write(new Header(tag, Tag.CLASS_APPLICATION, false, 0).tagToByteArray());
		final byte[] src = os.toByteArray();
		final ByteArrayInputStream is = new ByteArrayInputStream(src);
		Header h = Header.readHeader(is);
		assertTrue(h.getTag() == tag && h.getTagClass() == Tag.CLASS_APPLICATION && !h.isConstructed());
	}

	@Test
	public void testToByteArray() throws Exception {
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		os.write(new Header(0, (byte) 0, false, 0).toByteArray());
		os.write(new Header(10, Tag.CLASS_APPLICATION, true, 10).toByteArray());
		os.write(new Header(10, Tag.CLASS_APPLICATION, true, -1).toByteArray());
		assertTrue(
		          Arrays.equals(
		                       os.toByteArray(),
		                       new byte[]{0x0, 0x0, 0x6A, 0x0A, 0x6A, (byte) 0x80}
		                       )
		          );
	}

	@Test
	public void testWriteLength() throws Exception {
		final ByteArrayOutputStream os = new ByteArrayOutputStream(16);
		Header.writeLength(os, 10);
		Header.writeLength(os, 1000);
		Header.writeLength(os, Tag.FORM_INDEFINITE);
		Header.writeLength(os, 0x00);
		assertTrue(
		          Arrays.equals(
		                       os.toByteArray(),
		                       new byte[]{0x0A, (byte) 0x82, 0x03, (byte) 0xE8, (byte) 0x80, 0x00}
		                       )
		          );
	}

	@Test
	public void testEqualsAndIsSame() throws Exception {
		Header h = new Header(1, Tag.CLASS_UNIVERSAL, false, 0);
		Header h2 = new Header(1, Tag.CLASS_UNIVERSAL, false, 0);
		assertTrue(h.equals(h2));
		assertTrue(h.isSame(h2));

		h2 = new Header(1, Tag.CLASS_UNIVERSAL, false, 1);
		assertFalse(h.equals(h2));
		assertTrue(h.isSame(h2));

		h2 = new Header(2, Tag.CLASS_UNIVERSAL, false, 0);
		assertFalse(h.equals(h2));
		assertFalse(h.isSame(h2));

		h2 = new Header(1, Tag.CLASS_PRIVATE, false, 0);
		assertFalse(h.equals(h2));
		assertFalse(h.isSame(h2));

		h2 = new Header(1, Tag.CLASS_UNIVERSAL, true, 0);
		assertFalse(h.equals(h2));
		assertFalse(h.isSame(h2));
	}

	@Test
	public void testReadHeader() throws Exception {
		final byte[] data = new byte[]{0x0, 0x0, 0x1, 0x1, 0x5, 0x0};
		final ByteArrayInputStream is = new ByteArrayInputStream(data);
		Header h = Header.readHeader(is);
		assertTrue(h.isEOC());
		h = Header.readHeader(is);
		assertTrue(ASN1Boolean.HEADER.equals(h));
		h = Header.readHeader(is);
		assertTrue(ASN1Null.HEADER.equals(h));
	}
}
