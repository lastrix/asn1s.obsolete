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
 * @author lastrix
 * @version 1.0
 */
public final class ASN1OIDCoder extends ASN1RelativeOIDCoder {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger     = Logger.getLogger(ASN1OIDCoder.class);
	public final static  byte   TAG        = 0x06;
	private final static Header HEADER     = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 0);
	private static final int    MULTIPLIER = 40;

	public ASN1OIDCoder() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		int fOid = is.read() & Utils.BYTE_MASK;

		final long[] oids = readOids(is, header.getLength() - 1, 2);
		oids[0] = fOid / MULTIPLIER;
		oids[1] = fOid % MULTIPLIER;
		return oids;
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws IOException, IllegalArgumentException, NullPointerException {
		long[] oids = (long[]) value;

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write((int) (oids[0] * MULTIPLIER + oids[1]));
		writeOids(bos, oids, 2);
		final byte[] data = bos.toByteArray();
		bos.close();

		//tag
		os.write(HEADER.tagToByteArray());
		//length
		Header.writeLength(os, data.length);
		//content
		os.write(data);
	}

}
