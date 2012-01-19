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

package org.lastrix.asn1s.schema;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectHeaderException;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UTF8String extends ASN1OctetString {
	private final static Logger logger = Logger.getLogger(ASN1UTF8String.class);

	private final static String NAME         = "UTF8String";
	public final static  byte   TAG          = 0x0C;
	private final        byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 1).tagToByteArray();

	public ASN1UTF8String() {
		handledClass = String.class;
		name = NAME;
		this.headerBytes = HEADER_BYTES;
	}

	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		final byte[] data = ((String) o).getBytes("UTF-8");
		//write header and length
		//TODO: check about constructed.
		if (header) {
			os.write(HEADER_BYTES);
			Header.writeLength(os, data.length);
		}
		encode(os, data);
	}

	/**
	 * Read object of type from input stream
	 *
	 * @param o                   - the object which should be used for modifying
	 * @param is                  - the input stream
	 * @param header              - the header, non null values prevents method to read header from stream
	 * @param forceHeaderChecking - force type reader to check header
	 *
	 * @return an Object or null
	 *
	 * @throws IOException   thrown from I/O
	 * @throws ASN1Exception if selected type reader can not acquire data
	 */
	@Override
	public Object read(final Object o, final InputStream is, Header header, final boolean forceHeaderChecking) throws
	                                                                                                           IOException,
	                                                                                                           ASN1Exception {
		if (o != null) {
			throw new IllegalArgumentException("ASN1UTF8String does not allow non null values for parameter 'o'.");
		}

		if (header == null) {
			header = Header.readHeader(is, TAG, isConstructed(), Tag.CLASS_UNIVERSAL);
		} else if (forceHeaderChecking) {
			if (header.getTag() != TAG || header.getTagClass() != Tag.CLASS_UNIVERSAL || header.isConstructed() != isConstructed()) {
				throw new ASN1IncorrectHeaderException();
			}
		}
		return new String(decode(is, header.getLength()), "UTF-8");
	}

	@Override
	public boolean isConstructed() {
		return false;
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		//this is basic class which does not need any kind of validation
	}
}
