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

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.lastrix.asn1s.protocol.ASN1InputStream;
import org.lastrix.asn1s.protocol.ASN1OutputStream;
import org.lastrix.asn1s.protocol.ASN1Types;
import org.lastrix.asn1s.protocol.Header;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 11:52 AM
 */
public class Asn1s {
	private final static Logger logger = Logger.getLogger(Asn1s.class);

	private static       String logPropertiesFile = "resources/log4j.properties";
	private static final String REVISION          = "0.0.1";

	private static void initLogging() {
		final Properties logProperties = new Properties();
		try {
			// load our log4j properties / configuration file
			logProperties.load(new FileInputStream(logPropertiesFile));
			PropertyConfigurator.configure(logProperties);
			// print short summary
			logger.debug(
			            "\nASN1S version: " + getRevision() + "\n\n" + "Java vendor: "
			            + System.getProperty("java.vendor") + "\n" + "Java version: " + System.getProperty(
			                                                                                              "java.version"
			                                                                                              )
			            + "\n"
			            + "Java WM name: " + System.getProperty("java.vm.name") + "\n" + "Java WM vendor: "
			            + System.getProperty("java.vm.vendor") + "\n" + "Java WM version: "
			            + System.getProperty("java.vm.version")
			            + "\n\n" + "OS name: " + System.getProperty("os.name") + "\n" + "OS architecture: "
			            + System.getProperty("os.arch") + "\n" + "OS version: " + System.getProperty(
			                                                                                        "os.version"
			                                                                                        )
			            + "\n\n"
			            );
		} catch (final IOException e) {
			throw new RuntimeException("Unable to load logging property " + logPropertiesFile);
		}
	}

	private static String getRevision() {
		return REVISION;
	}

	public static void main(final String[] args) {
		initLogging();
		ASN1Types.init();
		final int SIZE = 500000;
		Object[] objects = new Object[]{
		                               -10000d,
		                               10d,
		                               0d,
		                               Double.NEGATIVE_INFINITY,
		                               Double.POSITIVE_INFINITY
		};
		ByteArrayOutputStream baos = new ByteArrayOutputStream(64);
		ASN1OutputStream os = new ASN1OutputStream(baos);
		try {
			for (Object o : objects) {
				os.write(o);
			}
		} catch (Exception e) {
			logger.warn("An exception occurred:", e);
			return;
		}

		final byte[] bytes = baos.toByteArray();
		logger.warn("\n" + makeHexString(bytes));
		ASN1InputStream bis = new ASN1InputStream(new ByteArrayInputStream(bytes));
		try {
			while (true) {
				Header header = bis.readHeader();
				if (header == null) {
					break;
				}
				Object o = bis.read(header);
				if (o != null && o.getClass().isArray()) {
					logger.warn(String.format("Object read: %s", Arrays.toString((byte[]) o)));
				} else {
					logger.warn(String.format("Object read: %s", o));
				}
			}
		} catch (Exception e) {
			logger.warn("Exception occurred:", e);
		}
	}

	public static String makeHexString(byte[] array) {
		if (array == null || array.length == 0) { return "[]"; }
		StringWriter sw = new StringWriter(array.length * 2 + 2);
		sw.append("[");
		for (int i = 0; i < array.length; i++) {
			sw.append(String.format(" 0x%02X", array[i]));
			if (i < array.length - 1) {
				sw.append(",");
			}
		}
		sw.append(" ]");
		return sw.toString();
	}
}
