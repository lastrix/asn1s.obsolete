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

import java.io.IOException;
import java.io.StringWriter;

/**
 * TODO: probably should use java.util.BitSet here
 *
 * @author: lastrix
 * Date: 8/14/11
 * Time: 6:15 PM
 */
public class ASN1BitString implements ValueHandler {

	public static final long TAG_BITSTRING = 0x03;

	@Override
	public Object decodeValue(final Header header, final ASN1InputStream bis) throws IOException, ASN1Exception {
		//this should be empty
		if (header.getLength() == 1) {
			return new String();
		}
		final int pad = bis.read();
		if (pad > 7) {
			throw new ASN1Exception("Bit string pad should be in [0,7]");
		}
		StringWriter sw = new StringWriter((int) ((header.getLength() - 1) * 2));
		int temp;
		for (int i = 2; i < header.getLength(); i++) {
			temp = bis.read();
			//we should add it manually, since ASN1Integer.toHexString() doesn't add it anyway
			if ((temp & 0xF0) == 0) {
				sw.append("0");
			}
			sw.append(Integer.toHexString(temp).toUpperCase());
		}
		temp = bis.read();
		temp = temp >> pad;
		sw.append(Integer.toHexString(temp).toUpperCase());
		return sw.toString();
	}

	@Override
	public long getTag() {
		return TAG_BITSTRING;
	}

	@Override
	public PC getPC() {
		return PC.PRIMITIVE;
	}

	@Override
	public TagClass getTagClass() {
		return TagClass.UNIVERSAL;
	}

	@Override
	public void encodeValue(final Object object, final ASN1OutputStream bos) throws ASN1Exception, IOException {
		if (!(object instanceof String)) {
			throw new ASN1Exception("String expected, has '" + object + "'.");
		}
		String value = (String) object;
		//header
		bos.write(0x03);
		//length (no OOB checks )
		//FIXME: length should be written validly here.
		bos.write(1 + value.length() / 2 + value.length() % 2);
		//pad
		bos.write((value.length() % 2) * 4);
		for (int i = 0; i < value.length() / 2; i++) {
			bos.write(Integer.parseInt(value.substring(i * 2, (i + 1) * 2), 16));
		}
		if (value.length() % 2 != 0) {
			bos.write(Integer.parseInt(value.substring(value.length() - 1), 16) << 4);
		}
	}
}
