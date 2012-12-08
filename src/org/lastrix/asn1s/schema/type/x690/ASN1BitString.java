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

import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;

import java.io.IOException;
import java.io.OutputStream;
import java.util.BitSet;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1BitString extends ASN1X690Type {

	public final static String  NAME = "BIT STRING";
	public final static ASN1Tag TAG  = new ASN1Tag(0x03, TagClass.UNIVERSAL, false);

	public ASN1BitString() {
		this.tag = TAG;
		this.name = NAME;
		this.handledClass = BitSet.class;
		this.typeId = getName();
		valid();
	}

	@Override
	public void write(final Object value, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		if (value == null) {
			throw new NullPointerException();
		}

		BitSet bs = (BitSet) value;
		final int bitCount = bs.length();
		final int rest = bitCount % 8;
		final int bytesCount = bitCount / 8 + ((rest > 0) ? 1 : 0) + 1;

		if (header) {
			os.write(getTag().asBytes());
			os.write(ASN1Length.asBytes(bytesCount));
		}

		//write pad settings
		if (rest == 0) {
			os.write(0x00);
		} else {
			os.write(8 - rest);
		}
		//write bytes
		for (int i = 0; i < bytesCount - 2; i++) {
			os.write(getByte(bs, i * 8, (i + 1) * 8));
		}
		int lastByte = getByte(bs, (bytesCount - 2) * 8, Math.min((bytesCount - 2) * 8 + bitCount, (bytesCount - 1) * 8));
		if (rest > 0) {
			lastByte <<= (8 - rest);
		}
		//write last byte
		os.write(lastByte);
	}

	@Override
	public Object read(final Object nullValue, final ASN1InputStream asn1is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1BitString does not allow non null parameter 'nullValue'");
		}

		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(asn1is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(asn1is);

		final int pad = asn1is.read();
		if (pad > 7) {
			throw new ASN1ProtocolException("Bit string pad should be in [0,7]");
		}

		BitSet bs = new BitSet((length - 1) * 8);
		int temp;
		final int size = length - 1 - ((pad > 0) ? 1 : 0);
		for (int i = 0; i < size; i++) {
			temp = asn1is.read();
			for (int k = i * 8; k < (i + 1) * 8; k++) {
				if ((temp & 0x01) > 0) {
					bs.set(k);
				}
				temp >>= 1;
			}
		}

		//handle pad
		if (pad > 0) {
			temp = asn1is.read();
			temp >>= pad;
			final int end = (length - 1) * 8 - pad;
			for (int i = (length - 2) * 8; i < end; i++) {
				if ((temp & 0x01) > 0) {
					bs.set(i);
				}
				temp >>= 1;
			}
		}
		return bs;
	}


	/**
	 * Extracts 1 byte from {@link BitSet}
	 *
	 * @param bs     - the BitSet
	 * @param sIndex - start index
	 * @param eIndex - end index
	 *
	 * @return an byte
	 */
	private static byte getByte(final BitSet bs, final int sIndex, final int eIndex) {
		int result = 0;
		for (int i = eIndex - 1; i >= sIndex; i--) {
			result <<= 1;
			if (bs.get(i)) {
				result |= 1;
			}
		}
		return (byte) result;
	}
}
