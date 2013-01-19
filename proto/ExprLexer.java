// $ANTLR 3.4 G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g 2013-01-19 13:33:08

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
    public String getGrammarFileName() { return "G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g"; }

    // $ANTLR start "Package"
    public final void mPackage() throws RecognitionException {
        try {
            int _type = Package;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:105:9: ( 'package' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:105:11: 'package'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:106:9: ( 'option' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:106:11: 'option'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:107:9: ( 'import' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:107:11: 'import'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:108:9: ( 'message' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:108:11: 'message'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:109:9: ( 'enum' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:109:11: 'enum'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:110:9: ( 'default' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:110:11: 'default'
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

    // $ANTLR start "Attribute"
    public final void mAttribute() throws RecognitionException {
        try {
            int _type = Attribute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:112:11: ( 'optional' | 'repeated' | 'required' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='o') ) {
                alt1=1;
            }
            else if ( (LA1_0=='r') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='e') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='p') ) {
                        alt1=2;
                    }
                    else if ( (LA1_3=='q') ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:112:13: 'optional'
                    {
                    match("optional"); 



                    }
                    break;
                case 2 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:112:26: 'repeated'
                    {
                    match("repeated"); 



                    }
                    break;
                case 3 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:112:39: 'required'
                    {
                    match("required"); 



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
    // $ANTLR end "Attribute"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:11: ( 'int32' | 'sint32' | 'uint32' | 'int64' | 'sint64' | 'uint64' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='n') ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4=='t') ) {
                        int LA2_7 = input.LA(4);

                        if ( (LA2_7=='3') ) {
                            alt2=1;
                        }
                        else if ( (LA2_7=='6') ) {
                            alt2=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 's':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='i') ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5=='n') ) {
                        int LA2_8 = input.LA(4);

                        if ( (LA2_8=='t') ) {
                            int LA2_12 = input.LA(5);

                            if ( (LA2_12=='3') ) {
                                alt2=2;
                            }
                            else if ( (LA2_12=='6') ) {
                                alt2=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 12, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'u':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='i') ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='n') ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9=='t') ) {
                            int LA2_13 = input.LA(5);

                            if ( (LA2_13=='3') ) {
                                alt2=3;
                            }
                            else if ( (LA2_13=='6') ) {
                                alt2=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 13, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:13: 'int32'
                    {
                    match("int32"); 



                    }
                    break;
                case 2 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:23: 'sint32'
                    {
                    match("sint32"); 



                    }
                    break;
                case 3 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:34: 'uint32'
                    {
                    match("uint32"); 



                    }
                    break;
                case 4 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:45: 'int64'
                    {
                    match("int64"); 



                    }
                    break;
                case 5 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:55: 'sint64'
                    {
                    match("sint64"); 



                    }
                    break;
                case 6 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:113:66: 'uint64'
                    {
                    match("uint64"); 



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
    // $ANTLR end "Type"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:114:11: ( '0' .. '9' | '1' .. '9' ( '0' .. '9' )+ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1 >= '0' && LA4_1 <= '9')) ) {
                    alt4=2;
                }
                else {
                    alt4=1;
                }
            }
            else if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:114:13: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:114:24: '1' .. '9' ( '0' .. '9' )+
                    {
                    matchRange('1','9'); 

                    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:114:33: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:115:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:115:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:115:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:
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
            	    break loop5;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:116:11: ( Identity ( Dot Identity )* )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:116:13: Identity ( Dot Identity )*
            {
            mIdentity(); 


            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:116:22: ( Dot Identity )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='.') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:116:23: Dot Identity
            	    {
            	    mDot(); 


            	    mIdentity(); 


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
    // $ANTLR end "ClassPath"

    // $ANTLR start "Quotation"
    public final void mQuotation() throws RecognitionException {
        try {
            int _type = Quotation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:117:11: ( '\"' ( . )* '\"' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:117:13: '\"' ( . )* '\"'
            {
            match('\"'); 

            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:117:17: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    alt7=2;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:117:17: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:118:11: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:118:13: '//' (~ ( '\\r' | '\\n' ) )*
            {
            match("//"); 



            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:118:18: (~ ( '\\r' | '\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:
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
            	    break loop8;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:119:11: ( ';' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:119:13: ';'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:120:5: ( '.' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:120:7: '.'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:121:8: ( '=' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:121:10: '='
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:122:8: ( '{' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:122:10: '{'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:123:8: ( '}' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:123:10: '}'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:124:9: ( '[' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:124:11: '['
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:125:9: ( ']' )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:125:11: ']'
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:126:7: ( ( ' ' | '\\t' | '\\r' | '\\n' )* )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:126:9: ( ' ' | '\\t' | '\\r' | '\\n' )*
            {
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:126:9: ( ' ' | '\\t' | '\\r' | '\\n' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:
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
            	    break loop9;
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
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:128:7: ( . )
            // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:128:9: .
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
        // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:8: ( Package | Option | Import | Message | Enum | Default | Attribute | Type | Number | Identity | ClassPath | Quotation | Comment | Semicolon | Dot | Equals | BraceL | BraceR | BracketL | BracketR | Space | Other )
        int alt10=22;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:10: Package
                {
                mPackage(); 


                }
                break;
            case 2 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:18: Option
                {
                mOption(); 


                }
                break;
            case 3 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:25: Import
                {
                mImport(); 


                }
                break;
            case 4 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:32: Message
                {
                mMessage(); 


                }
                break;
            case 5 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:40: Enum
                {
                mEnum(); 


                }
                break;
            case 6 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:45: Default
                {
                mDefault(); 


                }
                break;
            case 7 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:53: Attribute
                {
                mAttribute(); 


                }
                break;
            case 8 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:63: Type
                {
                mType(); 


                }
                break;
            case 9 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:68: Number
                {
                mNumber(); 


                }
                break;
            case 10 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:75: Identity
                {
                mIdentity(); 


                }
                break;
            case 11 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:84: ClassPath
                {
                mClassPath(); 


                }
                break;
            case 12 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:94: Quotation
                {
                mQuotation(); 


                }
                break;
            case 13 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:104: Comment
                {
                mComment(); 


                }
                break;
            case 14 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:112: Semicolon
                {
                mSemicolon(); 


                }
                break;
            case 15 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:122: Dot
                {
                mDot(); 


                }
                break;
            case 16 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:126: Equals
                {
                mEquals(); 


                }
                break;
            case 17 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:133: BraceL
                {
                mBraceL(); 


                }
                break;
            case 18 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:140: BraceR
                {
                mBraceR(); 


                }
                break;
            case 19 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:147: BracketL
                {
                mBracketL(); 


                }
                break;
            case 20 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:156: BracketR
                {
                mBracketR(); 


                }
                break;
            case 21 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:165: Space
                {
                mSpace(); 


                }
                break;
            case 22 :
                // G:\\MyWork\\Dev\\eclipse_project\\JfaceProject\\src1\\org\\chw\\proto\\Expr.g:1:171: Other
                {
                mOther(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\27\11\33\2\uffff\1\33\2\30\12\uffff\2\33\2\uffff\11\33\12\uffff"+
        "\21\33\1\115\10\33\2\130\1\33\1\uffff\10\33\1\143\1\144\1\uffff"+
        "\4\33\4\130\1\151\1\33\2\uffff\1\153\1\154\2\33\1\uffff\1\157\2"+
        "\uffff\2\157\1\uffff";
    static final String DFA10_eofS =
        "\160\uffff";
    static final String DFA10_minS =
        "\1\0\11\56\2\uffff\1\56\1\0\1\57\12\uffff\2\56\2\uffff\11\56\12"+
        "\uffff\35\56\1\uffff\12\56\1\uffff\12\56\2\uffff\4\56\1\uffff\1"+
        "\56\2\uffff\2\56\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\11\172\2\uffff\1\172\1\uffff\1\57\12\uffff\2\172\2\uffff"+
        "\11\172\12\uffff\35\172\1\uffff\12\172\1\uffff\12\172\2\uffff\4"+
        "\172\1\uffff\1\172\2\uffff\2\172\1\uffff";
    static final String DFA10_acceptS =
        "\12\uffff\2\11\3\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\25\1"+
        "\26\2\uffff\1\12\1\13\11\uffff\1\11\1\14\1\15\1\16\1\17\1\20\1\21"+
        "\1\22\1\23\1\24\35\uffff\1\5\12\uffff\1\10\12\uffff\1\2\1\3\4\uffff"+
        "\1\1\1\uffff\1\4\1\6\2\uffff\1\7";
    static final String DFA10_specialS =
        "\1\0\14\uffff\1\1\142\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\30\2\26\2\30\1\26\22\30\1\26\1\30\1\15\13\30\1\20\1\16\1"+
            "\13\11\12\1\30\1\17\1\30\1\21\3\30\32\14\1\24\1\30\1\25\1\30"+
            "\1\14\1\30\3\14\1\6\1\5\3\14\1\3\3\14\1\4\1\14\1\2\1\1\1\14"+
            "\1\7\1\10\1\14\1\11\5\14\1\22\1\30\1\23\uff82\30",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\31"+
            "\31\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\35\12\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32"+
            "\1\36\1\37\14\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\40\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\41\14\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\42\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\43\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\44\21\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\45\21\32",
            "",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\0\47",
            "\1\50",
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
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32"+
            "\1\60\27\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\61\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\62\12\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\63\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32"+
            "\1\64\7\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\65\5\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\5\32"+
            "\1\66\24\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\67\1\70\11\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\71\14\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\72\14\32",
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
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\12\32"+
            "\1\73\17\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\74\21\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\75\13\32",
            "\1\34\1\uffff\3\32\1\76\2\32\1\77\3\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32"+
            "\1\100\7\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32"+
            "\1\101\15\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\102"+
            "\31\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\103\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\104\5\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\105\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\106\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\107"+
            "\31\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\110\13\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\111\10\32",
            "\1\34\1\uffff\2\32\1\112\7\32\7\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32",
            "\1\34\1\uffff\4\32\1\113\5\32\7\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\114"+
            "\31\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\116\5\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\117"+
            "\31\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\120\21\32",
            "\1\34\1\uffff\3\32\1\121\2\32\1\122\3\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32",
            "\1\34\1\uffff\3\32\1\123\2\32\1\124\3\32\7\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\125\23\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\126\14\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\127\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\131\23\32",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\132\16\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\133\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\134\10\32",
            "\1\34\1\uffff\2\32\1\135\7\32\7\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32",
            "\1\34\1\uffff\4\32\1\136\5\32\7\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32",
            "\1\34\1\uffff\2\32\1\137\7\32\7\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32",
            "\1\34\1\uffff\4\32\1\140\5\32\7\uffff\32\32\4\uffff\1\32\1"+
            "\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\141\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\142"+
            "\31\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\145\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\146\6\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\147\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\150\25\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\152\16\32",
            "",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\155\26\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\156\26\32",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\34\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Package | Option | Import | Message | Enum | Default | Attribute | Type | Number | Identity | ClassPath | Quotation | Comment | Semicolon | Dot | Equals | BraceL | BraceR | BracketL | BracketR | Space | Other );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='p') ) {s = 1;}

                        else if ( (LA10_0=='o') ) {s = 2;}

                        else if ( (LA10_0=='i') ) {s = 3;}

                        else if ( (LA10_0=='m') ) {s = 4;}

                        else if ( (LA10_0=='e') ) {s = 5;}

                        else if ( (LA10_0=='d') ) {s = 6;}

                        else if ( (LA10_0=='r') ) {s = 7;}

                        else if ( (LA10_0=='s') ) {s = 8;}

                        else if ( (LA10_0=='u') ) {s = 9;}

                        else if ( ((LA10_0 >= '1' && LA10_0 <= '9')) ) {s = 10;}

                        else if ( (LA10_0=='0') ) {s = 11;}

                        else if ( ((LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'c')||(LA10_0 >= 'f' && LA10_0 <= 'h')||(LA10_0 >= 'j' && LA10_0 <= 'l')||LA10_0=='n'||LA10_0=='q'||LA10_0=='t'||(LA10_0 >= 'v' && LA10_0 <= 'z')) ) {s = 12;}

                        else if ( (LA10_0=='\"') ) {s = 13;}

                        else if ( (LA10_0=='/') ) {s = 14;}

                        else if ( (LA10_0==';') ) {s = 15;}

                        else if ( (LA10_0=='.') ) {s = 16;}

                        else if ( (LA10_0=='=') ) {s = 17;}

                        else if ( (LA10_0=='{') ) {s = 18;}

                        else if ( (LA10_0=='}') ) {s = 19;}

                        else if ( (LA10_0=='[') ) {s = 20;}

                        else if ( (LA10_0==']') ) {s = 21;}

                        else if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 22;}

                        else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\b')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\u001F')||LA10_0=='!'||(LA10_0 >= '#' && LA10_0 <= '-')||LA10_0==':'||LA10_0=='<'||(LA10_0 >= '>' && LA10_0 <= '@')||LA10_0=='\\'||LA10_0=='^'||LA10_0=='`'||LA10_0=='|'||(LA10_0 >= '~' && LA10_0 <= '\uFFFF')) ) {s = 24;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_13 = input.LA(1);

                        s = -1;
                        if ( ((LA10_13 >= '\u0000' && LA10_13 <= '\uFFFF')) ) {s = 39;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}