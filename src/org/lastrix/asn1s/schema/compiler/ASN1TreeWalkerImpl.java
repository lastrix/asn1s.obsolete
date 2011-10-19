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

package org.lastrix.asn1s.schema.compiler;

import org.antlr.runtime.tree.TreeNodeStream;
import org.apache.log4j.Logger;
import org.lastrix.asn1s.exception.ASN1ConstraintUsageException;
import org.lastrix.asn1s.schema.*;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TreeWalkerImpl extends ASN1TreeWalker {
	private final static Logger logger = Logger.getLogger(ASN1TreeWalkerImpl.class);

	private enum BlockTag {
		MODULE,
		VECTOR,
		TYPE_DEFINITION,
		CONSTRAINT,
		TYPE,
		TAGGED_TYPE,
		UNION,
		MODULE_ID
	}

	private final LinkedList<Object> stack = new LinkedList<Object>();

	public ASN1TreeWalkerImpl(TreeNodeStream input) {
		super(input);
	}

	protected final LinkedList<Object> transferTill(final Object o) {
		final LinkedList<Object> cStack = new LinkedList<Object>();
		Object tmp = stack.poll();
		while (tmp != o) {
			cStack.push(tmp);
			tmp = stack.poll();
			if (tmp == null && stack.size() == 0) {
				throw new IllegalStateException("Stack depleted.");
			}
		}
		return cStack;
	}


	@Override
	protected void openModule() {
//		super.openModule();
		stack.push(BlockTag.MODULE);
	}

	@Override
	protected void closeModule() {
		super.closeModule();
		final LinkedList<Object> moduleStack = transferTill(BlockTag.MODULE);
		final Module module = new Module();
		final String moduleId = (String) moduleStack.poll();
		if (moduleId == null) {
			throw new NullPointerException();
		}
		module.setModuleId(moduleId);
		logger.info("Values left: " + moduleStack);
		stack.push(module);
	}

	@Override
	protected void openModuleId(final String id) {
//		super.openModuleId(id);
		stack.push(BlockTag.MODULE_ID);
		stack.push(id);
	}

	@Override
	protected void closeModuleId() {
//		super.closeModuleId();
		final LinkedList<Object> moduleIdStack = transferTill(BlockTag.MODULE_ID);
		final String id = (String) moduleIdStack.poll();
		if (id == null) {
			throw new NullPointerException();
		}
		//TODO: add name validation

		//return it back (cos we can not make OID now)
		stack.push(id);
	}

	@Override
	protected void openVector() {
		super.openVector();
		stack.push(BlockTag.VECTOR);
	}

	@Override
	protected void closeVector() {
		super.closeVector();
		final LinkedList<Object> vectorStack = transferTill(BlockTag.VECTOR);
		final Vector<Object> vector = new Vector<Object>(vectorStack);
		stack.push(vector);
		logger.warn("Created vector: " + vector);
	}

	@Override
	protected void openExports(final boolean all) {
		// TODO: unimplemented method stub
		super.openExports(all);
	}

	@Override
	protected void closeExports() {
		// TODO: unimplemented method stub
		super.closeExports();
	}

	@Override
	protected void openImports() {
		// TODO: unimplemented method stub
		super.openImports();
	}

	@Override
	protected void closeImports() {
		// TODO: unimplemented method stub
		super.closeImports();
	}

	@Override
	protected void openSymbolsFromModule() {
		// TODO: unimplemented method stub
		super.openSymbolsFromModule();
	}

	@Override
	protected void closeSymbolsFromModule() {
		// TODO: unimplemented method stub
		super.closeSymbolsFromModule();
	}

	@Override
	protected void openValueAssignment(final String valueName) {
		// TODO: unimplemented method stub
		super.openValueAssignment(valueName);
	}

	@Override
	protected void closeValueAssignment() {
		// TODO: unimplemented method stub
		super.closeValueAssignment();
	}

	@Override
	protected void openTypeAssignment(final String name) {
//		super.openTypeAssignment(name);
		stack.push(BlockTag.TYPE_DEFINITION);
		stack.push(name);
	}

	@Override
	protected void closeTypeAssignment() {
//		super.closeTypeAssignment();
		final LinkedList<Object> typeDefStack = transferTill(BlockTag.TYPE_DEFINITION);

		final String typeName = (String) typeDefStack.poll();
		final ASN1Type type = (ASN1Type) typeDefStack.poll();

		stack.push(new ASN1UserType(typeName, type, (Constraint) typeDefStack.poll()));
	}

	@Override
	protected void openType() {
//		super.openType();
		stack.push(BlockTag.TYPE);
	}

	@Override
	protected void closeType() {
//		super.closeType();
		final LinkedList<Object> typeStack = transferTill(BlockTag.TYPE);
		final Object type = typeStack.poll();
		final ASN1Type asn1type = ASN1Type.createTypeFor(type);

		stack.push(asn1type);
		if (typeStack.size() == 1) {
			try {
				asn1type.setConstraint((Constraint) typeStack.poll());
			} catch (ASN1ConstraintUsageException e) {
				logger.warn("Exception:", e);
			}
		}
	}

	@Override
	protected void openValue() {
		// TODO: unimplemented method stub
		super.openValue();
	}

	@Override
	protected void closeValue() {
		// TODO: unimplemented method stub
		super.closeValue();
	}

	@Override
	protected void openTaggedType(final int tagNumber, final TagClass tc, final TaggingMethod tm) {
//		super.openTaggedType(tagNumber, tc, tm);
		stack.push(BlockTag.TAGGED_TYPE);
		stack.push(tagNumber);
		stack.push(tc);
		stack.push(tm);
	}

	@Override
	protected void closeTaggedType() {
//		super.closeTaggedType();
		final LinkedList<Object> taggedTypeStack = transferTill(BlockTag.TAGGED_TYPE);
		//there should be type and after that required values
		final Integer tagNumber = (Integer) taggedTypeStack.poll();
		final TagClass tagClass = (TagClass) taggedTypeStack.poll();
		final TaggingMethod taggingMethod = (TaggingMethod) taggedTypeStack.poll();
		final Object type = taggedTypeStack.poll();
		final ASN1Type asn1type = ASN1Type.createTypeFor(type);
		//and create new type
		stack.push(new ASN1TaggedType(asn1type, tagNumber, tagClass, taggingMethod, (Constraint) taggedTypeStack.poll()));
	}

	@Override
	protected void openSequenceOf() {
		// TODO: unimplemented method stub
		super.openSequenceOf();
	}

	@Override
	protected void closeSequenceOf() {
		// TODO: unimplemented method stub
		super.closeSequenceOf();
	}

	@Override
	protected void openSequence() {
		// TODO: unimplemented method stub
		super.openSequence();
	}

	@Override
	protected void closeSequence() {
		// TODO: unimplemented method stub
		super.closeSequence();
	}

	@Override
	protected void openSetOf() {
		// TODO: unimplemented method stub
		super.openSetOf();
	}

	@Override
	protected void closeSetOf() {
		// TODO: unimplemented method stub
		super.closeSetOf();
	}

	@Override
	protected void openSet() {
		// TODO: unimplemented method stub
		super.openSet();
	}

	@Override
	protected void closeSet() {
		// TODO: unimplemented method stub
		super.closeSet();
	}

	@Override
	protected void openChoice() {
		// TODO: unimplemented method stub
		super.openChoice();
	}

	@Override
	protected void closeChoice() {
		// TODO: unimplemented method stub
		super.closeChoice();
	}

	@Override
	protected void openExceptionSpec(final int num) {
		// TODO: unimplemented method stub
		super.openExceptionSpec(num);
	}

	@Override
	protected void openExceptionSpec() {
		// TODO: unimplemented method stub
		super.openExceptionSpec();
	}

	@Override
	protected void closeExceptionSpec() {
		// TODO: unimplemented method stub
		super.closeExceptionSpec();
	}

	@Override
	protected void openComponentType() {
		// TODO: unimplemented method stub
		super.openComponentType();
	}

	@Override
	protected void closeComponentType() {
		// TODO: unimplemented method stub
		super.closeComponentType();
	}

	@Override
	protected void openComponentTypeOption() {
		// TODO: unimplemented method stub
		super.openComponentTypeOption();
	}

	@Override
	protected void closeComponentTypeOption() {
		// TODO: unimplemented method stub
		super.closeComponentTypeOption();
	}

	@Override
	protected void openExtensionAdditionGroup(final int num) {
		// TODO: unimplemented method stub
		super.openExtensionAdditionGroup(num);
	}

	@Override
	protected void closeExtensionAdditionGroup() {
		// TODO: unimplemented method stub
		super.closeExtensionAdditionGroup();
	}

	@Override
	protected void openExtensionAdditionAlternativesGroup(final int num) {
		// TODO: unimplemented method stub
		super.openExtensionAdditionAlternativesGroup(num);
	}

	@Override
	protected void closeExtensionAdditionAlternativesGroup() {
		// TODO: unimplemented method stub
		super.closeExtensionAdditionAlternativesGroup();
	}

	@Override
	protected void openNamedType(final String name) {
		// TODO: unimplemented method stub
		super.openNamedType(name);
	}

	@Override
	protected void closeNamedType() {
		// TODO: unimplemented method stub
		super.closeNamedType();
	}

	@Override
	protected void openConstraint() {
		super.openConstraint();
		stack.push(BlockTag.CONSTRAINT);
	}

	@Override
	protected void closeConstraint() {
		super.closeConstraint();
		final LinkedList<Object> constraintStack = transferTill(BlockTag.CONSTRAINT);
		//TODO: add constraint generation
		stack.push(new Constraint());
	}

	@Override
	protected void openConstraintValueRange() {
		// TODO: unimplemented method stub
		super.openConstraintValueRange();
	}

	@Override
	protected void closeConstraintValueRange() {
		// TODO: unimplemented method stub
		super.closeConstraintValueRange();
	}

	@Override
	protected void openEndpoint(final boolean min, final boolean max) {
		// TODO: unimplemented method stub
		super.openEndpoint(min, max);
	}

	@Override
	protected void closeEndpoint() {
		// TODO: unimplemented method stub
		super.closeEndpoint();
	}

	@Override
	protected void openUnion(final boolean except) {
		super.openUnion(except);
		stack.push(BlockTag.UNION);
		stack.push(except);
	}

	@Override
	protected void closeUnion() {
		super.closeUnion();
		final LinkedList<Object> unionStack = transferTill(BlockTag.UNION);
		logger.info("Union created: " + unionStack);
	}

	@Override
	protected void openIntersectionElement() {
		// TODO: unimplemented method stub
		super.openIntersectionElement();
	}

	@Override
	protected void closeIntersectionElement() {
		// TODO: unimplemented method stub
		super.closeIntersectionElement();
	}

	@Override
	protected void openSizeConstraint() {
		// TODO: unimplemented method stub
		super.openSizeConstraint();
	}

	@Override
	protected void closeSizeConstraint() {
		// TODO: unimplemented method stub
		super.closeSizeConstraint();
	}

	@Override
	protected void openTypeConstraint(final boolean includes) {
		// TODO: unimplemented method stub
		super.openTypeConstraint(includes);
	}

	@Override
	protected void closeTypeConstraint() {
		// TODO: unimplemented method stub
		super.closeTypeConstraint();
	}

	@Override
	protected void openInnerTypeConstraint(final boolean dots) {
		// TODO: unimplemented method stub
		super.openInnerTypeConstraint(dots);
	}

	@Override
	protected void closeInnerTypeConstraint() {
		// TODO: unimplemented method stub
		super.closeInnerTypeConstraint();
	}

	@Override
	protected void openNamedConstraint(final String name, final Presence presence) {
		// TODO: unimplemented method stub
		super.openNamedConstraint(name, presence);
	}

	@Override
	protected void closeNamedConstraint() {
		// TODO: unimplemented method stub
		super.closeNamedConstraint();
	}

	@Override
	protected void openSelectionType(final String id) {
		// TODO: unimplemented method stub
		super.openSelectionType(id);
	}

	@Override
	protected void closeSelectionType() {
		// TODO: unimplemented method stub
		super.closeSelectionType();
	}

	@Override
	protected void openEnumeration() {
		// TODO: unimplemented method stub
		super.openEnumeration();
	}

	@Override
	protected void closeEnumeration() {
		// TODO: unimplemented method stub
		super.closeEnumeration();
	}

	@Override
	protected void enumerationItem(final String text) {
		// TODO: unimplemented method stub
		super.enumerationItem(text);
	}


	@Override
	protected void numberForm(final int number) {
		// TODO: unimplemented method stub
		super.numberForm(number);
	}

	@Override
	protected void nameNumberForm(final String name, final int number) {
		// TODO: unimplemented method stub
		super.nameNumberForm(name, number);
	}

	@Override
	protected void nameForm(final String name) {
		// TODO: unimplemented method stub
		super.nameForm(name);
	}

	@Override
	protected void symbol(final String name) {
		// TODO: unimplemented method stub
		super.symbol(name);
	}

	@Override
	protected void globalModuleReference(final String name) {
		// TODO: unimplemented method stub
		super.globalModuleReference(name);
	}

	@Override
	protected void typeInteger() {
//		super.typeInteger();
		stack.push(Integer.class);
	}

	@Override
	protected void typeBoolean() {
//		super.typeBoolean();
		stack.push(Boolean.class);
	}

	@Override
	protected void typeReal() {
//		super.typeReal();
		stack.push(Double.class);
	}

	@Override
	protected void typeOID() {
		// TODO: unimplemented method stub
		super.typeOID();
	}

	@Override
	protected void typeCString(final RestrictedCString subtype) {
		// TODO: unimplemented method stub
		super.typeCString(subtype);
	}

	@Override
	protected void typeUnrestrictedCString() {
		// TODO: unimplemented method stub
		super.typeUnrestrictedCString();
	}

	@Override
	protected void putTrue() {
//		super.putTrue();
		stack.push(true);
	}

	@Override
	protected void putFalse() {
//		super.putFalse();
		stack.push(false);
	}

	@Override
	protected void number(final int value) {
//		super.number(value);
		stack.push(value);
	}

	@Override
	protected void number(final double value) {
//		super.number(value);
		stack.push(value);
	}

	@Override
	protected void taggingMethod(final TaggingMethod tm) {
//		super.taggingMethod(tm);
		stack.push(tm);
	}

	@Override
	protected void extensionEndMarker() {
		// TODO: unimplemented method stub
		super.extensionEndMarker();
	}

	@Override
	protected void extensionAndException() {
		// TODO: unimplemented method stub
		super.extensionAndException();
	}

	@Override
	protected void extensibilityImplied() {
//		super.extensibilityImplied();
		stack.push(true);
	}
}
