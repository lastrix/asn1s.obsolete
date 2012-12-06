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

package org.lastrix.asn1s.schema.type;

import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.schema.*;
import org.lastrix.asn1s.schema.constraint.Constraint;

import java.io.*;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TaggedType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1TaggedType.class);


	private final TaggingMethod taggingMethod;
	private final TagClass      tagClass;
	private final int           tagNumber;
	private       ASN1Type      subType;

	/**
	 * It should be set later, so we would know for certain how to handle tagging
	 */
	private TaggingMethod _methodToUse = null;


	public ASN1TaggedType(
	                     final ASN1Type subType,
	                     final int tagNumber,
	                     final TagClass tagClass,
	                     final TaggingMethod taggingMethod,
	                     final Constraint constraint
	                     ) {
		if (subType == null || tagNumber < 0) {
			throw new NullPointerException();
		}
		this.subType = subType;
		this.tagNumber = tagNumber;
		this.tagClass = tagClass;
		this.name = subType.getName();
		if (taggingMethod == null) {
			this.taggingMethod = TaggingMethod.AUTOMATIC;
		} else {
			this.taggingMethod = taggingMethod;
		}
		this.typeId = getName();
		invalid();
	}


	@Override
	public String toString() {
		return "ASN1TaggedType{ [" + ((tagClass != null) ? tagClass : "") +
		       " " + tagNumber +
		       "] " + subType +
		       " " + taggingMethod + " }";
	}

	/**
	 * Encode <code>o</code> to ASN.1 notation and write it to <code>os</code>
	 *
	 * @param o      - the object to be written
	 * @param os     - the output stream
	 * @param header - true if header should be written
	 *
	 * @return number of bytes written
	 *
	 * @throws IOException
	 */
	@Override
	public void write(final Object o, final OutputStream os, final boolean header) throws IOException, ASN1Exception {
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();
		switch (_methodToUse) {
			case IMPLICIT:
				subType.write(o, bos, false);
				break;

			case EXPLICIT:
				subType.write(o, bos, true);
				break;
		}
		final byte[] data = bos.toByteArray();
		if (header) {
			os.write(getTag().asBytes());
			os.write(ASN1Length.asBytes(data.length));
		}

		os.write(data);
	}

	@Override
	public Object read(final Object value, final InputStream is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (tag == null) {
			tag = ASN1Tag.readTag(is);
			tagCheck = true;
		}
		// if we should check TAG, then check it!
		if (tagCheck) {
			if (!this.tag.equals(tag)) {
				throw new ASN1IncorrectTagException();
			}
		}

		switch (_methodToUse) {
			case IMPLICIT:
				return subType.read(value, is, tag, false);

			case EXPLICIT:
				//remove length field
				ASN1Length.readLength(is);
				return subType.read(value, is, null, false);
		}
		throw new ASN1Exception("Unknown error.");
	}

	@Override
	public void onInstall(final ASN1Module module) throws IllegalStateException, ASN1Exception {
		if (getModule() != null) {
			throw new IllegalStateException();
		}

		setModule(module);

		if (subType instanceof ASN1UnresolvedType) {
			final ASN1Type t = module.resolveType((ASN1UnresolvedType) subType);
			if (t == null) {
				new InstallPropertyChangeListener(this, (ASN1UnresolvedType) subType, module);
			} else {
				this.subType = t;
				doInstall(module);
			}
		} else {
			//now we should add self to index base
			doInstall(module);
		}
	}

	@Override
	public void typeResolved(final ASN1UnresolvedType unresolved, final ASN1Type resolved) {
		if (subType == unresolved) {
			subType = resolved;
			try {
				doInstall(module);
			} catch (ASN1Exception e) {
				logger.warn("doInstall failed:", e);
			}
		}
	}

	private void doInstall(ASN1Module module) throws ASN1Exception {
		switch (taggingMethod) {
			case AUTOMATIC:
				switch (module.getDefaultTaggingMethod()) {
					case AUTOMATIC:
					case IMPLICIT:
						_methodToUse = TaggingMethod.IMPLICIT;
						break;

					case EXPLICIT:
						_methodToUse = TaggingMethod.EXPLICIT;
						break;
				}
				break;

			case IMPLICIT:
				_methodToUse = TaggingMethod.IMPLICIT;
				break;

			case EXPLICIT:
				_methodToUse = TaggingMethod.EXPLICIT;
				break;
		}
		// set up tag
		if (!(subType instanceof ASN1UserType) && (subType.getModule() == null)) {
			subType.onInstall(module);
		}
		tag = new ASN1Tag(tagNumber, tagClass, subType.isConstructed() || _methodToUse == TaggingMethod.EXPLICIT);
		typeId = makeTypeId(getName(), getModuleName());
		valid();
	}

	@Override
	public void toASN1(final PrintWriter printWriter, final boolean typeAssignment) {
		getTag().toASN1(printWriter, false);
		if (!taggingMethod.equals(TaggingMethod.AUTOMATIC)) {
			printWriter.append(taggingMethod.toString());
			printWriter.append(" ");
		}
		subType.toASN1(printWriter, false);
	}

}
