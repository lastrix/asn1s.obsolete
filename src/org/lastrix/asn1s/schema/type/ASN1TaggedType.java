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
import org.lastrix.asn1s.exception.ASN1IncorrectHeaderException;
import org.lastrix.asn1s.protocol.Header;
import org.lastrix.asn1s.protocol.Tag;
import org.lastrix.asn1s.schema.ASN1Module;
import org.lastrix.asn1s.schema.compiler.generated.ASN1TreeWalker;
import org.lastrix.asn1s.schema.constraint.Constraint;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TaggedType extends ASN1Type {
	private final static Logger logger = Logger.getLogger(ASN1TaggedType.class);


	private final ASN1TreeWalker.TaggingMethod taggingMethod;
	private final ASN1TreeWalker.TagClass      tagClass;
	private final int                          tagNumber;
	private       ASN1Type                     subType;

	/**
	 * It should be set later, so we would know for certain how to handle tagging
	 */
	private ASN1TreeWalker.TaggingMethod _methodToUse = null;


	public ASN1TaggedType(
	                     final ASN1Type subType,
	                     final int tagNumber,
	                     final ASN1TreeWalker.TagClass tagClass,
	                     final ASN1TreeWalker.TaggingMethod taggingMethod,
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
			this.taggingMethod = ASN1TreeWalker.TaggingMethod.AUTOMATIC;
		} else {
			this.taggingMethod = taggingMethod;
		}
	}

	static byte getTagClass(final ASN1TreeWalker.TagClass tagClass) {
		if (tagClass == null) {
			return Tag.CLASS_CONTEXT_SPECIFIC;
		}
		switch (tagClass) {
			case UNIVERSAL:
				return Tag.CLASS_UNIVERSAL;

			case APPLICATION:
				return Tag.CLASS_APPLICATION;

			case PRIVATE:
				return Tag.CLASS_PRIVATE;
		}
		return 0;
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

		if (header) {
			os.write(
			        new Header(
			                  tagNumber,
			                  getTagClass(tagClass),
			                  isConstructed() || _methodToUse == ASN1TreeWalker.TaggingMethod.EXPLICIT,
			                  Tag.FORM_INDEFINITE
			        ).tagToByteArray()
			        );
		}
		final ByteArrayOutputStream bos = new ByteArrayOutputStream(128);
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
			Header.writeLength(os, data.length);
		}

		os.write(data);
	}

	/**
	 * Read object of type from input stream
	 *
	 * @param o                   - the object which should be used for modifying
	 * @param is                  - the input stream
	 * @param header              - the header, non null values prevents method to read header from stream
	 * @param forceHeaderChecking - force type reader to check header
	 *
	 * @return an Object or null
	 *
	 * @throws IOException   thrown from I/O
	 * @throws ASN1Exception if selected type reader can not acquire data
	 */
	@Override
	public Object read(final Object o, final InputStream is, Header header, final boolean forceHeaderChecking) throws
	                                                                                                           IOException,
	                                                                                                           ASN1Exception {
		if (header == null) {
			header = Header.readHeader(is, tagNumber, isConstructed(), getTagClass(tagClass));
		} else if (forceHeaderChecking) {
			if (header.getTag() != tagNumber || header.getTagClass() != getTagClass(tagClass) || header.isConstructed() != isConstructed()) {
				throw new ASN1IncorrectHeaderException();
			}
		}
		switch (_methodToUse) {
			case IMPLICIT:
				return subType.read(o, is, header, false);

			case EXPLICIT:
				return subType.read(o, is, null, false);
		}
		return null;
	}

	@Override
	public boolean isConstructed() {
		//TODO: fix this, cos there could be constructed types even if subType is not
		return subType.isConstructed() || _methodToUse == ASN1TreeWalker.TaggingMethod.EXPLICIT;
	}

	@Override
	public void setModule(final ASN1Module module) {
		super.setModule(module);
		if (subType.getModule() == null) {
			subType.setModule(module);
		}
	}

	/**
	 * Validate this object
	 *
	 * @param module
	 */
	@Override
	public void validate(final ASN1Module module) {
		if (subType instanceof ASN1UnresolvedType) {
			subType = module.getType(subType.getName(), ((ASN1UnresolvedType) subType).getModuleName());
		} else {
			subType.validate(module);
		}

		if (_methodToUse == null) {
			switch (taggingMethod) {
				case AUTOMATIC:
					switch (module.getDefaultTaggingMethod()) {
						case AUTOMATIC:
						case IMPLICIT:
							_methodToUse = ASN1TreeWalker.TaggingMethod.IMPLICIT;
							break;

						case EXPLICIT:
							_methodToUse = ASN1TreeWalker.TaggingMethod.EXPLICIT;
							break;
					}
					break;

				case IMPLICIT:
					_methodToUse = ASN1TreeWalker.TaggingMethod.IMPLICIT;
					break;

				case EXPLICIT:
					_methodToUse = ASN1TreeWalker.TaggingMethod.EXPLICIT;
					break;
			}
		}
		this.headerBytes = new Header(
		                             tagNumber,
		                             getTagClass(tagClass),
		                             isConstructed() || _methodToUse == ASN1TreeWalker.TaggingMethod.EXPLICIT,
		                             Tag.FORM_INDEFINITE
		).tagToByteArray();

	}
}
