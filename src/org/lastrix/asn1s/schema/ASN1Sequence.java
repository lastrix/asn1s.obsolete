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

package org.lastrix.asn1s.schema;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Class to handle sequences and sequences of values.
 * This class uses definite length form (buffers elements before writing them into output stream)
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Sequence extends ASN1Type {
	private final Logger logger = Logger.getLogger(ASN1Sequence.class);

	private final ASN1Type[] componentType;
	private final static byte   TAG          = 16;
	/**
	 * Construct this thing so we could use it later.
	 */
	private final static byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, true, Tag.FORM_INDEFINITE).tagToByteArray();

	public ASN1Sequence(final ASN1Type[] componentType) {
		this.componentType = componentType;
		this.name = generateName();
	}

	private String generateName() {
		if (componentType.length == 1) {
			return "SEQUENCE OF " + componentType[0].getName();
		}
		//TODO: make complete thing here
		return "SEQUENCE";
	}


	@Override
	public String toString() {
		if (componentType.length == 1) {
			return "SEQUENCE OF " + componentType[0];
		}
		return "SEQUENCE OF " + Arrays.toString(componentType);
	}

	@Override
	public void write(final Object o, final OutputStream os, boolean header) throws IOException, ASN1Exception {

		if (header) {
			//write header
			os.write(HEADER_BYTES);
		}

		ByteArrayOutputStream bos = new ByteArrayOutputStream(128);
		if (componentType.length == 1) {
			// SEQUENCE OF
			final List list = (List) o;
			for (Object lo : list) {
				componentType[0].write(lo, bos, true);
			}
		} else {
			// SEQUENCE
			for (ASN1Type t : componentType) {
				t.write(o, bos, true);
			}
		}
		final byte[] data = bos.toByteArray();

		//store size
		if (header) {
			Header.writeLength(os, data.length);
		}

		//and now we can save our data.
		os.write(data);
	}

	@Override
	public boolean isConstructed() {
		return true;
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		for (int i = 0; i < componentType.length; i++) {
			if (componentType[i] instanceof ASN1UnresolvedType) {
				componentType[i] = module.getType(componentType[i].getName(), ((ASN1UnresolvedType) componentType[i]).getModuleName());
			} else {
				componentType[i].validate(module);
			}
		}
	}
}
