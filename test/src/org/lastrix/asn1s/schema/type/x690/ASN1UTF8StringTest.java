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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UTF8StringTest extends CustomTestCase {
	private final String dataSet[] = new String[]{"", "Java", "ASN.1", "Все будет хорошо"};

	public void testUTF8Strings() throws Exception {
		final ASN1Schema schema = new ASN1Schema();
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();

		for (int i = 0; i < dataSet.length; i++) { schema.write(dataSet[i], bos); }

		final byte[] data = bos.toByteArray();
//		System.out.println(Utils.toHexString(data));
		final ByteArrayInputStream bis = new ByteArrayInputStream(data);

		Object tmp;
		String value;
		for (int i = 0; i < dataSet.length; i++) {
			tmp = schema.read(bis);
			assertNotNull(tmp);
			assertEquals(tmp.getClass(), String.class);
			value = (String) tmp;
			assertEquals("Failed to test value=" + dataSet[i], value, dataSet[i]);
		}

	}

}
