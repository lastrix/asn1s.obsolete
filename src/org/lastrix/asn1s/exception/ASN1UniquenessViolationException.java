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

package org.lastrix.asn1s.exception;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1UniquenessViolationException extends ASN1Exception {
	public ASN1UniquenessViolationException(final Throwable cause) {
		super(cause);
	}

	public ASN1UniquenessViolationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ASN1UniquenessViolationException(final String message) {
		super(message);
	}

	public ASN1UniquenessViolationException() {
	}
}
