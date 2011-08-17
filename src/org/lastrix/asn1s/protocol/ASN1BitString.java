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
import java.io.InputStream;
import java.io.OutputStream;
import java.util.BitSet;

/**
 * See X.690-0207 8.6 for more information
 *
 * @author lastrix
 * @version 1.0
 */
public final class ASN1BitString implements PrimitiveDecoder, PrimitiveEncoder {
	public static final  byte   TAG    = 0x03;
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1BitString.class);

	private static final Header HEADER = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 0);

	public ASN1BitString() {}


	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		final int pad = is.read();
		if (pad > 7) {
			throw new ASN1ProtocolException("Bit string pad should be in [0,7]");
		}

		BitSet bs = new BitSet((int) ((header.getLength() - 1) * 8));
		int temp;
		final int size = (int) (header.getLength() - 1 - ((pad > 0) ? 1 : 0));
		for (int i = 0; i < size; i++) {
			temp = is.read();
			for (int k = i * 8; k < (i + 1) * 8; k++) {
				if ((temp & 0x01) > 0) {
					bs.set(k);
				}
				temp >>= 1;
			}
		}

		//handle pad
		if (pad > 0) {
			temp = is.read();
			temp >>= pad;
			final int end = (int) ((header.getLength() - 1) * 8 - pad);
			for (int i = (int) ((header.getLength() - 2) * 8); i < end; i++) {
				if ((temp & 0x01) > 0) {
					bs.set(i);
				}
				temp >>= 1;
			}
		}
		return bs;
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws IOException {
		//write tag
		os.write(HEADER.tagToByteArray());

		BitSet bs = (BitSet) value;
		final int bitCount = bs.length();
		final int rest = bitCount % 8;
		final int bytesCount = bitCount / 8 + ((rest > 0) ? 1 : 0) + 1;

		//write length
		Header.writeLength(os, bytesCount);

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
