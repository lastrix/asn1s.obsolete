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
import org.lastrix.asn1s.protocol.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
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
		ValueHandlers.init();
		byte[] bytes = new byte[]{
		                         0x09, 0x04, (byte) 0x81, 0x04, 0x01, 0x00,
		                         0x09, 0x01, 0x41,
		                         0x03, 0x07, 0x04, 0x0A, (byte) 0x3B, 0x5F, 0x29, 0x1C, (byte) 0xD0
		};
		ASN1InputStream bis = new ASN1InputStream(new ByteArrayInputStream(bytes));
		try {
			while (true) {
				Header header = bis.readHeader();
				if (header == null) {
					break;
				}
				Object o = bis.read(header);
				if (o instanceof Long) {
					logger.warn(String.format("Object read: %s, %s", Long.toHexString((Long) o), o));
				} else {
					logger.warn(String.format("Object read: %s", o));
				}
			}
		} catch (Exception e) {
			logger.warn("Exception occurred:", e);
		}

		ByteArrayOutputStream baos = new ByteArrayOutputStream(64);
		ASN1OutputStream os = new ASN1OutputStream(baos);
		try {
			new ASN1Integer().encodeValue(new Integer(-100000), os);
			logger.warn(Arrays.toString(baos.toByteArray()));
		} catch (Exception e) {
			logger.warn("An exception occurred:", e);
		}
	}

}
