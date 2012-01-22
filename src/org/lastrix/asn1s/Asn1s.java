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
import org.lastrix.asn1s.schema.ASN1Schema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
		final ASN1Schema s = ASN1Schema.loadSchema("./test/res/TestModule.asn");
		s.printDebugInfo();
//		ASN1Tag tag = new ASN1Tag(200, TagClass.UNIVERSAL, false);
//		logger.warn("\n" + Utils.toHexString(tag.asBytes()));
//		ByteArrayOutputStream bos = new ByteArrayOutputStream(128*500000);
//
////		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0x10, 0x1, 0xFF, 0x1FF));
//		try {
//			logger.warn("Starting serialization");
//			for (int i = 0; i < 1; i++) {
//				s.write(
//				       new SequenceOfTestClass(i, 0x1111, 2.5, "Test", new SequenceOfTestClassAsField(i, "susy", 1.0)),
//				       bos
//				       );
//			}
//			logger.warn("Finished");
////			s.write(list, bos);
//		} catch (Exception e) {
//			logger.warn("Exception:", e);
//		}
//		final byte[] data = bos.toByteArray();
////		logger.warn("\n" + Utils.toHexString(data));
//		final ByteArrayInputStream bis = new ByteArrayInputStream(data);
//		logger.warn("Starting deserialization");
//		try {
//			int i = 0;
//			while (bis.available() > 0) {
//				final Object o = s.read(bis);
////				logger.warn("Got object: " + o);
//			}
//		} catch (Exception e) {
//			logger.warn("Exception:", e);
//		}
//		logger.warn("Finished");
	}

}
