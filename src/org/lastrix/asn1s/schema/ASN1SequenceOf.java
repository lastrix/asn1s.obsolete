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

import org.apache.log4j.Logger;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1SequenceOf extends ASN1Type {
	private final Logger logger = Logger.getLogger(ASN1SequenceOf.class);

	private final ASN1Type componentType;

	public ASN1SequenceOf(final ASN1Type componentType) {
		this.componentType = componentType;
	}


	@Override
	public String toString() {
		return "SEQUENCE OF " + componentType;
	}

	@Override
	public void write(final Object o, final OutputStream os) throws IOException {
		logger.warn("Writing " + o);
		final List list = (List) o;
		//write header
		os.write(new Header(17, (byte) 0, true, Tag.FORM_INDEFINITE).toByteArray());

		//write length (indefinite)
		Header.writeLength(os, Tag.FORM_INDEFINITE);
		for (Object lo : list) {
			componentType.write(lo, os);
			//getModule().get
		}

		//write EOC
		os.write(Header.EOC.toByteArray());
	}
}
