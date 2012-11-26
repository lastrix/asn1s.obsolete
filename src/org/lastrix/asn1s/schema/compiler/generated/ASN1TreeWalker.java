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

// $ANTLR 3.4 /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g 2012-11-26 14:26:08

package org.lastrix.asn1s.schema.compiler.generated;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeFilter;
import org.antlr.runtime.tree.TreeNodeStream;
import org.lastrix.asn1s.schema.Presence;
import org.lastrix.asn1s.schema.TagClass;
import org.lastrix.asn1s.schema.TaggingMethod;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ASN1TreeWalker extends TreeFilter {
	public static final String[] tokenNames = new String[]{
	                                                      "<invalid>",
	                                                      "<EOR>",
	                                                      "<DOWN>",
	                                                      "<UP>",
	                                                      "ALL",
	                                                      "ASSIGNMENT",
	                                                      "BIT_STRING",
	                                                      "BOOLEAN",
	                                                      "CHOICE",
	                                                      "CLASS_DEF",
	                                                      "COMMENT_LINE",
	                                                      "COMPONENT_TYPE",
	                                                      "COMPONENT_TYPE_OPTION",
	                                                      "CONSTRAINT",
	                                                      "CONSTRAINT_INNER_TYPE",
	                                                      "CONSTRAINT_PATTERN",
	                                                      "CONSTRAINT_SIZE",
	                                                      "CONSTRAINT_TYPE",
	                                                      "CONSTRAINT_VALUE",
	                                                      "CONSTRAINT_VALUE_RANGE",
	                                                      "CSTRING",
	                                                      "ENDPOINT",
	                                                      "ENUMERATION",
	                                                      "ENUMERATION_ITEM",
	                                                      "EXCEPT",
	                                                      "EXCEPTION_SPEC",
	                                                      "EXPLICIT",
	                                                      "EXPORTS",
	                                                      "EXTENSIBILITY_IMPLIED",
	                                                      "EXTENSION_ADDITION_ALTERNATIVES_GROUP",
	                                                      "EXTENSION_ADDITION_GROUP",
	                                                      "EXTENSION_AND_EXCEPTION",
	                                                      "EXTENSION_END_MARKER",
	                                                      "FALSE",
	                                                      "GLOBAL_MODULE_REFERENCE",
	                                                      "ID",
	                                                      "IMPLICIT",
	                                                      "IMPORTS",
	                                                      "INT",
	                                                      "INTEGER",
	                                                      "INTERSECTION_ELEMENT",
	                                                      "MINUS_INFINITY",
	                                                      "ML_COMMENT",
	                                                      "MODULE",
	                                                      "MODULE_IDENTIFIER",
	                                                      "NAMED_CONSTRAINT",
	                                                      "NAMED_NUMBER",
	                                                      "NAMED_TYPE",
	                                                      "NAME_FORM",
	                                                      "NAME_NUMBER_FORM",
	                                                      "NUMBER",
	                                                      "NUMBER_FORM",
	                                                      "OCTET_STRING",
	                                                      "OID",
	                                                      "PLUS_INFINITY",
	                                                      "REAL",
	                                                      "REAL_NUMBER",
	                                                      "SELECTION_TYPE",
	                                                      "SEQUENCE",
	                                                      "SEQUENCEOF",
	                                                      "SET",
	                                                      "SETOF",
	                                                      "SYMBOL",
	                                                      "SYMBOLS_FROM_MODULE",
	                                                      "TAG",
	                                                      "TAGGED_TYPE",
	                                                      "TAGGING_METHOD",
	                                                      "TAG_NUMBER",
	                                                      "TRUE",
	                                                      "TYPE",
	                                                      "TYPE_ASSIGNMENT",
	                                                      "TYPE_REFERENCE",
	                                                      "UNION",
	                                                      "UNRESTRICTED_CSTRING",
	                                                      "VALUE",
	                                                      "VALUE_ASSIGNMENT",
	                                                      "VALUE_ID",
	                                                      "VALUE_REFERENCE",
	                                                      "VEC",
	                                                      "WS",
	                                                      "'!'",
	                                                      "'('",
	                                                      "')'",
	                                                      "','",
	                                                      "'.'",
	                                                      "'..'",
	                                                      "'...'",
	                                                      "':'",
	                                                      "'::='",
	                                                      "';'",
	                                                      "'<'",
	                                                      "'ABSENT'",
	                                                      "'ALL'",
	                                                      "'APPLICATION'",
	                                                      "'AUTOMATIC'",
	                                                      "'BEGIN'",
	                                                      "'BIT'",
	                                                      "'BMPString'",
	                                                      "'BOOLEAN'",
	                                                      "'CHARACTER'",
	                                                      "'CHOICE'",
	                                                      "'COMPONENT'",
	                                                      "'COMPONENTS'",
	                                                      "'DEFAULT'",
	                                                      "'DEFINITIONS'",
	                                                      "'END'",
	                                                      "'ENUMERATED'",
	                                                      "'EXCEPT'",
	                                                      "'EXPLICIT'",
	                                                      "'EXPORTS'",
	                                                      "'EXTENSIBILITY'",
	                                                      "'FALSE'",
	                                                      "'FROM'",
	                                                      "'GeneralString'",
	                                                      "'GraphicString'",
	                                                      "'IA5String'",
	                                                      "'IDENTIFIER'",
	                                                      "'IMPLICIT'",
	                                                      "'IMPLIED'",
	                                                      "'IMPORTS'",
	                                                      "'INCLUDES'",
	                                                      "'INTEGER'",
	                                                      "'INTERSECTION'",
	                                                      "'ISO646String'",
	                                                      "'MAX'",
	                                                      "'MIN'",
	                                                      "'MINUS-INFINITY'",
	                                                      "'NumericString'",
	                                                      "'OBJECT'",
	                                                      "'OCTET'",
	                                                      "'OF'",
	                                                      "'OID_VALUE'",
	                                                      "'OPTIONAL'",
	                                                      "'PATTERN'",
	                                                      "'PLUS-INFINITY'",
	                                                      "'PRESENT'",
	                                                      "'PRIVATE'",
	                                                      "'PrintableString'",
	                                                      "'REAL'",
	                                                      "'SEQUENCE'",
	                                                      "'SET'",
	                                                      "'SIZE'",
	                                                      "'STRING'",
	                                                      "'T61String'",
	                                                      "'TAGS'",
	                                                      "'TRUE'",
	                                                      "'TeletexString'",
	                                                      "'UNION'",
	                                                      "'UNIVERSAL'",
	                                                      "'UTF8String'",
	                                                      "'UniversalString'",
	                                                      "'VideotexString'",
	                                                      "'VisibleString'",
	                                                      "'WITH'",
	                                                      "'['",
	                                                      "'[['",
	                                                      "']'",
	                                                      "']]'",
	                                                      "'^'",
	                                                      "'{'",
	                                                      "'|'",
	                                                      "'}'"
	};

	public static final int EOF                                   = -1;
	public static final int T__80                                 = 80;
	public static final int T__81                                 = 81;
	public static final int T__82                                 = 82;
	public static final int T__83                                 = 83;
	public static final int T__84                                 = 84;
	public static final int T__85                                 = 85;
	public static final int T__86                                 = 86;
	public static final int T__87                                 = 87;
	public static final int T__88                                 = 88;
	public static final int T__89                                 = 89;
	public static final int T__90                                 = 90;
	public static final int T__91                                 = 91;
	public static final int T__92                                 = 92;
	public static final int T__93                                 = 93;
	public static final int T__94                                 = 94;
	public static final int T__95                                 = 95;
	public static final int T__96                                 = 96;
	public static final int T__97                                 = 97;
	public static final int T__98                                 = 98;
	public static final int T__99                                 = 99;
	public static final int T__100                                = 100;
	public static final int T__101                                = 101;
	public static final int T__102                                = 102;
	public static final int T__103                                = 103;
	public static final int T__104                                = 104;
	public static final int T__105                                = 105;
	public static final int T__106                                = 106;
	public static final int T__107                                = 107;
	public static final int T__108                                = 108;
	public static final int T__109                                = 109;
	public static final int T__110                                = 110;
	public static final int T__111                                = 111;
	public static final int T__112                                = 112;
	public static final int T__113                                = 113;
	public static final int T__114                                = 114;
	public static final int T__115                                = 115;
	public static final int T__116                                = 116;
	public static final int T__117                                = 117;
	public static final int T__118                                = 118;
	public static final int T__119                                = 119;
	public static final int T__120                                = 120;
	public static final int T__121                                = 121;
	public static final int T__122                                = 122;
	public static final int T__123                                = 123;
	public static final int T__124                                = 124;
	public static final int T__125                                = 125;
	public static final int T__126                                = 126;
	public static final int T__127                                = 127;
	public static final int T__128                                = 128;
	public static final int T__129                                = 129;
	public static final int T__130                                = 130;
	public static final int T__131                                = 131;
	public static final int T__132                                = 132;
	public static final int T__133                                = 133;
	public static final int T__134                                = 134;
	public static final int T__135                                = 135;
	public static final int T__136                                = 136;
	public static final int T__137                                = 137;
	public static final int T__138                                = 138;
	public static final int T__139                                = 139;
	public static final int T__140                                = 140;
	public static final int T__141                                = 141;
	public static final int T__142                                = 142;
	public static final int T__143                                = 143;
	public static final int T__144                                = 144;
	public static final int T__145                                = 145;
	public static final int T__146                                = 146;
	public static final int T__147                                = 147;
	public static final int T__148                                = 148;
	public static final int T__149                                = 149;
	public static final int T__150                                = 150;
	public static final int T__151                                = 151;
	public static final int T__152                                = 152;
	public static final int T__153                                = 153;
	public static final int T__154                                = 154;
	public static final int T__155                                = 155;
	public static final int T__156                                = 156;
	public static final int T__157                                = 157;
	public static final int T__158                                = 158;
	public static final int T__159                                = 159;
	public static final int T__160                                = 160;
	public static final int T__161                                = 161;
	public static final int ALL                                   = 4;
	public static final int ASSIGNMENT                            = 5;
	public static final int BIT_STRING                            = 6;
	public static final int BOOLEAN                               = 7;
	public static final int CHOICE                                = 8;
	public static final int CLASS_DEF                             = 9;
	public static final int COMMENT_LINE                          = 10;
	public static final int COMPONENT_TYPE                        = 11;
	public static final int COMPONENT_TYPE_OPTION                 = 12;
	public static final int CONSTRAINT                            = 13;
	public static final int CONSTRAINT_INNER_TYPE                 = 14;
	public static final int CONSTRAINT_PATTERN                    = 15;
	public static final int CONSTRAINT_SIZE                       = 16;
	public static final int CONSTRAINT_TYPE                       = 17;
	public static final int CONSTRAINT_VALUE                      = 18;
	public static final int CONSTRAINT_VALUE_RANGE                = 19;
	public static final int CSTRING                               = 20;
	public static final int ENDPOINT                              = 21;
	public static final int ENUMERATION                           = 22;
	public static final int ENUMERATION_ITEM                      = 23;
	public static final int EXCEPT                                = 24;
	public static final int EXCEPTION_SPEC                        = 25;
	public static final int EXPLICIT                              = 26;
	public static final int EXPORTS                               = 27;
	public static final int EXTENSIBILITY_IMPLIED                 = 28;
	public static final int EXTENSION_ADDITION_ALTERNATIVES_GROUP = 29;
	public static final int EXTENSION_ADDITION_GROUP              = 30;
	public static final int EXTENSION_AND_EXCEPTION               = 31;
	public static final int EXTENSION_END_MARKER                  = 32;
	public static final int FALSE                                 = 33;
	public static final int GLOBAL_MODULE_REFERENCE               = 34;
	public static final int ID                                    = 35;
	public static final int IMPLICIT                              = 36;
	public static final int IMPORTS                               = 37;
	public static final int INT                                   = 38;
	public static final int INTEGER                               = 39;
	public static final int INTERSECTION_ELEMENT                  = 40;
	public static final int MINUS_INFINITY                        = 41;
	public static final int ML_COMMENT                            = 42;
	public static final int MODULE                                = 43;
	public static final int MODULE_IDENTIFIER                     = 44;
	public static final int NAMED_CONSTRAINT                      = 45;
	public static final int NAMED_NUMBER                          = 46;
	public static final int NAMED_TYPE                            = 47;
	public static final int NAME_FORM                             = 48;
	public static final int NAME_NUMBER_FORM                      = 49;
	public static final int NUMBER                                = 50;
	public static final int NUMBER_FORM                           = 51;
	public static final int OCTET_STRING                          = 52;
	public static final int OID                                   = 53;
	public static final int PLUS_INFINITY                         = 54;
	public static final int REAL                                  = 55;
	public static final int REAL_NUMBER                           = 56;
	public static final int SELECTION_TYPE                        = 57;
	public static final int SEQUENCE                              = 58;
	public static final int SEQUENCEOF                            = 59;
	public static final int SET                                   = 60;
	public static final int SETOF                                 = 61;
	public static final int SYMBOL                                = 62;
	public static final int SYMBOLS_FROM_MODULE                   = 63;
	public static final int TAG                                   = 64;
	public static final int TAGGED_TYPE                           = 65;
	public static final int TAGGING_METHOD                        = 66;
	public static final int TAG_NUMBER                            = 67;
	public static final int TRUE                                  = 68;
	public static final int TYPE                                  = 69;
	public static final int TYPE_ASSIGNMENT                       = 70;
	public static final int TYPE_REFERENCE                        = 71;
	public static final int UNION                                 = 72;
	public static final int UNRESTRICTED_CSTRING                  = 73;
	public static final int VALUE                                 = 74;
	public static final int VALUE_ASSIGNMENT                      = 75;
	public static final int VALUE_ID                              = 76;
	public static final int VALUE_REFERENCE                       = 77;
	public static final int VEC                                   = 78;
	public static final int WS                                    = 79;

	// delegates
	public TreeFilter[] getDelegates() {
		return new TreeFilter[]{};
	}

	// delegators


	public ASN1TreeWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}

	public ASN1TreeWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String[] getTokenNames() { return ASN1TreeWalker.tokenNames; }

	public String getGrammarFileName() { return "/home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g"; }


	/*
    public enum Presence {
    	PRESENT,
    	ABSENT,
    	OPTIONAL
    }

    public enum TagClass {
    	UNIVERSAL,
    	APPLICATION,
    	PRIVATE
    }

    public enum TaggingMethod {
    	IMPLICIT,
    	EXPLICIT,
    	AUTOMATIC;
    }
    */
	public enum RestrictedCString {
		BMPString,
		GeneralString,
		GraphicString,
		IA5String,
		ISO646String,
		NumericString,
		PrintableString,
		TeletexString,
		T61String,
		UniversalString,
		UTF8String,
		VideotexString,
		VisibleString
	}

	protected void openModule() {System.out.println("Module opened. ");}

	protected void closeModule() {System.out.println("Module closed.");}


	protected void openModuleId(String id) {System.out.println("Module id=" + id);}

	protected void closeModuleId() {System.out.println("Exit moduleId.");}


	protected void openVector() {System.out.println("Enter vector.");}

	protected void closeVector() {System.out.println("Exit vector.");}


	protected void openExports(boolean all) {System.out.println("Open exports." + all);}

	protected void closeExports() {System.out.println("Close exports.");}


	protected void openImports() {System.out.println("Open imports.");}

	protected void closeImports() {System.out.println("Close imports.");}


	protected void openSymbolsFromModule() {System.out.println("Open symbolsFromModule.");}

	;

	protected void closeSymbolsFromModule() {System.out.println("Close symbolsFromModule.");}

	;


	protected void openValueAssignment(String valueName) {System.out.println("Open ValueAssignment for " + valueName);}

	protected void closeValueAssignment() {System.out.println("Close ValueAssignment.");}


	protected void openTypeAssignment(String name, Class clazz) {System.out.println("Open TypeAssignment for " + name);}

	protected void closeTypeAssignment() {System.out.println("Close TypeAssignment.");}


	protected void openType() {System.out.println("Open Type.");}

	protected void closeType() {System.out.println("Close Type.");}


	protected void openValue() {System.out.println("Open value.");}

	protected void closeValue() {System.out.println("Close value.");}


	protected void openTaggedType(int tagNumber, TagClass tc, TaggingMethod tm) {
		System.out.println(
		                  "Open taggedType " + tc + " " + tagNumber + " " + tm
		                  );
	}

	protected void closeTaggedType() {System.out.println("Close taggedType .");}


	protected void openSequenceOf() {System.out.println("Open sequenceOf.");}

	protected void closeSequenceOf() {System.out.println("Close sequenceOf.");}


	protected void openSequence() {System.out.println("Open sequence.");}

	protected void closeSequence() {System.out.println("Close sequence.");}


	protected void openSetOf() {System.out.println("Open setOf.");}

	protected void closeSetOf() {System.out.println("Close setOf.");}


	protected void openSet() {System.out.println("Open set.");}

	protected void closeSet() {System.out.println("Close set.");}


	protected void openChoice() {System.out.println("Open choice.");}

	protected void closeChoice() {System.out.println("Close choice.");}


	protected void openExceptionSpec(int num) {System.out.println("Open exception spec." + num);}

	protected void openExceptionSpec() {System.out.println("Open exception spec.");}

	protected void closeExceptionSpec() {System.out.println("Close exception spec.");}


	protected void openComponentType() {System.out.println("Open componentType.");}

	protected void closeComponentType() {System.out.println("Close componentType.");}


	protected void openComponentTypeOption() {System.out.println("Open componentType option.");}

	protected void closeComponentTypeOption() {System.out.println("Close componentType option.");}


	protected void openExtensionAdditionGroup(int num) {System.out.println("Open extensionAddition group " + num);}

	protected void closeExtensionAdditionGroup() {System.out.println("Close extensionAddition group.");}

	protected void openExtensionAdditionAlternativesGroup(int num) {System.out.println("Open extensionAdditionAlternatives group " + num);}

	protected void closeExtensionAdditionAlternativesGroup() {System.out.println("Close extensionAdditionAlternatives group.");}


	protected void openNamedType(String name) {System.out.println("Open namedType for " + name);}

	protected void closeNamedType() {System.out.println("Close namedType.");}


	protected void openConstraint() {System.out.println("Open constraint.");}

	protected void closeConstraint() {System.out.println("Close constraint.");}


	protected void openConstraintValueRange() {System.out.println("Open value range.");}

	protected void closeConstraintValueRange() {System.out.println("Close value range.");}

	protected void openConstraintValue() {System.out.println("Open value.");}

	protected void closeConstraintValue() {System.out.println("Close value.");}


	protected void openEndpoint(boolean less, boolean min, boolean max) {System.out.println("Open endpoint." + less + " " + min + " " + max);}

	protected void closeEndpoint() {System.out.println("Close endpoint.");}


	protected void openUnion(boolean except) {System.out.println("Open union " + except);}

	protected void closeUnion() {System.out.println("Close union.");}


	protected void openIntersectionElement() {System.out.println("Open IntersectionElement.");}

	protected void closeIntersectionElement() {System.out.println("Close IntersectionElement.");}


	protected void openSizeConstraint() {System.out.println("Open SizeConstraint.");}

	protected void closeSizeConstraint() {System.out.println("Close SizeConstraint.");}


	protected void openTypeConstraint(boolean includes) {System.out.println("Open TypeConstraint. " + includes);}

	protected void closeTypeConstraint() {System.out.println("Close TypeConstraint.");}


	protected void openInnerTypeConstraint(boolean dots) {System.out.println("Open InnerTypeConstraint. " + dots);}

	protected void closeInnerTypeConstraint() {System.out.println("Close InnerTypeConstraint.");}


	protected void openNamedConstraint(String name, Presence presence) {System.out.println("Open NamedConstraint. " + name + " " + presence);}

	protected void closeNamedConstraint() {System.out.println("Close NamedConstraint.");}


	protected void openSelectionType(String id) {System.out.println("Open SelectionType. " + id);}

	protected void closeSelectionType() {System.out.println("Close SelectionType.");}


	protected void openEnumeration() {System.out.println("Open Enumeration.");}

	protected void closeEnumeration() {System.out.println("Close Enumeration.");}


	protected void openTypeReference(String a, String b) {System.out.println("Open type reference " + ((b == null) ? a : a + "." + b));}

	protected void closeTypeReference() {System.out.println("Close type .");}

	// MISC methods
	protected void numberForm(int number) {System.out.println("Number form " + number);}

	protected void nameNumberForm(String name, int number) {System.out.println("NameNumber form " + name + "(" + number + ")");}

	protected void nameForm(String name) {System.out.println("Name form " + name);}

	protected void symbol(String name) {System.out.println("Symbol " + name);}

	protected void globalModuleReference(String name) {System.out.println("GlobalModuleReference " + name);}

	protected void typeInteger() {System.out.println("Type: integer.");}

	protected void typeBoolean() {System.out.println("Type: boolean.");}

	protected void typeReal() {System.out.println("Type: real.");}

	protected void typeOID() {System.out.println("Type: OID.");}

	protected void typeCString(RestrictedCString subtype) {System.out.println("Type: " + subtype);}

	protected void typeUnrestrictedCString() {System.out.println("Type: unrestricted CString.");}

	protected void putTrue() {System.out.println("true");}

	protected void putFalse() {System.out.println("true");}

	protected void number(int value) {System.out.println("int:" + value);}

	protected void number(double value) {System.out.println("double:" + value);}

	protected void taggingMethod(TaggingMethod tm) {System.out.println("TaggingMethod:" + tm);}

	protected void extensionEndMarker() {System.out.println("Extension end marker.");}

	;

	protected void extensionAndException() {System.out.println("Extension and exception.");}

	protected void enumerationItem(String text) {System.out.println("Enumeration item " + text);}

	;

	protected void extensibilityImplied() {System.out.println("Extensibility implied.");}


	// $ANTLR start "topdown"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:258:1: topdown : ( enterModule | enterModuleId | enterVec | enterExports | enterImports | enterSymbolsFromModule | enterValueAssignment | enterTypeAssignment | enterType | enterValue | enterTaggedType | enterSequenceOf | enterSequence | enterSetOf | enterSet | enterChoice | enterExceptionSpec | enterComponentType | enterComponentTypeOption | enterExtensionAdditionGroup | enterExtensionAdditionAlternativesGroup | enterNamedType | enterConstraint | enterConstraintValueRange | enterConstraintValue | enterConstraintSize | enterConstraintType | enterConstraintInnerType | enterEndpoint | enterUnion | enterIntersectionElement | enterNamedConstraint | enterSelectionType | enterEnumeration | enterTypeReference | nameForm | nameNumberForm | numberForm | symbol | globalModuleReference | trueValue | falseValue | numberValue | defaultTaggingMethod | extensionEndMarkerPvt | integerType | booleanType | realType | oidType | cstringType | enumerationItemPvt | extensibilityImpliedPvt );
	public final void topdown() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:258:10: ( enterModule | enterModuleId | enterVec | enterExports | enterImports | enterSymbolsFromModule | enterValueAssignment | enterTypeAssignment | enterType | enterValue | enterTaggedType | enterSequenceOf | enterSequence | enterSetOf | enterSet | enterChoice | enterExceptionSpec | enterComponentType | enterComponentTypeOption | enterExtensionAdditionGroup | enterExtensionAdditionAlternativesGroup | enterNamedType | enterConstraint | enterConstraintValueRange | enterConstraintValue | enterConstraintSize | enterConstraintType | enterConstraintInnerType | enterEndpoint | enterUnion | enterIntersectionElement | enterNamedConstraint | enterSelectionType | enterEnumeration | enterTypeReference | nameForm | nameNumberForm | numberForm | symbol | globalModuleReference | trueValue | falseValue | numberValue | defaultTaggingMethod | extensionEndMarkerPvt | integerType | booleanType | realType | oidType | cstringType | enumerationItemPvt | extensibilityImpliedPvt )
			int alt1 = 52;
			switch (input.LA(1)) {
				case MODULE: {
					alt1 = 1;
				}
				break;
				case MODULE_IDENTIFIER: {
					alt1 = 2;
				}
				break;
				case VEC: {
					alt1 = 3;
				}
				break;
				case EXPORTS: {
					alt1 = 4;
				}
				break;
				case IMPORTS: {
					alt1 = 5;
				}
				break;
				case SYMBOLS_FROM_MODULE: {
					alt1 = 6;
				}
				break;
				case VALUE_ASSIGNMENT: {
					alt1 = 7;
				}
				break;
				case TYPE_ASSIGNMENT: {
					alt1 = 8;
				}
				break;
				case TYPE: {
					alt1 = 9;
				}
				break;
				case VALUE: {
					alt1 = 10;
				}
				break;
				case TAGGED_TYPE: {
					alt1 = 11;
				}
				break;
				case SEQUENCEOF: {
					alt1 = 12;
				}
				break;
				case SEQUENCE: {
					alt1 = 13;
				}
				break;
				case SETOF: {
					alt1 = 14;
				}
				break;
				case SET: {
					alt1 = 15;
				}
				break;
				case CHOICE: {
					alt1 = 16;
				}
				break;
				case EXCEPTION_SPEC: {
					alt1 = 17;
				}
				break;
				case COMPONENT_TYPE: {
					alt1 = 18;
				}
				break;
				case COMPONENT_TYPE_OPTION: {
					alt1 = 19;
				}
				break;
				case EXTENSION_ADDITION_GROUP: {
					alt1 = 20;
				}
				break;
				case EXTENSION_ADDITION_ALTERNATIVES_GROUP: {
					alt1 = 21;
				}
				break;
				case NAMED_TYPE: {
					alt1 = 22;
				}
				break;
				case CONSTRAINT: {
					alt1 = 23;
				}
				break;
				case CONSTRAINT_VALUE_RANGE: {
					alt1 = 24;
				}
				break;
				case CONSTRAINT_VALUE: {
					alt1 = 25;
				}
				break;
				case CONSTRAINT_SIZE: {
					alt1 = 26;
				}
				break;
				case CONSTRAINT_TYPE: {
					alt1 = 27;
				}
				break;
				case CONSTRAINT_INNER_TYPE: {
					alt1 = 28;
				}
				break;
				case ENDPOINT: {
					alt1 = 29;
				}
				break;
				case UNION: {
					alt1 = 30;
				}
				break;
				case INTERSECTION_ELEMENT: {
					alt1 = 31;
				}
				break;
				case NAMED_CONSTRAINT: {
					alt1 = 32;
				}
				break;
				case SELECTION_TYPE: {
					alt1 = 33;
				}
				break;
				case ENUMERATION: {
					alt1 = 34;
				}
				break;
				case TYPE_REFERENCE: {
					alt1 = 35;
				}
				break;
				case NAME_FORM: {
					alt1 = 36;
				}
				break;
				case NAME_NUMBER_FORM: {
					alt1 = 37;
				}
				break;
				case NUMBER_FORM: {
					alt1 = 38;
				}
				break;
				case SYMBOL: {
					alt1 = 39;
				}
				break;
				case GLOBAL_MODULE_REFERENCE: {
					alt1 = 40;
				}
				break;
				case TRUE: {
					alt1 = 41;
				}
				break;
				case FALSE: {
					alt1 = 42;
				}
				break;
				case NUMBER: {
					alt1 = 43;
				}
				break;
				case TAGGING_METHOD: {
					alt1 = 44;
				}
				break;
				case EXTENSION_END_MARKER: {
					alt1 = 45;
				}
				break;
				case INTEGER: {
					alt1 = 46;
				}
				break;
				case BOOLEAN: {
					alt1 = 47;
				}
				break;
				case REAL: {
					alt1 = 48;
				}
				break;
				case OID: {
					alt1 = 49;
				}
				break;
				case CSTRING: {
					alt1 = 50;
				}
				break;
				case ENUMERATION_ITEM: {
					alt1 = 51;
				}
				break;
				case EXTENSIBILITY_IMPLIED: {
					alt1 = 52;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);

					throw nvae;

			}

			switch (alt1) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:259:2: enterModule
				{
					pushFollow(FOLLOW_enterModule_in_topdown56);
					enterModule();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:260:4: enterModuleId
				{
					pushFollow(FOLLOW_enterModuleId_in_topdown61);
					enterModuleId();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:261:4: enterVec
				{
					pushFollow(FOLLOW_enterVec_in_topdown66);
					enterVec();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:262:4: enterExports
				{
					pushFollow(FOLLOW_enterExports_in_topdown71);
					enterExports();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:263:4: enterImports
				{
					pushFollow(FOLLOW_enterImports_in_topdown76);
					enterImports();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 6:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:264:4: enterSymbolsFromModule
				{
					pushFollow(FOLLOW_enterSymbolsFromModule_in_topdown81);
					enterSymbolsFromModule();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 7:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:265:4: enterValueAssignment
				{
					pushFollow(FOLLOW_enterValueAssignment_in_topdown86);
					enterValueAssignment();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 8:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:266:4: enterTypeAssignment
				{
					pushFollow(FOLLOW_enterTypeAssignment_in_topdown91);
					enterTypeAssignment();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 9:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:267:4: enterType
				{
					pushFollow(FOLLOW_enterType_in_topdown96);
					enterType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 10:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:268:4: enterValue
				{
					pushFollow(FOLLOW_enterValue_in_topdown101);
					enterValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 11:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:269:4: enterTaggedType
				{
					pushFollow(FOLLOW_enterTaggedType_in_topdown106);
					enterTaggedType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 12:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:270:4: enterSequenceOf
				{
					pushFollow(FOLLOW_enterSequenceOf_in_topdown111);
					enterSequenceOf();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 13:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:271:4: enterSequence
				{
					pushFollow(FOLLOW_enterSequence_in_topdown116);
					enterSequence();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 14:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:272:4: enterSetOf
				{
					pushFollow(FOLLOW_enterSetOf_in_topdown121);
					enterSetOf();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 15:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:273:4: enterSet
				{
					pushFollow(FOLLOW_enterSet_in_topdown126);
					enterSet();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 16:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:274:4: enterChoice
				{
					pushFollow(FOLLOW_enterChoice_in_topdown131);
					enterChoice();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 17:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:275:4: enterExceptionSpec
				{
					pushFollow(FOLLOW_enterExceptionSpec_in_topdown136);
					enterExceptionSpec();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 18:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:276:4: enterComponentType
				{
					pushFollow(FOLLOW_enterComponentType_in_topdown141);
					enterComponentType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 19:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:277:4: enterComponentTypeOption
				{
					pushFollow(FOLLOW_enterComponentTypeOption_in_topdown146);
					enterComponentTypeOption();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 20:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:278:4: enterExtensionAdditionGroup
				{
					pushFollow(FOLLOW_enterExtensionAdditionGroup_in_topdown151);
					enterExtensionAdditionGroup();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 21:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:279:4: enterExtensionAdditionAlternativesGroup
				{
					pushFollow(FOLLOW_enterExtensionAdditionAlternativesGroup_in_topdown156);
					enterExtensionAdditionAlternativesGroup();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 22:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:280:4: enterNamedType
				{
					pushFollow(FOLLOW_enterNamedType_in_topdown161);
					enterNamedType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 23:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:281:4: enterConstraint
				{
					pushFollow(FOLLOW_enterConstraint_in_topdown166);
					enterConstraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 24:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:282:4: enterConstraintValueRange
				{
					pushFollow(FOLLOW_enterConstraintValueRange_in_topdown171);
					enterConstraintValueRange();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 25:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:283:4: enterConstraintValue
				{
					pushFollow(FOLLOW_enterConstraintValue_in_topdown176);
					enterConstraintValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 26:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:284:4: enterConstraintSize
				{
					pushFollow(FOLLOW_enterConstraintSize_in_topdown181);
					enterConstraintSize();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 27:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:285:4: enterConstraintType
				{
					pushFollow(FOLLOW_enterConstraintType_in_topdown186);
					enterConstraintType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 28:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:286:4: enterConstraintInnerType
				{
					pushFollow(FOLLOW_enterConstraintInnerType_in_topdown191);
					enterConstraintInnerType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 29:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:287:4: enterEndpoint
				{
					pushFollow(FOLLOW_enterEndpoint_in_topdown196);
					enterEndpoint();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 30:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:288:4: enterUnion
				{
					pushFollow(FOLLOW_enterUnion_in_topdown201);
					enterUnion();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 31:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:289:4: enterIntersectionElement
				{
					pushFollow(FOLLOW_enterIntersectionElement_in_topdown206);
					enterIntersectionElement();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 32:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:290:4: enterNamedConstraint
				{
					pushFollow(FOLLOW_enterNamedConstraint_in_topdown211);
					enterNamedConstraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 33:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:291:4: enterSelectionType
				{
					pushFollow(FOLLOW_enterSelectionType_in_topdown216);
					enterSelectionType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 34:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:292:4: enterEnumeration
				{
					pushFollow(FOLLOW_enterEnumeration_in_topdown221);
					enterEnumeration();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 35:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:293:4: enterTypeReference
				{
					pushFollow(FOLLOW_enterTypeReference_in_topdown226);
					enterTypeReference();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 36:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:294:4: nameForm
				{
					pushFollow(FOLLOW_nameForm_in_topdown231);
					nameForm();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 37:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:295:4: nameNumberForm
				{
					pushFollow(FOLLOW_nameNumberForm_in_topdown236);
					nameNumberForm();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 38:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:296:4: numberForm
				{
					pushFollow(FOLLOW_numberForm_in_topdown241);
					numberForm();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 39:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:297:4: symbol
				{
					pushFollow(FOLLOW_symbol_in_topdown246);
					symbol();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 40:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:298:4: globalModuleReference
				{
					pushFollow(FOLLOW_globalModuleReference_in_topdown251);
					globalModuleReference();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 41:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:299:4: trueValue
				{
					pushFollow(FOLLOW_trueValue_in_topdown256);
					trueValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 42:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:300:4: falseValue
				{
					pushFollow(FOLLOW_falseValue_in_topdown261);
					falseValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 43:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:301:4: numberValue
				{
					pushFollow(FOLLOW_numberValue_in_topdown266);
					numberValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 44:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:302:4: defaultTaggingMethod
				{
					pushFollow(FOLLOW_defaultTaggingMethod_in_topdown271);
					defaultTaggingMethod();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 45:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:303:4: extensionEndMarkerPvt
				{
					pushFollow(FOLLOW_extensionEndMarkerPvt_in_topdown276);
					extensionEndMarkerPvt();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 46:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:304:4: integerType
				{
					pushFollow(FOLLOW_integerType_in_topdown281);
					integerType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 47:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:305:4: booleanType
				{
					pushFollow(FOLLOW_booleanType_in_topdown286);
					booleanType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 48:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:306:4: realType
				{
					pushFollow(FOLLOW_realType_in_topdown291);
					realType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 49:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:307:4: oidType
				{
					pushFollow(FOLLOW_oidType_in_topdown296);
					oidType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 50:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:308:4: cstringType
				{
					pushFollow(FOLLOW_cstringType_in_topdown301);
					cstringType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 51:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:309:4: enumerationItemPvt
				{
					pushFollow(FOLLOW_enumerationItemPvt_in_topdown306);
					enumerationItemPvt();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 52:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:310:4: extensibilityImpliedPvt
				{
					pushFollow(FOLLOW_extensibilityImpliedPvt_in_topdown311);
					extensibilityImpliedPvt();

					state._fsp--;
					if (state.failed) return;

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "topdown"


	// $ANTLR start "bottomup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:312:1: bottomup : ( exitModule | exitModuleId | exitVec | exitExports | exitImports | exitSymbolsFromModule | exitValueAssignment | exitTypeAssignment | exitType | exitValue | exitTaggedType | exitSequenceOf | exitSequence | exitSetOf | exitSet | exitChoice | exitExceptionSpec | exitComponentType | exitComponentTypeOption | exitExtensionAdditionGroup | exitExtensionAdditionAlternativesGroup | exitNamedType | exitConstraint | exitConstraintValueRange | exitConstraintValue | exitConstraintSize | exitConstraintType | exitConstraintInnerType | exitEndpoint | exitUnion | exitIntersectionElement | exitNamedConstraint | exitSelectionType | exitEnumeration | exitTypeReference );
	public final void bottomup() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:312:10: ( exitModule | exitModuleId | exitVec | exitExports | exitImports | exitSymbolsFromModule | exitValueAssignment | exitTypeAssignment | exitType | exitValue | exitTaggedType | exitSequenceOf | exitSequence | exitSetOf | exitSet | exitChoice | exitExceptionSpec | exitComponentType | exitComponentTypeOption | exitExtensionAdditionGroup | exitExtensionAdditionAlternativesGroup | exitNamedType | exitConstraint | exitConstraintValueRange | exitConstraintValue | exitConstraintSize | exitConstraintType | exitConstraintInnerType | exitEndpoint | exitUnion | exitIntersectionElement | exitNamedConstraint | exitSelectionType | exitEnumeration | exitTypeReference )
			int alt2 = 35;
			switch (input.LA(1)) {
				case MODULE: {
					alt2 = 1;
				}
				break;
				case MODULE_IDENTIFIER: {
					alt2 = 2;
				}
				break;
				case VEC: {
					alt2 = 3;
				}
				break;
				case EXPORTS: {
					alt2 = 4;
				}
				break;
				case IMPORTS: {
					alt2 = 5;
				}
				break;
				case SYMBOLS_FROM_MODULE: {
					alt2 = 6;
				}
				break;
				case VALUE_ASSIGNMENT: {
					alt2 = 7;
				}
				break;
				case TYPE_ASSIGNMENT: {
					alt2 = 8;
				}
				break;
				case TYPE: {
					alt2 = 9;
				}
				break;
				case VALUE: {
					alt2 = 10;
				}
				break;
				case TAGGED_TYPE: {
					alt2 = 11;
				}
				break;
				case SEQUENCEOF: {
					alt2 = 12;
				}
				break;
				case SEQUENCE: {
					alt2 = 13;
				}
				break;
				case SETOF: {
					alt2 = 14;
				}
				break;
				case SET: {
					alt2 = 15;
				}
				break;
				case CHOICE: {
					alt2 = 16;
				}
				break;
				case EXCEPTION_SPEC: {
					alt2 = 17;
				}
				break;
				case COMPONENT_TYPE: {
					alt2 = 18;
				}
				break;
				case COMPONENT_TYPE_OPTION: {
					alt2 = 19;
				}
				break;
				case EXTENSION_ADDITION_GROUP: {
					alt2 = 20;
				}
				break;
				case EXTENSION_ADDITION_ALTERNATIVES_GROUP: {
					alt2 = 21;
				}
				break;
				case NAMED_TYPE: {
					alt2 = 22;
				}
				break;
				case CONSTRAINT: {
					alt2 = 23;
				}
				break;
				case CONSTRAINT_VALUE_RANGE: {
					alt2 = 24;
				}
				break;
				case CONSTRAINT_VALUE: {
					alt2 = 25;
				}
				break;
				case CONSTRAINT_SIZE: {
					alt2 = 26;
				}
				break;
				case CONSTRAINT_TYPE: {
					alt2 = 27;
				}
				break;
				case CONSTRAINT_INNER_TYPE: {
					alt2 = 28;
				}
				break;
				case ENDPOINT: {
					alt2 = 29;
				}
				break;
				case UNION: {
					alt2 = 30;
				}
				break;
				case INTERSECTION_ELEMENT: {
					alt2 = 31;
				}
				break;
				case NAMED_CONSTRAINT: {
					alt2 = 32;
				}
				break;
				case SELECTION_TYPE: {
					alt2 = 33;
				}
				break;
				case ENUMERATION: {
					alt2 = 34;
				}
				break;
				case TYPE_REFERENCE: {
					alt2 = 35;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);

					throw nvae;

			}

			switch (alt2) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:313:2: exitModule
				{
					pushFollow(FOLLOW_exitModule_in_bottomup320);
					exitModule();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:314:4: exitModuleId
				{
					pushFollow(FOLLOW_exitModuleId_in_bottomup325);
					exitModuleId();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:315:4: exitVec
				{
					pushFollow(FOLLOW_exitVec_in_bottomup330);
					exitVec();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:316:4: exitExports
				{
					pushFollow(FOLLOW_exitExports_in_bottomup335);
					exitExports();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:317:4: exitImports
				{
					pushFollow(FOLLOW_exitImports_in_bottomup340);
					exitImports();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 6:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:318:4: exitSymbolsFromModule
				{
					pushFollow(FOLLOW_exitSymbolsFromModule_in_bottomup345);
					exitSymbolsFromModule();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 7:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:319:4: exitValueAssignment
				{
					pushFollow(FOLLOW_exitValueAssignment_in_bottomup350);
					exitValueAssignment();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 8:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:320:4: exitTypeAssignment
				{
					pushFollow(FOLLOW_exitTypeAssignment_in_bottomup355);
					exitTypeAssignment();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 9:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:321:4: exitType
				{
					pushFollow(FOLLOW_exitType_in_bottomup360);
					exitType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 10:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:322:4: exitValue
				{
					pushFollow(FOLLOW_exitValue_in_bottomup365);
					exitValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 11:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:323:4: exitTaggedType
				{
					pushFollow(FOLLOW_exitTaggedType_in_bottomup370);
					exitTaggedType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 12:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:324:4: exitSequenceOf
				{
					pushFollow(FOLLOW_exitSequenceOf_in_bottomup375);
					exitSequenceOf();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 13:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:325:4: exitSequence
				{
					pushFollow(FOLLOW_exitSequence_in_bottomup380);
					exitSequence();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 14:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:326:4: exitSetOf
				{
					pushFollow(FOLLOW_exitSetOf_in_bottomup385);
					exitSetOf();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 15:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:327:4: exitSet
				{
					pushFollow(FOLLOW_exitSet_in_bottomup390);
					exitSet();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 16:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:328:4: exitChoice
				{
					pushFollow(FOLLOW_exitChoice_in_bottomup395);
					exitChoice();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 17:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:329:4: exitExceptionSpec
				{
					pushFollow(FOLLOW_exitExceptionSpec_in_bottomup400);
					exitExceptionSpec();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 18:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:330:4: exitComponentType
				{
					pushFollow(FOLLOW_exitComponentType_in_bottomup405);
					exitComponentType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 19:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:331:4: exitComponentTypeOption
				{
					pushFollow(FOLLOW_exitComponentTypeOption_in_bottomup410);
					exitComponentTypeOption();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 20:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:332:4: exitExtensionAdditionGroup
				{
					pushFollow(FOLLOW_exitExtensionAdditionGroup_in_bottomup415);
					exitExtensionAdditionGroup();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 21:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:333:4: exitExtensionAdditionAlternativesGroup
				{
					pushFollow(FOLLOW_exitExtensionAdditionAlternativesGroup_in_bottomup420);
					exitExtensionAdditionAlternativesGroup();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 22:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:334:4: exitNamedType
				{
					pushFollow(FOLLOW_exitNamedType_in_bottomup425);
					exitNamedType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 23:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:335:4: exitConstraint
				{
					pushFollow(FOLLOW_exitConstraint_in_bottomup430);
					exitConstraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 24:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:336:4: exitConstraintValueRange
				{
					pushFollow(FOLLOW_exitConstraintValueRange_in_bottomup435);
					exitConstraintValueRange();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 25:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:337:4: exitConstraintValue
				{
					pushFollow(FOLLOW_exitConstraintValue_in_bottomup440);
					exitConstraintValue();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 26:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:338:4: exitConstraintSize
				{
					pushFollow(FOLLOW_exitConstraintSize_in_bottomup445);
					exitConstraintSize();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 27:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:339:4: exitConstraintType
				{
					pushFollow(FOLLOW_exitConstraintType_in_bottomup450);
					exitConstraintType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 28:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:340:4: exitConstraintInnerType
				{
					pushFollow(FOLLOW_exitConstraintInnerType_in_bottomup455);
					exitConstraintInnerType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 29:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:341:4: exitEndpoint
				{
					pushFollow(FOLLOW_exitEndpoint_in_bottomup460);
					exitEndpoint();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 30:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:342:4: exitUnion
				{
					pushFollow(FOLLOW_exitUnion_in_bottomup465);
					exitUnion();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 31:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:343:4: exitIntersectionElement
				{
					pushFollow(FOLLOW_exitIntersectionElement_in_bottomup470);
					exitIntersectionElement();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 32:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:344:4: exitNamedConstraint
				{
					pushFollow(FOLLOW_exitNamedConstraint_in_bottomup475);
					exitNamedConstraint();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 33:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:345:4: exitSelectionType
				{
					pushFollow(FOLLOW_exitSelectionType_in_bottomup480);
					exitSelectionType();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 34:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:346:4: exitEnumeration
				{
					pushFollow(FOLLOW_exitEnumeration_in_bottomup485);
					exitEnumeration();

					state._fsp--;
					if (state.failed) return;

				}
				break;
				case 35:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:347:4: exitTypeReference
				{
					pushFollow(FOLLOW_exitTypeReference_in_bottomup490);
					exitTypeReference();

					state._fsp--;
					if (state.failed) return;

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "bottomup"


	// $ANTLR start "enterModule"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:349:1: enterModule : ^( MODULE ( . )* ) ;
	public final void enterModule() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:349:13: ( ^( MODULE ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:350:2: ^( MODULE ( . )* )
			{
				match(input, MODULE, FOLLOW_MODULE_in_enterModule502);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:350:12: ( . )*
					loop3:
					do {
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if (((LA3_0 >= ALL && LA3_0 <= 161))) {
							alt3 = 1;
						} else if ((LA3_0 == UP)) {
							alt3 = 2;
						}


						switch (alt3) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:350:12: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop3;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openModule();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterModule"


	// $ANTLR start "enterModuleId"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:353:1: enterModuleId : ^( MODULE_IDENTIFIER ID ( . )* ) ;
	public final void enterModuleId() throws RecognitionException {
		CommonTree ID1 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:353:15: ( ^( MODULE_IDENTIFIER ID ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:354:2: ^( MODULE_IDENTIFIER ID ( . )* )
			{
				match(input, MODULE_IDENTIFIER, FOLLOW_MODULE_IDENTIFIER_in_enterModuleId520);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID1 = (CommonTree) match(input, ID, FOLLOW_ID_in_enterModuleId522);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:354:25: ( . )*
				loop4:
				do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if (((LA4_0 >= ALL && LA4_0 <= 161))) {
						alt4 = 1;
					} else if ((LA4_0 == UP)) {
						alt4 = 2;
					}


					switch (alt4) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:354:25: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop4;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {openModuleId((ID1 != null ? ID1.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterModuleId"


	// $ANTLR start "enterVec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:357:1: enterVec : ^( VEC ( . )* ) ;
	public final void enterVec() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:357:10: ( ^( VEC ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:358:2: ^( VEC ( . )* )
			{
				match(input, VEC, FOLLOW_VEC_in_enterVec542);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:358:8: ( . )*
					loop5:
					do {
						int alt5 = 2;
						int LA5_0 = input.LA(1);

						if (((LA5_0 >= ALL && LA5_0 <= 161))) {
							alt5 = 1;
						} else if ((LA5_0 == UP)) {
							alt5 = 2;
						}


						switch (alt5) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:358:8: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop5;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openVector();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterVec"


	// $ANTLR start "enterExports"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:361:1: enterExports : ^( EXPORTS ( ( ALL )=> ALL )? ( . )* ) ;
	public final void enterExports() throws RecognitionException {
		CommonTree ALL2 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:361:14: ( ^( EXPORTS ( ( ALL )=> ALL )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:2: ^( EXPORTS ( ( ALL )=> ALL )? ( . )* )
			{
				match(input, EXPORTS, FOLLOW_EXPORTS_in_enterExports560);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:12: ( ( ALL )=> ALL )?
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == ALL)) {
						int LA6_1 = input.LA(2);

						if ((synpred1_ASN1TreeWalker())) {
							alt6 = 1;
						}
					}
					switch (alt6) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:13: ( ALL )=> ALL
						{
							ALL2 = (CommonTree) match(input, ALL, FOLLOW_ALL_in_enterExports567);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:26: ( . )*
					loop7:
					do {
						int alt7 = 2;
						int LA7_0 = input.LA(1);

						if (((LA7_0 >= ALL && LA7_0 <= 161))) {
							alt7 = 1;
						} else if ((LA7_0 == UP)) {
							alt7 = 2;
						}


						switch (alt7) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:26: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop7;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openExports(ALL2 != null);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterExports"


	// $ANTLR start "enterImports"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:365:1: enterImports : IMPORTS ;
	public final void enterImports() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:365:14: ( IMPORTS )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:366:2: IMPORTS
			{
				match(input, IMPORTS, FOLLOW_IMPORTS_in_enterImports587);
				if (state.failed) return;

				if (state.backtracking == 1) {openImports();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterImports"


	// $ANTLR start "enterSymbolsFromModule"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:369:1: enterSymbolsFromModule : ^( SYMBOLS_FROM_MODULE ( . )* ) ;
	public final void enterSymbolsFromModule() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:369:23: ( ^( SYMBOLS_FROM_MODULE ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:370:2: ^( SYMBOLS_FROM_MODULE ( . )* )
			{
				match(input, SYMBOLS_FROM_MODULE, FOLLOW_SYMBOLS_FROM_MODULE_in_enterSymbolsFromModule600);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:370:24: ( . )*
					loop8:
					do {
						int alt8 = 2;
						int LA8_0 = input.LA(1);

						if (((LA8_0 >= ALL && LA8_0 <= 161))) {
							alt8 = 1;
						} else if ((LA8_0 == UP)) {
							alt8 = 2;
						}


						switch (alt8) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:370:24: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop8;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openSymbolsFromModule();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterSymbolsFromModule"


	// $ANTLR start "enterValueAssignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:373:1: enterValueAssignment : ^( VALUE_ASSIGNMENT ID ( . )* ) ;
	public final void enterValueAssignment() throws RecognitionException {
		CommonTree ID3 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:373:21: ( ^( VALUE_ASSIGNMENT ID ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:374:2: ^( VALUE_ASSIGNMENT ID ( . )* )
			{
				match(input, VALUE_ASSIGNMENT, FOLLOW_VALUE_ASSIGNMENT_in_enterValueAssignment617);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID3 = (CommonTree) match(input, ID, FOLLOW_ID_in_enterValueAssignment619);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:374:24: ( . )*
				loop9:
				do {
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if (((LA9_0 >= ALL && LA9_0 <= 161))) {
						alt9 = 1;
					} else if ((LA9_0 == UP)) {
						alt9 = 2;
					}


					switch (alt9) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:374:24: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop9;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {openValueAssignment((ID3 != null ? ID3.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterValueAssignment"


	// $ANTLR start "enterTypeAssignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:377:1: enterTypeAssignment : ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? ( . )* ) ;
	public final void enterTypeAssignment() throws RecognitionException {
		CommonTree CLASS_DEF4 = null;
		CommonTree ID5 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:377:20: ( ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:378:2: ^( TYPE_ASSIGNMENT ID ( CLASS_DEF )? ( . )* )
			{
				match(input, TYPE_ASSIGNMENT, FOLLOW_TYPE_ASSIGNMENT_in_enterTypeAssignment636);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID5 = (CommonTree) match(input, ID, FOLLOW_ID_in_enterTypeAssignment638);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:378:23: ( CLASS_DEF )?
				int alt10 = 2;
				int LA10_0 = input.LA(1);

				if ((LA10_0 == CLASS_DEF)) {
					alt10 = 1;
				}
				switch (alt10) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:378:23: CLASS_DEF
					{
						CLASS_DEF4 = (CommonTree) match(input, CLASS_DEF, FOLLOW_CLASS_DEF_in_enterTypeAssignment640);
						if (state.failed) return;

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:378:34: ( . )*
				loop11:
				do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if (((LA11_0 >= ALL && LA11_0 <= 161))) {
						alt11 = 1;
					} else if ((LA11_0 == UP)) {
						alt11 = 2;
					}


					switch (alt11) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:378:34: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop11;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {
					String classDef = (CLASS_DEF4 != null) ? (CLASS_DEF4 != null ? CLASS_DEF4.getText() : null) : "";
					Class clazz = java.util.ArrayList.class;
					if (classDef.length() > 2) {
						Class tc = null;
						try {
							tc = Class.forName(classDef.substring(classDef.indexOf('#') + 1, classDef.lastIndexOf('#')));
						} catch (ClassNotFoundException e) {
							//FIX ME: do report somehow?;
						}
						if (!tc.isInterface()) {
							clazz = tc;
						}
					}
					openTypeAssignment((ID5 != null ? ID5.getText() : null), clazz);
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterTypeAssignment"


	// $ANTLR start "enterType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:396:1: enterType : ^( TYPE ( . )* ) ;
	public final void enterType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:396:11: ( ^( TYPE ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:397:2: ^( TYPE ( . )* )
			{
				match(input, TYPE, FOLLOW_TYPE_in_enterType659);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:397:9: ( . )*
					loop12:
					do {
						int alt12 = 2;
						int LA12_0 = input.LA(1);

						if (((LA12_0 >= ALL && LA12_0 <= 161))) {
							alt12 = 1;
						} else if ((LA12_0 == UP)) {
							alt12 = 2;
						}


						switch (alt12) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:397:9: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop12;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterType"


	// $ANTLR start "enterValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:400:1: enterValue : VALUE ;
	public final void enterValue() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:400:12: ( VALUE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:401:2: VALUE
			{
				match(input, VALUE, FOLLOW_VALUE_in_enterValue676);
				if (state.failed) return;

				if (state.backtracking == 1) {openValue();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterValue"


	// $ANTLR start "enterTaggedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:404:1: enterTaggedType : ^( TAGGED_TYPE tn= tagNumber ( ( tagClassPvt )=>tc= tagClassPvt )? ( ( taggingMethodPvt )=>tm= taggingMethodPvt )? ( . )* ) ;
	public final void enterTaggedType() throws RecognitionException {
		int tn = 0;

		TagClass tc = null;

		TaggingMethod tm = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:404:17: ( ^( TAGGED_TYPE tn= tagNumber ( ( tagClassPvt )=>tc= tagClassPvt )? ( ( taggingMethodPvt )=>tm= taggingMethodPvt )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:2: ^( TAGGED_TYPE tn= tagNumber ( ( tagClassPvt )=>tc= tagClassPvt )? ( ( taggingMethodPvt )=>tm= taggingMethodPvt )? ( . )* )
			{
				match(input, TAGGED_TYPE, FOLLOW_TAGGED_TYPE_in_enterTaggedType690);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				pushFollow(FOLLOW_tagNumber_in_enterTaggedType694);
				tn = tagNumber();

				state._fsp--;
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:29: ( ( tagClassPvt )=>tc= tagClassPvt )?
				int alt13 = 2;
				switch (input.LA(1)) {
					case 148: {
						int LA13_1 = input.LA(2);

						if ((synpred2_ASN1TreeWalker())) {
							alt13 = 1;
						}
					}
					break;
					case 93: {
						int LA13_2 = input.LA(2);

						if ((synpred2_ASN1TreeWalker())) {
							alt13 = 1;
						}
					}
					break;
					case 136: {
						int LA13_3 = input.LA(2);

						if ((synpred2_ASN1TreeWalker())) {
							alt13 = 1;
						}
					}
					break;
				}

				switch (alt13) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:30: ( tagClassPvt )=>tc= tagClassPvt
					{
						pushFollow(FOLLOW_tagClassPvt_in_enterTaggedType703);
						tc = tagClassPvt();

						state._fsp--;
						if (state.failed) return;

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:62: ( ( taggingMethodPvt )=>tm= taggingMethodPvt )?
				int alt14 = 2;
				switch (input.LA(1)) {
					case 108: {
						int LA14_1 = input.LA(2);

						if ((synpred3_ASN1TreeWalker())) {
							alt14 = 1;
						}
					}
					break;
					case 117: {
						int LA14_2 = input.LA(2);

						if ((synpred3_ASN1TreeWalker())) {
							alt14 = 1;
						}
					}
					break;
					case 94: {
						int LA14_3 = input.LA(2);

						if ((synpred3_ASN1TreeWalker())) {
							alt14 = 1;
						}
					}
					break;
				}

				switch (alt14) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:63: ( taggingMethodPvt )=>tm= taggingMethodPvt
					{
						pushFollow(FOLLOW_taggingMethodPvt_in_enterTaggedType714);
						tm = taggingMethodPvt();

						state._fsp--;
						if (state.failed) return;

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:106: ( . )*
				loop15:
				do {
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if (((LA15_0 >= ALL && LA15_0 <= 161))) {
						alt15 = 1;
					} else if ((LA15_0 == UP)) {
						alt15 = 2;
					}


					switch (alt15) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:106: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop15;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {openTaggedType(tn, tc, tm);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterTaggedType"


	// $ANTLR start "enterSequenceOf"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:408:1: enterSequenceOf : SEQUENCEOF ;
	public final void enterSequenceOf() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:408:17: ( SEQUENCEOF )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:409:2: SEQUENCEOF
			{
				match(input, SEQUENCEOF, FOLLOW_SEQUENCEOF_in_enterSequenceOf734);
				if (state.failed) return;

				if (state.backtracking == 1) {openSequenceOf();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterSequenceOf"


	// $ANTLR start "enterSequence"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:412:1: enterSequence : SEQUENCE ;
	public final void enterSequence() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:412:15: ( SEQUENCE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:413:2: SEQUENCE
			{
				match(input, SEQUENCE, FOLLOW_SEQUENCE_in_enterSequence747);
				if (state.failed) return;

				if (state.backtracking == 1) {openSequence();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterSequence"


	// $ANTLR start "enterSetOf"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:416:1: enterSetOf : SETOF ;
	public final void enterSetOf() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:416:12: ( SETOF )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:417:2: SETOF
			{
				match(input, SETOF, FOLLOW_SETOF_in_enterSetOf760);
				if (state.failed) return;

				if (state.backtracking == 1) {openSetOf();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterSetOf"


	// $ANTLR start "enterSet"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:420:1: enterSet : SET ;
	public final void enterSet() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:420:10: ( SET )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:421:2: SET
			{
				match(input, SET, FOLLOW_SET_in_enterSet773);
				if (state.failed) return;

				if (state.backtracking == 1) {openSet();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterSet"


	// $ANTLR start "enterChoice"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:424:1: enterChoice : CHOICE ;
	public final void enterChoice() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:424:13: ( CHOICE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:425:2: CHOICE
			{
				match(input, CHOICE, FOLLOW_CHOICE_in_enterChoice786);
				if (state.failed) return;

				if (state.backtracking == 1) {openChoice();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterChoice"


	// $ANTLR start "enterExceptionSpec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:428:1: enterExceptionSpec : ^( EXCEPTION_SPEC ( INT )? ) ;
	public final void enterExceptionSpec() throws RecognitionException {
		CommonTree INT6 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:428:20: ( ^( EXCEPTION_SPEC ( INT )? ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:429:2: ^( EXCEPTION_SPEC ( INT )? )
			{
				match(input, EXCEPTION_SPEC, FOLLOW_EXCEPTION_SPEC_in_enterExceptionSpec800);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:429:19: ( INT )?
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if ((LA16_0 == INT)) {
						alt16 = 1;
					}
					switch (alt16) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:429:19: INT
						{
							INT6 = (CommonTree) match(input, INT, FOLLOW_INT_in_enterExceptionSpec802);
							if (state.failed) return;

						}
						break;

					}


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {
					if (INT6 != null) { openExceptionSpec((INT6 != null ? Integer.valueOf(INT6.getText()) : 0)); } else openExceptionSpec();
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterExceptionSpec"


	// $ANTLR start "enterComponentType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:432:1: enterComponentType : COMPONENT_TYPE ;
	public final void enterComponentType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:432:19: ( COMPONENT_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:433:2: COMPONENT_TYPE
			{
				match(input, COMPONENT_TYPE, FOLLOW_COMPONENT_TYPE_in_enterComponentType821);
				if (state.failed) return;

				if (state.backtracking == 1) {openComponentType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterComponentType"


	// $ANTLR start "enterComponentTypeOption"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:436:1: enterComponentTypeOption : COMPONENT_TYPE_OPTION ;
	public final void enterComponentTypeOption() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:436:25: ( COMPONENT_TYPE_OPTION )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:437:2: COMPONENT_TYPE_OPTION
			{
				match(input, COMPONENT_TYPE_OPTION, FOLLOW_COMPONENT_TYPE_OPTION_in_enterComponentTypeOption834);
				if (state.failed) return;

				if (state.backtracking == 1) {openComponentTypeOption();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterComponentTypeOption"


	// $ANTLR start "enterExtensionAdditionGroup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:440:1: enterExtensionAdditionGroup : ^( EXTENSION_ADDITION_GROUP ( ( INT )=> INT )? ( . )* ) ;
	public final void enterExtensionAdditionGroup() throws RecognitionException {
		CommonTree INT7 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:440:28: ( ^( EXTENSION_ADDITION_GROUP ( ( INT )=> INT )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:2: ^( EXTENSION_ADDITION_GROUP ( ( INT )=> INT )? ( . )* )
			{
				match(input, EXTENSION_ADDITION_GROUP, FOLLOW_EXTENSION_ADDITION_GROUP_in_enterExtensionAdditionGroup848);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:29: ( ( INT )=> INT )?
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == INT)) {
						int LA17_1 = input.LA(2);

						if ((synpred4_ASN1TreeWalker())) {
							alt17 = 1;
						}
					}
					switch (alt17) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:30: ( INT )=> INT
						{
							INT7 = (CommonTree) match(input, INT, FOLLOW_INT_in_enterExtensionAdditionGroup855);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:43: ( . )*
					loop18:
					do {
						int alt18 = 2;
						int LA18_0 = input.LA(1);

						if (((LA18_0 >= ALL && LA18_0 <= 161))) {
							alt18 = 1;
						} else if ((LA18_0 == UP)) {
							alt18 = 2;
						}


						switch (alt18) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:43: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop18;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openExtensionAdditionGroup(INT7 != null ? (INT7 != null ? Integer.valueOf(INT7.getText()) : 0) : -1);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterExtensionAdditionGroup"


	// $ANTLR start "enterExtensionAdditionAlternativesGroup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:444:1: enterExtensionAdditionAlternativesGroup : ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( ( INT )=> INT )? ( . )* ) ;
	public final void enterExtensionAdditionAlternativesGroup() throws RecognitionException {
		CommonTree INT8 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:444:40: ( ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( ( INT )=> INT )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:2: ^( EXTENSION_ADDITION_ALTERNATIVES_GROUP ( ( INT )=> INT )? ( . )* )
			{
				match(
				     input,
				     EXTENSION_ADDITION_ALTERNATIVES_GROUP,
				     FOLLOW_EXTENSION_ADDITION_ALTERNATIVES_GROUP_in_enterExtensionAdditionAlternativesGroup875
				     );
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:42: ( ( INT )=> INT )?
					int alt19 = 2;
					int LA19_0 = input.LA(1);

					if ((LA19_0 == INT)) {
						int LA19_1 = input.LA(2);

						if ((synpred5_ASN1TreeWalker())) {
							alt19 = 1;
						}
					}
					switch (alt19) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:43: ( INT )=> INT
						{
							INT8 = (CommonTree) match(input, INT, FOLLOW_INT_in_enterExtensionAdditionAlternativesGroup882);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:56: ( . )*
					loop20:
					do {
						int alt20 = 2;
						int LA20_0 = input.LA(1);

						if (((LA20_0 >= ALL && LA20_0 <= 161))) {
							alt20 = 1;
						} else if ((LA20_0 == UP)) {
							alt20 = 2;
						}


						switch (alt20) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:56: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop20;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {
					openExtensionAdditionAlternativesGroup(
					                                      INT8 != null ? (INT8 != null ? Integer.valueOf(INT8.getText()) : 0) : -1
					                                      );
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterExtensionAdditionAlternativesGroup"


	// $ANTLR start "enterNamedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:448:1: enterNamedType : ^( NAMED_TYPE ID ( . )* ) ;
	public final void enterNamedType() throws RecognitionException {
		CommonTree ID9 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:448:17: ( ^( NAMED_TYPE ID ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:449:2: ^( NAMED_TYPE ID ( . )* )
			{
				match(input, NAMED_TYPE, FOLLOW_NAMED_TYPE_in_enterNamedType904);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID9 = (CommonTree) match(input, ID, FOLLOW_ID_in_enterNamedType906);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:449:18: ( . )*
				loop21:
				do {
					int alt21 = 2;
					int LA21_0 = input.LA(1);

					if (((LA21_0 >= ALL && LA21_0 <= 161))) {
						alt21 = 1;
					} else if ((LA21_0 == UP)) {
						alt21 = 2;
					}


					switch (alt21) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:449:18: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop21;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {openNamedType((ID9 != null ? ID9.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterNamedType"


	// $ANTLR start "enterConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:452:1: enterConstraint : ^( CONSTRAINT ( . )* ) ;
	public final void enterConstraint() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:452:18: ( ^( CONSTRAINT ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:453:2: ^( CONSTRAINT ( . )* )
			{
				match(input, CONSTRAINT, FOLLOW_CONSTRAINT_in_enterConstraint927);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:453:15: ( . )*
					loop22:
					do {
						int alt22 = 2;
						int LA22_0 = input.LA(1);

						if (((LA22_0 >= ALL && LA22_0 <= 161))) {
							alt22 = 1;
						} else if ((LA22_0 == UP)) {
							alt22 = 2;
						}


						switch (alt22) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:453:15: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop22;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterConstraint"


	// $ANTLR start "enterConstraintValueRange"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:456:1: enterConstraintValueRange : ^( CONSTRAINT_VALUE_RANGE ( . )* ) ;
	public final void enterConstraintValueRange() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:456:26: ( ^( CONSTRAINT_VALUE_RANGE ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:457:2: ^( CONSTRAINT_VALUE_RANGE ( . )* )
			{
				match(input, CONSTRAINT_VALUE_RANGE, FOLLOW_CONSTRAINT_VALUE_RANGE_in_enterConstraintValueRange944);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:457:27: ( . )*
					loop23:
					do {
						int alt23 = 2;
						int LA23_0 = input.LA(1);

						if (((LA23_0 >= ALL && LA23_0 <= 161))) {
							alt23 = 1;
						} else if ((LA23_0 == UP)) {
							alt23 = 2;
						}


						switch (alt23) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:457:27: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop23;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openConstraintValueRange();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterConstraintValueRange"


	// $ANTLR start "enterConstraintValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:460:1: enterConstraintValue : ^( CONSTRAINT_VALUE ( . )* ) ;
	public final void enterConstraintValue() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:460:21: ( ^( CONSTRAINT_VALUE ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:461:2: ^( CONSTRAINT_VALUE ( . )* )
			{
				match(input, CONSTRAINT_VALUE, FOLLOW_CONSTRAINT_VALUE_in_enterConstraintValue961);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:461:21: ( . )*
					loop24:
					do {
						int alt24 = 2;
						int LA24_0 = input.LA(1);

						if (((LA24_0 >= ALL && LA24_0 <= 161))) {
							alt24 = 1;
						} else if ((LA24_0 == UP)) {
							alt24 = 2;
						}


						switch (alt24) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:461:21: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop24;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openConstraintValue();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterConstraintValue"


	// $ANTLR start "enterConstraintSize"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:464:1: enterConstraintSize : ^( CONSTRAINT_SIZE ( . )* ) ;
	public final void enterConstraintSize() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:464:21: ( ^( CONSTRAINT_SIZE ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:465:2: ^( CONSTRAINT_SIZE ( . )* )
			{
				match(input, CONSTRAINT_SIZE, FOLLOW_CONSTRAINT_SIZE_in_enterConstraintSize979);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:465:20: ( . )*
					loop25:
					do {
						int alt25 = 2;
						int LA25_0 = input.LA(1);

						if (((LA25_0 >= ALL && LA25_0 <= 161))) {
							alt25 = 1;
						} else if ((LA25_0 == UP)) {
							alt25 = 2;
						}


						switch (alt25) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:465:20: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop25;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openSizeConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterConstraintSize"


	// $ANTLR start "enterConstraintType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:468:1: enterConstraintType : ^( CONSTRAINT_TYPE (a= 'INCLUDES' )? ( . )* ) ;
	public final void enterConstraintType() throws RecognitionException {
		CommonTree a = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:468:21: ( ^( CONSTRAINT_TYPE (a= 'INCLUDES' )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:469:2: ^( CONSTRAINT_TYPE (a= 'INCLUDES' )? ( . )* )
			{
				match(input, CONSTRAINT_TYPE, FOLLOW_CONSTRAINT_TYPE_in_enterConstraintType998);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:469:21: (a= 'INCLUDES' )?
					int alt26 = 2;
					int LA26_0 = input.LA(1);

					if ((LA26_0 == 120)) {
						alt26 = 1;
					}
					switch (alt26) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:469:21: a= 'INCLUDES'
						{
							a = (CommonTree) match(input, 120, FOLLOW_120_in_enterConstraintType1002);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:469:34: ( . )*
					loop27:
					do {
						int alt27 = 2;
						int LA27_0 = input.LA(1);

						if (((LA27_0 >= ALL && LA27_0 <= 161))) {
							alt27 = 1;
						} else if ((LA27_0 == UP)) {
							alt27 = 2;
						}


						switch (alt27) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:469:34: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop27;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openTypeConstraint(a != null);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterConstraintType"


	// $ANTLR start "enterConstraintInnerType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:472:1: enterConstraintInnerType : ^( CONSTRAINT_INNER_TYPE (a= '...' )? ( . )* ) ;
	public final void enterConstraintInnerType() throws RecognitionException {
		CommonTree a = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:472:25: ( ^( CONSTRAINT_INNER_TYPE (a= '...' )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:473:2: ^( CONSTRAINT_INNER_TYPE (a= '...' )? ( . )* )
			{
				match(input, CONSTRAINT_INNER_TYPE, FOLLOW_CONSTRAINT_INNER_TYPE_in_enterConstraintInnerType1021);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:473:27: (a= '...' )?
					int alt28 = 2;
					int LA28_0 = input.LA(1);

					if ((LA28_0 == 86)) {
						alt28 = 1;
					}
					switch (alt28) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:473:27: a= '...'
						{
							a = (CommonTree) match(input, 86, FOLLOW_86_in_enterConstraintInnerType1025);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:473:35: ( . )*
					loop29:
					do {
						int alt29 = 2;
						int LA29_0 = input.LA(1);

						if (((LA29_0 >= ALL && LA29_0 <= 161))) {
							alt29 = 1;
						} else if ((LA29_0 == UP)) {
							alt29 = 2;
						}


						switch (alt29) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:473:35: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop29;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openInnerTypeConstraint(a == null);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterConstraintInnerType"


	// $ANTLR start "enterEndpoint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:476:1: enterEndpoint : ^( ENDPOINT (lessSignR= lessSign )? ( ( 'MIN' )=>min= 'MIN' | ( 'MAX' )=>max= 'MAX' )? ( . )* ) ;
	public final void enterEndpoint() throws RecognitionException {
		CommonTree min = null;
		CommonTree max = null;
		boolean lessSignR = false;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:476:16: ( ^( ENDPOINT (lessSignR= lessSign )? ( ( 'MIN' )=>min= 'MIN' | ( 'MAX' )=>max= 'MAX' )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:2: ^( ENDPOINT (lessSignR= lessSign )? ( ( 'MIN' )=>min= 'MIN' | ( 'MAX' )=>max= 'MAX' )? ( . )* )
			{
				match(input, ENDPOINT, FOLLOW_ENDPOINT_in_enterEndpoint1045);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:13: (lessSignR= lessSign )?
					int alt30 = 2;
					int LA30_0 = input.LA(1);

					if ((LA30_0 == 90)) {
						alt30 = 1;
					}
					switch (alt30) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:14: lessSignR= lessSign
						{
							pushFollow(FOLLOW_lessSign_in_enterEndpoint1050);
							lessSignR = lessSign();

							state._fsp--;
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:35: ( ( 'MIN' )=>min= 'MIN' | ( 'MAX' )=>max= 'MAX' )?
					int alt31 = 3;
					int LA31_0 = input.LA(1);

					if ((LA31_0 == 125)) {
						int LA31_1 = input.LA(2);

						if ((synpred6_ASN1TreeWalker())) {
							alt31 = 1;
						}
					} else if ((LA31_0 == 124)) {
						int LA31_2 = input.LA(2);

						if ((synpred7_ASN1TreeWalker())) {
							alt31 = 2;
						}
					}
					switch (alt31) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:36: ( 'MIN' )=>min= 'MIN'
						{
							min = (CommonTree) match(input, 125, FOLLOW_125_in_enterEndpoint1061);
							if (state.failed) return;

						}
						break;
						case 2:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:57: ( 'MAX' )=>max= 'MAX'
						{
							max = (CommonTree) match(input, 124, FOLLOW_124_in_enterEndpoint1071);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:78: ( . )*
					loop32:
					do {
						int alt32 = 2;
						int LA32_0 = input.LA(1);

						if (((LA32_0 >= ALL && LA32_0 <= 161))) {
							alt32 = 1;
						} else if ((LA32_0 == UP)) {
							alt32 = 2;
						}


						switch (alt32) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:78: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop32;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openEndpoint(lessSignR, min != null, max != null);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterEndpoint"


	// $ANTLR start "enterUnion"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:480:1: enterUnion : ^( UNION (a= 'ALL' )? ( . )* ) ;
	public final void enterUnion() throws RecognitionException {
		CommonTree a = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:480:13: ( ^( UNION (a= 'ALL' )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:481:2: ^( UNION (a= 'ALL' )? ( . )* )
			{
				match(input, UNION, FOLLOW_UNION_in_enterUnion1092);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:481:11: (a= 'ALL' )?
					int alt33 = 2;
					int LA33_0 = input.LA(1);

					if ((LA33_0 == 92)) {
						alt33 = 1;
					}
					switch (alt33) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:481:11: a= 'ALL'
						{
							a = (CommonTree) match(input, 92, FOLLOW_92_in_enterUnion1096);
							if (state.failed) return;

						}
						break;

					}


					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:481:19: ( . )*
					loop34:
					do {
						int alt34 = 2;
						int LA34_0 = input.LA(1);

						if (((LA34_0 >= ALL && LA34_0 <= 161))) {
							alt34 = 1;
						} else if ((LA34_0 == UP)) {
							alt34 = 2;
						}


						switch (alt34) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:481:19: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop34;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openUnion(a != null);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterUnion"


	// $ANTLR start "enterIntersectionElement"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:484:1: enterIntersectionElement : ^( INTERSECTION_ELEMENT ( . )* ) ;
	public final void enterIntersectionElement() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:484:25: ( ^( INTERSECTION_ELEMENT ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:485:2: ^( INTERSECTION_ELEMENT ( . )* )
			{
				match(input, INTERSECTION_ELEMENT, FOLLOW_INTERSECTION_ELEMENT_in_enterIntersectionElement1115);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:485:25: ( . )*
					loop35:
					do {
						int alt35 = 2;
						int LA35_0 = input.LA(1);

						if (((LA35_0 >= ALL && LA35_0 <= 161))) {
							alt35 = 1;
						} else if ((LA35_0 == UP)) {
							alt35 = 2;
						}


						switch (alt35) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:485:25: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop35;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openIntersectionElement();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterIntersectionElement"


	// $ANTLR start "enterNamedConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:488:1: enterNamedConstraint : ^( NAMED_CONSTRAINT ID (pc= presenceConstraint )? ( . )* ) ;
	public final void enterNamedConstraint() throws RecognitionException {
		CommonTree ID10 = null;
		Presence pc = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:488:22: ( ^( NAMED_CONSTRAINT ID (pc= presenceConstraint )? ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:489:2: ^( NAMED_CONSTRAINT ID (pc= presenceConstraint )? ( . )* )
			{
				match(input, NAMED_CONSTRAINT, FOLLOW_NAMED_CONSTRAINT_in_enterNamedConstraint1134);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID10 = (CommonTree) match(input, ID, FOLLOW_ID_in_enterNamedConstraint1136);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:489:24: (pc= presenceConstraint )?
				int alt36 = 2;
				switch (input.LA(1)) {
					case 135: {
						alt36 = 1;
					}
					break;
					case 91: {
						alt36 = 1;
					}
					break;
					case 132: {
						alt36 = 1;
					}
					break;
				}

				switch (alt36) {
					case 1:
						// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:489:25: pc= presenceConstraint
					{
						pushFollow(FOLLOW_presenceConstraint_in_enterNamedConstraint1141);
						pc = presenceConstraint();

						state._fsp--;
						if (state.failed) return;

					}
					break;

				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:489:49: ( . )*
				loop37:
				do {
					int alt37 = 2;
					int LA37_0 = input.LA(1);

					if (((LA37_0 >= ALL && LA37_0 <= 161))) {
						alt37 = 1;
					} else if ((LA37_0 == UP)) {
						alt37 = 2;
					}


					switch (alt37) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:489:49: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop37;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {openNamedConstraint((ID10 != null ? ID10.getText() : null), pc);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterNamedConstraint"


	// $ANTLR start "enterSelectionType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:492:1: enterSelectionType : ^( SELECTION_TYPE ID ( . )* ) ;
	public final void enterSelectionType() throws RecognitionException {
		CommonTree ID11 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:492:20: ( ^( SELECTION_TYPE ID ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:493:2: ^( SELECTION_TYPE ID ( . )* )
			{
				match(input, SELECTION_TYPE, FOLLOW_SELECTION_TYPE_in_enterSelectionType1161);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID11 = (CommonTree) match(input, ID, FOLLOW_ID_in_enterSelectionType1163);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:493:22: ( . )*
				loop38:
				do {
					int alt38 = 2;
					int LA38_0 = input.LA(1);

					if (((LA38_0 >= ALL && LA38_0 <= 161))) {
						alt38 = 1;
					} else if ((LA38_0 == UP)) {
						alt38 = 2;
					}


					switch (alt38) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:493:22: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop38;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {openSelectionType((ID11 != null ? ID11.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterSelectionType"


	// $ANTLR start "enterEnumeration"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:496:1: enterEnumeration : ^( ENUMERATION ( . )* ) ;
	public final void enterEnumeration() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:496:18: ( ^( ENUMERATION ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:497:2: ^( ENUMERATION ( . )* )
			{
				match(input, ENUMERATION, FOLLOW_ENUMERATION_in_enterEnumeration1182);
				if (state.failed) return;

				if (input.LA(1) == Token.DOWN) {
					match(input, Token.DOWN, null);
					if (state.failed) return;
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:497:16: ( . )*
					loop39:
					do {
						int alt39 = 2;
						int LA39_0 = input.LA(1);

						if (((LA39_0 >= ALL && LA39_0 <= 161))) {
							alt39 = 1;
						} else if ((LA39_0 == UP)) {
							alt39 = 2;
						}


						switch (alt39) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:497:16: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop39;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;
				}


				if (state.backtracking == 1) {openEnumeration();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterEnumeration"


	// $ANTLR start "enterTypeReference"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:500:1: enterTypeReference : ^( TYPE_REFERENCE a= ID ( (b= ID )? ) ( . )* ) ;
	public final void enterTypeReference() throws RecognitionException {
		CommonTree a = null;
		CommonTree b = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:500:20: ( ^( TYPE_REFERENCE a= ID ( (b= ID )? ) ( . )* ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:2: ^( TYPE_REFERENCE a= ID ( (b= ID )? ) ( . )* )
			{
				match(input, TYPE_REFERENCE, FOLLOW_TYPE_REFERENCE_in_enterTypeReference1201);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				a = (CommonTree) match(input, ID, FOLLOW_ID_in_enterTypeReference1205);
				if (state.failed) return;

				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:24: ( (b= ID )? )
				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:25: (b= ID )?
				{
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:26: (b= ID )?
					int alt40 = 2;
					int LA40_0 = input.LA(1);

					if ((LA40_0 == ID)) {
						alt40 = 1;
					}
					switch (alt40) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:26: b= ID
						{
							b = (CommonTree) match(input, ID, FOLLOW_ID_in_enterTypeReference1210);
							if (state.failed) return;

						}
						break;

					}


				}


				// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:32: ( . )*
				loop41:
				do {
					int alt41 = 2;
					int LA41_0 = input.LA(1);

					if (((LA41_0 >= ALL && LA41_0 <= 161))) {
						alt41 = 1;
					} else if ((LA41_0 == UP)) {
						alt41 = 2;
					}


					switch (alt41) {
						case 1:
							// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:501:32: .
						{
							matchAny(input);
							if (state.failed) return;

						}
						break;

						default:
							break loop41;
					}
				} while (true);


				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {
					openTypeReference(
					                 (a != null ? a.getText() : null),
					                 (b != null) ? (b != null ? b.getText() : null) : null
					                 );
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enterTypeReference"


	// $ANTLR start "exitModule"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:506:1: exitModule : MODULE ;
	public final void exitModule() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:506:12: ( MODULE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:507:2: MODULE
			{
				match(input, MODULE, FOLLOW_MODULE_in_exitModule1232);
				if (state.failed) return;

				if (state.backtracking == 1) {closeModule();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitModule"


	// $ANTLR start "exitModuleId"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:510:1: exitModuleId : MODULE_IDENTIFIER ;
	public final void exitModuleId() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:510:14: ( MODULE_IDENTIFIER )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:511:2: MODULE_IDENTIFIER
			{
				match(input, MODULE_IDENTIFIER, FOLLOW_MODULE_IDENTIFIER_in_exitModuleId1244);
				if (state.failed) return;

				if (state.backtracking == 1) {closeModuleId();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitModuleId"


	// $ANTLR start "exitVec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:514:1: exitVec : VEC ;
	public final void exitVec() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:514:10: ( VEC )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:515:2: VEC
			{
				match(input, VEC, FOLLOW_VEC_in_exitVec1259);
				if (state.failed) return;

				if (state.backtracking == 1) {closeVector();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitVec"


	// $ANTLR start "exitExports"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:518:1: exitExports : EXPORTS ;
	public final void exitExports() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:518:13: ( EXPORTS )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:519:2: EXPORTS
			{
				match(input, EXPORTS, FOLLOW_EXPORTS_in_exitExports1272);
				if (state.failed) return;

				if (state.backtracking == 1) {closeExports();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitExports"


	// $ANTLR start "exitImports"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:522:1: exitImports : IMPORTS ;
	public final void exitImports() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:522:13: ( IMPORTS )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:523:2: IMPORTS
			{
				match(input, IMPORTS, FOLLOW_IMPORTS_in_exitImports1286);
				if (state.failed) return;

				if (state.backtracking == 1) {closeImports();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitImports"


	// $ANTLR start "exitSymbolsFromModule"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:527:1: exitSymbolsFromModule : SYMBOLS_FROM_MODULE ;
	public final void exitSymbolsFromModule() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:527:22: ( SYMBOLS_FROM_MODULE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:528:2: SYMBOLS_FROM_MODULE
			{
				match(input, SYMBOLS_FROM_MODULE, FOLLOW_SYMBOLS_FROM_MODULE_in_exitSymbolsFromModule1299);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSymbolsFromModule();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitSymbolsFromModule"


	// $ANTLR start "exitValueAssignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:531:1: exitValueAssignment : VALUE_ASSIGNMENT ;
	public final void exitValueAssignment() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:531:20: ( VALUE_ASSIGNMENT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:532:2: VALUE_ASSIGNMENT
			{
				match(input, VALUE_ASSIGNMENT, FOLLOW_VALUE_ASSIGNMENT_in_exitValueAssignment1311);
				if (state.failed) return;

				if (state.backtracking == 1) {closeValueAssignment();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitValueAssignment"


	// $ANTLR start "exitTypeAssignment"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:535:1: exitTypeAssignment : TYPE_ASSIGNMENT ;
	public final void exitTypeAssignment() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:535:19: ( TYPE_ASSIGNMENT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:536:2: TYPE_ASSIGNMENT
			{
				match(input, TYPE_ASSIGNMENT, FOLLOW_TYPE_ASSIGNMENT_in_exitTypeAssignment1323);
				if (state.failed) return;

				if (state.backtracking == 1) {closeTypeAssignment();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitTypeAssignment"


	// $ANTLR start "exitType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:539:1: exitType : TYPE ;
	public final void exitType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:539:10: ( TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:540:2: TYPE
			{
				match(input, TYPE, FOLLOW_TYPE_in_exitType1336);
				if (state.failed) return;

				if (state.backtracking == 1) {closeType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitType"


	// $ANTLR start "exitValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:543:1: exitValue : VALUE ;
	public final void exitValue() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:543:11: ( VALUE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:544:2: VALUE
			{
				match(input, VALUE, FOLLOW_VALUE_in_exitValue1349);
				if (state.failed) return;

				if (state.backtracking == 1) {closeValue();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitValue"


	// $ANTLR start "exitTaggedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:547:1: exitTaggedType : TAGGED_TYPE ;
	public final void exitTaggedType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:547:16: ( TAGGED_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:548:2: TAGGED_TYPE
			{
				match(input, TAGGED_TYPE, FOLLOW_TAGGED_TYPE_in_exitTaggedType1362);
				if (state.failed) return;

				if (state.backtracking == 1) {closeTaggedType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitTaggedType"


	// $ANTLR start "exitSequenceOf"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:551:1: exitSequenceOf : SEQUENCEOF ;
	public final void exitSequenceOf() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:551:16: ( SEQUENCEOF )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:552:2: SEQUENCEOF
			{
				match(input, SEQUENCEOF, FOLLOW_SEQUENCEOF_in_exitSequenceOf1375);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSequenceOf();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitSequenceOf"


	// $ANTLR start "exitSequence"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:555:1: exitSequence : SEQUENCE ;
	public final void exitSequence() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:555:14: ( SEQUENCE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:556:2: SEQUENCE
			{
				match(input, SEQUENCE, FOLLOW_SEQUENCE_in_exitSequence1388);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSequence();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitSequence"


	// $ANTLR start "exitSetOf"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:559:1: exitSetOf : SETOF ;
	public final void exitSetOf() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:559:11: ( SETOF )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:560:2: SETOF
			{
				match(input, SETOF, FOLLOW_SETOF_in_exitSetOf1401);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSetOf();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitSetOf"


	// $ANTLR start "exitSet"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:563:1: exitSet : SET ;
	public final void exitSet() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:563:9: ( SET )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:564:2: SET
			{
				match(input, SET, FOLLOW_SET_in_exitSet1414);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSet();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitSet"


	// $ANTLR start "exitChoice"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:567:1: exitChoice : CHOICE ;
	public final void exitChoice() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:567:12: ( CHOICE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:568:2: CHOICE
			{
				match(input, CHOICE, FOLLOW_CHOICE_in_exitChoice1427);
				if (state.failed) return;

				if (state.backtracking == 1) {closeChoice();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitChoice"


	// $ANTLR start "exitExceptionSpec"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:571:1: exitExceptionSpec : EXCEPTION_SPEC ;
	public final void exitExceptionSpec() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:571:18: ( EXCEPTION_SPEC )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:572:2: EXCEPTION_SPEC
			{
				match(input, EXCEPTION_SPEC, FOLLOW_EXCEPTION_SPEC_in_exitExceptionSpec1439);
				if (state.failed) return;

				if (state.backtracking == 1) {closeExceptionSpec();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitExceptionSpec"


	// $ANTLR start "exitComponentType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:575:1: exitComponentType : COMPONENT_TYPE ;
	public final void exitComponentType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:575:18: ( COMPONENT_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:576:2: COMPONENT_TYPE
			{
				match(input, COMPONENT_TYPE, FOLLOW_COMPONENT_TYPE_in_exitComponentType1451);
				if (state.failed) return;

				if (state.backtracking == 1) {closeComponentType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitComponentType"


	// $ANTLR start "exitComponentTypeOption"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:579:1: exitComponentTypeOption : COMPONENT_TYPE_OPTION ;
	public final void exitComponentTypeOption() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:579:24: ( COMPONENT_TYPE_OPTION )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:580:2: COMPONENT_TYPE_OPTION
			{
				match(input, COMPONENT_TYPE_OPTION, FOLLOW_COMPONENT_TYPE_OPTION_in_exitComponentTypeOption1463);
				if (state.failed) return;

				if (state.backtracking == 1) {closeComponentTypeOption();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitComponentTypeOption"


	// $ANTLR start "exitExtensionAdditionGroup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:583:1: exitExtensionAdditionGroup : EXTENSION_ADDITION_GROUP ;
	public final void exitExtensionAdditionGroup() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:583:27: ( EXTENSION_ADDITION_GROUP )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:584:2: EXTENSION_ADDITION_GROUP
			{
				match(input, EXTENSION_ADDITION_GROUP, FOLLOW_EXTENSION_ADDITION_GROUP_in_exitExtensionAdditionGroup1475);
				if (state.failed) return;

				if (state.backtracking == 1) {closeExtensionAdditionGroup();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitExtensionAdditionGroup"


	// $ANTLR start "exitExtensionAdditionAlternativesGroup"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:587:1: exitExtensionAdditionAlternativesGroup : EXTENSION_ADDITION_ALTERNATIVES_GROUP ;
	public final void exitExtensionAdditionAlternativesGroup() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:587:39: ( EXTENSION_ADDITION_ALTERNATIVES_GROUP )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:588:2: EXTENSION_ADDITION_ALTERNATIVES_GROUP
			{
				match(
				     input,
				     EXTENSION_ADDITION_ALTERNATIVES_GROUP,
				     FOLLOW_EXTENSION_ADDITION_ALTERNATIVES_GROUP_in_exitExtensionAdditionAlternativesGroup1487
				     );
				if (state.failed) return;

				if (state.backtracking == 1) {closeExtensionAdditionAlternativesGroup();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitExtensionAdditionAlternativesGroup"


	// $ANTLR start "exitNamedType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:591:1: exitNamedType : NAMED_TYPE ;
	public final void exitNamedType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:591:16: ( NAMED_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:592:2: NAMED_TYPE
			{
				match(input, NAMED_TYPE, FOLLOW_NAMED_TYPE_in_exitNamedType1501);
				if (state.failed) return;

				if (state.backtracking == 1) {closeNamedType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitNamedType"


	// $ANTLR start "exitConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:595:1: exitConstraint : CONSTRAINT ;
	public final void exitConstraint() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:595:17: ( CONSTRAINT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:596:2: CONSTRAINT
			{
				match(input, CONSTRAINT, FOLLOW_CONSTRAINT_in_exitConstraint1515);
				if (state.failed) return;

				if (state.backtracking == 1) {closeConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitConstraint"


	// $ANTLR start "exitConstraintValueRange"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:599:1: exitConstraintValueRange : CONSTRAINT_VALUE_RANGE ;
	public final void exitConstraintValueRange() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:599:25: ( CONSTRAINT_VALUE_RANGE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:600:2: CONSTRAINT_VALUE_RANGE
			{
				match(input, CONSTRAINT_VALUE_RANGE, FOLLOW_CONSTRAINT_VALUE_RANGE_in_exitConstraintValueRange1527);
				if (state.failed) return;

				if (state.backtracking == 1) {closeConstraintValueRange();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitConstraintValueRange"


	// $ANTLR start "exitConstraintValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:603:1: exitConstraintValue : CONSTRAINT_VALUE ;
	public final void exitConstraintValue() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:603:20: ( CONSTRAINT_VALUE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:604:2: CONSTRAINT_VALUE
			{
				match(input, CONSTRAINT_VALUE, FOLLOW_CONSTRAINT_VALUE_in_exitConstraintValue1539);
				if (state.failed) return;

				if (state.backtracking == 1) {closeConstraintValue();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitConstraintValue"


	// $ANTLR start "exitConstraintSize"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:607:1: exitConstraintSize : CONSTRAINT_SIZE ;
	public final void exitConstraintSize() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:607:20: ( CONSTRAINT_SIZE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:608:2: CONSTRAINT_SIZE
			{
				match(input, CONSTRAINT_SIZE, FOLLOW_CONSTRAINT_SIZE_in_exitConstraintSize1552);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSizeConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitConstraintSize"


	// $ANTLR start "exitConstraintType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:611:1: exitConstraintType : CONSTRAINT_TYPE ;
	public final void exitConstraintType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:611:20: ( CONSTRAINT_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:612:2: CONSTRAINT_TYPE
			{
				match(input, CONSTRAINT_TYPE, FOLLOW_CONSTRAINT_TYPE_in_exitConstraintType1565);
				if (state.failed) return;

				if (state.backtracking == 1) {closeTypeConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitConstraintType"


	// $ANTLR start "exitConstraintInnerType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:615:1: exitConstraintInnerType : CONSTRAINT_INNER_TYPE ;
	public final void exitConstraintInnerType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:615:25: ( CONSTRAINT_INNER_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:616:2: CONSTRAINT_INNER_TYPE
			{
				match(input, CONSTRAINT_INNER_TYPE, FOLLOW_CONSTRAINT_INNER_TYPE_in_exitConstraintInnerType1578);
				if (state.failed) return;

				if (state.backtracking == 1) {closeInnerTypeConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitConstraintInnerType"


	// $ANTLR start "exitEndpoint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:619:1: exitEndpoint : ENDPOINT ;
	public final void exitEndpoint() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:619:15: ( ENDPOINT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:620:2: ENDPOINT
			{
				match(input, ENDPOINT, FOLLOW_ENDPOINT_in_exitEndpoint1592);
				if (state.failed) return;

				if (state.backtracking == 1) {closeEndpoint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitEndpoint"


	// $ANTLR start "exitUnion"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:623:1: exitUnion : UNION ;
	public final void exitUnion() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:623:12: ( UNION )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:624:2: UNION
			{
				match(input, UNION, FOLLOW_UNION_in_exitUnion1606);
				if (state.failed) return;

				if (state.backtracking == 1) {closeUnion();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitUnion"


	// $ANTLR start "exitIntersectionElement"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:627:1: exitIntersectionElement : INTERSECTION_ELEMENT ;
	public final void exitIntersectionElement() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:627:25: ( INTERSECTION_ELEMENT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:628:2: INTERSECTION_ELEMENT
			{
				match(input, INTERSECTION_ELEMENT, FOLLOW_INTERSECTION_ELEMENT_in_exitIntersectionElement1619);
				if (state.failed) return;

				if (state.backtracking == 1) {closeIntersectionElement();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitIntersectionElement"


	// $ANTLR start "exitNamedConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:631:1: exitNamedConstraint : NAMED_CONSTRAINT ;
	public final void exitNamedConstraint() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:631:21: ( NAMED_CONSTRAINT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:632:2: NAMED_CONSTRAINT
			{
				match(input, NAMED_CONSTRAINT, FOLLOW_NAMED_CONSTRAINT_in_exitNamedConstraint1632);
				if (state.failed) return;

				if (state.backtracking == 1) {closeNamedConstraint();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitNamedConstraint"


	// $ANTLR start "exitSelectionType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:635:1: exitSelectionType : SELECTION_TYPE ;
	public final void exitSelectionType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:635:19: ( SELECTION_TYPE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:636:2: SELECTION_TYPE
			{
				match(input, SELECTION_TYPE, FOLLOW_SELECTION_TYPE_in_exitSelectionType1645);
				if (state.failed) return;

				if (state.backtracking == 1) {closeSelectionType();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitSelectionType"


	// $ANTLR start "exitEnumeration"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:639:1: exitEnumeration : ENUMERATION ;
	public final void exitEnumeration() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:639:18: ( ENUMERATION )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:640:2: ENUMERATION
			{
				match(input, ENUMERATION, FOLLOW_ENUMERATION_in_exitEnumeration1659);
				if (state.failed) return;

				if (state.backtracking == 1) {closeEnumeration();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitEnumeration"


	// $ANTLR start "exitTypeReference"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:643:1: exitTypeReference : TYPE_REFERENCE ;
	public final void exitTypeReference() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:643:19: ( TYPE_REFERENCE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:644:2: TYPE_REFERENCE
			{
				match(input, TYPE_REFERENCE, FOLLOW_TYPE_REFERENCE_in_exitTypeReference1672);
				if (state.failed) return;

				if (state.backtracking == 1) {closeTypeReference();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "exitTypeReference"


	// $ANTLR start "nameForm"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:649:1: nameForm : ^( NAME_FORM ID ) ;
	public final void nameForm() throws RecognitionException {
		CommonTree ID12 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:649:10: ( ^( NAME_FORM ID ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:650:2: ^( NAME_FORM ID )
			{
				match(input, NAME_FORM, FOLLOW_NAME_FORM_in_nameForm1687);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID12 = (CommonTree) match(input, ID, FOLLOW_ID_in_nameForm1689);
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {nameForm((ID12 != null ? ID12.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "nameForm"


	// $ANTLR start "nameNumberForm"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:653:1: nameNumberForm : ^( NAME_NUMBER_FORM ID INT ) ;
	public final void nameNumberForm() throws RecognitionException {
		CommonTree ID13 = null;
		CommonTree INT14 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:653:16: ( ^( NAME_NUMBER_FORM ID INT ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:654:2: ^( NAME_NUMBER_FORM ID INT )
			{
				match(input, NAME_NUMBER_FORM, FOLLOW_NAME_NUMBER_FORM_in_nameNumberForm1704);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID13 = (CommonTree) match(input, ID, FOLLOW_ID_in_nameNumberForm1706);
				if (state.failed) return;

				INT14 = (CommonTree) match(input, INT, FOLLOW_INT_in_nameNumberForm1708);
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {
					nameNumberForm(
					              (ID13 != null ? ID13.getText() : null),
					              (INT14 != null ? Integer.valueOf(INT14.getText()) : 0)
					              );
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "nameNumberForm"


	// $ANTLR start "numberForm"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:657:1: numberForm : ^( NUMBER_FORM INT ) ;
	public final void numberForm() throws RecognitionException {
		CommonTree INT15 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:657:12: ( ^( NUMBER_FORM INT ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:658:2: ^( NUMBER_FORM INT )
			{
				match(input, NUMBER_FORM, FOLLOW_NUMBER_FORM_in_numberForm1724);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				INT15 = (CommonTree) match(input, INT, FOLLOW_INT_in_numberForm1726);
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {numberForm((INT15 != null ? Integer.valueOf(INT15.getText()) : 0));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "numberForm"


	// $ANTLR start "symbol"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:661:1: symbol : ^( SYMBOL ID ) ;
	public final void symbol() throws RecognitionException {
		CommonTree ID16 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:661:9: ( ^( SYMBOL ID ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:662:2: ^( SYMBOL ID )
			{
				match(input, SYMBOL, FOLLOW_SYMBOL_in_symbol1742);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID16 = (CommonTree) match(input, ID, FOLLOW_ID_in_symbol1744);
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {symbol((ID16 != null ? ID16.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "symbol"


	// $ANTLR start "globalModuleReference"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:665:1: globalModuleReference : ^( GLOBAL_MODULE_REFERENCE ID ) ;
	public final void globalModuleReference() throws RecognitionException {
		CommonTree ID17 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:665:22: ( ^( GLOBAL_MODULE_REFERENCE ID ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:666:2: ^( GLOBAL_MODULE_REFERENCE ID )
			{
				match(input, GLOBAL_MODULE_REFERENCE, FOLLOW_GLOBAL_MODULE_REFERENCE_in_globalModuleReference1758);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID17 = (CommonTree) match(input, ID, FOLLOW_ID_in_globalModuleReference1760);
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {globalModuleReference((ID17 != null ? ID17.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "globalModuleReference"


	// $ANTLR start "integerType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:669:1: integerType : INTEGER ;
	public final void integerType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:669:13: ( INTEGER )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:670:2: INTEGER
			{
				match(input, INTEGER, FOLLOW_INTEGER_in_integerType1774);
				if (state.failed) return;

				if (state.backtracking == 1) {typeInteger();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "integerType"


	// $ANTLR start "booleanType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:673:1: booleanType : BOOLEAN ;
	public final void booleanType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:673:13: ( BOOLEAN )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:674:2: BOOLEAN
			{
				match(input, BOOLEAN, FOLLOW_BOOLEAN_in_booleanType1788);
				if (state.failed) return;

				if (state.backtracking == 1) {typeBoolean();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "booleanType"


	// $ANTLR start "realType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:677:1: realType : REAL ;
	public final void realType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:677:10: ( REAL )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:678:2: REAL
			{
				match(input, REAL, FOLLOW_REAL_in_realType1802);
				if (state.failed) return;

				if (state.backtracking == 1) {typeReal();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "realType"


	// $ANTLR start "oidType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:681:1: oidType : OID ;
	public final void oidType() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:681:10: ( OID )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:682:2: OID
			{
				match(input, OID, FOLLOW_OID_in_oidType1817);
				if (state.failed) return;

				if (state.backtracking == 1) {typeOID();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "oidType"


	// $ANTLR start "cstringType"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:685:1: cstringType : ( ^( CSTRING UNRESTRICTED_CSTRING ( . )* ) | ^( CSTRING type= cstringSubtype ( . )* ) );
	public final void cstringType() throws RecognitionException {
		RestrictedCString type = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:685:13: ( ^( CSTRING UNRESTRICTED_CSTRING ( . )* ) | ^( CSTRING type= cstringSubtype ( . )* ) )
			int alt44 = 2;
			int LA44_0 = input.LA(1);

			if ((LA44_0 == CSTRING)) {
				int LA44_1 = input.LA(2);

				if ((LA44_1 == DOWN)) {
					int LA44_2 = input.LA(3);

					if ((LA44_2 == UNRESTRICTED_CSTRING)) {
						alt44 = 1;
					} else if ((LA44_2 == 97 || (LA44_2 >= 113 && LA44_2 <= 115) || LA44_2 == 123 || LA44_2 == 127 || LA44_2 == 137 || LA44_2 == 143
					            || LA44_2 == 146 || (LA44_2 >= 149 && LA44_2 <= 152))) {
						alt44 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return;
						}
						NoViableAltException nvae =
						new NoViableAltException("", 44, 2, input);

						throw nvae;

					}
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 44, 1, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 44, 0, input);

				throw nvae;

			}
			switch (alt44) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:686:2: ^( CSTRING UNRESTRICTED_CSTRING ( . )* )
				{
					match(input, CSTRING, FOLLOW_CSTRING_in_cstringType1831);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					match(input, UNRESTRICTED_CSTRING, FOLLOW_UNRESTRICTED_CSTRING_in_cstringType1833);
					if (state.failed) return;

					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:686:33: ( . )*
					loop42:
					do {
						int alt42 = 2;
						int LA42_0 = input.LA(1);

						if (((LA42_0 >= ALL && LA42_0 <= 161))) {
							alt42 = 1;
						} else if ((LA42_0 == UP)) {
							alt42 = 2;
						}


						switch (alt42) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:686:33: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop42;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {typeUnrestrictedCString();}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:688:4: ^( CSTRING type= cstringSubtype ( . )* )
				{
					match(input, CSTRING, FOLLOW_CSTRING_in_cstringType1846);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					pushFollow(FOLLOW_cstringSubtype_in_cstringType1850);
					type = cstringSubtype();

					state._fsp--;
					if (state.failed) return;

					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:688:34: ( . )*
					loop43:
					do {
						int alt43 = 2;
						int LA43_0 = input.LA(1);

						if (((LA43_0 >= ALL && LA43_0 <= 161))) {
							alt43 = 1;
						} else if ((LA43_0 == UP)) {
							alt43 = 2;
						}


						switch (alt43) {
							case 1:
								// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:688:34: .
							{
								matchAny(input);
								if (state.failed) return;

							}
							break;

							default:
								break loop43;
						}
					} while (true);


					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {typeCString(type);}

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "cstringType"


	// $ANTLR start "trueValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:691:1: trueValue : TRUE ;
	public final void trueValue() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:691:11: ( TRUE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:692:2: TRUE
			{
				match(input, TRUE, FOLLOW_TRUE_in_trueValue1867);
				if (state.failed) return;

				if (state.backtracking == 1) {putTrue();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "trueValue"


	// $ANTLR start "falseValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:695:1: falseValue : FALSE ;
	public final void falseValue() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:695:12: ( FALSE )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:696:2: FALSE
			{
				match(input, FALSE, FOLLOW_FALSE_in_falseValue1879);
				if (state.failed) return;

				if (state.backtracking == 1) {putFalse();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "falseValue"


	// $ANTLR start "numberValue"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:699:1: numberValue : ( ^( NUMBER ID ) | ^( NUMBER INT ) | ^( NUMBER REAL_NUMBER ) | ^( NUMBER PLUS_INFINITY ) | ^( NUMBER MINUS_INFINITY ) );
	public final void numberValue() throws RecognitionException {
		CommonTree INT18 = null;
		CommonTree REAL_NUMBER19 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:699:13: ( ^( NUMBER ID ) | ^( NUMBER INT ) | ^( NUMBER REAL_NUMBER ) | ^( NUMBER PLUS_INFINITY ) | ^( NUMBER MINUS_INFINITY ) )
			int alt45 = 5;
			int LA45_0 = input.LA(1);

			if ((LA45_0 == NUMBER)) {
				int LA45_1 = input.LA(2);

				if ((LA45_1 == DOWN)) {
					switch (input.LA(3)) {
						case ID: {
							alt45 = 1;
						}
						break;
						case INT: {
							alt45 = 2;
						}
						break;
						case REAL_NUMBER: {
							alt45 = 3;
						}
						break;
						case PLUS_INFINITY: {
							alt45 = 4;
						}
						break;
						case MINUS_INFINITY: {
							alt45 = 5;
						}
						break;
						default:
							if (state.backtracking > 0) {
								state.failed = true;
								return;
							}
							NoViableAltException nvae =
							new NoViableAltException("", 45, 2, input);

							throw nvae;

					}

				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 45, 1, input);

					throw nvae;

				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae =
				new NoViableAltException("", 45, 0, input);

				throw nvae;

			}
			switch (alt45) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:700:2: ^( NUMBER ID )
				{
					match(input, NUMBER, FOLLOW_NUMBER_in_numberValue1894);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					match(input, ID, FOLLOW_ID_in_numberValue1896);
					if (state.failed) return;

					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {System.out.println("Loooool.");}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:701:4: ^( NUMBER INT )
				{
					match(input, NUMBER, FOLLOW_NUMBER_in_numberValue1904);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					INT18 = (CommonTree) match(input, INT, FOLLOW_INT_in_numberValue1906);
					if (state.failed) return;

					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {number((INT18 != null ? Integer.valueOf(INT18.getText()) : 0));}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:702:4: ^( NUMBER REAL_NUMBER )
				{
					match(input, NUMBER, FOLLOW_NUMBER_in_numberValue1914);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					REAL_NUMBER19 = (CommonTree) match(input, REAL_NUMBER, FOLLOW_REAL_NUMBER_in_numberValue1916);
					if (state.failed) return;

					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {number(Double.parseDouble((REAL_NUMBER19 != null ? REAL_NUMBER19.getText() : null)));}

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:703:4: ^( NUMBER PLUS_INFINITY )
				{
					match(input, NUMBER, FOLLOW_NUMBER_in_numberValue1924);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					match(input, PLUS_INFINITY, FOLLOW_PLUS_INFINITY_in_numberValue1926);
					if (state.failed) return;

					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {number(Double.POSITIVE_INFINITY);}

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:704:4: ^( NUMBER MINUS_INFINITY )
				{
					match(input, NUMBER, FOLLOW_NUMBER_in_numberValue1934);
					if (state.failed) return;

					match(input, Token.DOWN, null);
					if (state.failed) return;
					match(input, MINUS_INFINITY, FOLLOW_MINUS_INFINITY_in_numberValue1936);
					if (state.failed) return;

					match(input, Token.UP, null);
					if (state.failed) return;


					if (state.backtracking == 1) {number(Double.NEGATIVE_INFINITY);}

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "numberValue"


	// $ANTLR start "presenceConstraint"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:706:1: presenceConstraint returns [Presence pr] : ( 'PRESENT' | 'ABSENT' | 'OPTIONAL' );
	public final Presence presenceConstraint() throws RecognitionException {
		Presence pr = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:706:41: ( 'PRESENT' | 'ABSENT' | 'OPTIONAL' )
			int alt46 = 3;
			switch (input.LA(1)) {
				case 135: {
					alt46 = 1;
				}
				break;
				case 91: {
					alt46 = 2;
				}
				break;
				case 132: {
					alt46 = 3;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return pr;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);

					throw nvae;

			}

			switch (alt46) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:707:2: 'PRESENT'
				{
					match(input, 135, FOLLOW_135_in_presenceConstraint1953);
					if (state.failed) return pr;

					if (state.backtracking == 1) {pr = Presence.PRESENT;}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:708:4: 'ABSENT'
				{
					match(input, 91, FOLLOW_91_in_presenceConstraint1960);
					if (state.failed) return pr;

					if (state.backtracking == 1) {pr = Presence.ABSENT;}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:709:4: 'OPTIONAL'
				{
					match(input, 132, FOLLOW_132_in_presenceConstraint1968);
					if (state.failed) return pr;

					if (state.backtracking == 1) {pr = Presence.OPTIONAL;}

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return pr;
	}
	// $ANTLR end "presenceConstraint"


	// $ANTLR start "tagClassPvt"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:711:1: tagClassPvt returns [TagClass tc] : ( 'UNIVERSAL' | 'APPLICATION' | 'PRIVATE' );
	public final TagClass tagClassPvt() throws RecognitionException {
		TagClass tc = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:711:34: ( 'UNIVERSAL' | 'APPLICATION' | 'PRIVATE' )
			int alt47 = 3;
			switch (input.LA(1)) {
				case 148: {
					alt47 = 1;
				}
				break;
				case 93: {
					alt47 = 2;
				}
				break;
				case 136: {
					alt47 = 3;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return tc;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);

					throw nvae;

			}

			switch (alt47) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:712:2: 'UNIVERSAL'
				{
					match(input, 148, FOLLOW_148_in_tagClassPvt1983);
					if (state.failed) return tc;

					if (state.backtracking == 1) {tc = TagClass.UNIVERSAL;}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:713:4: 'APPLICATION'
				{
					match(input, 93, FOLLOW_93_in_tagClassPvt1990);
					if (state.failed) return tc;

					if (state.backtracking == 1) {tc = TagClass.APPLICATION;}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:714:4: 'PRIVATE'
				{
					match(input, 136, FOLLOW_136_in_tagClassPvt1998);
					if (state.failed) return tc;

					if (state.backtracking == 1) {tc = TagClass.PRIVATE;}

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return tc;
	}
	// $ANTLR end "tagClassPvt"


	// $ANTLR start "tagNumber"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:716:1: tagNumber returns [int tagNumber] : INT ;
	public final int tagNumber() throws RecognitionException {
		int tagNumber = 0;


		CommonTree INT20 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:717:2: ( INT )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:717:4: INT
			{
				INT20 = (CommonTree) match(input, INT, FOLLOW_INT_in_tagNumber2014);
				if (state.failed) return tagNumber;

				if (state.backtracking == 1) {tagNumber = (INT20 != null ? Integer.valueOf(INT20.getText()) : 0);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return tagNumber;
	}
	// $ANTLR end "tagNumber"


	// $ANTLR start "defaultTaggingMethod"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:719:1: defaultTaggingMethod : ^( TAGGING_METHOD tm= taggingMethodPvt ) ;
	public final void defaultTaggingMethod() throws RecognitionException {
		TaggingMethod tm = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:720:2: ( ^( TAGGING_METHOD tm= taggingMethodPvt ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:721:2: ^( TAGGING_METHOD tm= taggingMethodPvt )
			{
				match(input, TAGGING_METHOD, FOLLOW_TAGGING_METHOD_in_defaultTaggingMethod2029);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				pushFollow(FOLLOW_taggingMethodPvt_in_defaultTaggingMethod2033);
				tm = taggingMethodPvt();

				state._fsp--;
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {taggingMethod(tm);}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "defaultTaggingMethod"


	// $ANTLR start "taggingMethodPvt"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:724:1: taggingMethodPvt returns [TaggingMethod tm] : ( 'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC' );
	public final TaggingMethod taggingMethodPvt() throws RecognitionException {
		TaggingMethod tm = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:724:44: ( 'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC' )
			int alt48 = 3;
			switch (input.LA(1)) {
				case 108: {
					alt48 = 1;
				}
				break;
				case 117: {
					alt48 = 2;
				}
				break;
				case 94: {
					alt48 = 3;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return tm;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);

					throw nvae;

			}

			switch (alt48) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:725:3: 'EXPLICIT'
				{
					match(input, 108, FOLLOW_108_in_taggingMethodPvt2053);
					if (state.failed) return tm;

					if (state.backtracking == 1) {tm = TaggingMethod.EXPLICIT;}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:726:5: 'IMPLICIT'
				{
					match(input, 117, FOLLOW_117_in_taggingMethodPvt2062);
					if (state.failed) return tm;

					if (state.backtracking == 1) {tm = TaggingMethod.IMPLICIT;}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:727:5: 'AUTOMATIC'
				{
					match(input, 94, FOLLOW_94_in_taggingMethodPvt2072);
					if (state.failed) return tm;

					if (state.backtracking == 1) {tm = TaggingMethod.AUTOMATIC;}

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return tm;
	}
	// $ANTLR end "taggingMethodPvt"


	// $ANTLR start "extensionEndMarkerPvt"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:729:1: extensionEndMarkerPvt : EXTENSION_END_MARKER ;
	public final void extensionEndMarkerPvt() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:729:23: ( EXTENSION_END_MARKER )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:730:3: EXTENSION_END_MARKER
			{
				match(input, EXTENSION_END_MARKER, FOLLOW_EXTENSION_END_MARKER_in_extensionEndMarkerPvt2087);
				if (state.failed) return;

				if (state.backtracking == 1) {extensionEndMarker();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "extensionEndMarkerPvt"


	// $ANTLR start "extensionAndExceptionPvt"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:733:1: extensionAndExceptionPvt : EXTENSION_AND_EXCEPTION ;
	public final void extensionAndExceptionPvt() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:733:25: ( EXTENSION_AND_EXCEPTION )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:734:3: EXTENSION_AND_EXCEPTION
			{
				match(input, EXTENSION_AND_EXCEPTION, FOLLOW_EXTENSION_AND_EXCEPTION_in_extensionAndExceptionPvt2103);
				if (state.failed) return;

				if (state.backtracking == 1) {extensionAndException();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "extensionAndExceptionPvt"


	// $ANTLR start "cstringSubtype"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:738:1: cstringSubtype returns [RestrictedCString type] : ( 'BMPString' | 'GeneralString' | 'GraphicString' | 'IA5String' | 'ISO646String' | 'NumericString' | 'PrintableString' | 'TeletexString' | 'T61String' | 'UniversalString' | 'UTF8String' | 'VideotexString' | 'VisibleString' );
	public final RestrictedCString cstringSubtype() throws RecognitionException {
		RestrictedCString type = null;


		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:738:48: ( 'BMPString' | 'GeneralString' | 'GraphicString' | 'IA5String' | 'ISO646String' | 'NumericString' | 'PrintableString' | 'TeletexString' | 'T61String' | 'UniversalString' | 'UTF8String' | 'VideotexString' | 'VisibleString' )
			int alt49 = 13;
			switch (input.LA(1)) {
				case 97: {
					alt49 = 1;
				}
				break;
				case 113: {
					alt49 = 2;
				}
				break;
				case 114: {
					alt49 = 3;
				}
				break;
				case 115: {
					alt49 = 4;
				}
				break;
				case 123: {
					alt49 = 5;
				}
				break;
				case 127: {
					alt49 = 6;
				}
				break;
				case 137: {
					alt49 = 7;
				}
				break;
				case 146: {
					alt49 = 8;
				}
				break;
				case 143: {
					alt49 = 9;
				}
				break;
				case 150: {
					alt49 = 10;
				}
				break;
				case 149: {
					alt49 = 11;
				}
				break;
				case 151: {
					alt49 = 12;
				}
				break;
				case 152: {
					alt49 = 13;
				}
				break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return type;
					}
					NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);

					throw nvae;

			}

			switch (alt49) {
				case 1:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:739:3: 'BMPString'
				{
					match(input, 97, FOLLOW_97_in_cstringSubtype2125);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.BMPString;}

				}
				break;
				case 2:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:740:4: 'GeneralString'
				{
					match(input, 113, FOLLOW_113_in_cstringSubtype2132);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.GeneralString;}

				}
				break;
				case 3:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:741:4: 'GraphicString'
				{
					match(input, 114, FOLLOW_114_in_cstringSubtype2139);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.GraphicString;}

				}
				break;
				case 4:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:742:4: 'IA5String'
				{
					match(input, 115, FOLLOW_115_in_cstringSubtype2146);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.IA5String;}

				}
				break;
				case 5:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:743:4: 'ISO646String'
				{
					match(input, 123, FOLLOW_123_in_cstringSubtype2153);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.ISO646String;}

				}
				break;
				case 6:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:744:4: 'NumericString'
				{
					match(input, 127, FOLLOW_127_in_cstringSubtype2160);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.NumericString;}

				}
				break;
				case 7:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:745:4: 'PrintableString'
				{
					match(input, 137, FOLLOW_137_in_cstringSubtype2167);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.PrintableString;}

				}
				break;
				case 8:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:746:4: 'TeletexString'
				{
					match(input, 146, FOLLOW_146_in_cstringSubtype2174);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.TeletexString;}

				}
				break;
				case 9:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:747:4: 'T61String'
				{
					match(input, 143, FOLLOW_143_in_cstringSubtype2181);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.T61String;}

				}
				break;
				case 10:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:748:4: 'UniversalString'
				{
					match(input, 150, FOLLOW_150_in_cstringSubtype2188);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.UniversalString;}

				}
				break;
				case 11:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:749:4: 'UTF8String'
				{
					match(input, 149, FOLLOW_149_in_cstringSubtype2195);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.UTF8String;}

				}
				break;
				case 12:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:750:4: 'VideotexString'
				{
					match(input, 151, FOLLOW_151_in_cstringSubtype2202);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.VideotexString;}

				}
				break;
				case 13:
					// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:751:4: 'VisibleString'
				{
					match(input, 152, FOLLOW_152_in_cstringSubtype2209);
					if (state.failed) return type;

					if (state.backtracking == 1) {type = RestrictedCString.VisibleString;}

				}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "cstringSubtype"


	// $ANTLR start "enumerationItemPvt"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:753:1: enumerationItemPvt : ^( ENUMERATION_ITEM ID ) ;
	public final void enumerationItemPvt() throws RecognitionException {
		CommonTree ID21 = null;

		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:753:21: ( ^( ENUMERATION_ITEM ID ) )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:754:2: ^( ENUMERATION_ITEM ID )
			{
				match(input, ENUMERATION_ITEM, FOLLOW_ENUMERATION_ITEM_in_enumerationItemPvt2225);
				if (state.failed) return;

				match(input, Token.DOWN, null);
				if (state.failed) return;
				ID21 = (CommonTree) match(input, ID, FOLLOW_ID_in_enumerationItemPvt2227);
				if (state.failed) return;

				match(input, Token.UP, null);
				if (state.failed) return;


				if (state.backtracking == 1) {enumerationItem((ID21 != null ? ID21.getText() : null));}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "enumerationItemPvt"


	// $ANTLR start "extensibilityImpliedPvt"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:757:1: extensibilityImpliedPvt : EXTENSIBILITY_IMPLIED ;
	public final void extensibilityImpliedPvt() throws RecognitionException {
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:757:26: ( EXTENSIBILITY_IMPLIED )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:758:2: EXTENSIBILITY_IMPLIED
			{
				match(input, EXTENSIBILITY_IMPLIED, FOLLOW_EXTENSIBILITY_IMPLIED_in_extensibilityImpliedPvt2244);
				if (state.failed) return;

				if (state.backtracking == 1) {extensibilityImplied();}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return;
	}
	// $ANTLR end "extensibilityImpliedPvt"


	// $ANTLR start "lessSign"
	// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:761:1: lessSign returns [boolean result] : '<' ;
	public final boolean lessSign() throws RecognitionException {
		boolean result = false;


		result = false;
		try {
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:762:24: ( '<' )
			// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:763:2: '<'
			{
				match(input, 90, FOLLOW_90_in_lessSign2267);
				if (state.failed) return result;

				if (state.backtracking == 1) {result = true;}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "lessSign"

	// $ANTLR start synpred1_ASN1TreeWalker
	public final void synpred1_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:13: ( ALL )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:362:14: ALL
		{
			match(input, ALL, FOLLOW_ALL_in_synpred1_ASN1TreeWalker564);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_ASN1TreeWalker

	// $ANTLR start synpred2_ASN1TreeWalker
	public final void synpred2_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:30: ( tagClassPvt )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:31: tagClassPvt
		{
			pushFollow(FOLLOW_tagClassPvt_in_synpred2_ASN1TreeWalker698);
			tagClassPvt();

			state._fsp--;
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_ASN1TreeWalker

	// $ANTLR start synpred3_ASN1TreeWalker
	public final void synpred3_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:63: ( taggingMethodPvt )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:405:64: taggingMethodPvt
		{
			pushFollow(FOLLOW_taggingMethodPvt_in_synpred3_ASN1TreeWalker709);
			taggingMethodPvt();

			state._fsp--;
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_ASN1TreeWalker

	// $ANTLR start synpred4_ASN1TreeWalker
	public final void synpred4_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:30: ( INT )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:441:31: INT
		{
			match(input, INT, FOLLOW_INT_in_synpred4_ASN1TreeWalker852);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_ASN1TreeWalker

	// $ANTLR start synpred5_ASN1TreeWalker
	public final void synpred5_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:43: ( INT )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:445:44: INT
		{
			match(input, INT, FOLLOW_INT_in_synpred5_ASN1TreeWalker879);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_ASN1TreeWalker

	// $ANTLR start synpred6_ASN1TreeWalker
	public final void synpred6_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:36: ( 'MIN' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:37: 'MIN'
		{
			match(input, 125, FOLLOW_125_in_synpred6_ASN1TreeWalker1056);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_ASN1TreeWalker

	// $ANTLR start synpred7_ASN1TreeWalker
	public final void synpred7_ASN1TreeWalker_fragment() throws RecognitionException {
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:57: ( 'MAX' )
		// /home/lastrix/Dev/Java/ASN1S/antlr/ASN1TreeWalker.g:477:58: 'MAX'
		{
			match(input, 124, FOLLOW_124_in_synpred7_ASN1TreeWalker1066);
			if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_ASN1TreeWalker

	// Delegated rules

	public final boolean synpred7_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred2_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred4_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred5_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred3_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred1_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred6_ASN1TreeWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_ASN1TreeWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}


	public static final BitSet FOLLOW_enterModule_in_topdown56                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterModuleId_in_topdown61                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterVec_in_topdown66                                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterExports_in_topdown71                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterImports_in_topdown76                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterSymbolsFromModule_in_topdown81                                                 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterValueAssignment_in_topdown86                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterTypeAssignment_in_topdown91                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterType_in_topdown96                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterValue_in_topdown101                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterTaggedType_in_topdown106                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterSequenceOf_in_topdown111                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterSequence_in_topdown116                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterSetOf_in_topdown121                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterSet_in_topdown126                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterChoice_in_topdown131                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterExceptionSpec_in_topdown136                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterComponentType_in_topdown141                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterComponentTypeOption_in_topdown146                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterExtensionAdditionGroup_in_topdown151                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterExtensionAdditionAlternativesGroup_in_topdown156                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterNamedType_in_topdown161                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterConstraint_in_topdown166                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterConstraintValueRange_in_topdown171                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterConstraintValue_in_topdown176                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterConstraintSize_in_topdown181                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterConstraintType_in_topdown186                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterConstraintInnerType_in_topdown191                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterEndpoint_in_topdown196                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterUnion_in_topdown201                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterIntersectionElement_in_topdown206                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterNamedConstraint_in_topdown211                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterSelectionType_in_topdown216                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterEnumeration_in_topdown221                                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enterTypeReference_in_topdown226                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_nameForm_in_topdown231                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_nameNumberForm_in_topdown236                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_numberForm_in_topdown241                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_symbol_in_topdown246                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_globalModuleReference_in_topdown251                                                 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_trueValue_in_topdown256                                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_falseValue_in_topdown261                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_numberValue_in_topdown266                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_defaultTaggingMethod_in_topdown271                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_extensionEndMarkerPvt_in_topdown276                                                 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_integerType_in_topdown281                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_booleanType_in_topdown286                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_realType_in_topdown291                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_oidType_in_topdown296                                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_cstringType_in_topdown301                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_enumerationItemPvt_in_topdown306                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_extensibilityImpliedPvt_in_topdown311                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitModule_in_bottomup320                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitModuleId_in_bottomup325                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitVec_in_bottomup330                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitExports_in_bottomup335                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitImports_in_bottomup340                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitSymbolsFromModule_in_bottomup345                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitValueAssignment_in_bottomup350                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitTypeAssignment_in_bottomup355                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitType_in_bottomup360                                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitValue_in_bottomup365                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitTaggedType_in_bottomup370                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitSequenceOf_in_bottomup375                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitSequence_in_bottomup380                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitSetOf_in_bottomup385                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitSet_in_bottomup390                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitChoice_in_bottomup395                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitExceptionSpec_in_bottomup400                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitComponentType_in_bottomup405                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitComponentTypeOption_in_bottomup410                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitExtensionAdditionGroup_in_bottomup415                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitExtensionAdditionAlternativesGroup_in_bottomup420                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitNamedType_in_bottomup425                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitConstraint_in_bottomup430                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitConstraintValueRange_in_bottomup435                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitConstraintValue_in_bottomup440                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitConstraintSize_in_bottomup445                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitConstraintType_in_bottomup450                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitConstraintInnerType_in_bottomup455                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitEndpoint_in_bottomup460                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitUnion_in_bottomup465                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitIntersectionElement_in_bottomup470                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitNamedConstraint_in_bottomup475                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitSelectionType_in_bottomup480                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitEnumeration_in_bottomup485                                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_exitTypeReference_in_bottomup490                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_MODULE_in_enterModule502                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_MODULE_IDENTIFIER_in_enterModuleId520                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterModuleId522                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_VEC_in_enterVec542                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXPORTS_in_enterExports560                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ALL_in_enterExports567                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_IMPORTS_in_enterImports587                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SYMBOLS_FROM_MODULE_in_enterSymbolsFromModule600                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_VALUE_ASSIGNMENT_in_enterValueAssignment617                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterValueAssignment619                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TYPE_ASSIGNMENT_in_enterTypeAssignment636                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterTypeAssignment638                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CLASS_DEF_in_enterTypeAssignment640                                                 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TYPE_in_enterType659                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_VALUE_in_enterValue676                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TAGGED_TYPE_in_enterTaggedType690                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_tagNumber_in_enterTaggedType694                                                     = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_tagClassPvt_in_enterTaggedType703                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_taggingMethodPvt_in_enterTaggedType714                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SEQUENCEOF_in_enterSequenceOf734                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SEQUENCE_in_enterSequence747                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SETOF_in_enterSetOf760                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SET_in_enterSet773                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CHOICE_in_enterChoice786                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXCEPTION_SPEC_in_enterExceptionSpec800                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_enterExceptionSpec802                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_COMPONENT_TYPE_in_enterComponentType821                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_COMPONENT_TYPE_OPTION_in_enterComponentTypeOption834                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSION_ADDITION_GROUP_in_enterExtensionAdditionGroup848                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_enterExtensionAdditionGroup855                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSION_ADDITION_ALTERNATIVES_GROUP_in_enterExtensionAdditionAlternativesGroup875 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_enterExtensionAdditionAlternativesGroup882                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NAMED_TYPE_in_enterNamedType904                                                     = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterNamedType906                                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_in_enterConstraint927                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_VALUE_RANGE_in_enterConstraintValueRange944                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_VALUE_in_enterConstraintValue961                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_SIZE_in_enterConstraintSize979                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_TYPE_in_enterConstraintType998                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_120_in_enterConstraintType1002                                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_INNER_TYPE_in_enterConstraintInnerType1021                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_86_in_enterConstraintInnerType1025                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ENDPOINT_in_enterEndpoint1045                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_lessSign_in_enterEndpoint1050                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_125_in_enterEndpoint1061                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_124_in_enterEndpoint1071                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_UNION_in_enterUnion1092                                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_92_in_enterUnion1096                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INTERSECTION_ELEMENT_in_enterIntersectionElement1115                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NAMED_CONSTRAINT_in_enterNamedConstraint1134                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterNamedConstraint1136                                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_presenceConstraint_in_enterNamedConstraint1141                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SELECTION_TYPE_in_enterSelectionType1161                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterSelectionType1163                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ENUMERATION_in_enterEnumeration1182                                                 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TYPE_REFERENCE_in_enterTypeReference1201                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterTypeReference1205                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enterTypeReference1210                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_MODULE_in_exitModule1232                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_MODULE_IDENTIFIER_in_exitModuleId1244                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_VEC_in_exitVec1259                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXPORTS_in_exitExports1272                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_IMPORTS_in_exitImports1286                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SYMBOLS_FROM_MODULE_in_exitSymbolsFromModule1299                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_VALUE_ASSIGNMENT_in_exitValueAssignment1311                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TYPE_ASSIGNMENT_in_exitTypeAssignment1323                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TYPE_in_exitType1336                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_VALUE_in_exitValue1349                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TAGGED_TYPE_in_exitTaggedType1362                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SEQUENCEOF_in_exitSequenceOf1375                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SEQUENCE_in_exitSequence1388                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SETOF_in_exitSetOf1401                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SET_in_exitSet1414                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CHOICE_in_exitChoice1427                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXCEPTION_SPEC_in_exitExceptionSpec1439                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_COMPONENT_TYPE_in_exitComponentType1451                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_COMPONENT_TYPE_OPTION_in_exitComponentTypeOption1463                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSION_ADDITION_GROUP_in_exitExtensionAdditionGroup1475                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSION_ADDITION_ALTERNATIVES_GROUP_in_exitExtensionAdditionAlternativesGroup1487 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NAMED_TYPE_in_exitNamedType1501                                                     = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_in_exitConstraint1515                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_VALUE_RANGE_in_exitConstraintValueRange1527                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_VALUE_in_exitConstraintValue1539                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_SIZE_in_exitConstraintSize1552                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_TYPE_in_exitConstraintType1565                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CONSTRAINT_INNER_TYPE_in_exitConstraintInnerType1578                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ENDPOINT_in_exitEndpoint1592                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_UNION_in_exitUnion1606                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INTERSECTION_ELEMENT_in_exitIntersectionElement1619                                 = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NAMED_CONSTRAINT_in_exitNamedConstraint1632                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SELECTION_TYPE_in_exitSelectionType1645                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ENUMERATION_in_exitEnumeration1659                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TYPE_REFERENCE_in_exitTypeReference1672                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NAME_FORM_in_nameForm1687                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_nameForm1689                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NAME_NUMBER_FORM_in_nameNumberForm1704                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_nameNumberForm1706                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000004000000000L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_nameNumberForm1708                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NUMBER_FORM_in_numberForm1724                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_numberForm1726                                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_SYMBOL_in_symbol1742                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_symbol1744                                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_GLOBAL_MODULE_REFERENCE_in_globalModuleReference1758                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_globalModuleReference1760                                                     = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INTEGER_in_integerType1774                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_BOOLEAN_in_booleanType1788                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_REAL_in_realType1802                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_OID_in_oidType1817                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CSTRING_in_cstringType1831                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_UNRESTRICTED_CSTRING_in_cstringType1833                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_CSTRING_in_cstringType1846                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_cstringSubtype_in_cstringType1850                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0xFFFFFFFFFFFFFFF8L,
	                                                                                                                                            0xFFFFFFFFFFFFFFFFL,
	                                                                                                                                            0x00000003FFFFFFFFL
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TRUE_in_trueValue1867                                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_FALSE_in_falseValue1879                                                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NUMBER_in_numberValue1894                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_numberValue1896                                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NUMBER_in_numberValue1904                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_numberValue1906                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NUMBER_in_numberValue1914                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_REAL_NUMBER_in_numberValue1916                                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NUMBER_in_numberValue1924                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_PLUS_INFINITY_in_numberValue1926                                                    = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_NUMBER_in_numberValue1934                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_MINUS_INFINITY_in_numberValue1936                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_135_in_presenceConstraint1953                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_91_in_presenceConstraint1960                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_132_in_presenceConstraint1968                                                       = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_148_in_tagClassPvt1983                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_93_in_tagClassPvt1990                                                               = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_136_in_tagClassPvt1998                                                              = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_tagNumber2014                                                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_TAGGING_METHOD_in_defaultTaggingMethod2029                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_taggingMethodPvt_in_defaultTaggingMethod2033                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_108_in_taggingMethodPvt2053                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_117_in_taggingMethodPvt2062                                                         = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_94_in_taggingMethodPvt2072                                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSION_END_MARKER_in_extensionEndMarkerPvt2087                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSION_AND_EXCEPTION_in_extensionAndExceptionPvt2103                             = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_97_in_cstringSubtype2125                                                            = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_113_in_cstringSubtype2132                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_114_in_cstringSubtype2139                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_115_in_cstringSubtype2146                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_123_in_cstringSubtype2153                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_127_in_cstringSubtype2160                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_137_in_cstringSubtype2167                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_146_in_cstringSubtype2174                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_143_in_cstringSubtype2181                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_150_in_cstringSubtype2188                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_149_in_cstringSubtype2195                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_151_in_cstringSubtype2202                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_152_in_cstringSubtype2209                                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ENUMERATION_ITEM_in_enumerationItemPvt2225                                          = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000004L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ID_in_enumerationItemPvt2227                                                        = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000008L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_EXTENSIBILITY_IMPLIED_in_extensibilityImpliedPvt2244                                = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_90_in_lessSign2267                                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_ALL_in_synpred1_ASN1TreeWalker564                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_tagClassPvt_in_synpred2_ASN1TreeWalker698                                           = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_taggingMethodPvt_in_synpred3_ASN1TreeWalker709                                      = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_synpred4_ASN1TreeWalker852                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_INT_in_synpred5_ASN1TreeWalker879                                                   = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_125_in_synpred6_ASN1TreeWalker1056                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);
	public static final BitSet FOLLOW_124_in_synpred7_ASN1TreeWalker1066                                                  = new BitSet(
	                                                                                                                                  new long[]{
	                                                                                                                                            0x0000000000000002L
	                                                                                                                                  }
	);

}