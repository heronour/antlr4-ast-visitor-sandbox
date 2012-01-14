// $ANTLR ANTLRVersion> ExprV4Parser.java generatedTimestamp>

package parser.v4;

import ast.*;
import ast.Number;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused"})
public class ExprV4Parser extends Parser {
	public static final int
		T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, INT=9, WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "<INVALID>", "<INVALID>",
		")", "+", "*", "-", "(", "/", "INT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_atom = 2;
	public static final String[] ruleNames = {
		"start", "expr", "atom"
	};
	public ExprV4Parser(TokenStream input) {
		super(input);
		_interp = new v2ParserATNSimulator<Token>(this,_ATN);
	}
	public static class startContext extends ParserRuleContext<Token> {
		public startContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).exitRule(this);
		}
	}

	public final startContext start() throws RecognitionException {
		startContext _localctx = new startContext(_ctx, 0);
		enterRule(_localctx, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); expr(0);
			setState(8); match(EOF);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class exprContext extends ParserRuleContext<Token> {
		public int _p;
		public exprContext left;;
		public exprContext e;;
		public atomContext a;;
		public exprContext right;;
		public Token op;;
		public exprContext(ParserRuleContext parent, int state) { super(parent, state); }
		public exprContext(ParserRuleContext parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
	 
		public exprContext() { }
		public void copyFrom(exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
			this.left = ctx.left;
			this.e = ctx.e;
			this.a = ctx.a;
			this.right = ctx.right;
			this.op = ctx.op;
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).exitRule(this);
		}
	}
	public static class opExprContext extends exprContext {
		public opExprContext(exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).exitRule(this);
		}
	}
	public static class atomExprContext extends exprContext {
		public atomExprContext(exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).exitRule(this);
		}
	}
	public static class parenExprContext extends exprContext {
		public parenExprContext(exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).exitRule(this);
		}
	}

	public final exprContext expr(int _p) throws RecognitionException {
	    ParserRuleContext<Token> _parentctx = _ctx;
		exprContext _localctx = new exprContext(_ctx, 2, _p);
		exprContext _prevctx = _localctx;
		int _startState = 2;
	    pushNewRecursionContext(_localctx, RULE_expr);
		try {
		    enterOuterAlt(_localctx, 1);
		    {
		    setState(18);
		    //_errHandler.sync(this);
		    switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
		    	case 1:
		    		{
		    		_localctx = new parenExprContext(_localctx);
		    		_ctx = _localctx;
		    		_prevctx = _localctx;
		    		setState(10); match(7);
		    		setState(12); _localctx.e = expr(0);
		    		setState(14); match(3);
		    		}
		    		break;
		    	case 2:
		    		{
		    		_localctx = new atomExprContext(_localctx);
		    		_ctx = _localctx;
		    		_prevctx = _localctx;
		    		setState(16); _localctx.a = atom();
		    		}
		    		break;
		    }
		    _ctx.stop = _input.LT(-1);
		    setState(42);
		    _errHandler.sync(this);
		    int _alt62 = getInterpreter().adaptivePredict(_input,4,_ctx);
		    while ( _alt62!=2 && _alt62!=-1 ) {
		        if ( _alt62==1 ) {
		    	    if ( _parseListeners!=null ) triggerExitRuleEvent();
		    	    _prevctx = _localctx;
		            {
		            setState(40);
		            //_errHandler.sync(this);
		            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
		            	case 1:
		            		{
		            		_localctx = new opExprContext(new exprContext(_parentctx, _startState, _p));
		            		_localctx.addChild(_prevctx);
		            		_localctx.left = _prevctx;
		            		pushNewRecursionContext(_localctx, RULE_expr);
		            		setState(20);
		            		if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {3 >= $_p}?");
		            		setState(26);
		            		//_errHandler.sync(this);
		            		switch ( _input.LA(1) ) {
		            			case 5:
		            				{
		            				setState(22); _localctx.op = match(5);
		            				}
		            				break;
		            			case 8:
		            				{
		            				setState(24); _localctx.op = match(8);
		            				}
		            				break;
		            			default :
		            				throw new NoViableAltException(this);
		            		}
		            		setState(28); _localctx.right = expr(4);
		            		}
		            		break;
		            	case 2:
		            		{
		            		_localctx = new opExprContext(new exprContext(_parentctx, _startState, _p));
		            		_localctx.addChild(_prevctx);
		            		_localctx.left = _prevctx;
		            		pushNewRecursionContext(_localctx, RULE_expr);
		            		setState(30);
		            		if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {2 >= $_p}?");
		            		setState(36);
		            		//_errHandler.sync(this);
		            		switch ( _input.LA(1) ) {
		            			case 4:
		            				{
		            				setState(32); _localctx.op = match(4);
		            				}
		            				break;
		            			case 6:
		            				{
		            				setState(34); _localctx.op = match(6);
		            				}
		            				break;
		            			default :
		            				throw new NoViableAltException(this);
		            		}
		            		setState(38); _localctx.right = expr(3);
		            		}
		            		break;
		            }
		            } 
		        }
		    	setState(44);
		    	_errHandler.sync(this);
		    	_alt62 = getInterpreter().adaptivePredict(_input,4,_ctx);
		    }
		    }
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class atomContext extends ParserRuleContext<Token> {
		public Token i;;
		public atomContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null ) ((ExprV4Listener)listener).exitRule(this);
		}
	}

	public final atomContext atom() throws RecognitionException {
		atomContext _localctx = new atomContext(_ctx, 4);
		enterRule(_localctx, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); _localctx.i = match(INT);
			}
			_localctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@Override
	public String[] getTokenNames() { return tokenNames; }
	@Override
	public String[] getRuleNames() { return ruleNames; }
	@Override
	public ATN getATN() { return _ATN; }

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch ( ruleIndex ) {
				case 1 : return expr_sempred((exprContext)_localctx, predIndex);
		}
		return true;
	}
	public boolean expr_sempred(exprContext _localctx, int predIndex) {
		switch ( predIndex ) {
			case 0 : return 3 >= _localctx._p;
			case 1 : return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\n\60\2\0\7\0\2\1\7\1\2\2\7\2\1\0\0\1\0\1\0\1\1\0\1\1\0\1\1\1\1\1\1"+
	  "\0\3\1\b\1\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\0\1\1\0\1\1\0\3\1\b\1"+
	  "\1\1\0\5\1\b\1\n\1\f\1,\t\1\1\2\1\2\1\2\3\0\2\4\0\0+\0\6\1\0\0\0\1/\5"+
	  "\uffff\0\0\2\22\1\0\0\0\3\b\1\0\0\0\3\16\1\0\0\0\3)\1\0\0\0\3)\1\0\0"+
	  "\0\4-\1\0\0\0\5\23\1\0\0\0\6\b\3\2\1\0\b\t\5\uffff\0\0\t\1\1\0\0\0\n"+
	  "\f\5\7\0\0\f\16\3\2\1\0\16\17\5\3\0\0\17\23\1\0\0\0\20\23\3\4\2\0\22"+
	  "\n\1\0\0\0\22\20\1\0\0\0\23*\1\0\0\0\24\32\4\1\0\1\26\33\5\5\0\0\30\33"+
	  "\5\b\0\0\32\26\1\0\0\0\32\30\1\0\0\0\33\34\1\0\0\0\34)\3\2\1\0\36$\4"+
	  "\1\1\1 %\5\4\0\0\"%\5\6\0\0$ \1\0\0\0$\"\1\0\0\0%&\1\0\0\0&)\3\2\1\0"+
	  "(\24\1\0\0\0(\36\1\0\0\0),\1\0\0\0*(\1\0\0\0*+\1\0\0\0+\3\1\0\0\0,*\1"+
	  "\0\0\0-.\5\t\0\0.\5\1\0\0\0\5\22\1\32\1$\1(\1*\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}