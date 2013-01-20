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
                  ^(name=Name Attribute Type index=Index DefaultValue? Comment*)
                  ;

enumInfo : ^(Identity enumFieldInfo*);

enumFieldInfo : ^(Name Index Comment*);


