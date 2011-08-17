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

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Holds all basic ASN.1 type encoders and decoders.
 *
 * @author lastrix
 * @version 1.0
 * @see ASN1InputStream
 * @see ASN1OutputStream
 */
@SuppressWarnings({"StaticMethodOnlyUsedInOneClass", "ClassWithoutConstructor"})
public class ASN1Types {
	@SuppressWarnings({"UnusedDeclaration"})
	private final static Logger logger = Logger.getLogger(ASN1Types.class);

	private static Map<Byte, Map<Long, PrimitiveDecoder>>   primitiveDecoders   = null;
	private static Map<Class, PrimitiveEncoder>             primitiveEncoders   = null;
	private static Map<Byte, Map<Long, ConstructedDecoder>> constructedDecoders = null;
	private static Map<Class, ConstructedEncoder>           constructedEncoders = null;
	private static PrimitiveEncoder                         nullEncoder         = null;

	public static void init() {

		nullEncoder = new ASN1Null();

		primitiveDecoders = new HashMap<Byte, Map<Long, PrimitiveDecoder>>();
		primitiveEncoders = new HashMap<Class, PrimitiveEncoder>();
		constructedDecoders = new HashMap<Byte, Map<Long, ConstructedDecoder>>();
		constructedEncoders = new HashMap<Class, ConstructedEncoder>();

		addPrimitive(Tag.CLASS_UNIVERSAL, ASN1Boolean.TAG, new ASN1Boolean(), Boolean.class);
		addPrimitive(Tag.CLASS_UNIVERSAL, ASN1Real.TAG, new ASN1Real(), Double.class, Float.class);
		addPrimitive(Tag.CLASS_UNIVERSAL, ASN1Integer.TAG, new ASN1Integer(), Integer.class, Byte.class, Short.class, Long.class);
		addPrimitive(Tag.CLASS_UNIVERSAL, ASN1Null.TAG, new ASN1Null());
		addPrimitive(Tag.CLASS_UNIVERSAL, ASN1BitString.TAG, new ASN1BitString(), BitSet.class);
		byte[] arr = new byte[1];
		addPrimitive((byte) 0x00, ASN1OctString.TAG, new ASN1OctString(), arr.getClass());
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
	 */
	public static PrimitiveDecoder getPrimitiveDecoder(Header header) {
		Map<Long, PrimitiveDecoder> map = primitiveDecoders.get(header.getTagClass());
		if (map != null) {
			return map.get(header.getTag());
		}
		return null;
	}

	/**
	 * Return constructed decoder that should handle specified {@code header}
	 *
	 * @param header - the header
	 *
	 * @return an ConstructedDecoder
	 */
	public static ConstructedDecoder getConstructedDecoder(Header header) {
		Map<Long, ConstructedDecoder> map = constructedDecoders.get(header.getTagClass());
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
