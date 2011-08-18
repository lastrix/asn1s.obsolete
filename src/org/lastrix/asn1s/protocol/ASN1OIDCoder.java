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
public final class ASN1OIDCoder implements PrimitiveDecoder, PrimitiveEncoder {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger     = Logger.getLogger(ASN1OIDCoder.class);
	public final static  long   TAG        = 0x06;
	private final static Header HEADER     = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 0);
	private static final int    MULTIPLIER = 40;

	public ASN1OIDCoder() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {

		int fOid = is.read() & Utils.BYTE_MASK;
		int count = 2;

		final byte[] data = new byte[(int) (header.getLength() - 1)];
		if (data.length > 0 && is.read(data) < data.length) {
			throw new ASN1ProtocolException("Can not read data.");
		}
		for (byte aData : data) {
			if ((aData & Utils.BYTE_SIGN_MASK) == 0) {
				count++;
			}
		}
		final long[] oids = new long[count];
		oids[0] = fOid / MULTIPLIER;
		oids[1] = fOid % MULTIPLIER;
		int pos = -1;
		long temp;
		for (int i = 2; i < count; i++) {
			temp = 0;
			do {
				pos++;
				temp = (temp << 7) | ((int) data[pos] & Utils.UNSIGNED_BYTE_MASK);
			} while ((data[pos] & Utils.BYTE_SIGN_MASK) != 0);
			oids[i] = temp;
		}
		return oids;
	}

	@Override
	public void encode(final OutputStream os, final Object value) throws IOException, IllegalArgumentException, NullPointerException {

		long[] oid = (long[]) value;

		//write header
		os.write(HEADER.tagToByteArray());


		//write oids to buffer first, so we could get a
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write((int) (oid[0] * MULTIPLIER + oid[1]));
		for (int i = 2; i < oid.length; i++) {
			writeOid(oid[i], bos);
		}
		final byte[] data = bos.toByteArray();
		bos.close();

		//write length
		Header.writeLength(os, data.length);

		//write data
		os.write(data);
	}

	/**
	 * Write long as valid oid
	 *
	 * @param value - the value to save
	 * @param os    - the output stream
	 *
	 * @throws IOException - from write() calls
	 */
	private static void writeOid(final long value, OutputStream os) throws IOException {
		final long mValue = Utils.makeByteGaps(value, 1, Utils.UNSIGNED_BYTE_MASK);
		final int bytesCount = Utils.getMinimumBytes(mValue);
		for (int i = bytesCount - 1; i > 0; i--) {
			os.write((int) ((mValue >> (i * 8)) & Utils.BYTE_MASK) | Utils.BYTE_SIGN_MASK);
		}
		os.write((int) (mValue & Utils.BYTE_MASK));
	}
}
