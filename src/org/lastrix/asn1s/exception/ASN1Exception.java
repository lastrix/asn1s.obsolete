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

package org.lastrix.asn1s.exception;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 1:53 PM
 */
public class ASN1Exception extends Exception {

	public ASN1Exception(final Throwable cause) {
		super(cause);
	}

	public ASN1Exception(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ASN1Exception(final String message) {
		super(message);
	}

	public ASN1Exception() {
	}
}
