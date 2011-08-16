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

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author: lastrix
 * Date: 8/16/11
 * Time: 8:06 PM
 */
public class ASN1OutputStreamTest extends TestCase {
	@Test
	public void testWork() throws Exception {
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		final ASN1OutputStream asnos = new ASN1OutputStream(os);
		for (Object o : ASN1InputStreamTest.objects) {
			asnos.write(o);
		}
		assertTrue(Arrays.equals(os.toByteArray(), ASN1InputStreamTest.data));
	}
}
