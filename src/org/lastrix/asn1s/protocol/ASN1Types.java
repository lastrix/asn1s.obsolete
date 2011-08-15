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

import org.lastrix.asn1s.exception.ASN1Exception;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 7:23 PM
 */
public class ASN1Types {
	public static Map<Byte, Map<Long, PrimitiveDecoder>> primitiveDecoders   = null;
	public static Map<Class, PrimitiveEncoder>           primitiveEncoders   = null;
	public static Map<Class, ConstructedEncoder>         constructedEncoders = null;
	public static PrimitiveEncoder nullEncoder;

	public final static void init() {

		nullEncoder = new ASN1Null();

		primitiveDecoders = new HashMap<Byte, Map<Long, PrimitiveDecoder>>();
		primitiveEncoders = new HashMap<Class, PrimitiveEncoder>();
		constructedEncoders = new HashMap<Class, ConstructedEncoder>();

		addPrimitive((byte) Tag.CLASS_UNIVERSAL, ASN1Boolean.TAG_BOOLEAN, new ASN1Boolean(), Boolean.class);
		addPrimitive((byte) Tag.CLASS_UNIVERSAL, ASN1Real.TAG_REAL, new ASN1Real(), Double.class, Float.class);
		addPrimitive((byte) Tag.CLASS_UNIVERSAL, ASN1Integer.TAG_INTEGER, new ASN1Integer(), Integer.class, Byte.class, Short.class, Long.class);
		addPrimitive((byte) Tag.CLASS_UNIVERSAL, ASN1Null.TAG_NULL, new ASN1Null());
		addPrimitive((byte) Tag.CLASS_UNIVERSAL, ASN1BitString.TAG_BITSTRING, new ASN1BitString(), BitSet.class);
		byte[] arr = new byte[0];
		addPrimitive((byte) Tag.CLASS_UNIVERSAL, ASN1OctString.TAG_OCTET_STRING, new ASN1OctString(), arr.getClass());
	}

	private static void addPrimitive(final byte clazz, final long tag, final Object object, Class... classes) {
		if (object instanceof PrimitiveDecoder) {
			addPrimitiveDecoder(clazz, tag, (PrimitiveDecoder) object);
		}
		if (object instanceof PrimitiveEncoder) {
			addPrimitiveEncoder((PrimitiveEncoder) object, classes);
		}
	}

	private static void addPrimitiveEncoder(final PrimitiveEncoder encoder, Class... classes) {
		if (encoder == null) {
			throw new NullPointerException();
		}
		for (Class clazz : classes) {
			primitiveEncoders.put(clazz, encoder);
		}
	}

	private static void addPrimitiveDecoder(final byte clazz, final long tag, final PrimitiveDecoder decoder) {
		Map<Long, PrimitiveDecoder> map = primitiveDecoders.get(clazz);

		if (map == null) {
			map = new HashMap<Long, PrimitiveDecoder>();
			primitiveDecoders.put(clazz, map);
		}
		map.put(tag, decoder);
	}

	/**
	 * Get handler for specified Header
	 *
	 * @param header - the header
	 *
	 * @return an ValueHandler handler
	 *
	 * @throws ASN1Exception
	 */
	public static PrimitiveDecoder getPrimitiveDecoder(Header header) throws ASN1Exception {
		if (header.isEOC()) {
			throw new ASN1Exception("An EOC marker");
		}
		Map<Long, PrimitiveDecoder> map = primitiveDecoders.get(header.getTagClass());
		if (map != null) {
			return map.get(header.getTag());
		}
		return null;
	}

	public static PrimitiveEncoder getPrimitiveTypeEncoder(Object o) {
		if (o == null) {
			return nullEncoder;
		}
		return primitiveEncoders.get(o.getClass());
	}

	public static ConstructedEncoder getConstructedTypeEncoder(Object o) {
		return constructedEncoders.get(o.getClass());
	}
}
