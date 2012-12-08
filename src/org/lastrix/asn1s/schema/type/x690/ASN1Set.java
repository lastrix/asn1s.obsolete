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
import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.exception.ASN1ProtocolException;
import org.lastrix.asn1s.schema.ASN1Length;
import org.lastrix.asn1s.schema.ASN1Tag;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.type.ASN1ComponentType;
import org.lastrix.asn1s.schema.type.ASN1Type;
import org.lastrix.asn1s.util.Utils;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for handling set tag.
 * Problem is free order of component appearance.
 *
 * @author lastrix
 * @version 1.0
 */
public class ASN1Set extends ASN1Container {
	private final Logger logger = Logger.getLogger(ASN1Set.class);

	public final static ASN1Tag                    TAG      = new ASN1Tag(17, TagClass.UNIVERSAL, true);
	public final        HashMap<ASN1Tag, ASN1Type> tag2type = new HashMap<ASN1Tag, ASN1Type>();


	public ASN1Set(final ASN1ComponentType[] componentType, final boolean of) {
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
	public void write(Object value, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		if (header) {
			//write header
			os.write(TAG.asBytes());
		}

		ByteArrayOutputStream bos = new ByteArrayOutputStream(128);
		if (of) {
			// SET OF
			final Set set = (Set) value;
			for (Object lo : set) {
				componentType[0].write(lo, bos, true);
			}
		} else {
			// SET
			//actually we should think that this thing is object.
			//TODO: hashmap?
			for (ASN1Type t : componentType) {
				t.write(value, bos, true);
			}
		}
		final byte[] data = bos.toByteArray();

		//store size
		if (header) {
			//i don't like those 00 00 bytes at end
			os.write(ASN1Length.asBytes(data.length));
		}

		//and now we can save our data.
		os.write(data);
	}

	@Override
	public Object read(Object value, final ASN1InputStream asn1is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (value == null) {
			value = new HashSet();
		}
		// TAG should be null in anyway
		if (tag == null) {
			tag = ASN1Tag.readTag(asn1is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!TAG.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		final int length = ASN1Length.readLength(asn1is);
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
			Utils.transfer(asn1is, bos, length);
			final byte[] data = bos.toByteArray();
			final ByteArrayInputStream bis = new ByteArrayInputStream(data);
			while (bis.available() > 0) {
//				set.add(componentType[0].read(bis));
			}
			return set;
		} else {
//			throw new UnsupportedOperationException("Not implemented!");
			if (value == null) {
				throw new NullPointerException();
			}

			//read first header, so we won't sent null
			ASN1Tag itemTag = null;
			int readObjects = 0;
			final HashMap<ASN1Type, Boolean> readFlag = new HashMap<ASN1Type, Boolean>();
			final InputStream _is;
			if (length == ASN1Length.FORM_INDEFINITE) {
				_is = asn1is;
			} else {
				final ByteArrayOutputStream bos = new ByteArrayOutputStream(length);
				Utils.transfer(asn1is, bos, length);
				final byte[] data = bos.toByteArray();
				_is = new ByteArrayInputStream(data);
			}

//			for (int i = 0; i < componentType.length; i++) {
//				if (itemTag == null) {
//					itemTag = ASN1Tag.readTag(_is);
//				}
//				if (length == ASN1Length.FORM_INDEFINITE && itemTag.isEOC()) {
//					break;
//				}
//				final ASN1ComponentType type = getByTag(itemTag);
//				if (readFlag.get(type)) {
//					throw new ASN1ProtocolException("Unable to read data.");
//				}
//				type.read(value, _is, itemTag, true);
//				readFlag.put(type, Boolean.TRUE);
//				if (length != ASN1Length.FORM_INDEFINITE && _is.available() == 0) {
//					break;
//				}
//			}
//
//			for (int i = 0; i < componentType.length; i++) {
//				//TODO: default value handling.
//				if (!readFlag.get(componentType[i]) && !((ASN1ComponentType) componentType[i]).isOptional()) {
//					throw new ASN1ProtocolException("Unmet non-optional non-default set member.");
//				}
//			}
			return value;
		}
	}

	private ASN1ComponentType getByTag(final ASN1Tag itemTag) {
		for (ASN1Type t : componentType) {
			if (t.getTag().equals(itemTag)) {
				return (ASN1ComponentType) t;
			}
		}
		return null;
	}


	@Override
	public void toASN1(final PrintWriter printWriter, final boolean typeAssignment) {
		printWriter.append("SET ");
		if (of) {
			printWriter.append("OF ");
			printWriter.append(componentType[0].getTypeId());
			printWriter.append(";");
		} else {
			printWriter.append("{\n");
			for (int i = 0; i < componentType.length; i++) {
				printWriter.append("      ");
				componentType[i].toASN1(printWriter, false);
				if (i + 1 < componentType.length) {
					printWriter.append(",");
				}
				printWriter.append("\n");
			}
			printWriter.append("}");
		}
	}
}
