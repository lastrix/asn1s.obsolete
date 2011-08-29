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

package org.lastrix.asn1s.protocol;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1ProtocolException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: implement this one.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Sequence implements ConstructedDecoder, ConstructedEncoder {
	private static final Logger logger = Logger.getLogger(ASN1Sequence.class);

	public final static  byte   TAG    = 0x10;
	private final static Header HEADER = new Header(TAG, Tag.CLASS_UNIVERSAL, true, 0);

	@Override
	public Object decode(final ASN1InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		final List list = new ArrayList();
		//so we load all available data into byte array, after that we derive another ASN1InputStream from is with ByteArrayInputStream as source.
		if (header.getLength() == Tag.FORM_INDEFINITE) {
			//indefinite form
			int bytesRead = 0;
			while (true) {
				final Header h = is.readHeader();
				//exit if EOC found
				if (h.isEOC()) break;

				//read the object
				Object o = is.readAs(h);

				//decoder should set valid length to header anyway.
				if (h.getLength() == Tag.FORM_INDEFINITE) {
					throw new ASN1ProtocolException("Length is not set after loading.");
				}
				bytesRead += h.getBytesRead();
				list.add(o);
			}
			header.setLength(bytesRead);
		} else {
			//this is definite form
			int bytesRead = 0;
			while (bytesRead < header.getLength()) {
				final Header h = is.readHeader();

				//read the object
				Object o = is.readAs(h);

				//decoder should set valid length to header anyway.
				if (h.getLength() == Tag.FORM_INDEFINITE) {
					throw new ASN1ProtocolException("Length is not set after loading.");
				}
				bytesRead += h.getBytesRead();
				list.add(o);
			}
		}
		return list;
	}

	@Override
	public void encode(final ASN1OutputStream os, final Object value) throws ASN1ProtocolException, IOException {
		List list = (List) value;

		//write header
		os.write(HEADER.tagToByteArray());

		//write length (indefinite)
		Header.writeLength(os, Tag.FORM_INDEFINITE);
		for (Object o : list) {
			os.write(o);
		}

		//write EOC
		os.write(Header.EOC.toByteArray());
	}
}
