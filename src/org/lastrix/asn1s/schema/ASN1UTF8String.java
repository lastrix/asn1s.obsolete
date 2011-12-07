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
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UTF8String extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1UTF8String.class);

	private final static String NAME         = "UTF8String";
	public final static  byte   TAG          = 0x0C;
	private final        byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 1).tagToByteArray();

	public ASN1UTF8String() {
		handledClass = String.class;
		name = NAME;
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
		// TODO: unimplemented method stub
		String s = (String) o;
		os.write(s.getBytes("UTF-8"));
		//TODO:
		logger.warn(Utils.toHexString(s.getBytes("UTF-8")));
		throw new UnsupportedOperationException("Not implemented yet.");
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
	}
}
