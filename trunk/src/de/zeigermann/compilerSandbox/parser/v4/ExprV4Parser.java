// $ANTLR ANTLRVersion> ExprV4Parser.java generatedTimestamp>

package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprV4Parser extends Parser {
	public static final int
		T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, INT=9, WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "<INVALID>", "<INVALID>",
		"')'", "'+'", "'*'", "'-'", "'('", "'/'", "INT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"start", "expr"
	};

	@Override
	public String getGrammarFileName() { return "ExprV4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprV4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator<Token>(this,_ATN);
	}
	public static class StartContext extends ParserRuleContext<Token> {
		public ExprContext e;
		public TerminalNode<Token> EOF() { return getToken(ExprV4Parser.EOF, 0); }
		public ExprContext expr() {
		    return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) { 
			if ( visitor instanceof ExprV4Visitor ) return ((ExprV4Visitor<T>)visitor).visitStart(this);
			else return null;
		}
		@Override
		public void enterRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ParseListener ) ((ExprV4ParseListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ParseListener ) ((ExprV4ParseListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, 0);
		enterRule(_localctx, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); ((StartContext)_localctx).e = expr(0);
			setState(6); match(EOF);
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

	public static class ExprContext extends ParserRuleContext<Token> {
		public int _p;
		public ExprContext(ParserRuleContext<Token> parent, int state) { super(parent, state); }
		public ExprContext(ParserRuleContext<Token> parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public ExprContext expr(int i) {
		    return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
		    return getRuleContexts(ExprContext.class);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).enterOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).exitOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) { 
			if ( visitor instanceof ExprV4Visitor ) return ((ExprV4Visitor<T>)visitor).visitOpExpr(this);
			else return null;
		}
		@Override
		public void exitRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ParseListener ) ((ExprV4ParseListener)listener).exitOpExpr(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public Token i;
		public TerminalNode<Token> INT() { return getToken(ExprV4Parser.INT, 0); }
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) { 
			if ( visitor instanceof ExprV4Visitor ) return ((ExprV4Visitor<T>)visitor).visitAtomExpr(this);
			else return null;
		}
		@Override
		public void exitRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ParseListener ) ((ExprV4ParseListener)listener).exitAtomExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
		    return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4Listener ) ((ExprV4Listener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) { 
			if ( visitor instanceof ExprV4Visitor ) return ((ExprV4Visitor<T>)visitor).visitParenExpr(this);
			else return null;
		}
		@Override
		public void exitRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ParseListener ) ((ExprV4ParseListener)listener).exitParenExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext<Token> _parentctx = _ctx;
		ExprContext _localctx = new ExprContext(_ctx, 2, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		pushNewRecursionContext(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 7:
					{
					_localctx = new ParenExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(8); match(7);
					setState(10); ((ParenExprContext)_localctx).e = expr(0);
					setState(12); match(3);
					}
					break;
				case INT:
					{
					_localctx = new AtomExprContext(_localctx);
					_ctx = _localctx;
					_prevctx = _localctx;
					setState(14); ((AtomExprContext)_localctx).i = match(INT);
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					_prevctx.stop = _input.LT(-1);
					{
					setState(38);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							_localctx = new OpExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							((OpExprContext)_localctx).left = _prevctx;
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(18);
							if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
							setState(24);
							//_errHandler.sync(this);
							switch ( _input.LA(1) ) {
								case 5:
									{
									setState(20); ((OpExprContext)_localctx).op = match(5);
									}
									break;
								case 8:
									{
									setState(22); ((OpExprContext)_localctx).op = match(8);
									}
									break;
								default :
									throw new NoViableAltException(this);
							}
							setState(26); ((OpExprContext)_localctx).right = expr(4);
							}
							break;

						case 2:
							{
							_localctx = new OpExprContext(new ExprContext(_parentctx, _startState, _p));
							_localctx.addChild(_prevctx);
							((OpExprContext)_localctx).left = _prevctx;
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(28);
							if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
							setState(34);
							//_errHandler.sync(this);
							switch ( _input.LA(1) ) {
								case 4:
									{
									setState(30); ((OpExprContext)_localctx).op = match(4);
									}
									break;
								case 6:
									{
									setState(32); ((OpExprContext)_localctx).op = match(6);
									}
									break;
								default :
									throw new NoViableAltException(this);
							}
							setState(36); ((OpExprContext)_localctx).right = expr(3);
							}
							break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch ( ruleIndex ) {
				case 1 : return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	public boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch ( predIndex ) {
			case 0 : return 3 >= _localctx._p;

			case 1 : return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\n,\2\0\7\0\2\1\7\1\1\0\0\1\0\1\0\1\1\0\1\1\0\1\1\1\1\1\1\0\3\1\b\1"+
		"\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\5\1\b"+
		"\1\n\1\f\1*\t\1\1\1\2\0\2\0\0\'\0\4\1\0\0\0\1+\5\uffff\0\0\2\20\1\0\0"+
		"\0\3\6\1\0\0\0\3\f\1\0\0\0\3\'\1\0\0\0\3\'\1\0\0\0\4\6\3\2\1\0\6\7\5\uffff"+
		"\0\0\7\1\1\0\0\0\b\n\5\7\0\0\n\f\3\2\1\0\f\r\5\3\0\0\r\21\1\0\0\0\16\21"+
		"\5\t\0\0\20\b\1\0\0\0\20\16\1\0\0\0\21(\1\0\0\0\22\30\4\1\0\1\24\31\5"+
		"\5\0\0\26\31\5\b\0\0\30\24\1\0\0\0\30\26\1\0\0\0\31\32\1\0\0\0\32\'\3"+
		"\2\1\0\34\"\4\1\1\1\36#\5\4\0\0 #\5\6\0\0\"\36\1\0\0\0\" \1\0\0\0#$\1"+
		"\0\0\0$\'\3\2\1\0&\22\1\0\0\0&\34\1\0\0\0\'*\1\0\0\0(&\1\0\0\0()\1\0\0"+
		"\0)\3\1\0\0\0*(\1\0\0\0\5\20\1\30\1\"\1&\1(\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}