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

/**
 * Enumeration that holds tag class, specified in ASN.1 specification
 *
 * @author lastrix
 * @version 1.0
 */
public enum TagClass {
	/**
	 * Universal class used by all default classes
	 */
	UNIVERSAL((byte) 0x00),
	/**
	 * This should be used by user defined classes
	 */
	APPLICATION((byte) 0x40),
	PRIVATE((byte) 0xC0);

	/**
	 * The code, see ASN.1 specification for more info
	 */
	private final byte code;

	private TagClass(final byte code) {
		this.code = code;
	}

	/**
	 * Returns code, that represent this class
	 *
	 * @return an byte
	 */
	public byte getCode() {
		return code;
	}

	/**
	 * Return enum constant by code representation as it comes from ASN.1 (no align needed)
	 *
	 * @param code - the code, should be 0x00, 0x40 or 0xC0, other values give IllegalArgumentException
	 *
	 * @return an TagClass enum constant
	 *
	 * @throws IllegalArgumentException if code is not 0x00, 0x40 or 0xC0.
	 */
	public static TagClass getByCode(final int code) throws IllegalArgumentException {
		if (code == 0x00) {
			return UNIVERSAL;
		} else if (code == 0x40) {
			return APPLICATION;
		} else if (code == 0xC0) {
			return PRIVATE;
		}
		throw new IllegalArgumentException(String.format("Unknown code '%d'.", code));
	}
}
