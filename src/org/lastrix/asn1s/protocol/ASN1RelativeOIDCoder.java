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
public class ASN1RelativeOIDCoder implements PrimitiveDecoder, PrimitiveEncoder {
	private final static Logger logger = Logger.getLogger(ASN1RelativeOIDCoder.class);

	public static final  byte   TAG    = 0x0D;
	private static final Header HEADER = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 0);

	public ASN1RelativeOIDCoder() {
	}

	@Override
	public Object decode(final InputStream is, final Header header) throws ASN1ProtocolException, IOException {
		return readOids(is, header.getLength(), 0);
	}

	/**
	 * Read oids from input stream
	 *
	 * @param is       - the input stream
	 * @param length   - amount of bytes to read
	 * @param preserve - read data contain X oids, this value would be added to X,
	 *                 so result array would contain more elements
	 *
	 * @return oids
	 *
	 * @throws ASN1ProtocolException - if enough data can not be read
	 * @throws IOException           - from read() calls
	 */
	protected final long[] readOids(final InputStream is, int length, int preserve) throws ASN1ProtocolException, IOException {
		final byte[] data = new byte[length];

		int count = preserve;
		if (data.length > 0 && is.read(data) < data.length) {
			throw new ASN1ProtocolException("Can not read data.");
		}

		for (byte aData : data) {
			if ((aData & Utils.BYTE_SIGN_MASK) == 0) {
				count++;
			}
		}
		final long[] oids = new long[count];
		int pos = -1;
		long temp;
		for (int i = preserve; i < count; i++) {
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
		long[] oids = (long[]) value;

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		writeOids(bos, oids, 0);
		final byte[] data = bos.toByteArray();
		bos.close();

		//tag
		os.write(HEADER.tagToByteArray());
		//length
		Header.writeLength(os, data.length);
		//content
		os.write(data);
	}

	/**
	 * Write oids to output stream
	 *
	 * @param os   - the output stream
	 * @param oids - the oids
	 * @param skip - number of elements to skip
	 *
	 * @throws IOException - from write() calls
	 */
	protected final void writeOids(final OutputStream os, long[] oids, int skip) throws IOException {
		for (int i = skip; i < oids.length; i++) {
			writeOid(oids[i], os);
		}
	}

	/**
	 * Write long as valid oid
	 *
	 * @param value - the value to save
	 * @param os    - the output stream
	 *
	 * @throws IOException - from write() calls
	 */
	private void writeOid(final long value, OutputStream os) throws IOException {
		final long mValue = Utils.makeByteGaps(value, 1, Utils.UNSIGNED_BYTE_MASK);
		final int bytesCount = Utils.getMinimumBytes(mValue);
		for (int i = bytesCount - 1; i > 0; i--) {
			os.write((int) ((mValue >> (i * 8)) & Utils.BYTE_MASK) | Utils.BYTE_SIGN_MASK);
		}
		os.write((int) (mValue & Utils.BYTE_MASK));
	}

}
