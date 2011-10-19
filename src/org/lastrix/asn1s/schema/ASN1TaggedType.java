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

import org.lastrix.asn1s.exception.ASN1ConstraintUsageException;
import org.lastrix.asn1s.schema.compiler.ASN1TreeWalker;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TaggedType extends ASN1Type {

	private final ASN1TreeWalker.TaggingMethod taggingMethod;
	private final ASN1TreeWalker.TagClass      tagClass;
	private final int                          tagNumber;
	private final ASN1Type                     subType;
	private       Constraint                   constraint;

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
		if (tagClass == null) {
			this.tagClass = ASN1TreeWalker.TagClass.UNIVERSAL;
		} else {
			this.tagClass = tagClass;
		}
		if (taggingMethod == null) {
			this.taggingMethod = ASN1TreeWalker.TaggingMethod.AUTOMATIC;
		} else {
			this.taggingMethod = taggingMethod;
		}
		this.constraint = constraint;
	}

	/**
	 * Setup constraint for this type
	 *
	 * @param constraint - the constraint to use
	 *
	 * @throws ASN1ConstraintUsageException - if constraint can not be applied
	 */
	@Override
	public void setConstraint(final Constraint constraint) throws ASN1ConstraintUsageException {
		this.constraint = constraint;
	}


	@Override
	public String toString() {
		return "ASN1TaggedType{ [" + ((tagClass != null) ? tagClass : "") +
		       " " + tagNumber +
		       "] " + subType +
		       " " + taggingMethod +
		       ((constraint != null) ? " ( " + constraint + " )" : "") + " }";
	}
}
