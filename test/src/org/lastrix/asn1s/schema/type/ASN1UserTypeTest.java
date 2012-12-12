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

package org.lastrix.asn1s.schema.type;

import org.lastrix.asn1s.CustomTestCase;
import org.lastrix.asn1s.schema.ASN1Schema;
import org.lastrix.asn1s.util.TestObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UserTypeTest extends CustomTestCase {

	private final TestObject dataSet[]    = new TestObject[]{new TestObject(1, "MyName1", -1), new TestObject(2, "MyName2", -2)};
	private final Integer    intDataSet[] = new Integer[]{1, 2, 3, 4, 5, 6};

	public void testArray() throws Exception {
		final ASN1Schema schema = ASN1Schema.loadSchema("./test/res/ArraysTest.asn");
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();

		schema.write(dataSet, bos);

		final byte[] data = bos.toByteArray();
//		System.out.println(Utils.toHexString(data));
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);

		Object tmp = schema.read(bis);
		assertNotNull(tmp);
		assertEquals(tmp.getClass(), TestObject[].class);
		assertTrue(Arrays.deepEquals(dataSet, (TestObject[]) tmp));
	}

	public void testIntArray() throws Exception {
		final ASN1Schema schema = ASN1Schema.loadSchema("./test/res/ArraysTest.asn");
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();

		schema.write(intDataSet, bos);

		final byte[] data = bos.toByteArray();
//		System.out.println(Utils.toHexString(data));
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);

		Object tmp = schema.read(bis);
		assertNotNull(tmp);
		assertEquals(tmp.getClass(), Integer[].class);
		assertTrue(Arrays.deepEquals(intDataSet, (Object[]) tmp));
	}
}
