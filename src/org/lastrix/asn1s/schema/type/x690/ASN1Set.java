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

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.util.Utils;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1Set extends ASN1Container implements ASN1X690Type {
	private final Logger logger = Logger.getLogger(ASN1Set.class);

	public final static ASN1Tag                    TAG      = new ASN1Tag(17, TagClass.UNIVERSAL, true);
	public final        HashMap<ASN1Tag, ASN1Type> tag2type = new HashMap<ASN1Tag, ASN1Type>();


	public ASN1Set(final ASN1Type[] componentType, final boolean of) {
		super(componentType, of, "SET@" + TAG.getTag(), TAG);
		for (ASN1Type t : componentType) {
			tag2type.put(t.getTag(), t);
		}
		valid();
	}

	@Override
	public String toString() {
		if (of) {
			return "SET OF " + componentType[0];
		}
		return "SET OF " + Arrays.toString(componentType);
	}

	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		// TODO: unimplemented method stub

	}

	@Override
	public Object read(Object value, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null) {
			value = new HashSet();
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
		if (of) {
			final Set set;
			if (value instanceof Set) {
				set = (Set) value;
			} else {
				throw new IllegalArgumentException("ASN1SetOf does not allow any objects if it not implement java.util.Set.");
			}

			//read all data
			if (length == ASN1Length.FORM_INDEFINITE) {
				throw new ASN1ProtocolException("SetOf doesn't support indefinite form");
			}
			final ByteArrayOutputStream bos = new ByteArrayOutputStream(length);
			Utils.transfer(is, bos, length);
			final byte[] data = bos.toByteArray();
			final ByteArrayInputStream bis = new ByteArrayInputStream(data);
			while (bis.available() > 0) {
				set.add(componentType[0].read(bis));
			}
			return set;
		} else {
			throw new UnsupportedOperationException("Not implemented!");
//			if (value == null) {
//				throw new NullPointerException();
//			}
//			//read first header, so we won't sent null
//			ASN1Tag itemTag = null;
//			int readObjects = 0;
//			final HashMap<ASN1Type, Boolean> readFlag = new HashMap<ASN1Type, Boolean>();
//
//
//
//			//TODO: poor coding, missing default values and not checking duplicate reads.
//			for (int i = 0; i < componentType.length; i++) {
//				if (itemTag == null) {
//					itemTag = ASN1Tag.readTag(is);
//				}
//				try {
//					getByTag(itemTag).read(value, is, itemTag, true);
//				} catch (ASN1OptionalComponentSkippedException e) {
//					//type reader told that we can not read such component but it is optional, so simply skip it
//					continue;
//				}
//				itemTag = null;
//			}
//
//			//check for indefinite form.
//			if (length == ASN1Length.FORM_INDEFINITE) {
//				final byte[] eocTest = new byte[]{0x7F, 0x7F};
//				is.read(eocTest);
//
//				if (eocTest[0] != eocTest[1] || eocTest[0] != 0x00) {
//					throw new ASN1ProtocolException("Indefinite encoding without EOC marker at end");
//				}
//			}
//			return value;
		}
	}

	private ASN1Type getByTag(final ASN1Tag itemTag) {
		for (ASN1Type t : componentType) {
			if (t.getTag().equals(itemTag)) {
				return t;
			}
		}
		return null;
	}


	@Override
	public void toASN1(final StringBuilder sb) {
		sb.append("SET ");
		if (of) {
			sb.append("OF ");
			sb.append(componentType[0].getTypeId());
			sb.append(";");
		} else {
			sb.append("{\n");
			for (int i = 0; i < componentType.length; i++) {
				sb.append("      ");
				componentType[i].toASN1(sb);
				if (i + 1 < componentType.length) {
					sb.append(",");
				}
				sb.append("\n");
			}
			sb.append("}");
		}

	}
}
