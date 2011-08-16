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

import junit.extensions.TestSetup;
import junit.framework.TestSuite;
import org.junit.Test;

import java.util.Locale;

/**
 * @author: lastrix
 * Date: 8/16/11
 * Time: 11:25 AM
 */
public class AllTests {

	/**
	 * Generate {@link TestSuite}
	 *
	 * @return an {@link Test} object
	 */
	public static junit.framework.Test suite() {
		final TestSuite suite = new TestSuite("Test for org.lastrix.asn1s.protocol");

		suite.addTestSuite(ASN1BooleanTest.class);
		suite.addTestSuite(ASN1NullTest.class);
		suite.addTestSuite(ASN1IntegerTest.class);
		suite.addTestSuite(ASN1RealTest.class);
		suite.addTestSuite(ASN1BitStringTest.class);
		suite.addTestSuite(ASN1OctStringTest.class);
		suite.addTestSuite(HeaderTest.class);
		//suite.addTest(org.lastrix.CSEmu.common.AllTests.suite());
		// Make sure that we run the tests using the english locale
		final TestSetup wrapper = new TestSetup(suite) {
			@Override
			public void setUp() {
				Locale.setDefault(Locale.US);
			}
		};
		return wrapper;

	}
}
