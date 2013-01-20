// $ANTLR 3.4 E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g 2013-01-20 08:58:03

package org.chw.proto;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Attribute", "BraceL", "BraceR", "BracketL", "BracketR", "ClassPath", "Comment", "Default", "DefaultValue", "Dot", "Enum", "EnumList", "Equals", "Identity", "Import", "ImportList", "Index", "Message", "MessageList", "Name", "Number", "Option", "OptionList", "Other", "Package", "PackageList", "Proto", "Quotation", "Semicolon", "Space", "Type"
    };

    public static final int EOF=-1;
    public static final int Attribute=4;
    public static final int BraceL=5;
    public static final int BraceR=6;
    public static final int BracketL=7;
    public static final int BracketR=8;
    public static final int ClassPath=9;
    public static final int Comment=10;
    public static final int Default=11;
    public static final int DefaultValue=12;
    public static final int Dot=13;
    public static final int Enum=14;
    public static final int EnumList=15;
    public static final int Equals=16;
    public static final int Identity=17;
    public static final int Import=18;
    public static final int ImportList=19;
    public static final int Index=20;
    public static final int Message=21;
    public static final int MessageList=22;
    public static final int Name=23;
    public static final int Number=24;
    public static final int Option=25;
    public static final int OptionList=26;
    public static final int Other=27;
    public static final int Package=28;
    public static final int PackageList=29;
    public static final int Proto=30;
    public static final int Quotation=31;
    public static final int Semicolon=32;
    public static final int Space=33;
    public static final int Type=34;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g"; }


    public static class proto_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "proto"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:40:1: proto : ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )* -> ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) ) ;
    public final ExprParser.proto_return proto() throws RecognitionException {
        ExprParser.proto_return retval = new ExprParser.proto_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Comment6=null;
        ExprParser.packageDef_return packageDef1 =null;

        ExprParser.optionDef_return optionDef2 =null;

        ExprParser.importDef_return importDef3 =null;

        ExprParser.messageDef_return messageDef4 =null;

        ExprParser.enumDef_return enumDef5 =null;


        Object Comment6_tree=null;
        RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");
        RewriteRuleSubtreeStream stream_packageDef=new RewriteRuleSubtreeStream(adaptor,"rule packageDef");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        RewriteRuleSubtreeStream stream_optionDef=new RewriteRuleSubtreeStream(adaptor,"rule optionDef");
        RewriteRuleSubtreeStream stream_importDef=new RewriteRuleSubtreeStream(adaptor,"rule importDef");
        RewriteRuleSubtreeStream stream_messageDef=new RewriteRuleSubtreeStream(adaptor,"rule messageDef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:40:7: ( ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )* -> ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:7: ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )*
            {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:7: ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case Package:
                    {
                    alt1=1;
                    }
                    break;
                case Option:
                    {
                    alt1=2;
                    }
                    break;
                case Import:
                    {
                    alt1=3;
                    }
                    break;
                case Message:
                    {
                    alt1=4;
                    }
                    break;
                case Enum:
                    {
                    alt1=5;
                    }
                    break;
                case Comment:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:8: packageDef
            	    {
            	    pushFollow(FOLLOW_packageDef_in_proto121);
            	    packageDef1=packageDef();

            	    state._fsp--;

            	    stream_packageDef.add(packageDef1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:19: optionDef
            	    {
            	    pushFollow(FOLLOW_optionDef_in_proto123);
            	    optionDef2=optionDef();

            	    state._fsp--;

            	    stream_optionDef.add(optionDef2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:29: importDef
            	    {
            	    pushFollow(FOLLOW_importDef_in_proto125);
            	    importDef3=importDef();

            	    state._fsp--;

            	    stream_importDef.add(importDef3.getTree());

            	    }
            	    break;
            	case 4 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:39: messageDef
            	    {
            	    pushFollow(FOLLOW_messageDef_in_proto127);
            	    messageDef4=messageDef();

            	    state._fsp--;

            	    stream_messageDef.add(messageDef4.getTree());

            	    }
            	    break;
            	case 5 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:50: enumDef
            	    {
            	    pushFollow(FOLLOW_enumDef_in_proto129);
            	    enumDef5=enumDef();

            	    state._fsp--;

            	    stream_enumDef.add(enumDef5.getTree());

            	    }
            	    break;
            	case 6 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:41:58: Comment
            	    {
            	    Comment6=(Token)match(input,Comment,FOLLOW_Comment_in_proto131);  
            	    stream_Comment.add(Comment6);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: optionDef, importDef, enumDef, packageDef, messageDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 42:7: -> ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:7: ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Proto, "Proto")
                , root_1);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:15: ^( PackageList ( packageDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PackageList, "PackageList")
                , root_2);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:29: ( packageDef )*
                while ( stream_packageDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_packageDef.nextTree());

                }
                stream_packageDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:42: ^( OptionList ( optionDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OptionList, "OptionList")
                , root_2);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:55: ( optionDef )*
                while ( stream_optionDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_optionDef.nextTree());

                }
                stream_optionDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:67: ^( ImportList ( importDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ImportList, "ImportList")
                , root_2);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:80: ( importDef )*
                while ( stream_importDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_importDef.nextTree());

                }
                stream_importDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:92: ^( MessageList ( messageDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MessageList, "MessageList")
                , root_2);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:106: ( messageDef )*
                while ( stream_messageDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_messageDef.nextTree());

                }
                stream_messageDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:119: ^( EnumList ( enumDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EnumList, "EnumList")
                , root_2);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:43:130: ( enumDef )*
                while ( stream_enumDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_enumDef.nextTree());

                }
                stream_enumDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "proto"


    public static class classRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classRef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:46:1: classRef[int type] : (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity |id= ClassPath ) ;
    public final ExprParser.classRef_return classRef(int type) throws RecognitionException {
        ExprParser.classRef_return retval = new ExprParser.classRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:47:5: ( (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity |id= ClassPath ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity |id= ClassPath )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity |id= ClassPath )
            int alt2=8;
            switch ( input.LA(1) ) {
            case Package:
                {
                alt2=1;
                }
                break;
            case Option:
                {
                alt2=2;
                }
                break;
            case Import:
                {
                alt2=3;
                }
                break;
            case Message:
                {
                alt2=4;
                }
                break;
            case Enum:
                {
                alt2=5;
                }
                break;
            case Default:
                {
                alt2=6;
                }
                break;
            case Identity:
                {
                alt2=7;
                }
                break;
            case ClassPath:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:6: id= Package
                    {
                    id=(Token)match(input,Package,FOLLOW_Package_in_classRef214); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:19: id= Option
                    {
                    id=(Token)match(input,Option,FOLLOW_Option_in_classRef220); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 3 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:31: id= Import
                    {
                    id=(Token)match(input,Import,FOLLOW_Import_in_classRef226); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 4 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:43: id= Message
                    {
                    id=(Token)match(input,Message,FOLLOW_Message_in_classRef232); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 5 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:56: id= Enum
                    {
                    id=(Token)match(input,Enum,FOLLOW_Enum_in_classRef238); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 6 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:66: id= Default
                    {
                    id=(Token)match(input,Default,FOLLOW_Default_in_classRef244); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 7 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:79: id= Identity
                    {
                    id=(Token)match(input,Identity,FOLLOW_Identity_in_classRef250); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 8 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:48:93: id= ClassPath
                    {
                    id=(Token)match(input,ClassPath,FOLLOW_ClassPath_in_classRef256); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;

            }


            id.setType(type);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classRef"


    public static class idDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "idDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:52:1: idDef[int type] : (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity ) ;
    public final ExprParser.idDef_return idDef(int type) throws RecognitionException {
        ExprParser.idDef_return retval = new ExprParser.idDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:53:5: ( (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity )
            {
            root_0 = (Object)adaptor.nil();


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Identity )
            int alt3=7;
            switch ( input.LA(1) ) {
            case Package:
                {
                alt3=1;
                }
                break;
            case Option:
                {
                alt3=2;
                }
                break;
            case Import:
                {
                alt3=3;
                }
                break;
            case Message:
                {
                alt3=4;
                }
                break;
            case Enum:
                {
                alt3=5;
                }
                break;
            case Default:
                {
                alt3=6;
                }
                break;
            case Identity:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:6: id= Package
                    {
                    id=(Token)match(input,Package,FOLLOW_Package_in_idDef288); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:19: id= Option
                    {
                    id=(Token)match(input,Option,FOLLOW_Option_in_idDef294); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 3 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:31: id= Import
                    {
                    id=(Token)match(input,Import,FOLLOW_Import_in_idDef300); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 4 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:43: id= Message
                    {
                    id=(Token)match(input,Message,FOLLOW_Message_in_idDef306); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 5 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:56: id= Enum
                    {
                    id=(Token)match(input,Enum,FOLLOW_Enum_in_idDef312); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 6 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:66: id= Default
                    {
                    id=(Token)match(input,Default,FOLLOW_Default_in_idDef318); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 7 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:54:79: id= Identity
                    {
                    id=(Token)match(input,Identity,FOLLOW_Identity_in_idDef324); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;

            }


            id.setType(type);

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "idDef"


    public static class packageDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "packageDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:60:1: packageDef : Package val= classRef[ClassPath] ( Semicolon )? -> ^( $val) ;
    public final ExprParser.packageDef_return packageDef() throws RecognitionException {
        ExprParser.packageDef_return retval = new ExprParser.packageDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Package7=null;
        Token Semicolon8=null;
        ExprParser.classRef_return val =null;


        Object Package7_tree=null;
        Object Semicolon8_tree=null;
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
        RewriteRuleTokenStream stream_Package=new RewriteRuleTokenStream(adaptor,"token Package");
        RewriteRuleSubtreeStream stream_classRef=new RewriteRuleSubtreeStream(adaptor,"rule classRef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:60:13: ( Package val= classRef[ClassPath] ( Semicolon )? -> ^( $val) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:61:13: Package val= classRef[ClassPath] ( Semicolon )?
            {
            Package7=(Token)match(input,Package,FOLLOW_Package_in_packageDef367);  
            stream_Package.add(Package7);


            pushFollow(FOLLOW_classRef_in_packageDef371);
            val=classRef(ClassPath);

            state._fsp--;

            stream_classRef.add(val.getTree());

            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:61:45: ( Semicolon )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Semicolon) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:61:45: Semicolon
                    {
                    Semicolon8=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_packageDef374);  
                    stream_Semicolon.add(Semicolon8);


                    }
                    break;

            }


            // AST REWRITE
            // elements: val
            // token labels: 
            // rule labels: val, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:13: -> ^( $val)
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:63:13: ^( $val)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_val.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "packageDef"


    public static class optionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:66:1: optionDef : Option val= idDef[Identity] Equals Quotation ( Semicolon )? -> ^( $val Quotation ) ;
    public final ExprParser.optionDef_return optionDef() throws RecognitionException {
        ExprParser.optionDef_return retval = new ExprParser.optionDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Option9=null;
        Token Equals10=null;
        Token Quotation11=null;
        Token Semicolon12=null;
        ExprParser.idDef_return val =null;


        Object Option9_tree=null;
        Object Equals10_tree=null;
        Object Quotation11_tree=null;
        Object Semicolon12_tree=null;
        RewriteRuleTokenStream stream_Option=new RewriteRuleTokenStream(adaptor,"token Option");
        RewriteRuleTokenStream stream_Quotation=new RewriteRuleTokenStream(adaptor,"token Quotation");
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:66:13: ( Option val= idDef[Identity] Equals Quotation ( Semicolon )? -> ^( $val Quotation ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:67:13: Option val= idDef[Identity] Equals Quotation ( Semicolon )?
            {
            Option9=(Token)match(input,Option,FOLLOW_Option_in_optionDef443);  
            stream_Option.add(Option9);


            pushFollow(FOLLOW_idDef_in_optionDef447);
            val=idDef(Identity);

            state._fsp--;

            stream_idDef.add(val.getTree());

            Equals10=(Token)match(input,Equals,FOLLOW_Equals_in_optionDef450);  
            stream_Equals.add(Equals10);


            Quotation11=(Token)match(input,Quotation,FOLLOW_Quotation_in_optionDef452);  
            stream_Quotation.add(Quotation11);


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:67:57: ( Semicolon )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Semicolon) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:67:57: Semicolon
                    {
                    Semicolon12=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_optionDef454);  
                    stream_Semicolon.add(Semicolon12);


                    }
                    break;

            }


            // AST REWRITE
            // elements: Quotation, val
            // token labels: 
            // rule labels: val, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:13: -> ^( $val Quotation )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:69:13: ^( $val Quotation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_val.nextNode(), root_1);

                adaptor.addChild(root_1, 
                stream_Quotation.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionDef"


    public static class importDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:72:1: importDef : Import Quotation ( Semicolon )? -> ^( Quotation ) ;
    public final ExprParser.importDef_return importDef() throws RecognitionException {
        ExprParser.importDef_return retval = new ExprParser.importDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Import13=null;
        Token Quotation14=null;
        Token Semicolon15=null;

        Object Import13_tree=null;
        Object Quotation14_tree=null;
        Object Semicolon15_tree=null;
        RewriteRuleTokenStream stream_Import=new RewriteRuleTokenStream(adaptor,"token Import");
        RewriteRuleTokenStream stream_Quotation=new RewriteRuleTokenStream(adaptor,"token Quotation");
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");

        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:72:13: ( Import Quotation ( Semicolon )? -> ^( Quotation ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:73:13: Import Quotation ( Semicolon )?
            {
            Import13=(Token)match(input,Import,FOLLOW_Import_in_importDef537);  
            stream_Import.add(Import13);


            Quotation14=(Token)match(input,Quotation,FOLLOW_Quotation_in_importDef539);  
            stream_Quotation.add(Quotation14);


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:73:30: ( Semicolon )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Semicolon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:73:30: Semicolon
                    {
                    Semicolon15=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_importDef541);  
                    stream_Semicolon.add(Semicolon15);


                    }
                    break;

            }


            // AST REWRITE
            // elements: Quotation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:13: -> ^( Quotation )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:75:13: ^( Quotation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_Quotation.nextNode()
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importDef"


    public static class messageDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "messageDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:78:1: messageDef : Message val= idDef[Identity] BraceL ( messageFieldDef )* BraceR -> ^( $val ( messageFieldDef )* ) ;
    public final ExprParser.messageDef_return messageDef() throws RecognitionException {
        ExprParser.messageDef_return retval = new ExprParser.messageDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Message16=null;
        Token BraceL17=null;
        Token BraceR19=null;
        ExprParser.idDef_return val =null;

        ExprParser.messageFieldDef_return messageFieldDef18 =null;


        Object Message16_tree=null;
        Object BraceL17_tree=null;
        Object BraceR19_tree=null;
        RewriteRuleTokenStream stream_BraceR=new RewriteRuleTokenStream(adaptor,"token BraceR");
        RewriteRuleTokenStream stream_Message=new RewriteRuleTokenStream(adaptor,"token Message");
        RewriteRuleTokenStream stream_BraceL=new RewriteRuleTokenStream(adaptor,"token BraceL");
        RewriteRuleSubtreeStream stream_messageFieldDef=new RewriteRuleSubtreeStream(adaptor,"rule messageFieldDef");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:78:13: ( Message val= idDef[Identity] BraceL ( messageFieldDef )* BraceR -> ^( $val ( messageFieldDef )* ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:79:13: Message val= idDef[Identity] BraceL ( messageFieldDef )* BraceR
            {
            Message16=(Token)match(input,Message,FOLLOW_Message_in_messageDef608);  
            stream_Message.add(Message16);


            pushFollow(FOLLOW_idDef_in_messageDef612);
            val=idDef(Identity);

            state._fsp--;

            stream_idDef.add(val.getTree());

            BraceL17=(Token)match(input,BraceL,FOLLOW_BraceL_in_messageDef615);  
            stream_BraceL.add(BraceL17);


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:79:48: ( messageFieldDef )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Default||LA7_0==Enum||(LA7_0 >= Identity && LA7_0 <= Import)||LA7_0==Message||LA7_0==Option||LA7_0==Package) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:79:48: messageFieldDef
            	    {
            	    pushFollow(FOLLOW_messageFieldDef_in_messageDef617);
            	    messageFieldDef18=messageFieldDef();

            	    state._fsp--;

            	    stream_messageFieldDef.add(messageFieldDef18.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            BraceR19=(Token)match(input,BraceR,FOLLOW_BraceR_in_messageDef620);  
            stream_BraceR.add(BraceR19);


            // AST REWRITE
            // elements: messageFieldDef, val
            // token labels: 
            // rule labels: val, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:13: -> ^( $val ( messageFieldDef )* )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:81:13: ^( $val ( messageFieldDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_val.nextNode(), root_1);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:81:20: ( messageFieldDef )*
                while ( stream_messageFieldDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_messageFieldDef.nextTree());

                }
                stream_messageFieldDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "messageDef"


    public static class messageFieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "messageFieldDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:84:1: messageFieldDef : att= idDef[Attribute] type= classRef[Type] name= idDef[Name] Equals index= Number ( defaultDef )? ( Semicolon )? ( Comment )* -> ^( $name $att $type $index ( defaultDef )? ( Comment )* ) ;
    public final ExprParser.messageFieldDef_return messageFieldDef() throws RecognitionException {
        ExprParser.messageFieldDef_return retval = new ExprParser.messageFieldDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token index=null;
        Token Equals20=null;
        Token Semicolon22=null;
        Token Comment23=null;
        ExprParser.idDef_return att =null;

        ExprParser.classRef_return type =null;

        ExprParser.idDef_return name =null;

        ExprParser.defaultDef_return defaultDef21 =null;


        Object index_tree=null;
        Object Equals20_tree=null;
        Object Semicolon22_tree=null;
        Object Comment23_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
        RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_defaultDef=new RewriteRuleSubtreeStream(adaptor,"rule defaultDef");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        RewriteRuleSubtreeStream stream_classRef=new RewriteRuleSubtreeStream(adaptor,"rule classRef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:84:17: (att= idDef[Attribute] type= classRef[Type] name= idDef[Name] Equals index= Number ( defaultDef )? ( Semicolon )? ( Comment )* -> ^( $name $att $type $index ( defaultDef )? ( Comment )* ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:17: att= idDef[Attribute] type= classRef[Type] name= idDef[Name] Equals index= Number ( defaultDef )? ( Semicolon )? ( Comment )*
            {
            pushFollow(FOLLOW_idDef_in_messageFieldDef708);
            att=idDef(Attribute);

            state._fsp--;

            stream_idDef.add(att.getTree());

            pushFollow(FOLLOW_classRef_in_messageFieldDef713);
            type=classRef(Type);

            state._fsp--;

            stream_classRef.add(type.getTree());

            pushFollow(FOLLOW_idDef_in_messageFieldDef718);
            name=idDef(Name);

            state._fsp--;

            stream_idDef.add(name.getTree());

            Equals20=(Token)match(input,Equals,FOLLOW_Equals_in_messageFieldDef721);  
            stream_Equals.add(Equals20);


            index=(Token)match(input,Number,FOLLOW_Number_in_messageFieldDef725);  
            stream_Number.add(index);


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:95: ( defaultDef )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BracketL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:95: defaultDef
                    {
                    pushFollow(FOLLOW_defaultDef_in_messageFieldDef727);
                    defaultDef21=defaultDef();

                    state._fsp--;

                    stream_defaultDef.add(defaultDef21.getTree());

                    }
                    break;

            }


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:107: ( Semicolon )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Semicolon) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:107: Semicolon
                    {
                    Semicolon22=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_messageFieldDef730);  
                    stream_Semicolon.add(Semicolon22);


                    }
                    break;

            }


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:118: ( Comment )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comment) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:85:118: Comment
            	    {
            	    Comment23=(Token)match(input,Comment,FOLLOW_Comment_in_messageFieldDef733);  
            	    stream_Comment.add(Comment23);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            index.setType(Index);

            // AST REWRITE
            // elements: att, defaultDef, index, type, Comment, name
            // token labels: index
            // rule labels: retval, name, att, type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_index=new RewriteRuleTokenStream(adaptor,"token index",index);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_att=new RewriteRuleSubtreeStream(adaptor,"rule att",att!=null?att.tree:null);
            RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type",type!=null?type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:17: -> ^( $name $att $type $index ( defaultDef )? ( Comment )* )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:88:17: ^( $name $att $type $index ( defaultDef )? ( Comment )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                adaptor.addChild(root_1, stream_att.nextTree());

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_index.nextNode());

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:88:43: ( defaultDef )?
                if ( stream_defaultDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultDef.nextTree());

                }
                stream_defaultDef.reset();

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:88:55: ( Comment )*
                while ( stream_Comment.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Comment.nextNode()
                    );

                }
                stream_Comment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "messageFieldDef"


    public static class defaultDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:91:1: defaultDef : BracketL Default Equals id= idDef[Identity] BracketR -> ^( $id) ;
    public final ExprParser.defaultDef_return defaultDef() throws RecognitionException {
        ExprParser.defaultDef_return retval = new ExprParser.defaultDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BracketL24=null;
        Token Default25=null;
        Token Equals26=null;
        Token BracketR27=null;
        ExprParser.idDef_return id =null;


        Object BracketL24_tree=null;
        Object Default25_tree=null;
        Object Equals26_tree=null;
        Object BracketR27_tree=null;
        RewriteRuleTokenStream stream_Default=new RewriteRuleTokenStream(adaptor,"token Default");
        RewriteRuleTokenStream stream_BracketL=new RewriteRuleTokenStream(adaptor,"token BracketL");
        RewriteRuleTokenStream stream_BracketR=new RewriteRuleTokenStream(adaptor,"token BracketR");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:91:13: ( BracketL Default Equals id= idDef[Identity] BracketR -> ^( $id) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:92:13: BracketL Default Equals id= idDef[Identity] BracketR
            {
            BracketL24=(Token)match(input,BracketL,FOLLOW_BracketL_in_defaultDef861);  
            stream_BracketL.add(BracketL24);


            Default25=(Token)match(input,Default,FOLLOW_Default_in_defaultDef863);  
            stream_Default.add(Default25);


            Equals26=(Token)match(input,Equals,FOLLOW_Equals_in_defaultDef865);  
            stream_Equals.add(Equals26);


            pushFollow(FOLLOW_idDef_in_defaultDef869);
            id=idDef(Identity);

            state._fsp--;

            stream_idDef.add(id.getTree());

            BracketR27=(Token)match(input,BracketR,FOLLOW_BracketR_in_defaultDef872);  
            stream_BracketR.add(BracketR27);


            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: id, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:13: -> ^( $id)
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:94:13: ^( $id)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defaultDef"


    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:97:1: enumDef : Enum id= idDef[Identity] BraceL ( enumFieldDef )* BraceR -> ^( $id ( enumFieldDef )* ) ;
    public final ExprParser.enumDef_return enumDef() throws RecognitionException {
        ExprParser.enumDef_return retval = new ExprParser.enumDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Enum28=null;
        Token BraceL29=null;
        Token BraceR31=null;
        ExprParser.idDef_return id =null;

        ExprParser.enumFieldDef_return enumFieldDef30 =null;


        Object Enum28_tree=null;
        Object BraceL29_tree=null;
        Object BraceR31_tree=null;
        RewriteRuleTokenStream stream_BraceR=new RewriteRuleTokenStream(adaptor,"token BraceR");
        RewriteRuleTokenStream stream_Enum=new RewriteRuleTokenStream(adaptor,"token Enum");
        RewriteRuleTokenStream stream_BraceL=new RewriteRuleTokenStream(adaptor,"token BraceL");
        RewriteRuleSubtreeStream stream_enumFieldDef=new RewriteRuleSubtreeStream(adaptor,"rule enumFieldDef");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:97:9: ( Enum id= idDef[Identity] BraceL ( enumFieldDef )* BraceR -> ^( $id ( enumFieldDef )* ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:98:9: Enum id= idDef[Identity] BraceL ( enumFieldDef )* BraceR
            {
            Enum28=(Token)match(input,Enum,FOLLOW_Enum_in_enumDef945);  
            stream_Enum.add(Enum28);


            pushFollow(FOLLOW_idDef_in_enumDef949);
            id=idDef(Identity);

            state._fsp--;

            stream_idDef.add(id.getTree());

            BraceL29=(Token)match(input,BraceL,FOLLOW_BraceL_in_enumDef952);  
            stream_BraceL.add(BraceL29);


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:98:40: ( enumFieldDef )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Default||LA11_0==Enum||(LA11_0 >= Identity && LA11_0 <= Import)||LA11_0==Message||LA11_0==Option||LA11_0==Package) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:98:40: enumFieldDef
            	    {
            	    pushFollow(FOLLOW_enumFieldDef_in_enumDef954);
            	    enumFieldDef30=enumFieldDef();

            	    state._fsp--;

            	    stream_enumFieldDef.add(enumFieldDef30.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            BraceR31=(Token)match(input,BraceR,FOLLOW_BraceR_in_enumDef957);  
            stream_BraceR.add(BraceR31);


            // AST REWRITE
            // elements: enumFieldDef, id
            // token labels: 
            // rule labels: id, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:9: -> ^( $id ( enumFieldDef )* )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:100:9: ^( $id ( enumFieldDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:100:15: ( enumFieldDef )*
                while ( stream_enumFieldDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumFieldDef.nextTree());

                }
                stream_enumFieldDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumDef"


    public static class enumFieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumFieldDef"
    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:103:1: enumFieldDef : id= idDef[Name] Equals index= Number ( Semicolon )? ( Comment )* -> ^( $id $index ( Comment )* ) ;
    public final ExprParser.enumFieldDef_return enumFieldDef() throws RecognitionException {
        ExprParser.enumFieldDef_return retval = new ExprParser.enumFieldDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token index=null;
        Token Equals32=null;
        Token Semicolon33=null;
        Token Comment34=null;
        ExprParser.idDef_return id =null;


        Object index_tree=null;
        Object Equals32_tree=null;
        Object Semicolon33_tree=null;
        Object Comment34_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
        RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:103:13: (id= idDef[Name] Equals index= Number ( Semicolon )? ( Comment )* -> ^( $id $index ( Comment )* ) )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:104:13: id= idDef[Name] Equals index= Number ( Semicolon )? ( Comment )*
            {
            pushFollow(FOLLOW_idDef_in_enumFieldDef1022);
            id=idDef(Name);

            state._fsp--;

            stream_idDef.add(id.getTree());

            Equals32=(Token)match(input,Equals,FOLLOW_Equals_in_enumFieldDef1025);  
            stream_Equals.add(Equals32);


            index=(Token)match(input,Number,FOLLOW_Number_in_enumFieldDef1029);  
            stream_Number.add(index);


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:104:48: ( Semicolon )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Semicolon) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:104:48: Semicolon
                    {
                    Semicolon33=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_enumFieldDef1031);  
                    stream_Semicolon.add(Semicolon33);


                    }
                    break;

            }


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:104:59: ( Comment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comment) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:104:59: Comment
            	    {
            	    Comment34=(Token)match(input,Comment,FOLLOW_Comment_in_enumFieldDef1034);  
            	    stream_Comment.add(Comment34);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            index.setType(Index);

            // AST REWRITE
            // elements: index, id, Comment
            // token labels: index
            // rule labels: id, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_index=new RewriteRuleTokenStream(adaptor,"token index",index);
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 106:13: -> ^( $id $index ( Comment )* )
            {
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:107:13: ^( $id $index ( Comment )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_1, stream_index.nextNode());

                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:107:26: ( Comment )*
                while ( stream_Comment.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Comment.nextNode()
                    );

                }
                stream_Comment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e)
        	{
        	    throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enumFieldDef"

    // Delegated rules


 

    public static final BitSet FOLLOW_packageDef_in_proto121 = new BitSet(new long[]{0x0000000012244402L});
    public static final BitSet FOLLOW_optionDef_in_proto123 = new BitSet(new long[]{0x0000000012244402L});
    public static final BitSet FOLLOW_importDef_in_proto125 = new BitSet(new long[]{0x0000000012244402L});
    public static final BitSet FOLLOW_messageDef_in_proto127 = new BitSet(new long[]{0x0000000012244402L});
    public static final BitSet FOLLOW_enumDef_in_proto129 = new BitSet(new long[]{0x0000000012244402L});
    public static final BitSet FOLLOW_Comment_in_proto131 = new BitSet(new long[]{0x0000000012244402L});
    public static final BitSet FOLLOW_Package_in_classRef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Option_in_classRef220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_classRef226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Message_in_classRef232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Enum_in_classRef238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_classRef244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identity_in_classRef250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ClassPath_in_classRef256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_idDef288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Option_in_idDef294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_idDef300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Message_in_idDef306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Enum_in_idDef312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_idDef318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identity_in_idDef324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_packageDef367 = new BitSet(new long[]{0x0000000012264A00L});
    public static final BitSet FOLLOW_classRef_in_packageDef371 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_Semicolon_in_packageDef374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Option_in_optionDef443 = new BitSet(new long[]{0x0000000012264800L});
    public static final BitSet FOLLOW_idDef_in_optionDef447 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_optionDef450 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Quotation_in_optionDef452 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_Semicolon_in_optionDef454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_importDef537 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Quotation_in_importDef539 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_Semicolon_in_importDef541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Message_in_messageDef608 = new BitSet(new long[]{0x0000000012264800L});
    public static final BitSet FOLLOW_idDef_in_messageDef612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BraceL_in_messageDef615 = new BitSet(new long[]{0x0000000012264840L});
    public static final BitSet FOLLOW_messageFieldDef_in_messageDef617 = new BitSet(new long[]{0x0000000012264840L});
    public static final BitSet FOLLOW_BraceR_in_messageDef620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idDef_in_messageFieldDef708 = new BitSet(new long[]{0x0000000012264A00L});
    public static final BitSet FOLLOW_classRef_in_messageFieldDef713 = new BitSet(new long[]{0x0000000012264800L});
    public static final BitSet FOLLOW_idDef_in_messageFieldDef718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_messageFieldDef721 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Number_in_messageFieldDef725 = new BitSet(new long[]{0x0000000100000482L});
    public static final BitSet FOLLOW_defaultDef_in_messageFieldDef727 = new BitSet(new long[]{0x0000000100000402L});
    public static final BitSet FOLLOW_Semicolon_in_messageFieldDef730 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Comment_in_messageFieldDef733 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_BracketL_in_defaultDef861 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Default_in_defaultDef863 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_defaultDef865 = new BitSet(new long[]{0x0000000012264800L});
    public static final BitSet FOLLOW_idDef_in_defaultDef869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BracketR_in_defaultDef872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Enum_in_enumDef945 = new BitSet(new long[]{0x0000000012264800L});
    public static final BitSet FOLLOW_idDef_in_enumDef949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BraceL_in_enumDef952 = new BitSet(new long[]{0x0000000012264840L});
    public static final BitSet FOLLOW_enumFieldDef_in_enumDef954 = new BitSet(new long[]{0x0000000012264840L});
    public static final BitSet FOLLOW_BraceR_in_enumDef957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idDef_in_enumFieldDef1022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_enumFieldDef1025 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Number_in_enumFieldDef1029 = new BitSet(new long[]{0x0000000100000402L});
    public static final BitSet FOLLOW_Semicolon_in_enumFieldDef1031 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Comment_in_enumFieldDef1034 = new BitSet(new long[]{0x0000000000000402L});

}