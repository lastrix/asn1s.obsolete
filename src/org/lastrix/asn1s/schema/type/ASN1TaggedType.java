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
import org.lastrix.asn1s.ASN1InputStream;
import org.lastrix.asn1s.exception.ASN1Exception;
import org.lastrix.asn1s.exception.ASN1IncorrectTagException;
import org.lastrix.asn1s.schema.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TaggedType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1TaggedType.class);
	private final TagClass      tagClass;
	private final TaggingMethod taggingMethod;
	private final int           tagNumber;
	private       ASN1Type      subType;
	private TaggingMethod _methodToUse = null;

	public ASN1TaggedType(
	                     final ASN1Type subType,
	                     final int tagNumber,
	                     final TagClass tagClass,
	                     final TaggingMethod taggingMethod
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
	public Object read(Object value, final ASN1InputStream asn1is, ASN1Tag tag, boolean tagCheck) throws IOException, ASN1Exception {
		if (tag == null) {
			tag = ASN1Tag.readTag(asn1is);
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
				return subType.read(value, asn1is, tag, false);

			case EXPLICIT:
				//remove length field
				int length = ASN1Length.readLength(asn1is);
				value = subType.read(value, asn1is, null, true);
				if (length == -1) {
					asn1is.read();
					asn1is.read();
				}
				return value;
		}
		throw new ASN1Exception("Unknown error.");
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

	@Override
	public String toString() {
		return "ASN1TaggedType{ [" + ((tagClass != null) ? tagClass : "") +
		       " " + tagNumber +
		       "] " + subType +
		       " " + taggingMethod + " }";
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

	@Override
	public void moduleDeployed() throws ASN1Exception {
		subType.moduleDeployed();
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
		if (header) {
			os.write(getTag().asBytes());
			os.write(ASN1Length.asBytes(ASN1Length.FORM_INDEFINITE));
		}
		switch (_methodToUse) {
			case IMPLICIT:
				subType.write(o, os, false);
				break;

			case EXPLICIT:
				subType.write(o, os, true);
				break;
		}
		if (header) {
			os.write(0x00);
			os.write(0x00);
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
}