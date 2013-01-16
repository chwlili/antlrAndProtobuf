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
  ClassPath;
  DefaultValue;
}

@parser::header {
package org.elex.antlr.java;
}

@lexer::header {
package org.elex.antlr.java;
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

packageDef  :
            Package va=classpath Semicolon?
            ->
            ^(ClassPath[$va.start,$va.text])
            ;

optionDef   : 
            Option Identity Equals Quotation Semicolon? 
            ->
            ^(Identity Quotation)
            ;
            
importDef   : 
            Import Quotation Semicolon? 
            ->
            ^(Quotation)
            ;

messageDef  : 
            Message Identity BraceL messageFieldDef* BraceR 
            ->
            ^(Identity messageFieldDef*)
            ;
            
messageFieldDef : 
                Attribute val=classpath Identity Equals Number defaultDef? Semicolon? Comment* 
                ->
                ^(Identity Attribute ClassPath[$val.start,$val.text] Number defaultDef? Comment*)
                ;
                
defaultDef  : 
            BracketL Default Equals (val=Number|val=Identity) BracketR 
            ->
            ^(DefaultValue[$val,$val.text])
            ;
            
classPart   : Package | Option | Import | Message | Enum | Default | Attribute | Type | Identity;

classpath   : classPart (Dot classPart)*;
            
enumDef :
        Enum Identity BraceL enumFieldDef* BraceR 
        ->
        ^(Identity enumFieldDef*)
        ;
        
enumFieldDef: 
            Identity Equals Number Semicolon? Comment* 
            ->
            ^(Identity Number )
            ; 


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
