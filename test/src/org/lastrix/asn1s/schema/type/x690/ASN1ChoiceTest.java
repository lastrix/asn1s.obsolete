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

import org.lastrix.asn1s.CustomTestCase;
import org.lastrix.asn1s.schema.ASN1Schema;
import org.lastrix.asn1s.util.TestObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1ChoiceTest extends CustomTestCase {

	public void testChoice() throws Exception {
		final ASN1Schema schema = ASN1Schema.loadSchema("./test/res/ChoiceTest.asn");
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();

		final long longValue = 101010L;
		schema.write(longValue, bos);
		final TestObject to = new TestObject(101010, "MyName", 0.0f);
		schema.write(to, bos);
		final double doubleValue = 10.02d;
		schema.write(doubleValue, bos);

		final byte[] data = bos.toByteArray();
//		System.out.println(Utils.toHexString(data));
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);

		Object tmp;
		tmp = schema.read(bis);
		assertNotNull(tmp);
		assertEquals(tmp.getClass(), Long.class);
		final long nLongValue = (Long) tmp;
		assertTrue(nLongValue == longValue);
		tmp = schema.read(bis);
		assertNotNull(tmp);
		assertEquals(tmp, to);
		tmp = schema.read(bis);
		assertNotNull(tmp);
		assertEquals(tmp.getClass(), Double.class);
		final double nDoubleValue = (Double) tmp;
		assertTrue(nDoubleValue == doubleValue);
	}
}
