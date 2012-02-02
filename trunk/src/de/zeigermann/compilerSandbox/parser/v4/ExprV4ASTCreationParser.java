// $ANTLR ANTLRVersion> ExprV4ASTCreationParser.java generatedTimestamp>

package de.zeigermann.compilerSandbox.parser.v4;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused"})
public class ExprV4ASTCreationParser extends Parser {
	public static final int
		T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, INT=9, WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "<INVALID>", "<INVALID>",
		"')'", "'+'", "'*'", "'-'", "'('", "'/'", "INT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_atom = 2;
	public static final String[] ruleNames = {
		"start", "expr", "atom"
	};
	public ExprV4ASTCreationParser(TokenStream input) {
		super(input);
		_interp = new v2ParserATNSimulator<Token>(this,_ATN);
	}
	public static class startContext extends ParserRuleContext<Token> {
		public Expression expr;
		public exprContext _rexpr;;
		public startContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null && listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null && listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exitRule(this);
		}
	}

	public final startContext start() throws RecognitionException {
		startContext _localctx = new startContext(_ctx, 0);
		enterRule(_localctx, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); _localctx._rexpr = expr(0);
			_localctx.expr =  _localctx._rexpr.expr;
			setState(10); match(EOF);
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
		public Expression expr;
		public exprContext left;;
		public exprContext e;;
		public exprContext right;;
		public exprContext _rexpr;;
		public atomContext _ratom;;
		public Token op;;
		public exprContext(ParserRuleContext parent, int state) { super(parent, state); }
		public exprContext(ParserRuleContext parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null && listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null && listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exitRule(this);
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
		    setState(24);
		    //_errHandler.sync(this);
		    switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
		    	case 1:
		    		{
		    		setState(12); match(7);
		    		setState(14); _localctx.e = _localctx._rexpr = expr(0);
		    		setState(16); match(3);
		    		 _localctx.expr =  _localctx.e.expr; 
		    		}
		    		break;

		    	case 2:
		    		{
		    		setState(20); _localctx._ratom = atom();
		    		 _localctx.expr =  _localctx._ratom.expr; 
		    		}
		    		break;
		    }
		    _ctx.stop = _input.LT(-1);
		    setState(52);
		    _errHandler.sync(this);
		    int _alt72 = getInterpreter().adaptivePredict(_input,4,_ctx);
		    while ( _alt72!=2 && _alt72!=-1 ) {
		        if ( _alt72==1 ) {
		    	    if ( _parseListeners!=null ) triggerExitRuleEvent();
		    	    _prevctx = _localctx;
		            {
		            setState(50);
		            //_errHandler.sync(this);
		            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
		            	case 1:
		            		{
		            		_localctx = new exprContext(_parentctx, _startState, _p);
		            		_localctx.addChild(_prevctx);
		            		_localctx.left = _prevctx;
		            		pushNewRecursionContext(_localctx, RULE_expr);
		            		setState(26);
		            		if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {3 >= $_p}?");
		            		setState(32);
		            		//_errHandler.sync(this);
		            		switch ( _input.LA(1) ) {
		            			case 5:
		            				{
		            				setState(28); _localctx.op = match(5);
		            				}
		            				break;
		            			case 8:
		            				{
		            				setState(30); _localctx.op = match(8);
		            				}
		            				break;
		            			default :
		            				throw new NoViableAltException(this);
		            		}
		            		setState(34); _localctx.right = _localctx._rexpr = expr(4);
		            		 _localctx.expr =  new Operation((_localctx.op!=null?_localctx.op.getText():null), _localctx.left.expr, _localctx.right.expr); 
		            		}
		            		break;

		            	case 2:
		            		{
		            		_localctx = new exprContext(_parentctx, _startState, _p);
		            		_localctx.addChild(_prevctx);
		            		_localctx.left = _prevctx;
		            		pushNewRecursionContext(_localctx, RULE_expr);
		            		setState(38);
		            		if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {2 >= $_p}?");
		            		setState(44);
		            		//_errHandler.sync(this);
		            		switch ( _input.LA(1) ) {
		            			case 4:
		            				{
		            				setState(40); _localctx.op = match(4);
		            				}
		            				break;
		            			case 6:
		            				{
		            				setState(42); _localctx.op = match(6);
		            				}
		            				break;
		            			default :
		            				throw new NoViableAltException(this);
		            		}
		            		setState(46); _localctx.right = _localctx._rexpr = expr(3);
		            		 _localctx.expr =  new Operation((_localctx.op!=null?_localctx.op.getText():null), _localctx.left.expr, _localctx.right.expr); 
		            		}
		            		break;
		            }
		            } 
		        }
		    	setState(54);
		    	_errHandler.sync(this);
		    	_alt72 = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public Expression expr;
		public Token _tINT;;
		public atomContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener!=null && listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener!=null && listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exitRule(this);
		}
	}

	public final atomContext atom() throws RecognitionException {
		atomContext _localctx = new atomContext(_ctx, 4);
		enterRule(_localctx, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); _localctx._tINT = match(INT);
			 _localctx.expr =  new Number((_localctx._tINT!=null?_localctx._tINT.getText():null)); 
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
		"\3\n<\2\0\7\0\2\1\7\1\2\2\7\2\1\0\0\1\0\0\1\0\1\0\1\1\0\1\1\0\1\1\0\1"+
	  "\1\1\1\1\1\0\1\1\1\1\3\1\b\1\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\1\1"+
	  "\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\1\1\5\1\b\1\n\1\f\1\66\t\1\1\2\0"+
	  "\1\2\1\2\1\2\3\0\2\4\0\0\64\0\6\1\0\0\0\1;\5\uffff\0\0\2\30\1\0\0\0\3"+
	  "\b\1\0\0\0\3\20\1\0\0\0\3$\1\0\0\0\3\60\1\0\0\0\4\67\1\0\0\0\5\26\1\0"+
	  "\0\0\6\b\3\2\1\0\b\n\6\0\uffff\0\n\13\5\uffff\0\0\13\1\1\0\0\0\f\16\5"+
	  "\7\0\0\16\20\3\2\1\0\20\22\5\3\0\0\22\23\6\1\uffff\0\23\31\1\0\0\0\24"+
	  "\26\3\4\2\0\26\27\6\1\uffff\0\27\31\1\0\0\0\30\f\1\0\0\0\30\24\1\0\0"+
	  "\0\31\64\1\0\0\0\32 \4\1\0\1\34!\5\5\0\0\36!\5\b\0\0 \34\1\0\0\0 \36"+
	  "\1\0\0\0!\"\1\0\0\0\"$\3\2\1\0$%\6\1\uffff\0%\63\1\0\0\0&,\4\1\1\1(-"+
	  "\5\4\0\0*-\5\6\0\0,(\1\0\0\0,*\1\0\0\0-.\1\0\0\0.\60\3\2\1\0\60\61\6"+
	  "\1\uffff\0\61\63\1\0\0\0\62\32\1\0\0\0\62&\1\0\0\0\63\66\1\0\0\0\64\62"+
	  "\1\0\0\0\64\65\1\0\0\0\65\3\1\0\0\0\66\64\1\0\0\0\679\5\t\0\09:\6\2\uffff"+
	  "\0:\5\1\0\0\0\5\30\1 \1,\1\62\1\64\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}