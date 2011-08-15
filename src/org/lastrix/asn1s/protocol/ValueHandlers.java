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

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lastrix
 * Date: 8/14/11
 * Time: 7:23 PM
 */
public class ValueHandlers {
	public static Map<Tag.TagClass, Map<Long, ValueHandler>> primitiveValues   = null;
	public static Map<Tag.TagClass, Map<Long, ValueHandler>> constructedValues = null;
	public static Map<Class, ValueHandler>                   typeHandlers      = null;
	public static ValueHandler nullHandler;

	public final static void init() {
		primitiveValues = new HashMap<Tag.TagClass, Map<Long, ValueHandler>>();
		constructedValues = new HashMap<Tag.TagClass, Map<Long, ValueHandler>>();
		typeHandlers = new HashMap<Class, ValueHandler>();
		addPrimitiveHandler(new ASN1Boolean(), Boolean.class);
		addPrimitiveHandler(new ASN1Integer(), Integer.class);
		addPrimitiveHandler(new ASN1BitString(), String.class);

		nullHandler = new ASN1Null();
		addPrimitiveHandler(nullHandler);

		addPrimitiveHandler(new ASN1Real(), Double.class, Float.class);
		addPrimitiveHandler(new ASN1Enumerated(), Enum.class);
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
	public static ValueHandler getByHeader(Header header) throws ASN1Exception {
		if (header.isEOC()) {
			throw new ASN1Exception("An EOC marker");
		}
		if (header.getPc() == Tag.PC.PRIMITIVE) {
			return getFromMap(header, primitiveValues);
		} else {
			return getFromMap(header, constructedValues);
		}
	}

	public static ValueHandler getTypeHandler(Class clazz) {
		if (clazz == null) {
			return nullHandler;
		}
		return typeHandlers.get(clazz);
	}

	/**
	 * Helper function for value handler fetching
	 *
	 * @param header - the header
	 * @param map    - the map
	 *
	 * @return the ValueHandler
	 */
	private static ValueHandler getFromMap(Header header, Map<Tag.TagClass, Map<Long, ValueHandler>> map) {
		Map<Long, ValueHandler> smap = map.get(header.getTagClass());
		if (smap != null) {
			return smap.get(header.getTag());
		}
		return null;
	}

	/**
	 * Add handler to primitive handlers
	 *
	 * @param handler - the handler
	 * @param clazzs
	 */
	private static void addPrimitiveHandler(ValueHandler handler, final Class... clazzs) {
		addHandlerToMap(handler, primitiveValues, clazzs);
	}

	/**
	 * Add handler to constructed handlers
	 *
	 * @param handler - the handler
	 */
	private static void addConstructedHandler(ValueHandler handler, final Class... clazzs) {
		addHandlerToMap(handler, constructedValues, clazzs);
	}

	/**
	 * Add handler to specified map
	 *
	 * @param handler - the handler
	 * @param map     - the map
	 * @param clazzs
	 */
	private static void addHandlerToMap(ValueHandler handler, Map<Tag.TagClass, Map<Long, ValueHandler>> map, final Class[] clazzs) {
		Map<Long, ValueHandler> smap = map.get(handler.getTagClass());
		if (smap == null) {
			smap = new HashMap<Long, ValueHandler>();
			map.put(handler.getTagClass(), smap);
		}
		smap.put(handler.getTag(), handler);

		//put type handlers
		if (clazzs != null && clazzs.length > 0) {
			for (Class clazz : clazzs) {
				typeHandlers.put(clazz, handler);
			}
		}
	}
}
