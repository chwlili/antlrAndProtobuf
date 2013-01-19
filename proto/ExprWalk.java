// $ANTLR 3.4 G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g 2013-01-19 13:33:09

package org.chw.proto;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprWalk extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public ExprWalk(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprWalk(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprWalk.tokenNames; }
    public String getGrammarFileName() { return "G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g"; }


    public static class proto_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "proto"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:22:1: proto : ^( Proto ^( PackageList ( packInfo )* ) ^( OptionList ( optionInfo )* ) ^( ImportList ( importInfo )* ) ^( MessageList ( messageInfo )* ) ^( EnumList ( enumInfo )* ) ) ;
    public final ExprWalk.proto_return proto() throws RecognitionException {
        ExprWalk.proto_return retval = new ExprWalk.proto_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Proto1=null;
        CommonTree PackageList2=null;
        CommonTree OptionList4=null;
        CommonTree ImportList6=null;
        CommonTree MessageList8=null;
        CommonTree EnumList10=null;
        ExprWalk.packInfo_return packInfo3 =null;

        ExprWalk.optionInfo_return optionInfo5 =null;

        ExprWalk.importInfo_return importInfo7 =null;

        ExprWalk.messageInfo_return messageInfo9 =null;

        ExprWalk.enumInfo_return enumInfo11 =null;


        CommonTree Proto1_tree=null;
        CommonTree PackageList2_tree=null;
        CommonTree OptionList4_tree=null;
        CommonTree ImportList6_tree=null;
        CommonTree MessageList8_tree=null;
        CommonTree EnumList10_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:22:7: ( ^( Proto ^( PackageList ( packInfo )* ) ^( OptionList ( optionInfo )* ) ^( ImportList ( importInfo )* ) ^( MessageList ( messageInfo )* ) ^( EnumList ( enumInfo )* ) ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:7: ^( Proto ^( PackageList ( packInfo )* ) ^( OptionList ( optionInfo )* ) ^( ImportList ( importInfo )* ) ^( MessageList ( messageInfo )* ) ^( EnumList ( enumInfo )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Proto1=(CommonTree)match(input,Proto,FOLLOW_Proto_in_proto72); 
            Proto1_tree = (CommonTree)adaptor.dupNode(Proto1);


            root_1 = (CommonTree)adaptor.becomeRoot(Proto1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PackageList2=(CommonTree)match(input,PackageList,FOLLOW_PackageList_in_proto75); 
            PackageList2_tree = (CommonTree)adaptor.dupNode(PackageList2);


            root_2 = (CommonTree)adaptor.becomeRoot(PackageList2_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:29: ( packInfo )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==ClassPath) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:29: packInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_packInfo_in_proto77);
                	    packInfo3=packInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, packInfo3.getTree());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OptionList4=(CommonTree)match(input,OptionList,FOLLOW_OptionList_in_proto82); 
            OptionList4_tree = (CommonTree)adaptor.dupNode(OptionList4);


            root_2 = (CommonTree)adaptor.becomeRoot(OptionList4_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:53: ( optionInfo )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==Identity) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:53: optionInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_optionInfo_in_proto84);
                	    optionInfo5=optionInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, optionInfo5.getTree());


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ImportList6=(CommonTree)match(input,ImportList,FOLLOW_ImportList_in_proto89); 
            ImportList6_tree = (CommonTree)adaptor.dupNode(ImportList6);


            root_2 = (CommonTree)adaptor.becomeRoot(ImportList6_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:79: ( importInfo )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Quotation) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:79: importInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_importInfo_in_proto91);
                	    importInfo7=importInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, importInfo7.getTree());


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MessageList8=(CommonTree)match(input,MessageList,FOLLOW_MessageList_in_proto96); 
            MessageList8_tree = (CommonTree)adaptor.dupNode(MessageList8);


            root_2 = (CommonTree)adaptor.becomeRoot(MessageList8_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:106: ( messageInfo )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Identity) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:106: messageInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_messageInfo_in_proto98);
                	    messageInfo9=messageInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, messageInfo9.getTree());


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EnumList10=(CommonTree)match(input,EnumList,FOLLOW_EnumList_in_proto103); 
            EnumList10_tree = (CommonTree)adaptor.dupNode(EnumList10);


            root_2 = (CommonTree)adaptor.becomeRoot(EnumList10_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:131: ( enumInfo )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Identity) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:23:131: enumInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_enumInfo_in_proto105);
                	    enumInfo11=enumInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_2, enumInfo11.getTree());


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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


    public static class packInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "packInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:26:1: packInfo : ClassPath ;
    public final ExprWalk.packInfo_return packInfo() throws RecognitionException {
        ExprWalk.packInfo_return retval = new ExprWalk.packInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ClassPath12=null;

        CommonTree ClassPath12_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:26:10: ( ClassPath )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:26:12: ClassPath
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            ClassPath12=(CommonTree)match(input,ClassPath,FOLLOW_ClassPath_in_packInfo123); 
            ClassPath12_tree = (CommonTree)adaptor.dupNode(ClassPath12);


            adaptor.addChild(root_0, ClassPath12_tree);


            System.out.println(ClassPath12);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "packInfo"


    public static class optionInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:28:1: optionInfo : ^( Identity Quotation ) ;
    public final ExprWalk.optionInfo_return optionInfo() throws RecognitionException {
        ExprWalk.optionInfo_return retval = new ExprWalk.optionInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Identity13=null;
        CommonTree Quotation14=null;

        CommonTree Identity13_tree=null;
        CommonTree Quotation14_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:28:12: ( ^( Identity Quotation ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:28:14: ^( Identity Quotation )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Identity13=(CommonTree)match(input,Identity,FOLLOW_Identity_in_optionInfo135); 
            Identity13_tree = (CommonTree)adaptor.dupNode(Identity13);


            root_1 = (CommonTree)adaptor.becomeRoot(Identity13_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            Quotation14=(CommonTree)match(input,Quotation,FOLLOW_Quotation_in_optionInfo137); 
            Quotation14_tree = (CommonTree)adaptor.dupNode(Quotation14);


            adaptor.addChild(root_1, Quotation14_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            System.out.println((Identity13!=null?Identity13.getText():null)+"="+(Quotation14!=null?Quotation14.getText():null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "optionInfo"


    public static class importInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:30:1: importInfo : Quotation ;
    public final ExprWalk.importInfo_return importInfo() throws RecognitionException {
        ExprWalk.importInfo_return retval = new ExprWalk.importInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Quotation15=null;

        CommonTree Quotation15_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:30:13: ( Quotation )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:30:15: Quotation
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            Quotation15=(CommonTree)match(input,Quotation,FOLLOW_Quotation_in_importInfo148); 
            Quotation15_tree = (CommonTree)adaptor.dupNode(Quotation15);


            adaptor.addChild(root_0, Quotation15_tree);


            System.out.println("import  "+(Quotation15!=null?Quotation15.getText():null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "importInfo"


    public static class messageInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "messageInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:32:1: messageInfo : ^( Identity ( messageFieldInfo )* ) ;
    public final ExprWalk.messageInfo_return messageInfo() throws RecognitionException {
        ExprWalk.messageInfo_return retval = new ExprWalk.messageInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Identity16=null;
        ExprWalk.messageFieldInfo_return messageFieldInfo17 =null;


        CommonTree Identity16_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:32:13: ( ^( Identity ( messageFieldInfo )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:32:15: ^( Identity ( messageFieldInfo )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Identity16=(CommonTree)match(input,Identity,FOLLOW_Identity_in_messageInfo160); 
            Identity16_tree = (CommonTree)adaptor.dupNode(Identity16);


            root_1 = (CommonTree)adaptor.becomeRoot(Identity16_tree, root_1);


            System.out.println("\nmessage:"+Identity16);

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:32:71: ( messageFieldInfo )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Identity) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:32:71: messageFieldInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_messageFieldInfo_in_messageInfo163);
                	    messageFieldInfo17=messageFieldInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_1, messageFieldInfo17.getTree());


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "messageInfo"


    public static class messageFieldInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "messageFieldInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:34:1: messageFieldInfo : ^(name= Identity Attribute Type index= Number ( DefaultValue )? ( Comment )* ) ;
    public final ExprWalk.messageFieldInfo_return messageFieldInfo() throws RecognitionException {
        ExprWalk.messageFieldInfo_return retval = new ExprWalk.messageFieldInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree name=null;
        CommonTree index=null;
        CommonTree Attribute18=null;
        CommonTree Type19=null;
        CommonTree DefaultValue20=null;
        CommonTree Comment21=null;

        CommonTree name_tree=null;
        CommonTree index_tree=null;
        CommonTree Attribute18_tree=null;
        CommonTree Type19_tree=null;
        CommonTree DefaultValue20_tree=null;
        CommonTree Comment21_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:34:18: ( ^(name= Identity Attribute Type index= Number ( DefaultValue )? ( Comment )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:35:19: ^(name= Identity Attribute Type index= Number ( DefaultValue )? ( Comment )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            name=(CommonTree)match(input,Identity,FOLLOW_Identity_in_messageFieldInfo195); 
            name_tree = (CommonTree)adaptor.dupNode(name);


            root_1 = (CommonTree)adaptor.becomeRoot(name_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            Attribute18=(CommonTree)match(input,Attribute,FOLLOW_Attribute_in_messageFieldInfo197); 
            Attribute18_tree = (CommonTree)adaptor.dupNode(Attribute18);


            adaptor.addChild(root_1, Attribute18_tree);


            _last = (CommonTree)input.LT(1);
            Type19=(CommonTree)match(input,Type,FOLLOW_Type_in_messageFieldInfo199); 
            Type19_tree = (CommonTree)adaptor.dupNode(Type19);


            adaptor.addChild(root_1, Type19_tree);


            _last = (CommonTree)input.LT(1);
            index=(CommonTree)match(input,Number,FOLLOW_Number_in_messageFieldInfo203); 
            index_tree = (CommonTree)adaptor.dupNode(index);


            adaptor.addChild(root_1, index_tree);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:35:63: ( DefaultValue )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DefaultValue) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:35:63: DefaultValue
                    {
                    _last = (CommonTree)input.LT(1);
                    DefaultValue20=(CommonTree)match(input,DefaultValue,FOLLOW_DefaultValue_in_messageFieldInfo205); 
                    DefaultValue20_tree = (CommonTree)adaptor.dupNode(DefaultValue20);


                    adaptor.addChild(root_1, DefaultValue20_tree);


                    }
                    break;

            }


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:35:77: ( Comment )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comment) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:35:77: Comment
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    Comment21=(CommonTree)match(input,Comment,FOLLOW_Comment_in_messageFieldInfo208); 
            	    Comment21_tree = (CommonTree)adaptor.dupNode(Comment21);


            	    adaptor.addChild(root_1, Comment21_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "messageFieldInfo"


    public static class enumInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:38:1: enumInfo : ^( Identity ( enumFieldInfo )* ) ;
    public final ExprWalk.enumInfo_return enumInfo() throws RecognitionException {
        ExprWalk.enumInfo_return retval = new ExprWalk.enumInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Identity22=null;
        ExprWalk.enumFieldInfo_return enumFieldInfo23 =null;


        CommonTree Identity22_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:38:10: ( ^( Identity ( enumFieldInfo )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:38:12: ^( Identity ( enumFieldInfo )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Identity22=(CommonTree)match(input,Identity,FOLLOW_Identity_in_enumInfo238); 
            Identity22_tree = (CommonTree)adaptor.dupNode(Identity22);


            root_1 = (CommonTree)adaptor.becomeRoot(Identity22_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:38:23: ( enumFieldInfo )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Identity) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:38:23: enumFieldInfo
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_enumFieldInfo_in_enumInfo240);
                	    enumFieldInfo23=enumFieldInfo();

                	    state._fsp--;

                	    adaptor.addChild(root_1, enumFieldInfo23.getTree());


                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "enumInfo"


    public static class enumFieldInfo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumFieldInfo"
    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:40:1: enumFieldInfo : ^( Identity Number ( Comment )* ) ;
    public final ExprWalk.enumFieldInfo_return enumFieldInfo() throws RecognitionException {
        ExprWalk.enumFieldInfo_return retval = new ExprWalk.enumFieldInfo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Identity24=null;
        CommonTree Number25=null;
        CommonTree Comment26=null;

        CommonTree Identity24_tree=null;
        CommonTree Number25_tree=null;
        CommonTree Comment26_tree=null;

        try {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:40:15: ( ^( Identity Number ( Comment )* ) )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:40:17: ^( Identity Number ( Comment )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            Identity24=(CommonTree)match(input,Identity,FOLLOW_Identity_in_enumFieldInfo251); 
            Identity24_tree = (CommonTree)adaptor.dupNode(Identity24);


            root_1 = (CommonTree)adaptor.becomeRoot(Identity24_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            Number25=(CommonTree)match(input,Number,FOLLOW_Number_in_enumFieldInfo253); 
            Number25_tree = (CommonTree)adaptor.dupNode(Number25);


            adaptor.addChild(root_1, Number25_tree);


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:40:35: ( Comment )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comment) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\ExprWalk.g:40:35: Comment
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    Comment26=(CommonTree)match(input,Comment,FOLLOW_Comment_in_enumFieldInfo255); 
            	    Comment26_tree = (CommonTree)adaptor.dupNode(Comment26);


            	    adaptor.addChild(root_1, Comment26_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "enumFieldInfo"

    // Delegated rules


 

    public static final BitSet FOLLOW_Proto_in_proto72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PackageList_in_proto75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_packInfo_in_proto77 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_OptionList_in_proto82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_optionInfo_in_proto84 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_ImportList_in_proto89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importInfo_in_proto91 = new BitSet(new long[]{0x0000000020000008L});
    public static final BitSet FOLLOW_MessageList_in_proto96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_messageInfo_in_proto98 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_EnumList_in_proto103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumInfo_in_proto105 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_ClassPath_in_packInfo123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identity_in_optionInfo135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Quotation_in_optionInfo137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Quotation_in_importInfo148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identity_in_messageInfo160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_messageFieldInfo_in_messageInfo163 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_Identity_in_messageFieldInfo195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Attribute_in_messageFieldInfo197 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Type_in_messageFieldInfo199 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_Number_in_messageFieldInfo203 = new BitSet(new long[]{0x0000000000001408L});
    public static final BitSet FOLLOW_DefaultValue_in_messageFieldInfo205 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_Comment_in_messageFieldInfo208 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_Identity_in_enumInfo238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumFieldInfo_in_enumInfo240 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_Identity_in_enumFieldInfo251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Number_in_enumFieldInfo253 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_Comment_in_enumFieldInfo255 = new BitSet(new long[]{0x0000000000000408L});

}