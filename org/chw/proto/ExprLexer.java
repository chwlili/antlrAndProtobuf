// $ANTLR 3.4 E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g 2013-01-20 08:58:03

package org.chw.proto;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g"; }

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:112:9: ( 'package' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:112:11: 'package'
            {
            match("package"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Package"

    // $ANTLR start "Option"
    public final void mOption() throws RecognitionException {
        try {
            int _type = Option;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:113:9: ( 'option' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:113:11: 'option'
            {
            match("option"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Option"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:114:9: ( 'import' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:114:11: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:115:9: ( 'message' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:115:11: 'message'
            {
            match("message"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Enum"
    public final void mEnum() throws RecognitionException {
        try {
            int _type = Enum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:116:9: ( 'enum' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:116:11: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Enum"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:117:9: ( 'default' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:117:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:121:11: ( '0' .. '9' | '1' .. '9' ( '0' .. '9' )+ )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1 >= '0' && LA2_1 <= '9')) ) {
                    alt2=2;
                }
                else {
                    alt2=1;
                }
            }
            else if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:121:13: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:121:24: '1' .. '9' ( '0' .. '9' )+
                    {
                    matchRange('1','9'); 

                    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:121:33: ( '0' .. '9' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Identity"
    public final void mIdentity() throws RecognitionException {
        try {
            int _type = Identity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:122:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:122:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:122:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identity"

    // $ANTLR start "ClassPath"
    public final void mClassPath() throws RecognitionException {
        try {
            int _type = ClassPath;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:123:11: ( Identity ( Dot Identity )* )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:123:13: Identity ( Dot Identity )*
            {
            mIdentity(); 


            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:123:22: ( Dot Identity )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:123:23: Dot Identity
            	    {
            	    mDot(); 


            	    mIdentity(); 


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ClassPath"

    // $ANTLR start "Quotation"
    public final void mQuotation() throws RecognitionException {
        try {
            int _type = Quotation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:124:11: ( '\"' ( . )* '\"' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:124:13: '\"' ( . )* '\"'
            {
            match('\"'); 

            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:124:17: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    alt5=2;
                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:124:17: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Quotation"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:125:11: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:125:13: '//' (~ ( '\\r' | '\\n' ) )*
            {
            match("//"); 



            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:125:18: (~ ( '\\r' | '\\n' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:126:11: ( ';' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:126:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:127:5: ( '.' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:127:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:128:8: ( '=' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:128:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "BraceL"
    public final void mBraceL() throws RecognitionException {
        try {
            int _type = BraceL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:129:8: ( '{' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:129:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BraceL"

    // $ANTLR start "BraceR"
    public final void mBraceR() throws RecognitionException {
        try {
            int _type = BraceR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:130:8: ( '}' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:130:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BraceR"

    // $ANTLR start "BracketL"
    public final void mBracketL() throws RecognitionException {
        try {
            int _type = BracketL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:131:9: ( '[' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:131:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BracketL"

    // $ANTLR start "BracketR"
    public final void mBracketR() throws RecognitionException {
        try {
            int _type = BracketR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:132:9: ( ']' )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:132:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BracketR"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
        try {
            int _type = Space;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:133:7: ( ( ' ' | '\\t' | '\\r' | '\\n' )* )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:133:9: ( ' ' | '\\t' | '\\r' | '\\n' )*
            {
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:133:9: ( ' ' | '\\t' | '\\r' | '\\n' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "Other"
    public final void mOther() throws RecognitionException {
        try {
            int _type = Other;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:135:7: ( . )
            // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:135:9: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Other"

    public void mTokens() throws RecognitionException {
        // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:8: ( Package | Option | Import | Message | Enum | Default | Number | Identity | ClassPath | Quotation | Comment | Semicolon | Dot | Equals | BraceL | BraceR | BracketL | BracketR | Space | Other )
        int alt8=20;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:10: Package
                {
                mPackage(); 


                }
                break;
            case 2 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:18: Option
                {
                mOption(); 


                }
                break;
            case 3 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:25: Import
                {
                mImport(); 


                }
                break;
            case 4 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:32: Message
                {
                mMessage(); 


                }
                break;
            case 5 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:40: Enum
                {
                mEnum(); 


                }
                break;
            case 6 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:45: Default
                {
                mDefault(); 


                }
                break;
            case 7 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:53: Number
                {
                mNumber(); 


                }
                break;
            case 8 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:60: Identity
                {
                mIdentity(); 


                }
                break;
            case 9 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:69: ClassPath
                {
                mClassPath(); 


                }
                break;
            case 10 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:79: Quotation
                {
                mQuotation(); 


                }
                break;
            case 11 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:89: Comment
                {
                mComment(); 


                }
                break;
            case 12 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:97: Semicolon
                {
                mSemicolon(); 


                }
                break;
            case 13 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:107: Dot
                {
                mDot(); 


                }
                break;
            case 14 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:111: Equals
                {
                mEquals(); 


                }
                break;
            case 15 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:118: BraceL
                {
                mBraceL(); 


                }
                break;
            case 16 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:125: BraceR
                {
                mBraceR(); 


                }
                break;
            case 17 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:132: BracketL
                {
                mBracketL(); 


                }
                break;
            case 18 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:141: BracketR
                {
                mBracketR(); 


                }
                break;
            case 19 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:150: Space
                {
                mSpace(); 


                }
                break;
            case 20 :
                // E:\\gitTest\\antlrAndProtobuf\\org\\chw\\proto\\Expr.g:1:156: Other
                {
                mOther(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\24\6\30\2\uffff\1\30\2\25\12\uffff\2\30\2\uffff\5\30\12\uffff"+
        "\12\30\1\71\5\30\1\uffff\2\30\1\101\1\102\2\30\1\105\2\uffff\1\106"+
        "\1\107\3\uffff";
    static final String DFA8_eofS =
        "\110\uffff";
    static final String DFA8_minS =
        "\1\0\6\56\2\uffff\1\56\1\0\1\57\12\uffff\2\56\2\uffff\5\56\12\uffff"+
        "\20\56\1\uffff\7\56\2\uffff\2\56\3\uffff";
    static final String DFA8_maxS =
        "\1\uffff\6\172\2\uffff\1\172\1\uffff\1\57\12\uffff\2\172\2\uffff"+
        "\5\172\12\uffff\20\172\1\uffff\7\172\2\uffff\2\172\3\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\2\7\3\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\2\23\1\24"+
        "\2\uffff\1\10\1\11\5\uffff\1\7\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
        "\1\21\1\22\20\uffff\1\5\7\uffff\1\2\1\3\2\uffff\1\1\1\4\1\6";
    static final String DFA8_specialS =
        "\1\0\11\uffff\1\1\75\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\25\2\23\2\25\1\23\22\25\1\23\1\25\1\12\13\25\1\15\1\13\1"+
            "\10\11\7\1\25\1\14\1\25\1\16\3\25\32\11\1\21\1\25\1\22\1\25"+
            "\1\11\1\25\3\11\1\6\1\5\3\11\1\3\3\11\1\4\1\11\1\2\1\1\12\11"+
            "\1\17\1\25\1\20\uff82\25",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\26"+
            "\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27"+
            "\1\32\12\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\27"+
            "\1\33\15\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27"+
            "\1\34\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27"+
            "\1\35\14\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27"+
            "\1\36\25\27",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\0\40",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27"+
            "\1\51\27\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27"+
            "\1\52\6\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27"+
            "\1\53\12\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27"+
            "\1\54\7\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27"+
            "\1\55\5\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\5\27"+
            "\1\56\24\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\12\27"+
            "\1\57\17\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27"+
            "\1\60\21\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27"+
            "\1\61\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27"+
            "\1\62\7\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\27"+
            "\1\63\15\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\64"+
            "\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\65"+
            "\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27"+
            "\1\66\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27"+
            "\1\67\10\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\70"+
            "\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27"+
            "\1\72\5\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\6\27"+
            "\1\73\23\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27"+
            "\1\74\14\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27"+
            "\1\75\6\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\6\27"+
            "\1\76\23\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27"+
            "\1\77\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27"+
            "\1\100\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27"+
            "\1\103\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27"+
            "\1\104\6\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Package | Option | Import | Message | Enum | Default | Number | Identity | ClassPath | Quotation | Comment | Semicolon | Dot | Equals | BraceL | BraceR | BracketL | BracketR | Space | Other );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='p') ) {s = 1;}

                        else if ( (LA8_0=='o') ) {s = 2;}

                        else if ( (LA8_0=='i') ) {s = 3;}

                        else if ( (LA8_0=='m') ) {s = 4;}

                        else if ( (LA8_0=='e') ) {s = 5;}

                        else if ( (LA8_0=='d') ) {s = 6;}

                        else if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {s = 7;}

                        else if ( (LA8_0=='0') ) {s = 8;}

                        else if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'c')||(LA8_0 >= 'f' && LA8_0 <= 'h')||(LA8_0 >= 'j' && LA8_0 <= 'l')||LA8_0=='n'||(LA8_0 >= 'q' && LA8_0 <= 'z')) ) {s = 9;}

                        else if ( (LA8_0=='\"') ) {s = 10;}

                        else if ( (LA8_0=='/') ) {s = 11;}

                        else if ( (LA8_0==';') ) {s = 12;}

                        else if ( (LA8_0=='.') ) {s = 13;}

                        else if ( (LA8_0=='=') ) {s = 14;}

                        else if ( (LA8_0=='{') ) {s = 15;}

                        else if ( (LA8_0=='}') ) {s = 16;}

                        else if ( (LA8_0=='[') ) {s = 17;}

                        else if ( (LA8_0==']') ) {s = 18;}

                        else if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {s = 19;}

                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||LA8_0=='!'||(LA8_0 >= '#' && LA8_0 <= '-')||LA8_0==':'||LA8_0=='<'||(LA8_0 >= '>' && LA8_0 <= '@')||LA8_0=='\\'||LA8_0=='^'||LA8_0=='`'||LA8_0=='|'||(LA8_0 >= '~' && LA8_0 <= '\uFFFF')) ) {s = 21;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA8_10 = input.LA(1);

                        s = -1;
                        if ( ((LA8_10 >= '\u0000' && LA8_10 <= '\uFFFF')) ) {s = 32;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}