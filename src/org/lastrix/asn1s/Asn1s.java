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

package org.lastrix.asn1s;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.schema.ASN1Schema;

import java.io.*;
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

//		final ByteArrayInputStream is = new ByteArrayInputStream(new byte[]{0x00, 0x00});
//		try {
//			ASN1Tag tag = ASN1Tag.readTag(is);
//			logger.warn(tag);
//			logger.warn(tag.isConstructed());
//		} catch (ASN1Exception e) {
//			logger.warn("Exception:", e);
//		}

		try {
			final ASN1Schema s = ASN1Schema.loadSchema("./test/res/testModule.asn");
			logger.warn(s.getModulesString());
			final FileWriter fw = new FileWriter("/tmp/out.asn");
			final PrintWriter pw = new PrintWriter(fw);
			s.getModule("TestModule").toASN1(pw, false);
			fw.close();
		} catch (ASN1Exception e) {
			logger.warn("Exception:", e);
//		} catch (FileNotFoundException e) {
//			logger.warn("Exception:", e);
		} catch (IOException e) {
			logger.warn("Exception:", e);
		}
//		s.printDebugInfo();
	}

}
