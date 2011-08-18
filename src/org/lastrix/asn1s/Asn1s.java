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
import org.lastrix.asn1s.protocol.ASN1Coders;
import org.lastrix.asn1s.protocol.ASN1InputStream;
import org.lastrix.asn1s.protocol.ASN1OutputStream;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.util.Utils;

import java.io.*;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Properties;

/**
 * The main of ASN1S.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"WeakerAccess", "ClassWithoutConstructor"})
public class Asn1s {
	private final static Logger logger = Logger.getLogger(Asn1s.class);

	@SuppressWarnings({"FieldCanBeLocal"})
	private static final String logPropertiesFile = "resources/log4j.properties";
	private static final String REVISION          = "0.0.1";

	private static void initLogging() {
		final Properties logProperties = new Properties();

		final FileInputStream fis;
		//open file
		try {
			fis = new FileInputStream(logPropertiesFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Unable to load logging property " + logPropertiesFile);
		}
		//load properties
		try {
			// load our log4j properties / configuration file
			logProperties.load(fis);
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
		} finally {
			//now we could close it
			try {
				fis.close();
			} catch (IOException e) {
				logger.warn("Exception:", e);
			}
		}
	}

	public static String getRevision() {
		return REVISION;
	}

	public static void main(final String... args) {
		initLogging();
		ASN1Coders.init();
		final BitSet bs = new BitSet(8);
		bs.set(1);
		bs.set(3);
		bs.set(5);
		bs.set(7);
		final Object[] objects = new Object[]{
		                                     new long[]{1, 2},
		                                     new long[]{1, 2, 140, 230, 1024, 4096, 32768},
		                                     new long[]{1, 2, 140},
		                                     -10000d,
		                                     10d,
		                                     0d,
		                                     0.001d,
		                                     Double.NEGATIVE_INFINITY,
		                                     Double.POSITIVE_INFINITY,
		                                     0,
		                                     10000000,
		                                     -1000000,
		                                     true,
		                                     false,
		                                     new byte[]{1, 2, 3, 4, 5, 6, 7},
		                                     null,
		                                     bs
		};
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
		ASN1OutputStream os = new ASN1OutputStream(byteArrayOutputStream);
		try {
			for (Object o : objects) {
				os.write(o);
			}
		} catch (Exception e) {
			logger.warn("An exception occurred:", e);
			return;
		}

		final byte[] bytes = byteArrayOutputStream.toByteArray();
		logger.warn("\n" + Utils.toHexString(bytes));
		ASN1InputStream bis = new ASN1InputStream(new ByteArrayInputStream(bytes));
		try {
			while (true) {
				Header header = bis.readHeader();
				if (header == null) {
					break;
				}
				Object o = bis.readAs(header);
				if (o != null && o.getClass().isArray()) {
					try {
						logger.warn(String.format("Object readAs: %s", Arrays.toString((byte[]) o)));
					} catch (Exception e) {
						logger.warn(String.format("Object readAs: %s", Arrays.toString((long[]) o)));
					}
				} else {
					logger.warn(String.format("Object readAs: %s", o));
				}
			}
		} catch (Exception e) {
			logger.warn("Exception occurred:", e);
		}
	}

}
