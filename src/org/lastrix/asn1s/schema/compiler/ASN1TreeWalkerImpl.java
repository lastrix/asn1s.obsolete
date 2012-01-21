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

package org.lastrix.asn1s.schema.compiler;

import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.log4j.Logger;
import org.lastrix.asn1s.schema.*;
import org.lastrix.asn1s.schema.compiler.generated.ASN1TreeWalker;
import org.lastrix.asn1s.schema.constraint.*;
import org.lastrix.asn1s.schema.type.*;
import org.lastrix.asn1s.schema.type.x690.ASN1Sequence;

import java.util.LinkedList;
import java.util.Vector;

/**
 * @author lastrix
 * @version 1.0
 */
public class ASN1TreeWalkerImpl extends ASN1TreeWalker {
	private final static Logger logger = Logger.getLogger(ASN1TreeWalkerImpl.class);

	/**
	 * The schema where every valid module should be placed
	 */
	private final ASN1Schema schema;

	/**
	 * Stack is used to construct ASN1 schema objects
	 */
	private final LinkedList<Object> stack = new LinkedList<Object>();

	/**
	 * Create tree walker for nodes and schema that should accept modules
	 *
	 * @param nodes  - tree nodes
	 * @param schema - the schema
	 */
	public ASN1TreeWalkerImpl(
	                         final CommonTreeNodeStream nodes,
	                         final ASN1Schema schema
	                         ) {
		super(nodes);
		this.schema = schema;
	}

	/**
	 * Pop values from stack into result till 'o' found ('o' would be removed from stack and NOT added to result)
	 *
	 * @param o - the needle
	 *
	 * @return an stack
	 */
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
//		super.closeModule();
		final LinkedList<Object> moduleStack = transferTill(BlockTag.MODULE);
		//TODO: module id
		final String moduleId = (String) moduleStack.poll();

		final TaggingMethod defaultTaggingMethod = (moduleStack.peek() instanceof TaggingMethod) ?
		                                           (TaggingMethod) moduleStack.poll() :
		                                           TaggingMethod.AUTOMATIC;
		final Boolean extensibilityImplied = (moduleStack.peek() instanceof Boolean) ? (Boolean) moduleStack.poll() : false;
		final Exports e = (moduleStack.peek() instanceof Exports) ? (Exports) moduleStack.poll() : new Exports(false, null);
		final Imports i = (moduleStack.peek() instanceof Imports) ? (Imports) moduleStack.poll() : new Imports(null);
		final Vector assignments = (Vector) moduleStack.poll();

		final ASN1Module module = (e.all) ? new ASN1Module(moduleId, defaultTaggingMethod, extensibilityImplied, true, i.imports, assignments)
		                                  : new ASN1Module(moduleId, defaultTaggingMethod, extensibilityImplied, e.exports, i.imports, assignments);

		//actually we have no need to store it in stack
//		stack.push(module);
		//now add module to schema
		schema.addModule(module);
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
//		super.openVector();
		stack.push(BlockTag.VECTOR);
	}

	@Override
	protected void closeVector() {
//		super.closeVector();
		final LinkedList<Object> vectorStack = transferTill(BlockTag.VECTOR);
		final Vector<Object> vector = new Vector<Object>(vectorStack);
		stack.push(vector);
//		logger.warn("Created vector: " + vector);
	}

	@Override
	protected void openExports(final boolean all) {
//		super.openExports(all);
		stack.push(BlockTag.EXPORTS);
		stack.push(all);
	}

	@Override
	protected void closeExports() {
//		super.closeExports();
		final LinkedList<Object> eStack = transferTill(BlockTag.EXPORTS);
		final Boolean all = (Boolean) eStack.poll();
		stack.push(new Exports(all, (Vector) eStack.poll()));
	}

	@Override
	protected void openImports() {
//		super.openImports();
		stack.push(BlockTag.IMPORTS);
	}

	@Override
	protected void closeImports() {
//		super.closeImports();
		final LinkedList<Object> iStack = transferTill(BlockTag.IMPORTS);
		stack.push(new Imports((Vector) iStack.poll()));
	}

	@Override
	protected void openSymbolsFromModule() {
//		super.openSymbolsFromModule();
		stack.push(BlockTag.SYMBOLS_FROM_MODULE);
	}

	@Override
	protected void closeSymbolsFromModule() {
//		super.closeSymbolsFromModule();
		final LinkedList<Object> sfmStack = transferTill(BlockTag.SYMBOLS_FROM_MODULE);
		stack.push(new SymbolsFromModule((String) sfmStack.poll(), (Vector) sfmStack.poll()));
	}

	@Override
	protected void openValueAssignment(final String valueName) {
		// TODO: unimplemented method stub
		super.openValueAssignment(valueName);
		throw new UnsupportedOperationException();
	}

	@Override
	protected void closeValueAssignment() {
		// TODO: unimplemented method stub
		super.closeValueAssignment();
		throw new UnsupportedOperationException();
	}

	@Override
	protected void openTypeAssignment(final String name, final Class clazz) {
//		super.openTypeAssignment(name);
		stack.push(BlockTag.TYPE_DEFINITION);
		stack.push(name);
		stack.push(clazz);
	}

	@Override
	protected void closeTypeAssignment() {
//		super.closeTypeAssignment();
		final LinkedList<Object> typeDefStack = transferTill(BlockTag.TYPE_DEFINITION);

		final String typeName = (String) typeDefStack.poll();
		final Class clazz = (typeDefStack.peek() instanceof Class) ? (Class) typeDefStack.poll() : null;
		final ASN1Type type = (ASN1Type) typeDefStack.poll();

//		logger.warn("User specified class for " + typeName + " = " + clazz);
		stack.push(new ASN1UserType(typeName, type, clazz));
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
		final ASN1Type asn1type = getType(type);//ASN1Type.createTypeFor(type);
		if (typeStack.size() == 1) {
			stack.push(new ASN1ConstrainedType(asn1type, (Constraint) typeStack.poll()));
		} else if (typeStack.isEmpty()) {
			stack.push(asn1type);
		} else {
			throw new IllegalStateException();
		}
	}

	private ASN1Type getType(final Object type) {
		if (type instanceof String) {
			return new ASN1UnresolvedType((String) type);
		}
		if (type instanceof ASN1Type) {
			return (ASN1Type) type;
		}
		return null;
	}

	@Override
	protected void openValue() {
//		super.openValue();
		stack.push(BlockTag.VALUE);
	}

	@Override
	protected void closeValue() {
//		super.closeValue();
		//actually there is nothing to do, except validation
		final LinkedList<Object> valueStack = transferTill(BlockTag.VALUE);
		if (valueStack.size() != 1) {
			throw new IllegalStateException();
		}
		stack.push(valueStack.poll());
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
//		logger.info(String.format("Creating type for %d %s %s %s", tagNumber, tagClass, taggingMethod, type));
		stack.push(new ASN1TaggedType(asn1type, tagNumber, tagClass, taggingMethod, (Constraint) taggedTypeStack.poll()));
	}

	@Override
	protected void openSequenceOf() {
//		super.openSequenceOf();
		stack.push(BlockTag.SEQUENCEOF);
	}

	@Override
	protected void closeSequenceOf() {
//		super.closeSequenceOf();
		final LinkedList<Object> sofStack = transferTill(BlockTag.SEQUENCEOF);
		ASN1Type eType = (ASN1Type) sofStack.poll();
		Constraint c = (Constraint) sofStack.poll();
		if (c != null) {
			stack.push(new ASN1ConstrainedType(new ASN1Sequence(new ASN1Type[]{eType}, true), c));
		} else {
			stack.push(new ASN1Sequence(new ASN1Type[]{eType}, true));
		}
	}

	@Override
	protected void openSequence() {
//		super.openSequence();
		stack.push(BlockTag.SEQUENCE);
	}

	@Override
	protected void closeSequence() {
//		super.closeSequence();
		final LinkedList<Object> sStack = transferTill(BlockTag.SEQUENCE);
		final Vector<ASN1Type> componentTypes = (Vector<ASN1Type>) sStack.poll();
		stack.push(new ASN1Sequence(componentTypes.toArray(new ASN1Type[componentTypes.size()]), false));
//		logger.warn(sStack);
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
//		super.openComponentType();
		stack.push(BlockTag.COMPONENT_TYPE);
	}

	@Override
	protected void closeComponentType() {
//		super.closeComponentType();
		final LinkedList<Object> ctStack = transferTill(BlockTag.COMPONENT_TYPE);
		//FIXME: COMPONENTS OF is not handled!!!
		while (!ctStack.isEmpty()) {
			final NamedType type = (NamedType) ctStack.poll();
			//TODO options
			stack.push(new ASN1ComponentType(type.name, type.type));
		}
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
//		super.openNamedType(name);
		stack.push(BlockTag.NAMED_TYPE);
		stack.push(name);
	}

	@Override
	protected void closeNamedType() {
//		super.closeNamedType();
		final LinkedList<Object> ntStack = transferTill(BlockTag.NAMED_TYPE);
		final String name = (String) ntStack.poll();
		final ASN1Type type = (ASN1Type) ntStack.poll();
		stack.push(new NamedType(name, type));
	}

	@Override
	protected void openConstraint() {
//		super.openConstraint();
		stack.push(BlockTag.CONSTRAINT);
	}

	@Override
	protected void closeConstraint() {
//		super.closeConstraint();
		final LinkedList<Object> constraintStack = transferTill(BlockTag.CONSTRAINT);
//		logger.warn(constraintStack);
		Object o = constraintStack.poll();
		if (o instanceof Constraint) {
			stack.push(o);
		} else {
			stack.push(new RootConstraint((Union) o));
		}
	}

	@Override
	protected void openConstraintValueRange() {
//		super.openConstraintValueRange();
		stack.push(BlockTag.CONSTRAINT_VALUE_RANGE);
	}

	@Override
	protected void closeConstraintValueRange() {
//		super.closeConstraintValueRange();
		final LinkedList<Object> cvrStack = transferTill(BlockTag.CONSTRAINT_VALUE_RANGE);
		final Endpoint lowerEP = (Endpoint) cvrStack.poll();
		final Endpoint upperEP = (Endpoint) cvrStack.poll();
		stack.push(new ValueRangeConstraint(lowerEP.value, lowerEP.less, lowerEP.sp, upperEP.value, upperEP.less, upperEP.sp));
	}

	@Override
	protected void openEndpoint(final boolean less, final boolean min, final boolean max) {
//		super.openEndpoint(less, min, max);
		stack.push(BlockTag.ENDPOINT);
		stack.push(less);
		if (min | max) {
			if (min && max) throw new IllegalStateException();

			if (min) stack.push(ValueRangeConstraint.EndpointState.MIN);
			if (max) stack.push(ValueRangeConstraint.EndpointState.MAX);
		} else {
			stack.push(ValueRangeConstraint.EndpointState.NONE);
		}
	}

	@Override
	protected void closeEndpoint() {
//		super.closeEndpoint();
		final LinkedList<Object> epStack = transferTill(BlockTag.ENDPOINT);
		Boolean less = (Boolean) epStack.poll();
		ValueRangeConstraint.EndpointState mm = (ValueRangeConstraint.EndpointState) epStack.poll();
		Object value = epStack.poll();
		stack.push(new Endpoint(less, value, mm));
	}

	@Override
	protected void openConstraintValue() {
//		super.openConstraintValue();
		stack.push(BlockTag.CONSTRAINT_VALUE);
	}

	@Override
	protected void closeConstraintValue() {
//		super.closeConstraintValue();
		final LinkedList<Object> cvStack = transferTill(BlockTag.CONSTRAINT_VALUE);
		final Object value = cvStack.poll();
		stack.push(new ValueConstraint(value));
	}

	@Override
	protected void openUnion(final boolean except) {
//		super.openUnion(except);
		stack.push(BlockTag.UNION);
		stack.push(except);
	}

	@Override
	protected void closeUnion() {
//		super.closeUnion();
		final LinkedList<Object> unionStack = transferTill(BlockTag.UNION);
		Boolean except = (Boolean) unionStack.poll();
		Object o = unionStack.poll();
		Vector ints;
		if (o instanceof Union) {
			ints = ((Union) o).getUnions();
			except = !((Union) o).isExcept();
		} else if (o instanceof Vector) {
			ints = (Vector) o;
		} else {
			throw new IllegalStateException();
		}
		stack.push(new Union(except, ints));
	}

	@Override
	protected void openIntersectionElement() {
//		super.openIntersectionElement();
		stack.push(BlockTag.INTERSECTION);
	}

	@Override
	protected void closeIntersectionElement() {
//		super.closeIntersectionElement();
		final LinkedList<Object> intStack = transferTill(BlockTag.INTERSECTION);
		stack.push(new Intersection((Constraint) intStack.poll(), (Constraint) intStack.poll()));
	}

	@Override
	protected void openTypeReference(final String a, final String b) {
//		super.openTypeReference(a, b);
		stack.push(BlockTag.TYPE_REFERENCE);
		if (b == null) {
			stack.push(null);
			stack.push(a);
		} else {
			stack.push(a);
			stack.push(b);
		}
	}

	@Override
	protected void closeTypeReference() {
//		super.closeTypeReference();
		final LinkedList<Object> trStack = transferTill(BlockTag.TYPE_REFERENCE);
		String moduleName = (String) trStack.poll();
		String typeName = (String) trStack.poll();
		Constraint constraint = (Constraint) trStack.poll();
		//TODO: validation
		if (constraint == null) {
			stack.push(new ASN1UnresolvedType(typeName, moduleName));
		} else {
			stack.push(new ASN1ConstrainedType(new ASN1UnresolvedType(typeName, moduleName), constraint));
		}
	}

	@Override
	protected void openSizeConstraint() {
//		super.openSizeConstraint();
		stack.push(BlockTag.CONSTRAINT_SIZE);
	}

	@Override
	protected void closeSizeConstraint() {
//		super.closeSizeConstraint();
		final LinkedList<Object> sizeStack = transferTill(BlockTag.CONSTRAINT_SIZE);
		if (sizeStack.size() != 1) { throw new IllegalStateException(); }

		stack.push(new SizeConstraint((Constraint) sizeStack.poll()));
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
//		super.symbol(name);
		stack.push(name);
		//TODO: validation
	}

	@Override
	protected void globalModuleReference(final String name) {
//		super.globalModuleReference(name);
		//TODO: validation
		stack.push(name);
	}

	@Override
	protected void typeInteger() {
//		super.typeInteger();
		stack.push("INTEGER");
	}

	@Override
	protected void typeBoolean() {
//		super.typeBoolean();
		stack.push("BOOLEAN");
	}

	@Override
	protected void typeReal() {
//		super.typeReal();
		stack.push("REAL");
	}

	@Override
	protected void typeOID() {
		// TODO: unimplemented method stub
		super.typeOID();
		stack.push("OID");
	}

	@Override
	protected void typeCString(final RestrictedCString subtype) {
		// TODO: unimplemented method stub
//		super.typeCString(subtype);
		switch (subtype) {
			case UTF8String:
				stack.push("UTF8String");
				break;

			case IA5String:
				stack.push("IA5String");
				break;

			default:
				throw new UnsupportedOperationException("Can not handle " + subtype);
		}
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

	private static class NamedType {
		final String   name;
		final ASN1Type type;

		private NamedType(final String name, final ASN1Type type) {
			this.name = name;
			this.type = type;
		}

		@Override
		public String toString() {
			return "NamedType{" +
			       "name='" + name + '\'' +
			       ", type=" + type +
			       '}';
		}
	}


	private static class Endpoint {
		final boolean                            less;
		final ValueRangeConstraint.EndpointState sp;
		final Object                             value;

		private Endpoint(final boolean less, final Object value) {
			this(less, value, ValueRangeConstraint.EndpointState.NONE);
		}

		private Endpoint(final boolean less, final Object value, final ValueRangeConstraint.EndpointState sp) {
			this.less = less;
			this.sp = sp;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Endpoint{" +
			       "less=" + less +
			       ", value=" + value +
			       ", sp=" + sp +
			       '}';
		}
	}

	private static class Exports {
		final Vector  exports;
		final boolean all;

		private Exports(final boolean all, final Vector exports) {
			this.all = all;
			this.exports = exports;
		}

		@Override
		public String toString() {
			return "Exports{" + ((all) ? "ALL" : exports) +
			       '}';
		}
	}

	private static class Imports {
		final Vector imports;

		private Imports(final Vector imports) {
			this.imports = imports;
		}

		@Override
		public String toString() {
			return "Imports{" + imports +
			       '}';
		}
	}

	private enum BlockTag {
		MODULE,
		VECTOR,
		TYPE_DEFINITION,
		CONSTRAINT,
		TYPE,
		TAGGED_TYPE,
		UNION,
		CONSTRAINT_VALUE_RANGE,
		ENDPOINT,
		VALUE,
		CONSTRAINT_VALUE,
		INTERSECTION,
		CONSTRAINT_SIZE,
		SYMBOLS_FROM_MODULE,
		IMPORTS,
		EXPORTS,
		SEQUENCEOF,
		TYPE_REFERENCE,
		SEQUENCE,
		NAMED_TYPE,
		COMPONENT_TYPE,
		MODULE_ID
	}
}
