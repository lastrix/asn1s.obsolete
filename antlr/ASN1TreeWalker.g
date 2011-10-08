tree grammar ASN1TreeWalker;
options {
  tokenVocab = ASN1;
  ASTLabelType = CommonTree;
  filter = true;
}

@members {

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

protected void openType(){System.out.println("Open Type.");}

protected void closeType(){System.out.println("Close Type.");}

protected void openValue(){System.out.println("Open value.");}

protected void closeValue(){System.out.println("Close value.");}


// MISC methods
protected void numberForm(int number){System.out.println("Number form " + number);}
protected void nameNumberForm(String name, int number){System.out.println("NameNumber form " + name + "(" + number + ")");}
protected void nameForm(String name){System.out.println("Name form " + name);}

protected void symbol(String name){System.out.println("Symbol " + name);}
protected void globalModuleReference(String name){System.out.println("GlobalModuleReference " + name);}

protected void typeInteger(){System.out.println("Type: integer.");}
protected void typeBoolean(){System.out.println("Type: boolean.");}
protected void typeReal(){System.out.println("Type: real.");}

protected void putTrue(){System.out.println("true");}
protected void putFalse(){System.out.println("true");}

protected void number(int value){System.out.println("int:" + value);}
protected void number(double value){System.out.println("double:" + value);}
}

topdown		:
	enterModule
	| enterModuleId
	| enterVec
	| enterExports
	| enterImports
	| enterSymbolsFromModule
	| enterValueAssignment
	| enterType
	| enterValue
	| nameForm
	| nameNumberForm
	| numberForm
	| symbol
	| globalModuleReference
	| integerType
	| booleanType
	| realType
	| trueValue
	| falseValue
	| numberValue;

bottomup	:
	exitModule
	| exitModuleId
	| exitVec
	| exitExports
	| exitImports
	| exitSymbolsFromModule
	| exitValueAssignment
	| exitType
	| exitValue;
	
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
	^(EXPORTS ALL? .*)
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

enterType	:	
	TYPE
	{openType();};

enterValue	:	
	VALUE
	{openValue();};

	
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

exitType	:	
	TYPE
	{closeType();};

exitValue	:	
	VALUE
	{closeValue();};


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
	
trueValue	:
	TRUE
	{putTrue();};

falseValue	:
	FALSE
	{putFalse();};
	
numberValue	:	
	^(NUMBER ID){System.out.println("Loooool.");}
	| ^(NUMBER SINT){number($SINT.int);}
	| ^(NUMBER REAL_NUMBER){number(Double.parseDouble($REAL_NUMBER.text));}
	| ^(NUMBER PLUS_INFINITY){number(Double.POSITIVE_INFINITY);}
	| ^(NUMBER MINUS_INFINITY){number(Double.NEGATIVE_INFINITY);};	
	