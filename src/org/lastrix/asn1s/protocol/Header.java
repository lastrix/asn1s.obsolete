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
 * Class for holding information about header (BER).
 *
 * @author: lastrix
 * Date: 8/14/11
 * Time: 12:29 PM
 */
public class Header implements Length, Tag {
	private final TagClass   tagClass;
	private final PC         pc;
	private final long       tag;
	private final long       length;
	private final LengthForm form;

	public Header(final int tagClass, final boolean pc, final long tag, final LengthForm form, final long length) {
		if (tagClass == CLASS_APPLICATION) {
			this.tagClass = TagClass.APPLICATION;
		} else if (tagClass == CLASS_CONTEXT_SPECIFIC) {
			this.tagClass = TagClass.CONTEXT_SPECIFIC;
		} else if (tagClass == CLASS_PRIVATE) {
			this.tagClass = TagClass.PRIVATE;
		} else if (tagClass == CLASS_UNIVERSAL) {
			this.tagClass = TagClass.UNIVERSAL;
		} else {
			this.tagClass = null;
			throw new IllegalArgumentException(String.format("An unknown tagClass found '%d'.", tagClass));
		}
		if (pc) {
			this.pc = PC.CONSTRUCTED;
		} else {
			this.pc = PC.PRIMITIVE;
		}
		this.tag = tag;
		this.form = form;
		this.length = length;
	}


	public long getLength() {
		return length;
	}

	public long getTag() {
		return tag;
	}

	public TagClass getTagClass() {
		return tagClass;
	}

	public PC getPc() {
		return pc;
	}

	public LengthForm getForm() {
		return form;
	}

	public boolean isEOC() {
		//end of contents is special 00 00 mark which could be counted as an UNIVERSAL PRIMITIVE object with zero tag and zero length
		return length == 0 && form == LengthForm.DEFINITE && tagClass == TagClass.UNIVERSAL && pc == PC.PRIMITIVE && tag == 0;
	}

	@Override
	public String toString() {
		return "Header{" +
		       "tagClass=" + tagClass +
		       ", pc=" + pc +
		       ", tag=" + tag +
		       ", length=" + length +
		       ", form=" + form +
		       '}';
	}
}
