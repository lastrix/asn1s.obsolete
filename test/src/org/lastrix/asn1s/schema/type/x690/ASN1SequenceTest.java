/******************************************************************************
 * Copyright (C) 2010-2012 Lastrix                                            *
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

package org.lastrix.asn1s.schema.type.x690;

import org.junit.Test;
import org.lastrix.asn1s.CustomTestCase;
import org.lastrix.asn1s.schema.ASN1Schema;
import org.lastrix.asn1s.util.TestObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1SequenceTest extends CustomTestCase {

	@Test
	public void testSequenceOf() throws Exception {
		final ASN1Schema schema = ASN1Schema.loadSchema("./test/res/SequenceTest.asn");
		final List<Integer> list = new ArrayList<Integer>();
		final int N = 5;
		for (int i = 0; i < N; i++) {
			list.add(i);
		}
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();
		schema.write(list, bos);

		final byte[] data = bos.toByteArray();
//		System.out.println(Utils.toHexString(data));
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);
		final List<Integer> n_list = (List<Integer>) schema.read(bis);
		assertNotNull(n_list);
		assertEquals(n_list.size(), list.size());
		assertEquals(n_list.toString(), list.toString());
	}

	@Test
	public void testSequence() throws Exception {
		final ASN1Schema schema = ASN1Schema.loadSchema("./test/res/SequenceTest.asn");
		final TestObject to = new TestObject(101010, "MyName", 0.0f);

		final ByteArrayOutputStream bos = new ByteArrayOutputStream();
		final int N = 2;
		for (int i = 0; i < N; i++) {
			schema.write(to, bos);
		}

		final byte[] data = bos.toByteArray();
//		System.out.println(Utils.toHexString(data));
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);

		for (int i = 0; i < N; i++) {
			final TestObject n_to = (TestObject) schema.read(bis);
			assertNotNull(n_to);
			assertTrue(n_to.equals(to));
		}
	}
}
