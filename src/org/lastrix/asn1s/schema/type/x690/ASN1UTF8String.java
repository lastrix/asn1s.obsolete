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

package org.lastrix.asn1s.schema.type.x690;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.schema.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UTF8String extends ASN1OctetString {
	private final static Logger logger = Logger.getLogger(ASN1UTF8String.class);

	private final static String  NAME = "UTF8String";
	public final static  ASN1Tag TAG  = new ASN1Tag(0x0C, TagClass.UNIVERSAL, false);

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
		final byte[] data = ((String) o).getBytes("UTF-8");
		//write header and length
		//TODO: check about constructed.
		if (header) {
			os.write(TAG.asBytes());
			os.write(ASN1Length.asBytes(data.length));
		}
		encode(os, data);
	}

	@Override
	public Object read(final Object nullValue, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1Integer does not allow non null parameter 'nullValue'");
		}

		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(is).getLength();

		return new String(decode(is, length), "UTF-8");
	}

	@Override
	public boolean isConstructed() {
		return TAG.isConstructed();
	}

	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		//now we should add self to index base
		module.install(this);
	}

	@Override
	public void onExport(final ASN1Schema schema) throws IllegalStateException {
		// TODO: unimplemented method stub

	}

	@Override
	public void onImport(final ASN1Module module) throws IllegalStateException {
		module.importType(this);
	}

	@Override
	public void resolveTypes() {
		// TODO: unimplemented method stub

	}

	@Override
	public boolean isValid() {
		// TODO: unimplemented method stub
		return false;
	}

	@Override
	public ASN1Tag getTag() {
		return TAG;
	}
}
