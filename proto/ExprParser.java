// $ANTLR 3.4 G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g 2013-01-19 13:33:08

package org.chw.proto;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Attribute", "BraceL", "BraceR", "BracketL", "BracketR", "ClassPath", "Comment", "Default", "DefaultValue", "Dot", "Enum", "EnumList", "Equals", "Identity", "Import", "ImportList", "Message", "MessageList", "Number", "Option", "OptionList", "Other", "Package", "PackageList", "Proto", "Quotation", "Semicolon", "Space", "Type"
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
    public static final int Message=20;
    public static final int MessageList=21;
    public static final int Number=22;
    public static final int Option=23;
    public static final int OptionList=24;
    public static final int Other=25;
    public static final int Package=26;
    public static final int PackageList=27;
    public static final int Proto=28;
    public static final int Quotation=29;
    public static final int Semicolon=30;
    public static final int Space=31;
    public static final int Type=32;

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
    public String getGrammarFileName() { return "G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g"; }


    public static class proto_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "proto"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:35:1: proto : ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )* -> ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) ) ;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:35:7: ( ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )* -> ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:7: ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )*
            {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:7: ( packageDef | optionDef | importDef | messageDef | enumDef | Comment )*
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
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:8: packageDef
            	    {
            	    pushFollow(FOLLOW_packageDef_in_proto98);
            	    packageDef1=packageDef();

            	    state._fsp--;

            	    stream_packageDef.add(packageDef1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:19: optionDef
            	    {
            	    pushFollow(FOLLOW_optionDef_in_proto100);
            	    optionDef2=optionDef();

            	    state._fsp--;

            	    stream_optionDef.add(optionDef2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:29: importDef
            	    {
            	    pushFollow(FOLLOW_importDef_in_proto102);
            	    importDef3=importDef();

            	    state._fsp--;

            	    stream_importDef.add(importDef3.getTree());

            	    }
            	    break;
            	case 4 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:39: messageDef
            	    {
            	    pushFollow(FOLLOW_messageDef_in_proto104);
            	    messageDef4=messageDef();

            	    state._fsp--;

            	    stream_messageDef.add(messageDef4.getTree());

            	    }
            	    break;
            	case 5 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:50: enumDef
            	    {
            	    pushFollow(FOLLOW_enumDef_in_proto106);
            	    enumDef5=enumDef();

            	    state._fsp--;

            	    stream_enumDef.add(enumDef5.getTree());

            	    }
            	    break;
            	case 6 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:36:58: Comment
            	    {
            	    Comment6=(Token)match(input,Comment,FOLLOW_Comment_in_proto108);  
            	    stream_Comment.add(Comment6);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: optionDef, enumDef, messageDef, importDef, packageDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:7: -> ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:7: ^( Proto ^( PackageList ( packageDef )* ) ^( OptionList ( optionDef )* ) ^( ImportList ( importDef )* ) ^( MessageList ( messageDef )* ) ^( EnumList ( enumDef )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Proto, "Proto")
                , root_1);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:15: ^( PackageList ( packageDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PackageList, "PackageList")
                , root_2);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:29: ( packageDef )*
                while ( stream_packageDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_packageDef.nextTree());

                }
                stream_packageDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:42: ^( OptionList ( optionDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OptionList, "OptionList")
                , root_2);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:55: ( optionDef )*
                while ( stream_optionDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_optionDef.nextTree());

                }
                stream_optionDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:67: ^( ImportList ( importDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ImportList, "ImportList")
                , root_2);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:80: ( importDef )*
                while ( stream_importDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_importDef.nextTree());

                }
                stream_importDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:92: ^( MessageList ( messageDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MessageList, "MessageList")
                , root_2);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:106: ( messageDef )*
                while ( stream_messageDef.hasNext() ) {
                    adaptor.addChild(root_2, stream_messageDef.nextTree());

                }
                stream_messageDef.reset();

                adaptor.addChild(root_1, root_2);
                }

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:119: ^( EnumList ( enumDef )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EnumList, "EnumList")
                , root_2);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:38:130: ( enumDef )*
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:41:1: classRef[int type] : (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity |id= ClassPath ) ;
    public final ExprParser.classRef_return classRef(int type) throws RecognitionException {
        ExprParser.classRef_return retval = new ExprParser.classRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:42:5: ( (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity |id= ClassPath ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity |id= ClassPath )
            {
            root_0 = (Object)adaptor.nil();


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity |id= ClassPath )
            int alt2=10;
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
            case Attribute:
                {
                alt2=7;
                }
                break;
            case Type:
                {
                alt2=8;
                }
                break;
            case Identity:
                {
                alt2=9;
                }
                break;
            case ClassPath:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:6: id= Package
                    {
                    id=(Token)match(input,Package,FOLLOW_Package_in_classRef191); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:19: id= Option
                    {
                    id=(Token)match(input,Option,FOLLOW_Option_in_classRef197); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 3 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:31: id= Import
                    {
                    id=(Token)match(input,Import,FOLLOW_Import_in_classRef203); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 4 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:43: id= Message
                    {
                    id=(Token)match(input,Message,FOLLOW_Message_in_classRef209); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 5 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:56: id= Enum
                    {
                    id=(Token)match(input,Enum,FOLLOW_Enum_in_classRef215); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 6 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:66: id= Default
                    {
                    id=(Token)match(input,Default,FOLLOW_Default_in_classRef221); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 7 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:79: id= Attribute
                    {
                    id=(Token)match(input,Attribute,FOLLOW_Attribute_in_classRef227); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 8 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:94: id= Type
                    {
                    id=(Token)match(input,Type,FOLLOW_Type_in_classRef233); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 9 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:104: id= Identity
                    {
                    id=(Token)match(input,Identity,FOLLOW_Identity_in_classRef239); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 10 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:43:118: id= ClassPath
                    {
                    id=(Token)match(input,ClassPath,FOLLOW_ClassPath_in_classRef245); 
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:47:1: idDef[int type] : (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity ) ;
    public final ExprParser.idDef_return idDef(int type) throws RecognitionException {
        ExprParser.idDef_return retval = new ExprParser.idDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;

        Object id_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:48:5: ( (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity )
            {
            root_0 = (Object)adaptor.nil();


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:5: (id= Package |id= Option |id= Import |id= Message |id= Enum |id= Default |id= Attribute |id= Type |id= Identity )
            int alt3=9;
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
            case Attribute:
                {
                alt3=7;
                }
                break;
            case Type:
                {
                alt3=8;
                }
                break;
            case Identity:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:6: id= Package
                    {
                    id=(Token)match(input,Package,FOLLOW_Package_in_idDef277); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 2 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:19: id= Option
                    {
                    id=(Token)match(input,Option,FOLLOW_Option_in_idDef283); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 3 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:31: id= Import
                    {
                    id=(Token)match(input,Import,FOLLOW_Import_in_idDef289); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 4 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:43: id= Message
                    {
                    id=(Token)match(input,Message,FOLLOW_Message_in_idDef295); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 5 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:56: id= Enum
                    {
                    id=(Token)match(input,Enum,FOLLOW_Enum_in_idDef301); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 6 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:66: id= Default
                    {
                    id=(Token)match(input,Default,FOLLOW_Default_in_idDef307); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 7 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:79: id= Attribute
                    {
                    id=(Token)match(input,Attribute,FOLLOW_Attribute_in_idDef313); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 8 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:94: id= Type
                    {
                    id=(Token)match(input,Type,FOLLOW_Type_in_idDef319); 
                    id_tree = 
                    (Object)adaptor.create(id)
                    ;
                    adaptor.addChild(root_0, id_tree);


                    }
                    break;
                case 9 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:49:104: id= Identity
                    {
                    id=(Token)match(input,Identity,FOLLOW_Identity_in_idDef325); 
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:55:1: packageDef : Package val= classRef[ClassPath] ( Semicolon )? -> ^( $val) ;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:55:13: ( Package val= classRef[ClassPath] ( Semicolon )? -> ^( $val) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:56:13: Package val= classRef[ClassPath] ( Semicolon )?
            {
            Package7=(Token)match(input,Package,FOLLOW_Package_in_packageDef368);  
            stream_Package.add(Package7);


            pushFollow(FOLLOW_classRef_in_packageDef372);
            val=classRef(ClassPath);

            state._fsp--;

            stream_classRef.add(val.getTree());

            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:56:45: ( Semicolon )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Semicolon) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:56:45: Semicolon
                    {
                    Semicolon8=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_packageDef375);  
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
            // 57:13: -> ^( $val)
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:58:13: ^( $val)
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:61:1: optionDef : Option val= idDef[Identity] Equals Quotation ( Semicolon )? -> ^( $val Quotation ) ;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:61:13: ( Option val= idDef[Identity] Equals Quotation ( Semicolon )? -> ^( $val Quotation ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:62:13: Option val= idDef[Identity] Equals Quotation ( Semicolon )?
            {
            Option9=(Token)match(input,Option,FOLLOW_Option_in_optionDef444);  
            stream_Option.add(Option9);


            pushFollow(FOLLOW_idDef_in_optionDef448);
            val=idDef(Identity);

            state._fsp--;

            stream_idDef.add(val.getTree());

            Equals10=(Token)match(input,Equals,FOLLOW_Equals_in_optionDef451);  
            stream_Equals.add(Equals10);


            Quotation11=(Token)match(input,Quotation,FOLLOW_Quotation_in_optionDef453);  
            stream_Quotation.add(Quotation11);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:62:57: ( Semicolon )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Semicolon) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:62:57: Semicolon
                    {
                    Semicolon12=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_optionDef455);  
                    stream_Semicolon.add(Semicolon12);


                    }
                    break;

            }


            // AST REWRITE
            // elements: val, Quotation
            // token labels: 
            // rule labels: val, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:13: -> ^( $val Quotation )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:64:13: ^( $val Quotation )
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:67:1: importDef : Import Quotation ( Semicolon )? -> ^( Quotation ) ;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:67:13: ( Import Quotation ( Semicolon )? -> ^( Quotation ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:68:13: Import Quotation ( Semicolon )?
            {
            Import13=(Token)match(input,Import,FOLLOW_Import_in_importDef538);  
            stream_Import.add(Import13);


            Quotation14=(Token)match(input,Quotation,FOLLOW_Quotation_in_importDef540);  
            stream_Quotation.add(Quotation14);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:68:30: ( Semicolon )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Semicolon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:68:30: Semicolon
                    {
                    Semicolon15=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_importDef542);  
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
            // 69:13: -> ^( Quotation )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:70:13: ^( Quotation )
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:73:1: messageDef : Message val= idDef[Identity] BraceL ( messageFieldDef )* BraceR -> ^( $val ( messageFieldDef )* ) ;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:73:13: ( Message val= idDef[Identity] BraceL ( messageFieldDef )* BraceR -> ^( $val ( messageFieldDef )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:74:13: Message val= idDef[Identity] BraceL ( messageFieldDef )* BraceR
            {
            Message16=(Token)match(input,Message,FOLLOW_Message_in_messageDef609);  
            stream_Message.add(Message16);


            pushFollow(FOLLOW_idDef_in_messageDef613);
            val=idDef(Identity);

            state._fsp--;

            stream_idDef.add(val.getTree());

            BraceL17=(Token)match(input,BraceL,FOLLOW_BraceL_in_messageDef616);  
            stream_BraceL.add(BraceL17);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:74:48: ( messageFieldDef )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Attribute) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:74:48: messageFieldDef
            	    {
            	    pushFollow(FOLLOW_messageFieldDef_in_messageDef618);
            	    messageFieldDef18=messageFieldDef();

            	    state._fsp--;

            	    stream_messageFieldDef.add(messageFieldDef18.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            BraceR19=(Token)match(input,BraceR,FOLLOW_BraceR_in_messageDef621);  
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
            // 75:13: -> ^( $val ( messageFieldDef )* )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:76:13: ^( $val ( messageFieldDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_val.nextNode(), root_1);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:76:20: ( messageFieldDef )*
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:79:1: messageFieldDef : Attribute type= classRef[Type] id= idDef[Identity] Equals Number ( defaultDef )? ( Semicolon )? ( Comment )* -> ^( $id Attribute $type Number ( defaultDef )? ( Comment )* ) ;
    public final ExprParser.messageFieldDef_return messageFieldDef() throws RecognitionException {
        ExprParser.messageFieldDef_return retval = new ExprParser.messageFieldDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Attribute20=null;
        Token Equals21=null;
        Token Number22=null;
        Token Semicolon24=null;
        Token Comment25=null;
        ExprParser.classRef_return type =null;

        ExprParser.idDef_return id =null;

        ExprParser.defaultDef_return defaultDef23 =null;


        Object Attribute20_tree=null;
        Object Equals21_tree=null;
        Object Number22_tree=null;
        Object Semicolon24_tree=null;
        Object Comment25_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
        RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");
        RewriteRuleTokenStream stream_Attribute=new RewriteRuleTokenStream(adaptor,"token Attribute");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_defaultDef=new RewriteRuleSubtreeStream(adaptor,"rule defaultDef");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        RewriteRuleSubtreeStream stream_classRef=new RewriteRuleSubtreeStream(adaptor,"rule classRef");
        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:79:17: ( Attribute type= classRef[Type] id= idDef[Identity] Equals Number ( defaultDef )? ( Semicolon )? ( Comment )* -> ^( $id Attribute $type Number ( defaultDef )? ( Comment )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:17: Attribute type= classRef[Type] id= idDef[Identity] Equals Number ( defaultDef )? ( Semicolon )? ( Comment )*
            {
            Attribute20=(Token)match(input,Attribute,FOLLOW_Attribute_in_messageFieldDef707);  
            stream_Attribute.add(Attribute20);


            pushFollow(FOLLOW_classRef_in_messageFieldDef711);
            type=classRef(Type);

            state._fsp--;

            stream_classRef.add(type.getTree());

            pushFollow(FOLLOW_idDef_in_messageFieldDef716);
            id=idDef(Identity);

            state._fsp--;

            stream_idDef.add(id.getTree());

            Equals21=(Token)match(input,Equals,FOLLOW_Equals_in_messageFieldDef719);  
            stream_Equals.add(Equals21);


            Number22=(Token)match(input,Number,FOLLOW_Number_in_messageFieldDef721);  
            stream_Number.add(Number22);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:80: ( defaultDef )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BracketL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:80: defaultDef
                    {
                    pushFollow(FOLLOW_defaultDef_in_messageFieldDef723);
                    defaultDef23=defaultDef();

                    state._fsp--;

                    stream_defaultDef.add(defaultDef23.getTree());

                    }
                    break;

            }


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:92: ( Semicolon )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Semicolon) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:92: Semicolon
                    {
                    Semicolon24=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_messageFieldDef726);  
                    stream_Semicolon.add(Semicolon24);


                    }
                    break;

            }


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:103: ( Comment )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comment) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:80:103: Comment
            	    {
            	    Comment25=(Token)match(input,Comment,FOLLOW_Comment_in_messageFieldDef729);  
            	    stream_Comment.add(Comment25);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: id, defaultDef, Attribute, type, Comment, Number
            // token labels: 
            // rule labels: id, retval, type
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type",type!=null?type.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:17: -> ^( $id Attribute $type Number ( defaultDef )? ( Comment )* )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:82:17: ^( $id Attribute $type Number ( defaultDef )? ( Comment )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_1, 
                stream_Attribute.nextNode()
                );

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_Number.nextNode()
                );

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:82:46: ( defaultDef )?
                if ( stream_defaultDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultDef.nextTree());

                }
                stream_defaultDef.reset();

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:82:58: ( Comment )*
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:85:1: defaultDef : BracketL Default Equals id= idDef[Identity] BracketR -> ^( $id) ;
    public final ExprParser.defaultDef_return defaultDef() throws RecognitionException {
        ExprParser.defaultDef_return retval = new ExprParser.defaultDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BracketL26=null;
        Token Default27=null;
        Token Equals28=null;
        Token BracketR29=null;
        ExprParser.idDef_return id =null;


        Object BracketL26_tree=null;
        Object Default27_tree=null;
        Object Equals28_tree=null;
        Object BracketR29_tree=null;
        RewriteRuleTokenStream stream_Default=new RewriteRuleTokenStream(adaptor,"token Default");
        RewriteRuleTokenStream stream_BracketL=new RewriteRuleTokenStream(adaptor,"token BracketL");
        RewriteRuleTokenStream stream_BracketR=new RewriteRuleTokenStream(adaptor,"token BracketR");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:85:13: ( BracketL Default Equals id= idDef[Identity] BracketR -> ^( $id) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:86:13: BracketL Default Equals id= idDef[Identity] BracketR
            {
            BracketL26=(Token)match(input,BracketL,FOLLOW_BracketL_in_defaultDef837);  
            stream_BracketL.add(BracketL26);


            Default27=(Token)match(input,Default,FOLLOW_Default_in_defaultDef839);  
            stream_Default.add(Default27);


            Equals28=(Token)match(input,Equals,FOLLOW_Equals_in_defaultDef841);  
            stream_Equals.add(Equals28);


            pushFollow(FOLLOW_idDef_in_defaultDef845);
            id=idDef(Identity);

            state._fsp--;

            stream_idDef.add(id.getTree());

            BracketR29=(Token)match(input,BracketR,FOLLOW_BracketR_in_defaultDef848);  
            stream_BracketR.add(BracketR29);


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
            // 87:13: -> ^( $id)
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:88:13: ^( $id)
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:91:1: enumDef : Enum id= idDef[Identity] BraceL ( enumFieldDef )* BraceR -> ^( $id ( enumFieldDef )* ) ;
    public final ExprParser.enumDef_return enumDef() throws RecognitionException {
        ExprParser.enumDef_return retval = new ExprParser.enumDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Enum30=null;
        Token BraceL31=null;
        Token BraceR33=null;
        ExprParser.idDef_return id =null;

        ExprParser.enumFieldDef_return enumFieldDef32 =null;


        Object Enum30_tree=null;
        Object BraceL31_tree=null;
        Object BraceR33_tree=null;
        RewriteRuleTokenStream stream_BraceR=new RewriteRuleTokenStream(adaptor,"token BraceR");
        RewriteRuleTokenStream stream_Enum=new RewriteRuleTokenStream(adaptor,"token Enum");
        RewriteRuleTokenStream stream_BraceL=new RewriteRuleTokenStream(adaptor,"token BraceL");
        RewriteRuleSubtreeStream stream_enumFieldDef=new RewriteRuleSubtreeStream(adaptor,"rule enumFieldDef");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:91:9: ( Enum id= idDef[Identity] BraceL ( enumFieldDef )* BraceR -> ^( $id ( enumFieldDef )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:92:9: Enum id= idDef[Identity] BraceL ( enumFieldDef )* BraceR
            {
            Enum30=(Token)match(input,Enum,FOLLOW_Enum_in_enumDef921);  
            stream_Enum.add(Enum30);


            pushFollow(FOLLOW_idDef_in_enumDef925);
            id=idDef(Identity);

            state._fsp--;

            stream_idDef.add(id.getTree());

            BraceL31=(Token)match(input,BraceL,FOLLOW_BraceL_in_enumDef928);  
            stream_BraceL.add(BraceL31);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:92:40: ( enumFieldDef )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Attribute||LA11_0==Default||LA11_0==Enum||(LA11_0 >= Identity && LA11_0 <= Import)||LA11_0==Message||LA11_0==Option||LA11_0==Package||LA11_0==Type) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:92:40: enumFieldDef
            	    {
            	    pushFollow(FOLLOW_enumFieldDef_in_enumDef930);
            	    enumFieldDef32=enumFieldDef();

            	    state._fsp--;

            	    stream_enumFieldDef.add(enumFieldDef32.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            BraceR33=(Token)match(input,BraceR,FOLLOW_BraceR_in_enumDef933);  
            stream_BraceR.add(BraceR33);


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
            // 93:9: -> ^( $id ( enumFieldDef )* )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:94:9: ^( $id ( enumFieldDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:94:15: ( enumFieldDef )*
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
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:97:1: enumFieldDef : id= idDef[Identity] Equals Number ( Semicolon )? ( Comment )* -> ^( $id Number ( Comment )* ) ;
    public final ExprParser.enumFieldDef_return enumFieldDef() throws RecognitionException {
        ExprParser.enumFieldDef_return retval = new ExprParser.enumFieldDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Equals34=null;
        Token Number35=null;
        Token Semicolon36=null;
        Token Comment37=null;
        ExprParser.idDef_return id =null;


        Object Equals34_tree=null;
        Object Number35_tree=null;
        Object Semicolon36_tree=null;
        Object Comment37_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_Semicolon=new RewriteRuleTokenStream(adaptor,"token Semicolon");
        RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleSubtreeStream stream_idDef=new RewriteRuleSubtreeStream(adaptor,"rule idDef");
        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:97:13: (id= idDef[Identity] Equals Number ( Semicolon )? ( Comment )* -> ^( $id Number ( Comment )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:98:13: id= idDef[Identity] Equals Number ( Semicolon )? ( Comment )*
            {
            pushFollow(FOLLOW_idDef_in_enumFieldDef998);
            id=idDef(Identity);

            state._fsp--;

            stream_idDef.add(id.getTree());

            Equals34=(Token)match(input,Equals,FOLLOW_Equals_in_enumFieldDef1001);  
            stream_Equals.add(Equals34);


            Number35=(Token)match(input,Number,FOLLOW_Number_in_enumFieldDef1003);  
            stream_Number.add(Number35);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:98:46: ( Semicolon )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Semicolon) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:98:46: Semicolon
                    {
                    Semicolon36=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_enumFieldDef1005);  
                    stream_Semicolon.add(Semicolon36);


                    }
                    break;

            }


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:98:57: ( Comment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comment) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:98:57: Comment
            	    {
            	    Comment37=(Token)match(input,Comment,FOLLOW_Comment_in_enumFieldDef1008);  
            	    stream_Comment.add(Comment37);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: Number, Comment, id
            // token labels: 
            // rule labels: id, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:13: -> ^( $id Number ( Comment )* )
            {
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:100:13: ^( $id Number ( Comment )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_1, 
                stream_Number.nextNode()
                );

                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:100:26: ( Comment )*
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


 

    public static final BitSet FOLLOW_packageDef_in_proto98 = new BitSet(new long[]{0x0000000004944402L});
    public static final BitSet FOLLOW_optionDef_in_proto100 = new BitSet(new long[]{0x0000000004944402L});
    public static final BitSet FOLLOW_importDef_in_proto102 = new BitSet(new long[]{0x0000000004944402L});
    public static final BitSet FOLLOW_messageDef_in_proto104 = new BitSet(new long[]{0x0000000004944402L});
    public static final BitSet FOLLOW_enumDef_in_proto106 = new BitSet(new long[]{0x0000000004944402L});
    public static final BitSet FOLLOW_Comment_in_proto108 = new BitSet(new long[]{0x0000000004944402L});
    public static final BitSet FOLLOW_Package_in_classRef191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Option_in_classRef197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_classRef203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Message_in_classRef209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Enum_in_classRef215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_classRef221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Attribute_in_classRef227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Type_in_classRef233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identity_in_classRef239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ClassPath_in_classRef245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_idDef277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Option_in_idDef283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_idDef289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Message_in_idDef295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Enum_in_idDef301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Default_in_idDef307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Attribute_in_idDef313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Type_in_idDef319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identity_in_idDef325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_packageDef368 = new BitSet(new long[]{0x0000000104964A10L});
    public static final BitSet FOLLOW_classRef_in_packageDef372 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_Semicolon_in_packageDef375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Option_in_optionDef444 = new BitSet(new long[]{0x0000000104964810L});
    public static final BitSet FOLLOW_idDef_in_optionDef448 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_optionDef451 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Quotation_in_optionDef453 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_Semicolon_in_optionDef455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Import_in_importDef538 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Quotation_in_importDef540 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_Semicolon_in_importDef542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Message_in_messageDef609 = new BitSet(new long[]{0x0000000104964810L});
    public static final BitSet FOLLOW_idDef_in_messageDef613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BraceL_in_messageDef616 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_messageFieldDef_in_messageDef618 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_BraceR_in_messageDef621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Attribute_in_messageFieldDef707 = new BitSet(new long[]{0x0000000104964A10L});
    public static final BitSet FOLLOW_classRef_in_messageFieldDef711 = new BitSet(new long[]{0x0000000104964810L});
    public static final BitSet FOLLOW_idDef_in_messageFieldDef716 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_messageFieldDef719 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_Number_in_messageFieldDef721 = new BitSet(new long[]{0x0000000040000482L});
    public static final BitSet FOLLOW_defaultDef_in_messageFieldDef723 = new BitSet(new long[]{0x0000000040000402L});
    public static final BitSet FOLLOW_Semicolon_in_messageFieldDef726 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Comment_in_messageFieldDef729 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_BracketL_in_defaultDef837 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Default_in_defaultDef839 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_defaultDef841 = new BitSet(new long[]{0x0000000104964810L});
    public static final BitSet FOLLOW_idDef_in_defaultDef845 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BracketR_in_defaultDef848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Enum_in_enumDef921 = new BitSet(new long[]{0x0000000104964810L});
    public static final BitSet FOLLOW_idDef_in_enumDef925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BraceL_in_enumDef928 = new BitSet(new long[]{0x0000000104964850L});
    public static final BitSet FOLLOW_enumFieldDef_in_enumDef930 = new BitSet(new long[]{0x0000000104964850L});
    public static final BitSet FOLLOW_BraceR_in_enumDef933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idDef_in_enumFieldDef998 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Equals_in_enumFieldDef1001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_Number_in_enumFieldDef1003 = new BitSet(new long[]{0x0000000040000402L});
    public static final BitSet FOLLOW_Semicolon_in_enumFieldDef1005 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Comment_in_enumFieldDef1008 = new BitSet(new long[]{0x0000000000000402L});

}