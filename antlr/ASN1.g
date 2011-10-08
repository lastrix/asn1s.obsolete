grammar ASN1;

options {
  output = AST;              // build trees
  ASTLabelType = CommonTree; // use standard tree nodes
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
VALUE;
TYPE_ASSIGNMENT;
VALUE_ASSIGNMENT;
BOOLEAN;
INTEGER;
REAL;
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
}

@header {
//package org.lastrix.asn1s.schema.compiler;

//import org.lastrix.asn1s.schema.compiler.*;
//import java.util.List;
//import java.util.Collections;
}

@lexer::header{
//package org.lastrix.asn1s.schema.compiler;
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
		ID '(' INT ')' -> ^(NAME_NUMBER_FORM ID INT)
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
		typeAssignment
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
	|	(SINT) -> ^(NUMBER SINT )
	|	REAL_NUMBER -> ^(NUMBER REAL_NUMBER);

numberSign
	:	'-' | '+';

objectIdentifierValue		:
		'OID_VALUE';

booleanValue:
		'TRUE' -> ^(TRUE)
	|	'FALSE' -> ^(FALSE);

typeAssignment			:
		ID '::=' type -> ^(TYPE_ASSIGNMENT ID type);

type				:
		booleanType -> ^(TYPE booleanType)
	|	realType -> ^(TYPE realType)
	|	integerType -> ^(TYPE integerType);

realType			:
		'REAL' -> ^(REAL);

integerType			:
		'INTEGER' ('{' namedNumberList '}')? -> ^(INTEGER namedNumberList?);

namedNumberList		:
		namedNumber (',' namedNumber)* -> ^(VEC namedNumber+);

namedNumber		:
		ID '(' SINT ')' -> ^(NAMED_NUMBER ID SINT);

booleanType			:
		'BOOLEAN' -> ^(BOOLEAN);







ID		:	('a'..'z'|'A'..'Z') ('-'?('a'..'z'|'A'..'Z'|'0'..'9'))*;

INT		:	'0' | ('1'..'9')('0'..'9')*;
SINT		:	'-'? INT;
REAL_NUMBER	:	'-'? INT '.' ('0'..'9')+ (('e'|'E') ('-'|'+')? INT )?;

WS		:	(' ' | '\t' | '\n' | '\r') {$channel=HIDDEN;};
COMMENT_LINE	:	'--'(options { greedy = false; } : .)* '\n' { $channel = HIDDEN; };
ML_COMMENT	:	'/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;};
