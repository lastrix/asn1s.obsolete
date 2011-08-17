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

package org.lastrix.asn1s;

import junit.framework.TestCase;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Special class to allow tests use {@link org.apache.log4j.Logger}.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"ClassWithoutLogger"})
public class CustomTestCase extends TestCase {
	private static final String logPropertiesFile = "resources/log4j_test.properties";

	public CustomTestCase() {}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		final Properties logProperties = new Properties();
		final FileInputStream fis = new FileInputStream(logPropertiesFile);
		// load our log4j properties / configuration file
		logProperties.load(fis);
		PropertyConfigurator.configure(logProperties);
		fis.close();
	}
}
