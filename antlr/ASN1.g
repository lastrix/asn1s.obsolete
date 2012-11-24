grammar ASN1;

options {
  output = AST;              // build trees
  ASTLabelType = CommonTree; // use standard tree nodes
//  backtrack=true;
}

tokens{
MODULE;
MODULE_IDENTIFIER;
VEC;
NUMBER_FORM;
NAME_FORM;
NAME_NUMBER_FORM;
EXTENSIBILITY_IMPLIED;
TAGGING_METHOD;
EXPORTS;
IMPORTS;
ASSIGNMENT;
VALUE_REFERENCE;
TYPE;
TAGGED_TYPE;
VALUE;
TYPE_ASSIGNMENT;
VALUE_ASSIGNMENT;
BOOLEAN;
INTEGER;
REAL;
OID;
BIT_STRING;
ENUMERATION;
ENUMERATION_ITEM;
OCTET_STRING;
SELECTION_TYPE;
NAMED_NUMBER;
PLUS_INFINITY;
MINUS_INFINITY;
NUMBER;
ALL;
SYMBOL;
SYMBOLS_FROM_MODULE;
GLOBAL_MODULE_REFERENCE;
TRUE;
FALSE;
IMPLICIT;
EXPLICIT;
TAG;
TAG_NUMBER;
SEQUENCEOF;
SEQUENCE;
SETOF;
SET;
NAMED_TYPE;
EXTENSION_ADDITION_GROUP;
COMPONENT_TYPE;
EXCEPTION_SPEC;
EXTENSION_AND_EXCEPTION;
EXTENSION_END_MARKER;
COMPONENT_TYPE_OPTION;
CHOICE;
EXTENSION_ADDITION_ALTERNATIVES_GROUP;
UNRESTRICTED_CSTRING;
CSTRING;
CONSTRAINT;
UNION;
INTERSECTION_ELEMENT;
EXCEPT;
CONSTRAINT_VALUE;
CONSTRAINT_PATTERN;
CONSTRAINT_SIZE;
CONSTRAINT_VALUE_RANGE;
CONSTRAINT_TYPE;
CONSTRAINT_INNER_TYPE;
NAMED_CONSTRAINT;
ENDPOINT;
TYPE_REFERENCE;
}

@header {
package org.lastrix.asn1s.schema.compiler.generated;
}

@lexer::header{
package org.lastrix.asn1s.schema.compiler.generated;
}

@rulecatch{
    catch (RecognitionException e){
            throw e;
      }
}

parse	:	module+;

module                 	:
		moduleIdentifier 'DEFINITIONS' 
		tagDefault? extensionDefault? '::='
		'BEGIN' exports? imports? assignmentList 'END' -> ^(MODULE moduleIdentifier tagDefault? extensionDefault? exports? imports? assignmentList);

// Module header
moduleIdentifier	:
	ID definitiveIdentifier? -> ^(MODULE_IDENTIFIER ID definitiveIdentifier?);



definitiveIdentifier	:
	'{' definitiveObjIdComponent (',' definitiveObjIdComponent)* '}'
	-> ^(VEC definitiveObjIdComponent+);


definitiveObjIdComponent:
		nameNumberForm
	|	ID -> ^(NAME_FORM ID)
	|	INT -> ^(NUMBER_FORM INT);

extensionDefault		:	
		'EXTENSIBILITY' 'IMPLIED' -> ^(EXTENSIBILITY_IMPLIED);

tagDefault			:
		taggingMethod 'TAGS' -> ^(TAGGING_METHOD taggingMethod);

taggingMethod			:
		'EXPLICIT' | 'IMPLICIT' | 'AUTOMATIC';


// Module body and etc
exports				:
		'EXPORTS' 'ALL' ';' -> ^(EXPORTS ALL)
	|	'EXPORTS' symbolList ';' -> ^(EXPORTS symbolList);

symbolList			:
		symbol ( ',' symbol)* -> ^(VEC symbol+);

// TODO: parametrizedReference
symbol				:
		ID -> ^(SYMBOL ID);

imports				:
		'IMPORTS' symbolsFromModuleList ';' -> ^(IMPORTS symbolsFromModuleList);

symbolsFromModuleList		:
		symbolsFromModule+ -> ^(VEC symbolsFromModule+)  ;

symbolsFromModule		:
		symbolList 'FROM' globalModuleReference -> ^(SYMBOLS_FROM_MODULE globalModuleReference symbolList);

//TODO: add here assigned identifier when you need it
globalModuleReference		:
		ID assignedIdentifier? -> ^(GLOBAL_MODULE_REFERENCE ID);// assignedIdentifier?);

assignedIdentifier		:
		(objectIdentifierValue | definedValue);


// TODO: parametrized value left
definedValue			:
		(ID '.')? ID -> ^(VALUE_REFERENCE ID ID?);


assignmentList			:
		assignment+ -> ^(VEC assignment+);

assignment			:
		(CLASS_DEF? ID '::=' )=> typeAssignment
	|	valueAssignment;

valueAssignment			:
		ID type '::=' value ';'? -> ^(VALUE_ASSIGNMENT ID type value);

value				:
		booleanValue -> ^(VALUE booleanValue)
	|	numberValue -> ^(VALUE numberValue)
	|	objectIdentifierValue -> ^(VALUE objectIdentifierValue);

//after huge brainstorms i decided to make all numbers into this...
numberValue			:
		'PLUS-INFINITY' -> ^(NUMBER PLUS_INFINITY)
	|	'MINUS-INFINITY' -> ^(NUMBER MINUS_INFINITY)
	|	ID -> ^(NUMBER ID)
	|	(INT) -> ^(NUMBER INT )
	|	REAL_NUMBER -> ^(NUMBER REAL_NUMBER);

objectIdentifierValue		:
		'OID_VALUE';

booleanValue:
		'TRUE' -> ^(TRUE)
	|	'FALSE' -> ^(FALSE);

typeAssignment			:
		CLASS_DEF? ID '::=' type -> ^(TYPE_ASSIGNMENT ID CLASS_DEF? type);

type				:
		booleanType -> ^(TYPE booleanType)
	|	realType -> ^(TYPE realType)
	|	integerType -> ^(TYPE integerType)
	|	taggedType -> ^(TYPE taggedType)
	|	('SEQUENCE' constraint? 'OF' ) => sequenceOfType -> ^(TYPE sequenceOfType)
	|	sequenceType -> ^(TYPE sequenceType)
	|	('SET' constraint? 'OF' ) =>setOfType -> ^(TYPE setOfType)
	|	setType -> ^(TYPE setType)
	|	choiceType -> ^(TYPE choiceType)
	|	'OBJECT' 'IDENTIFIER' -> ^(TYPE OID)
	|	characterStringType -> ^(TYPE characterStringType)
	|	bitStringType -> ^(TYPE bitStringType)
	|	enumeratedType -> ^(TYPE enumeratedType)
	|	'OCTET' 'STRING' constraint?-> ^(TYPE OCTET_STRING constraint?)
	|	definedType -> ^(TYPE definedType)
	|	selectionType -> ^(TYPE selectionType);

//TODO: 
definedType			:
		(ID '.')? ID constraint? -> ^(TYPE_REFERENCE ID ID? constraint?)
		| restrictedStringType constraint? -> ^(CSTRING restrictedStringType constraint?);

selectionType			:
		ID '<' type -> ^(SELECTION_TYPE ID type);

enumeratedType			:
		'ENUMERATED' '{' enumerations '}'
		-> ^(ENUMERATION enumerations);

enumerations			:
		enumerationItem (',' enumerationItem)* -> ^(VEC enumerationItem+);

enumerationItem			:
		(namedNumber) => namedNumber
	|	ID -> ^(ENUMERATION_ITEM ID);

bitStringType			:
		'BIT' 'STRING' namedBitList? -> ^(BIT_STRING namedBitList);

namedBitList			:
		'{' nameNumberForm (',' nameNumberForm)* '}'
		-> ^(VEC nameNumberForm+);

//TODO: defined value here
nameNumberForm			:
		ID '(' INT ')' -> ^(NAME_NUMBER_FORM ID INT);

characterStringType		:
		'CHARACTER' 'STRING' constraint?-> ^( CSTRING UNRESTRICTED_CSTRING constraint?);
//		| restrictedStringType constraint?-> ^(CSTRING restrictedStringType constraint?);
		
restrictedStringType
	:	
	|	'BMPString'
	|	'GeneralString'
	|	'GraphicString'
	|	'IA5String'
	|	'ISO646String'
	|	'NumericString'
	|	'PrintableString'
	|	'TeletexString'
	|	'T61String'
	|	'UniversalString'
	|	'UTF8String'
	|	'VideotexString'
	|	'VisibleString';

choiceType			:
		'CHOICE' '{' alternativesTypeLists '}' constraint? -> ^(CHOICE alternativesTypeLists constraint?);

alternativesTypeLists		:
		alternativeTypeList (',' extensionAndException (',' extensionAdditionAlternativesList)? extensionEndMarker?)?
		-> ^(alternativeTypeList (extensionAndException extensionAdditionAlternativesList? extensionEndMarker?)?);

alternativeTypeList		:
		namedType (',' namedType)* -> ^(VEC namedType+);

extensionAdditionAlternativesList:
		extensionAdditionAlternative (',' extensionAdditionAlternative)* -> ^(VEC extensionAdditionAlternative+);

extensionAdditionAlternative	:
		extensionAdditionAlternativesGroup | namedType;

extensionAdditionAlternativesGroup:
		'[[' (INT ':')?  alternativeTypeList ']]' 
		-> ^(EXTENSION_ADDITION_ALTERNATIVES_GROUP INT? alternativeTypeList);

setType				:
		'SET' '{' componentTypeLists? '}' constraint? -> ^(SET componentTypeLists? constraint? );

setOfType			:
		'SET' constraint? 'OF' sOfComponentType -> ^(SETOF sOfComponentType constraint?);

sOfComponentType
	:	(VALUE_ID)=>namedType | type;

sequenceType			:
//	|	'SEQUENCE' '{' '...' exceptionSpec extensionEndMarker? '}' -> ^(SEQUENCE exceptionSpec extensionEndMarker?)
		'SEQUENCE' '{' componentTypeLists? '}' constraint?-> ^(SEQUENCE componentTypeLists? constraint?);

componentTypeLists		:	
		componentTypeList (',' extensionAndException extensionAdditions? (extensionEndMarker componentTypeList?)?)?
		-> ^(componentTypeList (extensionAndException extensionAdditions? (extensionEndMarker componentTypeList?)?)? )                
	|	extensionAndException extensionAdditions? extensionEndMarker?
		-> ^(extensionAndException extensionAdditions? extensionEndMarker?);
		
componentTypeList		:	
		componentType (',' componentType)* -> ^(VEC componentType+);

componentType			:	
		namedType componentTypeOption? -> ^( COMPONENT_TYPE namedType componentTypeOption? )
	|	'COMPONENTS' 'OF' type -> ^(COMPONENT_TYPE type);

componentTypeOption		:	
		'OPTIONAL' -> ^(COMPONENT_TYPE_OPTION )
	|	'DEFAULT' value -> ^(COMPONENT_TYPE_OPTION value);
	
extensionAdditions		:	
		',' extensionAddition (',' extensionAddition)? -> ^(VEC extensionAddition+);
		
extensionAddition		:	
		componentType | extensionAdditionGroup;
extensionAdditionGroup		:	
		'[[' (INT ':')? componentTypeList ']]' -> ^(EXTENSION_ADDITION_GROUP INT? componentTypeList);

extensionEndMarker		:	
		',' '...' -> ^(EXTENSION_END_MARKER);
		
extensionAndException		:
		'...' exceptionSpec? -> ^(EXTENSION_AND_EXCEPTION exceptionSpec?);

exceptionSpec			:
		('!' definedValue ) -> ^(EXCEPTION_SPEC definedValue)
		| ( '!' type ':' value)  -> ^(EXCEPTION_SPEC type value)
		| ( '!' INT)  -> ^(EXCEPTION_SPEC INT)
		;

sequenceOfType			:
	'SEQUENCE' constraint? 'OF' sOfComponentType ';'? -> ^(SEQUENCEOF sOfComponentType constraint?);

namedType
	:
	ID type -> ^(NAMED_TYPE ID type);

taggedType			:
		'[' tagClass? classNumber ']' taggingMethod? type -> ^(TAGGED_TYPE classNumber tagClass? taggingMethod? type);

classNumber			:
	INT | definedValue;

tagClass	:
	'UNIVERSAL' | 'APPLICATION' | 'PRIVATE';

realType			:
		'REAL' constraint? -> ^(REAL constraint?);

integerType			:
		'INTEGER' constraint? ('{' namedNumberList '}')? -> ^(INTEGER namedNumberList? constraint?);

namedNumberList		:
		namedNumber (',' namedNumber)* -> ^(VEC namedNumber+);

namedNumber		:
		ID '(' INT ')' -> ^(NAME_NUMBER_FORM ID INT);

booleanType			:
		'BOOLEAN' constraint? -> ^(BOOLEAN constraint?);


constraint			:	
		'(' constraintSpec exceptionSpec?')' 
		-> ^(CONSTRAINT constraintSpec exceptionSpec?);

//TODO: GENERAL CONSTRAINT
constraintSpec			:
		elementSetSpecs;// | generalConstraint;

elementSetSpecs			:
		elementSetSpec (extensionEndMarker ( ',' elementSetSpec)?)?
		-> ^(elementSetSpec (extensionEndMarker elementSetSpec?)?);

elementSetSpec			:
		unions -> ^(UNION unions)
		| 'ALL' exclusions -> ^(UNION 'ALL' exclusions);

exclusions			:
		'EXCEPT' elements
		-> ^(elements);

unions				:	
		intersections (unionMark intersections)*
		-> ^(VEC intersections+);

intersections			:
		intersectionElement (intersectionMark intersectionElement)*
		-> ^(VEC intersectionElement+);

intersectionElement		:
		elements exclusions?
		-> ^(INTERSECTION_ELEMENT elements exclusions?);

elements			:
		('(') => '(' elementSetSpec ')' -> ^(elementSetSpec)
	|	subtypeElements;

subtypeElements			:
		(value)=>value -> ^(CONSTRAINT_VALUE value)
	|	valueRange
	|	sizeConstraint
	|	typeConstraint
	|	innerTypeConstraint
	|	patternConstraint;

innerTypeConstraint		:
		'WITH' 'COMPONENT' constraint -> ^(CONSTRAINT_INNER_TYPE constraint)
	|	'WITH' 'COMPONENTS' '{' ('...' ',')? typeConstraints '}' 
		-> ^(CONSTRAINT_INNER_TYPE '...'? typeConstraints);

typeConstraints			:
		namedConstraint (',' namedConstraint)* 
		-> ^(VEC namedConstraint+);

namedConstraint			:
		ID constraint? presenceConstraint?
		-> ^(NAMED_CONSTRAINT ID presenceConstraint? constraint? );

presenceConstraint		:
		'PRESENT' | 'ABSENT' | 'OPTIONAL';

typeConstraint			:
		'INCLUDES'? type
		-> ^(CONSTRAINT_TYPE 'INCLUDES'? type);

valueRange			:
		lowerEndPoint '..' upperEndPoint
		-> ^(CONSTRAINT_VALUE_RANGE lowerEndPoint upperEndPoint);

lowerEndPoint			:
		lowerEndValue '<'?
		-> ^(ENDPOINT '<'? lowerEndValue);

upperEndPoint			:
		'<'? upperEndValue
		-> ^(ENDPOINT '<'? upperEndValue);

lowerEndValue			:
		value 
		| 'MIN';

upperEndValue			:
		value 
		| 'MAX';

sizeConstraint			:
		'SIZE' constraint -> ^(CONSTRAINT_SIZE constraint);

patternConstraint		:
		'PATTERN' value -> ^(CONSTRAINT_PATTERN value);

unionMark			:
		('|' | 'UNION' );

intersectionMark			:
		('^' | 'INTERSECTION' );


fragment
VALUE_ID	:	('a'..'z') ('-'?('a'..'z'|'A'..'Z'|'0'..'9'))*;
ID		:	('a'..'z'|'A'..'Z') ('-'?('a'..'z'|'A'..'Z'|'0'..'9'))*;

INT		:	'0' | '-'? ('1'..'9')('0'..'9')*;
REAL_NUMBER	:	INT '.' ('0'..'9')+ (('e'|'E') (('-')=>'-'|'+')? INT )?;

CLASS_DEF	:	'--' '#' (options { greedy = false; } : .)* '\n';
COMMENT_LINE	:	'--' (options { greedy = false; } : .)* '\n' { $channel = HIDDEN; };
ML_COMMENT	:	'/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;};
WS		:	(' ' | '\t' | '\n' | '\r') {$channel=HIDDEN;};
