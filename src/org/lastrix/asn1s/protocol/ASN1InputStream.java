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

import org.lastrix.asn1s.exception.ASN1ProtocolException;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 12:21 PM
 */
public class ASN1InputStream extends FilterInputStream {

	public ASN1InputStream(final InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		final int result = super.read();

		if (result == -1) {
			throw new EOFException("End of file reached.");
		}

		return result;
	}

	/**
	 * Read header from input stream (redirects to {@link Header#readHeader(InputStream)})
	 *
	 * @return header
	 *
	 * @throws ASN1ProtocolException
	 */
	public Header readHeader() throws ASN1ProtocolException {
		return Header.readHeader(this);
	}

	/**
	 * Read object from stream according to specified header
	 *
	 * @param header - the header
	 *
	 * @return an object
	 *
	 * @throws ASN1ProtocolException if no handlers found or caught an exception from decoder
	 */
	public Object read(Header header) throws ASN1ProtocolException {
		if (header.isConstructed()) {
			//for constructed
			ConstructedDecoder decoder = ASN1Types.getConstructedDecoder(header);
			if (decoder == null) {
				throw new ASN1ProtocolException(String.format("No handlers found for '%s'", header));
			}
			try {
				return decoder.decode(this, header);
			} catch (IOException e) {
				throw new ASN1ProtocolException(e);
			}

		} else {
			//for primitive
			PrimitiveDecoder decoder = ASN1Types.getPrimitiveDecoder(header);
			if (decoder == null) {
				throw new ASN1ProtocolException(String.format("No handlers found for '%s'", header));
			}
			try {
				return decoder.decode(this, header);
			} catch (IOException e) {
				throw new ASN1ProtocolException(e);
			}
		}
	}

}
