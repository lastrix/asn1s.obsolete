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

import org.lastrix.asn1s.exception.ASN1Exception;

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
		// TODO: unimplemented method stub
		final int result = super.read();

		if (result == -1) {
			throw new EOFException("End of file reached.");
		}

		return result;
	}

	public Header readHeader() throws ASN1Exception {
		return readHeader(false);
	}

	public Header readHeader(final boolean putMark) throws ASN1Exception {

		if (putMark) {
			//put mark, so user could reset to start if something bad happen.
			this.mark(java.lang.Integer.MAX_VALUE);
		}

		//tag reading
		int temp = 0;
		try {
			temp = read();
		} catch (IOException e) {
			//no header
			return null;
		}
		final byte tagClass = (byte) (temp & Tag.CLASS_MASK);
		final boolean constructed = ((temp & Tag.PC_MASK) >> 5) > 0;
		long tag = temp & Tag.TAG_MASK;

		/*
			We have here tag with additional octets
		 */
		if (tag == Tag.TAG_MASK) {
			//zeroing is necessary, since first octet has a flag, not real data.
			tag = 0;
			do {
				try {
					temp = read();
				} catch (IOException e) {
					throw new ASN1Exception("Unexpected EOF found.", e);
				}
				tag = (tag << 7) | (temp & Tag.TAG_MASK_EXTENDED);
			} while ((temp & Tag.TAG_EXTEND_MASK) > 0);
		}

		/*
			Read the length
		 */
		try {
			temp = read();
		} catch (IOException e) {
			throw new ASN1Exception("Unexpected EOF found.", e);
		}

		long length = 0;

		if ((temp & Length.FORM_MASK) == 0) {
			//this is short definite form
			length = temp & Length.LENGTH_MASK;
		} else {
			if ((temp & Length.LENGTH_MASK) == 0) {
				//this is an indefinite form
				length = 0;
			} else {
				//this is an definite long form
				final int count = temp & Length.LENGTH_MASK;
				try {
					for (int i = 0; i < count; i++) {
						temp = read();
						length = (length << 8) | ((long) temp & 0xFFL);
					}
				} catch (IOException e) {
					throw new ASN1Exception("Unexpected EOF found.", e);
				}
			}
		}
		return new Header(tag, tagClass, constructed, length);
	}

	/**
	 * Read object from stream according to specified header
	 *
	 * @param header - the header
	 *
	 * @return an object
	 */
	public Object read(Header header) throws ASN1Exception {
		if (header.isConstructed()) {
			throw new IllegalStateException("Header tells, that content doesn't contain any primitive");
		}
		PrimitiveDecoder decoder = ASN1Types.getPrimitiveDecoder(header);
		if (decoder == null) {
			throw new ASN1Exception("No handler found for tag " + header.getTag() + " class " + header.getTagClass() + ".");
		}
		try {
			return decoder.decode(this, header);
		} catch (IOException e) {
			throw new ASN1Exception("Unexpected EOF found.", e);
		}
	}

}
