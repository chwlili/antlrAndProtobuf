tree grammar ExprWalk;

options {
  language = Java;
  output = AST;
  tokenVocab = Expr;
  ASTLabelType = CommonTree;
}

@header {
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
      ^(Proto ^(PackageList packInfo*) ^(OptionList optionInfo*) ^(ImportList importInfo*) ^(MessageList messageInfo*) ^(EnumList enumInfo*))
      ;

packInfo : ClassPath {System.out.println($ClassPath);} ;

optionInfo : ^(Identity Quotation){System.out.println($Identity.text+"="+$Quotation.text);};

importInfo  : Quotation {System.out.println("import  "+$Quotation.text);} ;

messageInfo : ^(Identity{System.out.println("\nmessage:"+$Identity);} messageFieldInfo*);

messageFieldInfo : 
                  ^(name=Identity Attribute Type index=Number DefaultValue? Comment*)
                  ;

enumInfo : ^(Identity enumFieldInfo*);

enumFieldInfo : ^(Identity Number Comment*);


