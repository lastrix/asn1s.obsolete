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
import org.lastrix.asn1s.util.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Class for holding information about header (BER).
 *
 * @author: lastrix
 * Date: 8/14/11
 * Time: 12:29 PM
 */
public class Header implements Length {
	private static final Logger logger = Logger.getLogger(Header.class);

	public final static Header EOC_HEADER = new Header(0, (byte) 0, false, 0);

	private final byte    tagClass;
	private final boolean constructed;
	private final long    tag;
	private final long    length;
	private byte[] byteArray = null;
	private byte[] tagBytes  = null;

	public Header(final long tag, final byte tagClass, final boolean constructed, final long length) {
		this.tag = tag;
		this.tagClass = tagClass;
		this.constructed = constructed;
		this.length = Math.max(length, 0);
	}


	public long getLength() {
		return length;
	}

	public long getTag() {
		return tag;
	}

	public boolean isEOC() {
		//end of contents is special 00 00 mark which could be counted as an UNIVERSAL PRIMITIVE object with zero tag and zero length
		return length == 0 && tagClass == Tag.CLASS_UNIVERSAL && !constructed && tag == 0;
	}

	public byte getTagClass() {
		return tagClass;
	}

	public boolean isConstructed() {
		return constructed;
	}

	public byte[] tagToByteArray() {
		if (tagBytes == null) {
			toByteArray();
		}
		return tagBytes;
	}

	public byte[] toByteArray() {
		if (byteArray != null) {
			return byteArray;
		}
		final long tagBits = Long.highestOneBit(getTag());
		ByteArrayOutputStream bos = new ByteArrayOutputStream(Utils.getMinimumBytes(getTag()) + Utils.getMinimumBytes(getLength()) + 1);

		if (tagBits > 0x1FL) {
			//much worse, but doable
			//TODO:
		} else {
			bos.write(((int) getTag()) & 0x1F | getTagClass() | ((isConstructed()) ? Tag.PC_MASK : 0));
		}

		//save tag bytes
		tagBytes = bos.toByteArray();
		try {
			writeLength(bos, getLength());
		} catch (IOException e) {
			//actually this should never happen here.
			logger.error("An exception occurred.", e);
		}
		byteArray = bos.toByteArray();
		return byteArray;
	}

	public static final void writeLength(OutputStream os, long length) throws IOException {
		final long lengthBits = Long.highestOneBit(length);
		if (lengthBits > 0x7FL) {
			//much worse, but doable
			//TODO:
		} else {
			os.write(((int) length) & 0x7F);
		}
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		} else if (obj instanceof Header) {
			return getLength() == ((Header) obj).getLength()
			       && getTag() == ((Header) obj).getTag()
			       && getTagClass() == ((Header) obj).getTagClass()
			       && isConstructed() == ((Header) obj).isConstructed();
		}
		return false;
	}

	/**
	 * Checks if tag, tagClass and constructed fields are equal
	 *
	 * @param header
	 *
	 * @return an boolean
	 */
	public final boolean isSame(Header header) {
		return isConstructed() == header.isConstructed()
		       && getTag() == header.getTag()
		       && getTagClass() == header.getTagClass();
	}

	@Override
	public String toString() {
		return "Header{" +
		       "tag=" + tag +
		       ", tagClass=" + tagClass +
		       ", constructed=" + constructed +
		       ", length=" + length +
		       '}';
	}


}
