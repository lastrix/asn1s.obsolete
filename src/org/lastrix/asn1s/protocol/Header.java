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
import org.lastrix.asn1s.util.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Class for holding, handling and simple processing header information (BER).
 * See X.690-0207 8.1 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public final class Header {
	private static final Logger logger = Logger.getLogger(Header.class);

	private final byte    tagClass;
	private final boolean constructed;
	private final long    tag;
	private       int     length;
	private final int     bytesRead;
	private             byte[] byteArray = null;
	private             byte[] tagBytes  = null;
	public final static Header EOC       = new Header(0, (byte) 0, false, 0, 2);

	/**
	 * Create header
	 *
	 * @param tag         - the tag
	 * @param tagClass    - the class tag see Tag.CLASS_ for more info
	 * @param constructed - constructed or primitive
	 * @param length      - the length
	 */
	@SuppressWarnings({"ParameterHidesMemberVariable"})
	public Header(final long tag, final byte tagClass, final boolean constructed, final int length) {
		this(tag, tagClass, constructed, length, 0);
	}

	/**
	 * Create header
	 *
	 * @param tag         - the tag
	 * @param tagClass    - the class tag see Tag.CLASS_ for more info
	 * @param constructed - constructed or primitive
	 * @param length      - the length
	 */
	@SuppressWarnings({"ParameterHidesMemberVariable"})
	public Header(final long tag, final byte tagClass, final boolean constructed, final int length, final int bytesRead) {
		this.tag = tag;
		this.tagClass = tagClass;
		this.constructed = constructed;
		this.length = length;
		this.bytesRead = bytesRead;
	}


	public int getLength() {
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

		if (tagBits > Tag.TAG_MASK) {
			//write XX X 11111
			bos.write(Tag.TAG_MASK | getTagClass() | ((isConstructed()) ? Tag.PC_MASK : 0));

			long mTag = Utils.makeByteGaps(getTag(), 1, Utils.UNSIGNED_BYTE_MASK);
			final int bytesCount = Utils.getMinimumBytes(mTag);
			for (int i = bytesCount - 1; i > 0; i--) {
				bos.write((int) ((mTag >> (i * 8)) & Utils.BYTE_MASK) | Utils.BYTE_SIGN_MASK);
			}
			bos.write((int) (mTag & Utils.BYTE_MASK));
		} else {
			bos.write(((int) getTag()) & Tag.TAG_MASK | getTagClass() | ((isConstructed()) ? Tag.PC_MASK : 0));
		}

		//save tag bytes
		tagBytes = bos.toByteArray();
		try {
			if (getLength() >= 0) {
				writeLength(bos, getLength());
			} else {
				writeLength(bos, Tag.FORM_INDEFINITE);
			}
		} catch (IOException e) {
			//actually this should never happen here.
			logger.error("An exception occurred.", e);
		}
		byteArray = bos.toByteArray();
		return byteArray;
	}

	/**
	 * Writes the length into output stream
	 *
	 * @param os    - the output stream
	 * @param value - the length
	 *
	 * @throws IOException - from write() calls
	 */
	public static void writeLength(OutputStream os, int value) throws IOException {
		if (value == Tag.FORM_INDEFINITE) {
			os.write(Tag.FORM_INDEFINITE);
		} else if (value > Utils.UNSIGNED_BYTE_MASK) {
			final int bytesCount = Utils.getMinimumBytes(value);
			//as 8.1.3.5 in X.690-0207 says in 1st content octet bit 8 should be 1 and 7 to 1 should encode amount of bytes,
			// the others - length as unsigned integer LE!
			os.write(bytesCount | Tag.FORM_INDEFINITE);
			for (int i = bytesCount - 1; i >= 0; i--) {
				os.write((value >> (i * 8)) & Utils.BYTE_MASK);
			}
		} else {
			os.write(value & Utils.UNSIGNED_BYTE_MASK);
		}
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		} else //noinspection InstanceofInterfaces
			if (obj instanceof Header) {
				final Header header = (Header) obj;
				return getLength() == header.getLength()
				       && getTag() == header.getTag()
				       && getTagClass() == header.getTagClass()
				       && isConstructed() == header.isConstructed();
			}
		return false;
	}

	/**
	 * Checks if tag, tagClass and constructed fields are equal
	 *
	 * @param header - the header
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

	/**
	 * Read tag with length and return Header as result
	 *
	 * @param is - the input stream
	 *
	 * @return read Header
	 *
	 * @throws ASN1ProtocolException - if header can not be read
	 */
	public static Header readHeader(InputStream is) throws ASN1ProtocolException {
		//tag reading
		int bytesRead = 0;
		int temp;
		try {
			temp = is.read();
			bytesRead++;
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
					temp = is.read();
					bytesRead++;
				} catch (IOException e) {
					throw new ASN1ProtocolException("Unexpected EOF found.", e);
				}
				tag = (tag << 7) | (temp & Utils.UNSIGNED_BYTE_MASK);
			} while ((temp & Utils.BYTE_SIGN_MASK) > 0);
		}

		/*
			Read the length and create header
		 */
		try {
			temp = is.read();
			bytesRead++;
		} catch (IOException e) {
			throw new ASN1ProtocolException("Unexpected EOF found.", e);
		}

		int length = 0;

		if (temp == Tag.FORM_INDEFINITE) {
			//this is an indefinite form
			length = 0;
		} else if ((temp & Utils.BYTE_SIGN_MASK) == 0) {
			//this is short definite form
			length = temp & Utils.UNSIGNED_BYTE_MASK;
		} else {
			//this is an definite long form
			final int count = temp & Utils.UNSIGNED_BYTE_MASK;
			try {
				for (int i = 0; i < count; i++) {
					temp = is.read();
					bytesRead++;
					length = (length << 8) | (temp & Utils.BYTE_MASK);
				}
			} catch (IOException e) {
				throw new ASN1ProtocolException("Unexpected EOF found.", e);
			}
		}
		return new Header(tag, tagClass, constructed, length, bytesRead);
	}

	public int getBytesRead() {
		return bytesRead;
	}

	void setLength(final int length) {
		this.length = length;
	}
}
