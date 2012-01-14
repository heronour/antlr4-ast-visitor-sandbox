// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g 2012-01-07 16:16:49

package parser;

import ast.*;
import ast.Number;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int INT=4;
    public static final int WS=5;

    // delegates
    // delegators


        public ExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g"; }



    // $ANTLR start "start"
    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:13:1: start returns [Expression expr] : expr EOF ;
    public final Expression start() throws RecognitionException {
        Expression expr = null;

        Expression expr1 = null;


        try {
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:14:3: ( expr EOF )
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:14:5: expr EOF
            {
            pushFollow(FOLLOW_expr_in_start30);
            expr1=expr();

            state._fsp--;

             expr = expr1; 
            match(input,EOF,FOLLOW_EOF_in_start44); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "start"


    // $ANTLR start "expr"
    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:19:1: expr returns [Expression expr] : left= mulExpr ( (operator= '+' | operator= '-' ) right= expr | ) ;
    public final Expression expr() throws RecognitionException {
        Expression expr = null;

        Token operator=null;
        Expression left = null;

        Expression right = null;


        try {
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:20:3: (left= mulExpr ( (operator= '+' | operator= '-' ) right= expr | ) )
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:20:5: left= mulExpr ( (operator= '+' | operator= '-' ) right= expr | )
            {
            pushFollow(FOLLOW_mulExpr_in_expr63);
            left=mulExpr();

            state._fsp--;

            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:21:5: ( (operator= '+' | operator= '-' ) right= expr | )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=6 && LA2_0<=7)) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:21:6: (operator= '+' | operator= '-' ) right= expr
                    {
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:21:6: (operator= '+' | operator= '-' )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==6) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==7) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:21:7: operator= '+'
                            {
                            operator=(Token)match(input,6,FOLLOW_6_in_expr74); 

                            }
                            break;
                        case 2 :
                            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:21:20: operator= '-'
                            {
                            operator=(Token)match(input,7,FOLLOW_7_in_expr78); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr83);
                    right=expr();

                    state._fsp--;

                     expr = new Operation((operator!=null?operator.getText():null), left, right); 

                    }
                    break;
                case 2 :
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:24:7: 
                    {
                     expr = left; 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "expr"


    // $ANTLR start "mulExpr"
    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:28:1: mulExpr returns [Expression expr] : left= atom ( (operator= '*' | operator= '/' ) right= mulExpr | ) ;
    public final Expression mulExpr() throws RecognitionException {
        Expression expr = null;

        Token operator=null;
        Expression left = null;

        Expression right = null;


        try {
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:29:3: (left= atom ( (operator= '*' | operator= '/' ) right= mulExpr | ) )
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:29:5: left= atom ( (operator= '*' | operator= '/' ) right= mulExpr | )
            {
            pushFollow(FOLLOW_atom_in_mulExpr131);
            left=atom();

            state._fsp--;

            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:30:5: ( (operator= '*' | operator= '/' ) right= mulExpr | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=8 && LA4_0<=9)) ) {
                alt4=1;
            }
            else if ( (LA4_0==EOF||(LA4_0>=6 && LA4_0<=7)||LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:30:6: (operator= '*' | operator= '/' ) right= mulExpr
                    {
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:30:6: (operator= '*' | operator= '/' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==8) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==9) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:30:7: operator= '*'
                            {
                            operator=(Token)match(input,8,FOLLOW_8_in_mulExpr142); 

                            }
                            break;
                        case 2 :
                            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:30:20: operator= '/'
                            {
                            operator=(Token)match(input,9,FOLLOW_9_in_mulExpr146); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_mulExpr_in_mulExpr151);
                    right=mulExpr();

                    state._fsp--;

                     expr = new Operation((operator!=null?operator.getText():null), left, right); 

                    }
                    break;
                case 2 :
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:33:7: 
                    {
                     expr = left; 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "mulExpr"


    // $ANTLR start "atom"
    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:37:1: atom returns [Expression expr] : (value= INT | '(' expr ')' );
    public final Expression atom() throws RecognitionException {
        Expression expr = null;

        Token value=null;
        Expression expr2 = null;


        try {
            // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:38:4: (value= INT | '(' expr ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==10) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:38:6: value= INT
                    {
                    value=(Token)match(input,INT,FOLLOW_INT_in_atom200); 
                     expr = new Number((value!=null?value.getText():null)); 

                    }
                    break;
                case 2 :
                    // C:\\google-workspace\\ANTLR-Visitor-Demo\\src\\parser\\Expr.g:39:6: '(' expr ')'
                    {
                    match(input,10,FOLLOW_10_in_atom209); 
                    pushFollow(FOLLOW_expr_in_atom211);
                    expr2=expr();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_atom213); 
                     expr = expr2; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_start30 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulExpr_in_expr63 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_6_in_expr74 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_7_in_expr78 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_expr83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_mulExpr131 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_mulExpr142 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_9_in_mulExpr146 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_mulExpr_in_mulExpr151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atom209 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_atom211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atom213 = new BitSet(new long[]{0x0000000000000002L});

}