tree grammar ASN1TreeWalker;
options {
  tokenVocab = ASN1;
  ASTLabelType = CommonTree;
  filter = true;
}

@header{
package org.lastrix.asn1s.schema.compiler;
}

@members {
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

public enum RestrictedCString{
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

protected void openModule(){System.out.println("Module opened. ");}

protected void closeModule(){System.out.println("Module closed.");}


protected void openModuleId(String id){System.out.println("Module id=" + id);}

protected void closeModuleId(){System.out.println("Exit moduleId.");}


protected void openVector(){System.out.println("Enter vector.");}

protected void closeVector(){System.out.println("Exit vector.");}


protected void openExports(boolean all){System.out.println("Open exports." + all);}

protected void closeExports(){System.out.println("Close exports.");}


protected void openImports(){System.out.println("Open imports.");}

protected void closeImports(){System.out.println("Close imports.");}


protected void openSymbolsFromModule(){System.out.println("Open symbolsFromModule.");};

protected void closeSymbolsFromModule(){System.out.println("Close symbolsFromModule.");};


protected void openValueAssignment(String valueName){System.out.println("Open ValueAssignment for " + valueName);}

protected void closeValueAssignment(){System.out.println("Close ValueAssignment.");}


protected void openTypeAssignment(String name){System.out.println("Open TypeAssignment for " + name);}

protected void closeTypeAssignment(){System.out.println("Close TypeAssignment.");}


protected void openType(){System.out.println("Open Type.");}

protected void closeType(){System.out.println("Close Type.");}


protected void openValue(){System.out.println("Open value.");}

protected void closeValue(){System.out.println("Close value.");}


protected void openTaggedType(int tagNumber, TagClass tc, TaggingMethod tm){System.out.println("Open taggedType " + tc + " " + tagNumber + " " + tm);}

protected void closeTaggedType(){System.out.println("Close taggedType .");}


protected void openSequenceOf(){System.out.println("Open sequenceOf.");}

protected void closeSequenceOf(){System.out.println("Close sequenceOf.");}


protected void openSequence(){System.out.println("Open sequence.");}

protected void closeSequence(){System.out.println("Close sequence.");}


protected void openSetOf(){System.out.println("Open setOf.");}

protected void closeSetOf(){System.out.println("Close setOf.");}


protected void openSet(){System.out.println("Open set.");}

protected void closeSet(){System.out.println("Close set.");}


protected void openChoice(){System.out.println("Open choice.");}

protected void closeChoice(){System.out.println("Close choice.");}


protected void openExceptionSpec(int num){System.out.println("Open exception spec." + num);}

protected void openExceptionSpec(){System.out.println("Open exception spec.");}

protected void closeExceptionSpec(){System.out.println("Close exception spec.");}


protected void openComponentType(){System.out.println("Open componentType.");}

protected void closeComponentType(){System.out.println("Close componentType.");}


protected void openComponentTypeOption(){System.out.println("Open componentType option.");}

protected void closeComponentTypeOption(){System.out.println("Close componentType option.");}


protected void openExtensionAdditionGroup(int num){System.out.println("Open extensionAddition group " + num);}

protected void closeExtensionAdditionGroup(){System.out.println("Close extensionAddition group." );}

protected void openExtensionAdditionAlternativesGroup(int num){System.out.println("Open extensionAdditionAlternatives group " + num);}

protected void closeExtensionAdditionAlternativesGroup(){System.out.println("Close extensionAdditionAlternatives group." );}


protected void openNamedType(String name){System.out.println("Open namedType for " + name );}

protected void closeNamedType(){System.out.println("Close namedType." );}


protected void openConstraint(){System.out.println("Open constraint." );}

protected void closeConstraint(){System.out.println("Close constraint." );}


protected void openConstraintValueRange(){System.out.println("Open value range." );}

protected void closeConstraintValueRange(){System.out.println("Close value range." );}


protected void openEndpoint(boolean min, boolean max){System.out.println("Open endpoint." + min + " " + max );}

protected void closeEndpoint(){System.out.println("Close endpoint." );}


protected void openUnion(boolean except){System.out.println("Open union " + except );}

protected void closeUnion(){System.out.println("Close union." );}


protected void openIntersectionElement(){System.out.println("Open IntersectionElement." );}

protected void closeIntersectionElement(){System.out.println("Close IntersectionElement." );}


protected void openSizeConstraint(){System.out.println("Open SizeConstraint." );}

protected void closeSizeConstraint(){System.out.println("Close SizeConstraint." );}


protected void openTypeConstraint(boolean includes){System.out.println("Open TypeConstraint. " + includes );}

protected void closeTypeConstraint(){System.out.println("Close TypeConstraint." );}


protected void openInnerTypeConstraint(boolean dots){System.out.println("Open InnerTypeConstraint. " + dots );}

protected void closeInnerTypeConstraint(){System.out.println("Close InnerTypeConstraint." );}


protected void openNamedConstraint(String name, Presence presence){System.out.println("Open NamedConstraint. " + name + " " + presence );}

protected void closeNamedConstraint(){System.out.println("Close NamedConstraint." );}


protected void openSelectionType(String id){System.out.println("Open SelectionType. " + id );}

protected void closeSelectionType(){System.out.println("Close SelectionType." );}


protected void openEnumeration(){System.out.println("Open Enumeration." );}

protected void closeEnumeration(){System.out.println("Close Enumeration." );}
// MISC methods
protected void numberForm(int number){System.out.println("Number form " + number);}
protected void nameNumberForm(String name, int number){System.out.println("NameNumber form " + name + "(" + number + ")");}
protected void nameForm(String name){System.out.println("Name form " + name);}

protected void symbol(String name){System.out.println("Symbol " + name);}
protected void globalModuleReference(String name){System.out.println("GlobalModuleReference " + name);}

protected void typeInteger(){System.out.println("Type: integer.");}
protected void typeBoolean(){System.out.println("Type: boolean.");}
protected void typeReal(){System.out.println("Type: real.");}
protected void typeOID(){System.out.println("Type: OID.");}
protected void typeCString(RestrictedCString subtype){System.out.println("Type: " + subtype);}
protected void typeUnrestrictedCString(){System.out.println("Type: unrestricted CString.");}

protected void putTrue(){System.out.println("true");}
protected void putFalse(){System.out.println("true");}

protected void number(int value){System.out.println("int:" + value);}
protected void number(double value){System.out.println("double:" + value);}

protected void taggingMethod(TaggingMethod tm){System.out.println("TaggingMethod:" + tm);}

protected void extensionEndMarker(){System.out.println("Extension end marker.");};

protected void extensionAndException(){System.out.println("Extension and exception.");}

protected void enumerationItem(String text){System.out.println("Enumeration item " + text);};

protected void extensibilityImplied(){System.out.println("Extensibility implied.");}
}

topdown		:
	enterModule
	| enterModuleId
	| enterVec
	| enterExports
	| enterImports
	| enterSymbolsFromModule
	| enterValueAssignment
	| enterTypeAssignment
	| enterType
	| enterValue
	| enterTaggedType
	| enterSequenceOf
	| enterSequence
	| enterSetOf
	| enterSet
	| enterChoice
	| enterExceptionSpec
	| enterComponentType
	| enterComponentTypeOption
	| enterExtensionAdditionGroup
	| enterExtensionAdditionAlternativesGroup
	| enterNamedType
	| enterConstraint
	| enterConstraintValueRange
	| enterConstraintSize
	| enterConstraintType
	| enterConstraintInnerType
	| enterEndpoint
	| enterUnion
	| enterIntersectionElement
	| enterNamedConstraint
	| enterSelectionType
	| enterEnumeration
	| nameForm
	| nameNumberForm
	| numberForm
	| symbol
	| globalModuleReference
	| trueValue
	| falseValue
	| numberValue
	| defaultTaggingMethod
	| extensionEndMarkerPvt
	| integerType
	| booleanType
	| realType
	| oidType
	| cstringType
	| enumerationItemPvt
	| extensibilityImpliedPvt;

bottomup	:
	exitModule
	| exitModuleId
	| exitVec
	| exitExports
	| exitImports
	| exitSymbolsFromModule
	| exitValueAssignment
	| exitTypeAssignment
	| exitType
	| exitValue
	| exitTaggedType
	| exitSequenceOf
	| exitSequence
	| exitSetOf
	| exitSet
	| exitChoice
	| exitExceptionSpec
	| exitComponentType
	| exitComponentTypeOption
	| exitExtensionAdditionGroup
	| exitExtensionAdditionAlternativesGroup
	| exitNamedType
	| exitConstraint
	| exitConstraintValueRange
	| exitConstraintSize
	| exitConstraintType
	| exitConstraintInnerType
	| exitEndpoint
	| exitUnion
	| exitIntersectionElement
	| exitNamedConstraint
	| exitSelectionType
	| exitEnumeration;
	
enterModule	:
	^( MODULE .*)
	{openModule();};

enterModuleId	:	
	^(MODULE_IDENTIFIER ID .* )
	{openModuleId($ID.text);};
	
enterVec	:	
	^(VEC .*)
	{openVector();};

enterExports	:	
	^(EXPORTS ((ALL)=>ALL)? .*)
	{openExports($ALL!=null);};
	
enterImports	:	
	IMPORTS
	{openImports();};

enterSymbolsFromModule:	
	^(SYMBOLS_FROM_MODULE .*)
	{openSymbolsFromModule();};

enterValueAssignment:	
	^(VALUE_ASSIGNMENT ID .*)
	{openValueAssignment($ID.text);};

enterTypeAssignment:	
	^(TYPE_ASSIGNMENT ID .*)
	{openTypeAssignment($ID.text);};

enterType	:	
	^(TYPE .*)
	{openType();};

enterValue	:	
	VALUE
	{openValue();};

enterTaggedType	:	
	^(TAGGED_TYPE tn=tagNumber ((tagClassPvt)=>tc=tagClassPvt)? ((taggingMethodPvt)=>tm=taggingMethodPvt)?  .*)
	{openTaggedType(tn, tc, tm);};

enterSequenceOf	:	
	SEQUENCEOF
	{openSequenceOf();};

enterSequence	:	
	SEQUENCE
	{openSequence();};

enterSetOf	:	
	SETOF
	{openSetOf();};

enterSet	:	
	SET
	{openSet();};

enterChoice	:	
	CHOICE
	{openChoice();};

enterExceptionSpec	:	
	^(EXCEPTION_SPEC INT? )
	{if ( $INT != null ) openExceptionSpec($INT.int); else openExceptionSpec();};			
	
enterComponentType:	
	COMPONENT_TYPE
	{openComponentType();};
	
enterComponentTypeOption:	
	COMPONENT_TYPE_OPTION
	{openComponentTypeOption();};
	
enterExtensionAdditionGroup:	
	^(EXTENSION_ADDITION_GROUP ((INT)=>INT)? .*)
	{openExtensionAdditionGroup($INT!=null?$INT.int:-1);};	

enterExtensionAdditionAlternativesGroup:	
	^(EXTENSION_ADDITION_ALTERNATIVES_GROUP ((INT)=>INT)? .*)
	{openExtensionAdditionAlternativesGroup($INT!=null?$INT.int:-1);};	

enterNamedType		:	
	^(NAMED_TYPE ID .*)
	{openNamedType($ID.text);};	
	
enterConstraint		:	
	^(CONSTRAINT .*)
	{openConstraint();};

enterConstraintValueRange:	
	^(CONSTRAINT_VALUE_RANGE .*)
	{openConstraintValueRange();};

enterConstraintSize	:	
	^(CONSTRAINT_SIZE .* )
	{openSizeConstraint();};

enterConstraintType	:	
	^(CONSTRAINT_TYPE a='INCLUDES'? .* )
	{openTypeConstraint($a!=null);};

enterConstraintInnerType:	
	^(CONSTRAINT_INNER_TYPE a='...'? .*)
	{openInnerTypeConstraint($a==null);};

enterEndpoint		:	
	^(ENDPOINT (('MIN')=>min='MIN')? (('MAX')=>max='MAX')? .*)
	{openEndpoint($min!=null, $max!=null);};

enterUnion		:	
	^(UNION a='ALL'? .*)
	{openUnion($a!=null);};
	
enterIntersectionElement:	
	^(INTERSECTION_ELEMENT .*)
	{openIntersectionElement();};	

enterNamedConstraint	:	
	^(NAMED_CONSTRAINT ID (pc=presenceConstraint)? .*)
	{openNamedConstraint($ID.text, pc);};

enterSelectionType	:	
	^(SELECTION_TYPE ID .* )
	{openSelectionType($ID.text);};

enterEnumeration	:	
	^(ENUMERATION .* )
	{openEnumeration();};


	
exitModule	:	
	MODULE
	{closeModule();};

exitModuleId	:
	MODULE_IDENTIFIER
	{closeModuleId();};
	
exitVec		:	
	VEC
	{closeVector();};

exitExports	:	
	EXPORTS
	{closeExports();};
	
exitImports	:	
	IMPORTS
	{closeImports();};


exitSymbolsFromModule:	
	SYMBOLS_FROM_MODULE
	{closeSymbolsFromModule();};

exitValueAssignment:	
	VALUE_ASSIGNMENT
	{closeValueAssignment();};

exitTypeAssignment:	
	TYPE_ASSIGNMENT
	{closeTypeAssignment();};

exitType	:	
	TYPE
	{closeType();};

exitValue	:	
	VALUE
	{closeValue();};

exitTaggedType	:	
	TAGGED_TYPE
	{closeTaggedType();};

exitSequenceOf	:	
	SEQUENCEOF
	{closeSequenceOf();};

exitSequence	:	
	SEQUENCE
	{closeSequence();};

exitSetOf	:	
	SETOF
	{closeSetOf();};

exitSet	:	
	SET
	{closeSet();};

exitChoice	:	
	CHOICE
	{closeChoice();};

exitExceptionSpec:	
	EXCEPTION_SPEC
	{closeExceptionSpec();};

exitComponentType:	
	COMPONENT_TYPE
	{closeComponentType();};

exitComponentTypeOption:	
	COMPONENT_TYPE_OPTION
	{closeComponentTypeOption();};

exitExtensionAdditionGroup:	
	EXTENSION_ADDITION_GROUP
	{closeExtensionAdditionGroup();};

exitExtensionAdditionAlternativesGroup:	
	EXTENSION_ADDITION_ALTERNATIVES_GROUP
	{closeExtensionAdditionAlternativesGroup();};

exitNamedType		:	
	NAMED_TYPE
	{closeNamedType();};

exitConstraint		:	
	CONSTRAINT
	{closeConstraint();};

exitConstraintValueRange:	
	CONSTRAINT_VALUE_RANGE
	{closeConstraintValueRange();};

exitConstraintSize	:	
	CONSTRAINT_SIZE
	{closeSizeConstraint();};

exitConstraintType	:	
	CONSTRAINT_TYPE
	{closeTypeConstraint();};

exitConstraintInnerType	:	
	CONSTRAINT_INNER_TYPE
	{closeInnerTypeConstraint();};

exitEndpoint		:	
	ENDPOINT
	{closeEndpoint();};

exitUnion		:	
	UNION
	{closeUnion();};

exitIntersectionElement	:	
	INTERSECTION_ELEMENT
	{closeIntersectionElement();};

exitNamedConstraint	:	
	NAMED_CONSTRAINT
	{closeNamedConstraint();};

exitSelectionType	:	
	SELECTION_TYPE
	{closeSelectionType();};

exitEnumeration		:	
	ENUMERATION
	{closeEnumeration();};



nameForm	:
	^(NAME_FORM ID)
	{nameForm($ID.text);};

nameNumberForm	:	
	^(NAME_NUMBER_FORM ID INT)
	{nameNumberForm($ID.text, $INT.int);};
	
numberForm	:	
	^(NUMBER_FORM INT)
	{numberForm($INT.int);};

symbol		:	
	^(SYMBOL ID)
	{symbol($ID.text);};
	
globalModuleReference:
	^(GLOBAL_MODULE_REFERENCE ID)
	{globalModuleReference($ID.text);};

integerType	:	
	INTEGER
	{typeInteger();};
	
booleanType	:	
	BOOLEAN
	{typeBoolean();};
	
realType	:	
	REAL
	{typeReal();};
	
oidType		:	
	OID
	{typeOID();};

cstringType	:	
	^(CSTRING UNRESTRICTED_CSTRING .*)
	{typeUnrestrictedCString();}
	| ^(CSTRING type=cstringSubtype .*)
	{typeCString($type.type);};
	
trueValue	:
	TRUE
	{putTrue();};

falseValue	:
	FALSE
	{putFalse();};
	
numberValue	:	
	^(NUMBER ID){System.out.println("Loooool.");}
	| ^(NUMBER INT){number($INT.int);}
	| ^(NUMBER REAL_NUMBER){number(Double.parseDouble($REAL_NUMBER.text));}
	| ^(NUMBER PLUS_INFINITY){number(Double.POSITIVE_INFINITY);}
	| ^(NUMBER MINUS_INFINITY){number(Double.NEGATIVE_INFINITY);};	
	
presenceConstraint returns [Presence pr]:	
	'PRESENT' {$pr = Presence.PRESENT;}
	| 'ABSENT'  {$pr = Presence.ABSENT;}
	| 'OPTIONAL' {$pr = Presence.OPTIONAL;};
	
tagClassPvt returns [TagClass tc]:
	'UNIVERSAL' {$tc = TagClass.UNIVERSAL;}
	| 'APPLICATION'  {$tc = TagClass.APPLICATION;}
	| 'PRIVATE' {$tc = TagClass.PRIVATE;};
	
tagNumber returns [int tagNumber]
	:	INT {tagNumber = $INT.int;};
	
defaultTaggingMethod
	:	
	^(TAGGING_METHOD tm=taggingMethodPvt)
	{taggingMethod(tm);};	
	
taggingMethodPvt returns [TaggingMethod tm]:	
		'EXPLICIT' {$tm = TaggingMethod.EXPLICIT;} 
	| 	'IMPLICIT' {$tm = TaggingMethod.IMPLICIT;}  
	| 	'AUTOMATIC' {$tm = TaggingMethod.AUTOMATIC;} ;
	
extensionEndMarkerPvt	:	
		EXTENSION_END_MARKER
		{extensionEndMarker();};	
	
extensionAndExceptionPvt:	
		EXTENSION_AND_EXCEPTION
		{extensionAndException();};
		
		
cstringSubtype returns [RestrictedCString type]:
		'BMPString' {$type = RestrictedCString.BMPString;}
	|	'GeneralString' {$type = RestrictedCString.GeneralString;}
	|	'GraphicString' {$type = RestrictedCString.GraphicString;}
	|	'IA5String' {$type = RestrictedCString.IA5String;}
	|	'ISO646String' {$type = RestrictedCString.ISO646String;}
	|	'NumericString' {$type = RestrictedCString.NumericString;}
	|	'PrintableString' {$type = RestrictedCString.PrintableString;}
	|	'TeletexString' {$type = RestrictedCString.TeletexString;}
	|	'T61String' {$type = RestrictedCString.T61String;}
	|	'UniversalString' {$type = RestrictedCString.UniversalString;}
	|	'UTF8String' {$type = RestrictedCString.UTF8String;}
	|	'VideotexString' {$type = RestrictedCString.VideotexString;}
	|	'VisibleString' {$type = RestrictedCString.VisibleString;};	
	
enumerationItemPvt		:	
	^(ENUMERATION_ITEM ID)
	{enumerationItem($ID.text);};	
	
extensibilityImpliedPvt		:	
	EXTENSIBILITY_IMPLIED
	{extensibilityImplied();};	
		