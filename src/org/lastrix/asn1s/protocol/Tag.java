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

/**
 * Special constants highly used in whole org.lastrix.asn1s.protocol package and its subpackages.
 *
 * @author lastrix
 * @version 1.0
 */
@SuppressWarnings({"UnusedDeclaration"})
public interface Tag {

	/**
	 * Class mask to extract 7th and 8th bits from first tag octet
	 */
	public static final int CLASS_MASK = 0xC0;

	/*
		Classes
	 */
	public static final byte CLASS_UNIVERSAL = 0x00;

	public static final byte CLASS_APPLICATION = 0x40;

	public static final byte CLASS_CONTEXT_SPECIFIC = (byte) 0x80;

	public static final byte CLASS_PRIVATE = (byte) 0xC0;

	/**
	 * PC mask to extract 6th bit from first tag octet
	 */
	public static final int PC_MASK = 0x20;

	/**
	 * Tag mask to extract 1-5th bits from first tag octet
	 */
	public static final int TAG_MASK = 0x1F;

	/**
	 * Used for additional tag octets
	 */
	public static final int TAG_MASK_EXTENDED = 0x7F;

	/**
	 * Mask to extract 8th bit from octets that come after 1st one ( if 1st one had 1-5 bits as 1 ).
	 */
	public static final int TAG_EXTEND_MASK = 0x80;

	public static final int FORM_INDEFINITE = 0x80;

	public static final int FORM_MASK = 0x80;

	public static final int LENGTH_MASK = 0x7F;

	public static final int MORE_BYTES = 0x80;
}
