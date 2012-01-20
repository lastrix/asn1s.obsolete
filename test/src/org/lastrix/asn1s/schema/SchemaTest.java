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

package org.lastrix.asn1s.schema;

import org.lastrix.asn1s.CustomTestCase;
import org.lastrix.asn1s.SequenceOfTestClass;
import org.lastrix.asn1s.SequenceOfTestClassAsField;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class SchemaTest extends CustomTestCase {

	public void testSaveLoad() throws Exception {
		final ASN1Schema s = ASN1Schema.loadSchema("./test/res/TestModule.asn");
		final int COUNT = 500;
		final ByteArrayOutputStream bos = new ByteArrayOutputStream(128 * COUNT);
		try {
			for (int i = 0; i < COUNT; i++) {
				s.write(
				       new SequenceOfTestClass(i, 0x1111, 2.5, "Test" + i, new SequenceOfTestClassAsField(i, "susy" + i, 1.0)),
				       bos
				       );
			}
		} catch (Exception e) {
			fail("Exception caught.");
		}
		final byte[] data = bos.toByteArray();
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);
		try {
			int i = 0;
			while (bis.available() > 0) {
				final Object o = s.read(bis);
				assertNotNull(o);
				i++;
			}
			assertEquals(COUNT, i);
		} catch (Exception e) {
			fail("Exception caught.");
		}
	}
}