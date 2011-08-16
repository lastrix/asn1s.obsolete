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

/**
 * @author: lastrix
 * Date: 8/16/11
 * Time: 12:05 PM
 */
public class ASN1RealTest extends TestCase {
	@Test
	public void testDecode() throws Exception {
		byte[] data = new byte[]{
		                        0x09,
		                        0x0A,
		                        (byte) 0xC1,
		                        0x04,
		                        0x0C,
		                        0x03,
		                        (byte) 0x88,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x02,
		                        0x01,
		                        0x0A,
		                        0x02,
		                        0x01,
		                        (byte) 0xF6,
		                        0x09,
		                        0x0A,
		                        (byte) 0x81,
		                        0x04,
		                        0x02,
		                        0x04,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x00,
		                        0x09,
		                        0x00
		};
	}

	@Test
	public void testEncode() throws Exception {

	}
}
