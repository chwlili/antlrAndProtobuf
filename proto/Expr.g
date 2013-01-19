grammar Expr;

options {
	language=Java;
	output=AST;
}

tokens
{
  Proto;
  PackageList;
  OptionList;
  ImportList;
  MessageList;
  EnumList;
  DefaultValue;
}

@parser::header {
package org.chw.proto;
}

@lexer::header {
package org.chw.proto;
}

@rulecatch
{
	catch (RecognitionException e)
	{
	    throw e;
	}
}

proto :
      (packageDef|optionDef|importDef|messageDef|enumDef|Comment)* 
      ->
      ^(Proto ^(PackageList packageDef*) ^(OptionList optionDef*) ^(ImportList importDef*) ^(MessageList messageDef*) ^(EnumList enumDef*))
      ;

classRef[int type]
    :
    (id=Package | id=Option | id=Import | id=Message | id=Enum | id=Default | id=Attribute | id=Type | id=Identity | id=ClassPath)
    {$id.setType(type);}
    ;

idDef[int type]
    :
    (id=Package | id=Option | id=Import | id=Message | id=Enum | id=Default | id=Attribute | id=Type | id=Identity)
    {$id.setType(type);}
    ;
    

    
packageDef  :
            Package val=classRef[ClassPath] Semicolon?
            -> 
            ^($val)
            ;

optionDef   : 
            Option val=idDef[Identity] Equals Quotation Semicolon? 
            ->
            ^($val Quotation)
            ;
            
importDef   : 
            Import Quotation Semicolon? 
            ->
            ^(Quotation)
            ;

messageDef  : 
            Message val=idDef[Identity] BraceL messageFieldDef* BraceR
            ->
            ^($val messageFieldDef*)
            ; 
             
messageFieldDef : 
                Attribute type=classRef[Type] id=idDef[Identity] Equals Number defaultDef? Semicolon? Comment*
                ->
                ^($id Attribute $type Number defaultDef? Comment*)
                ;
                
defaultDef  : 
            BracketL Default Equals id=idDef[Identity] BracketR 
            ->
            ^($id)
            ;
            
enumDef :
        Enum id=idDef[Identity] BraceL enumFieldDef* BraceR
        ->
        ^($id enumFieldDef*)
        ;
        
enumFieldDef: 
            id=idDef[Identity] Equals Number Semicolon? Comment* 
            ->
            ^($id Number Comment*)
            ; 

//(id=Package | id=Option | id=Import | id=Message | id=Enum | id=Default | id=Attribute | id=Type | id=Identity | id=ClassPath)

Package : 'package';
Option  : 'option';
Import  : 'import';
Message : 'message';
Enum    : 'enum';
Default : 'default';

Attribute : 'optional' | 'repeated' | 'required';
Type      : 'int32' | 'sint32' | 'uint32' | 'int64' | 'sint64' | 'uint64';
Number    : '0'..'9' | '1'..'9' '0'..'9'+;
Identity  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ClassPath : Identity (Dot Identity)*;
Quotation : '"' .* '"';
Comment   : '//' ~('\r'|'\n')*;
Semicolon : ';';
Dot : '.';
Equals : '=';
BraceL : '{' ;
BraceR : '}';
BracketL: '[';
BracketR: ']';
Space : (' ' | '\t' | '\r' | '\n')* {$channel=HIDDEN;};

Other : .;
