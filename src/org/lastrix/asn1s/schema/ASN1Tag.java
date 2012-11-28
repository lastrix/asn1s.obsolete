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

import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1ReadException;
import org.lastrix.asn1s.util.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Declares ASN1 Tag. This object perform reading and writing from or to stream ASN1 tags.
 * See ITU-T X.690 (07/2002) paragraph  8.1.2.3.
 *
 * @author lastrix
 * @version 1.0
 * @see #readTag(InputStream) - to read tag from stream
 * @see #asBytes() - to get byte array representation, you could write it to stream
 */
public final class ASN1Tag {
	/**
	 * Class mask to extract 7th and 8th bits from first tag octet
	 */
	public static final int CLASS_MASK = 0xC0;

	/**
	 * PC mask to extract 6th bit from first tag octet
	 */
	public static final int PC_MASK = 0x20;

	/**
	 * Tag mask to extract 1-5th bits from first tag octet
	 */
	public static final int TAG_MASK = 0x1F;

	/**
	 * The tag class, could be either UNIVERSAL, PRIVATE or APPLICATION
	 */
	private final TagClass tagClass;

	/**
	 * Flag to determine whether this class constructed
	 */
	private final boolean constructed;

	/**
	 * To save time, serializing this thing.
	 */
	private final byte[] bytes;

	/**
	 * The tag number
	 */
	private final int tag;

	/**
	 * Private method for reading tags encoded with ASN.1
	 *
	 * @param is - the input stream
	 *
	 * @return an ASN1Tag
	 *
	 * @throws ASN1Exception
	 */
	public static ASN1Tag readTag(InputStream is) throws ASN1Exception {
		int temp;
		//get first byte, this is only reading in most cases actually.
		try {
			temp = is.read();
		} catch (IOException e) {
			throw new ASN1ReadException("I/O error", e);
		}
		// see tag format in ITU-T X.690 paragraph 8.1.2.3, and in some cases 8.1.2.4.3.
		final int tagClass = (temp & CLASS_MASK);
		final boolean constructed = ((temp & PC_MASK) >> 5) > 0;
		int tag = temp & TAG_MASK;

		// We have here tag with additional octets
		if (tag == TAG_MASK) {
			// zeroing is necessary, since first octet has a flag, not real data.
			tag = 0;
			do {
				try {
					temp = is.read();
				} catch (IOException e) {
					throw new ASN1ReadException("I/O error", e);
				}
				tag = (tag << 7) | (temp & Utils.UNSIGNED_BYTE_MASK);
			} while ((temp & Utils.BYTE_SIGN_MASK) > 0);
		}
		// now create class
		return new ASN1Tag(tag, TagClass.getByCode(tagClass), constructed);
	}


	/**
	 * Construct ASN1Tag
	 *
	 * @param tag         - the tag number
	 * @param tagClass    - the tag class
	 * @param constructed - the constructed flag
	 *
	 * @see #asBytes()
	 * @see #readTag(InputStream)
	 */
	public ASN1Tag(final int tag, final TagClass tagClass, final boolean constructed) {
		super();
		this.tag = tag;
		this.tagClass = tagClass;
		this.constructed = constructed;
		// may be do it lazy?
		this.bytes = toByteArray();
	}


	/**
	 * Returns tag number
	 *
	 * @return an int
	 */
	public int getTag() {
		return tag;
	}


	/**
	 * Returns Tag Class
	 *
	 * @return an TagClass
	 */
	public TagClass getTagClass() {
		return tagClass;
	}


	/**
	 * Returns constructed
	 *
	 * @return an boolean
	 */
	public boolean isConstructed() {
		return constructed;
	}


	/**
	 * Returns true whenever this tag is an eoc label.
	 *
	 * @return
	 */
	public boolean isEOC() {
		return getTag() == 0 && getTagClass() == TagClass.UNIVERSAL && !isConstructed();
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new ASN1Tag(tag, tagClass, constructed);
	}


	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof ASN1Tag) {
			// yes, there is no constructed checks. Since some types got very bad here (like Strings, see ITU-T X.690 paragraph 8.6.4.2)
			// so it better not to check
			return tag == ((ASN1Tag) obj).getTag() && tagClass.equals(((ASN1Tag) obj).getTagClass());
		}
		return false;
	}


	@Override
	public int hashCode() {
		// we don't need to hash constructed, some classes don't like it, like Strings, see ITU-T X.690 paragraph 8.6.4.2
		return tagClass.ordinal()
		       | (tag << 2);
	}


	@Override
	public String toString() {
		//small hack, so constructed would only change bracket to brace
		if (constructed) {
			return String.format("ASN1Tag[%d %s]", tag, tagClass);
		}
		return String.format("ASN1Tag{%d %s}", tag, tagClass);
	}


	/**
	 * Converts tag, tagClass and constructed to byte array, so you could write it
	 *
	 * @return an byte array
	 */
	private byte[] toByteArray() {
		final long tagBits = Long.highestOneBit(getTag());
		ByteArrayOutputStream bos = new ByteArrayOutputStream(1);

		if (tagBits > TAG_MASK) {
			//write XX X 11111 byte
			bos.write(TAG_MASK | getTagClass().getCode() | ((isConstructed()) ? PC_MASK : 0));

			// now write tag number as described in ITU-T X.690 paragraph 8.1.2.4.3.
			long mTag = Utils.makeByteGaps(getTag(), 1, Utils.UNSIGNED_BYTE_MASK);
			final int bytesCount = Utils.getMinimumBytes(mTag);
			for (int i = bytesCount - 1; i >= 0; i--) {
				bos.write((int) ((mTag >> (i * 8)) & Utils.BYTE_MASK) | Utils.BYTE_SIGN_MASK);
			}
		} else {
			// one byte tag
			bos.write(getTag() & TAG_MASK | getTagClass().getCode() | ((isConstructed()) ? PC_MASK : 0));
		}
		return bos.toByteArray();
	}


	/**
	 * Returns byte array representation of this tag
	 *
	 * @return an byte array
	 */
	public byte[] asBytes() {
		return bytes;
	}
}