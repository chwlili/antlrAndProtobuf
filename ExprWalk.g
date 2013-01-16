tree grammar ExprWalk;

options {
  language = Java;
  output = AST;
  tokenVocab = Expr;
  ASTLabelType = CommonTree;
}

@header {
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
      ^(Proto ^(PackageList packInfo*) ^(OptionList optionInfo*) ^(ImportList importInfo*) ^(MessageList messageInfo*) ^(EnumList enumInfo*))
      ;

packInfo : ClassPath {System.out.println($ClassPath);} ;

optionInfo : ^(Identity Quotation){System.out.println($Identity.text+"="+$Quotation.text);};

importInfo  : Quotation {System.out.println("import  "+$Quotation.text);} ;

messageInfo : ^(Identity{System.out.println("\nmessage:"+$Identity);} messageFieldInfo*);

messageFieldInfo : 
                  ^(name=Identity Attribute ClassPath index=Number DefaultValue? Comment*)
                  {System.out.println($Attribute+" "+$name+":"+$ClassPath+"="+$index+($DefaultValue!=null ? " ["+$DefaultValue+"]":"")+"  "+($Comment!=null ? $Comment:""));}
                  ;

enumInfo : ^(Identity enumFieldInfo*);

enumFieldInfo : ^(Identity Number Comment*);
       
classPart   : Package | Option | Import | Message | Enum | Default | Attribute | Type | Identity;

classPath : ^(ClassPath classPart (Dot classPart)*);

