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

package org.lastrix.asn1s.schema;

import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;
import org.lastrix.asn1s.util.Utils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Integer extends ASN1Type {

	public static final String NAME         = "INTEGER";
	public final static byte   TAG          = 0x02;
	private final       byte[] HEADER_BYTES = new Header(TAG, Tag.CLASS_UNIVERSAL, false, 1).tagToByteArray();

	public ASN1Integer() {
		handledClass = Integer.class;
		this.name = NAME;
	}

	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException {
		final long value = numberToLong(o);

		int size = Utils.getMinimumBytes((value < 0) ? -value : value);

		//if highest bit of highest byte is 1 then we should increase size to add
		// trailing zero
		if (value > 0 && ((value >> ((size - 1) * 8 + 7)) & 0x01) > 0) {
			size++;
		}

		if (header) {
			//write header
			os.write(HEADER_BYTES);
			//write length
			Header.writeLength(os, size);
		}
		//write integer data
		os.write(Utils.extractBytes(value, 0, size));
	}

	/**
	 * Converts Byte, Short, Integer or Long to long
	 *
	 * @param o - the number object
	 *
	 * @return long
	 */
	private static long numberToLong(final Object o) {
		if (o == null) {
			throw new NullPointerException();
		}
		//noinspection ChainOfInstanceofChecks
		if (o instanceof Byte) {
			return (Byte) o;
		} else if (o instanceof Short) {
			return (Short) o;
		} else if (o instanceof Integer) {
			return (Integer) o;
		} else if (o instanceof Long) {
			return (Long) o;
		}
		throw new IllegalArgumentException(
		                                  String.format(
		                                               "Object 'o' should be 'Byte', 'Short', 'Integer' or 'Long', has '%s'.",
		                                               o.getClass().getSimpleName()
		                                               )
		);
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public boolean isConstructed() {
		return false;
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
	}
}
