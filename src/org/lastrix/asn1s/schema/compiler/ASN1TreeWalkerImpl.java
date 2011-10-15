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
import org.lastrix.asn1s.schema.Module;

import java.util.LinkedList;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TreeWalkerImpl extends ASN1TreeWalker {
	private enum BlockTag {
		MODULE_ID
	}

	private final LinkedList<Object> stack = new LinkedList<Object>();

	public ASN1TreeWalkerImpl(TreeNodeStream input) {
		super(input);
	}

	@Override
	protected void openModule() {
		super.openModule();
		stack.push(new Module());
	}

	@Override
	protected void closeModule() {
		super.closeModule();
		final Object tmp = stack.poll();
		if (tmp instanceof Module) {
			System.out.println("Got module here " + tmp);
		}
	}

	@Override
	protected void openModuleId(final String id) {
		super.openModuleId(id);
		stack.push(BlockTag.MODULE_ID);
		stack.push(id);
	}

	@Override
	protected void closeModuleId() {
		super.closeModuleId();
		Object o1 = stack.poll();
		Object o2 = stack.poll();
		if (o2 == BlockTag.MODULE_ID && o1 instanceof String) {
			// all is good
			o2 = stack.peek();
			if (o2 instanceof Module) {
				((Module) o2).setModuleId((String) o1);
				return;
			}
		}
		System.out.println("VERY BAD!!!");
	}

	@Override
	protected void openVector() {
		// TODO: unimplemented method stub
		super.openVector();
	}

	@Override
	protected void closeVector() {
		// TODO: unimplemented method stub
		super.closeVector();
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
		// TODO: unimplemented method stub
		super.openTypeAssignment(name);
	}

	@Override
	protected void closeTypeAssignment() {
		// TODO: unimplemented method stub
		super.closeTypeAssignment();
	}

	@Override
	protected void openType() {
		// TODO: unimplemented method stub
		super.openType();
	}

	@Override
	protected void closeType() {
		// TODO: unimplemented method stub
		super.closeType();
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
		// TODO: unimplemented method stub
		super.openTaggedType(tagNumber, tc, tm);
	}

	@Override
	protected void closeTaggedType() {
		// TODO: unimplemented method stub
		super.closeTaggedType();
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
		// TODO: unimplemented method stub
		super.openConstraint();
	}

	@Override
	protected void closeConstraint() {
		// TODO: unimplemented method stub
		super.closeConstraint();
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
		// TODO: unimplemented method stub
		super.typeInteger();
	}

	@Override
	protected void typeBoolean() {
		// TODO: unimplemented method stub
		super.typeBoolean();
	}

	@Override
	protected void typeReal() {
		// TODO: unimplemented method stub
		super.typeReal();
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
		// TODO: unimplemented method stub
		super.putTrue();
	}

	@Override
	protected void putFalse() {
		// TODO: unimplemented method stub
		super.putFalse();
	}

	@Override
	protected void number(final int value) {
		// TODO: unimplemented method stub
		super.number(value);
	}

	@Override
	protected void number(final double value) {
		// TODO: unimplemented method stub
		super.number(value);
	}

	@Override
	protected void taggingMethod(final TaggingMethod tm) {
		// TODO: unimplemented method stub
		super.taggingMethod(tm);
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
}
