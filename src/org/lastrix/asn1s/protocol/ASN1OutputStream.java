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

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lastrix
 *         Date: 8/14/11
 *         Time: 1:46 PM
 * @version 1.0
 */
public final class ASN1OutputStream extends FilterOutputStream {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1OutputStream.class);

	public ASN1OutputStream(final OutputStream outputStream) {
		super(outputStream);
	}


	public void write(Object o) throws ASN1ProtocolException, IOException {
		//try primitive encoder
		PrimitiveEncoder encoder = ASN1Types.getPrimitiveTypeEncoder(o);
		if (encoder != null) {
			encoder.encode(this, o);

		} else {
			//try constructed encoder
			ConstructedEncoder cEncoder = ASN1Types.getConstructedTypeEncoder(o);
			if (cEncoder != null) {
				cEncoder.encode(this, o);

			} else {
				throw new ASN1ProtocolException("No encoder for '" + o + "'");
			}
		}
	}
}
