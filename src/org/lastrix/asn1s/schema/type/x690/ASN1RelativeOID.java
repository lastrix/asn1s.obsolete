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

import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.type.ASN1RelativeObjectIdentifier;
import org.lastrix.asn1s.util.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1RelativeOID extends ASN1Type {
	public final static String  NAME = "RELATIVE-OID";
	public final static ASN1Tag TAG  = new ASN1Tag(0x0D, TagClass.UNIVERSAL, false);

	public ASN1RelativeOID() {
		this.tag = TAG;
		this.name = NAME;
		this.handledClass = ASN1RelativeObjectIdentifier.class;
		valid();
	}

	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		if (o == null || !handledClass.equals(o.getClass())) {
			throw new ASN1Exception("");
		}
		long[] oids = ((ASN1RelativeObjectIdentifier) o).getOids();

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		writeOids(bos, oids);
		final byte[] data = bos.toByteArray();
		bos.close();

		if (header) {
			os.write(getTag().asBytes());
			os.write(ASN1Length.asBytes(data.length));
		}

		//content
		os.write(data);
	}

	@Override
	public Object read(final Object nullValue, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (nullValue != null) {
			throw new IllegalArgumentException("ASN1RelativeOID does not allow non null parameter 'nullValue'");
		}

		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(is);
		final long[] oids = readOids(is, length, 0);
		return new ASN1RelativeObjectIdentifier(oids);
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

	/**
	 * Write oids to output stream
	 *
	 * @param os   - the output stream
	 * @param oids - the oids
	 *
	 * @throws IOException - from write() calls
	 */
	protected void writeOids(final OutputStream os, long[] oids) throws IOException {
		for (int i = 0; i < oids.length; i++) {
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
	protected final void writeOid(final long value, OutputStream os) throws IOException {
		final long mValue = Utils.makeByteGaps(value, 1, Utils.UNSIGNED_BYTE_MASK);
		final int bytesCount = Utils.getMinimumBytes(mValue);
		for (int i = bytesCount - 1; i > 0; i--) {
			os.write((int) ((mValue >> (i * 8)) & Utils.BYTE_MASK) | Utils.BYTE_SIGN_MASK);
		}
		os.write((int) (mValue & Utils.BYTE_MASK));
	}

}
