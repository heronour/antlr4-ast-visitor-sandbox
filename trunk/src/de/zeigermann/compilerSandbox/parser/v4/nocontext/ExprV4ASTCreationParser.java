// $ANTLR ANTLRVersion> ExprV4ASTCreationParser.java generatedTimestamp>

package de.zeigermann.compilerSandbox.parser.v4.nocontext;

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprV4ASTCreationParser extends Parser {
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
	public String getGrammarFileName() { return "ExprV4ASTCreation.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprV4ASTCreationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator<Token>(this,_ATN);
	}
	public static class StartContext extends ParserRuleContext<Token> {
		public Expression expression;
		public ExprContext expr;
		public TerminalNode<Token> EOF() { return getToken(ExprV4ASTCreationParser.EOF, 0); }
		public ExprContext expr() {
		    return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprV4ASTCreationVisitor ) return ((ExprV4ASTCreationVisitor<T>)visitor).visitStart(this);
			else return null;
		}
		@Override
		public void enterRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationParseListener ) ((ExprV4ASTCreationParseListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationParseListener ) ((ExprV4ASTCreationParseListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, 0);
		enterRule(_localctx, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); ((StartContext)_localctx).expr = expr(0);
			((StartContext)_localctx).expression =  ((StartContext)_localctx).expr.expression;
			setState(8); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public Expression expression;
		public ExprContext left;
		public ExprContext e;
		public Token INT;
		public Token op;
		public ExprContext right;
		public TerminalNode<Token> INT() { return getToken(ExprV4ASTCreationParser.INT, 0); }
		public ExprContext expr(int i) {
		    return getRuleContext(ExprContext.class,i);
		}
		public List<? extends ExprContext> expr() {
		    return getRuleContexts(ExprContext.class);
		}
		public ExprContext(ParserRuleContext<Token> parent, int state) { super(parent, state); }
		public ExprContext(ParserRuleContext<Token> parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprV4ASTCreationVisitor ) return ((ExprV4ASTCreationVisitor<T>)visitor).visitExpr(this);
			else return null;
		}
		@Override
		public void exitRule(ParseListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationParseListener ) ((ExprV4ASTCreationParseListener)listener).exitExpr(this);
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
			setState(24);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 7:
					{
					setState(12); match(7);
					setState(14); ((ExprContext)_localctx).e = expr(0);
					setState(16); match(3);
					 ((ExprContext)_localctx).expression =  ((ExprContext)_localctx).e.expression; 
					}
					break;
				case INT:
					{
					setState(20); ((ExprContext)_localctx).INT = match(INT);
					 ((ExprContext)_localctx).expression =  new Number((((ExprContext)_localctx).INT!=null?((ExprContext)_localctx).INT.getText():null)); 
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					_prevctx.stop = _input.LT(-1);
					{
					setState(50);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							_localctx = new ExprContext(_parentctx, _startState, _p);
							_localctx.addChild(_prevctx);
							_localctx.left = _prevctx;
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(26);
							if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
							setState(32);
							//_errHandler.sync(this);
							switch ( _input.LA(1) ) {
								case 5:
									{
									setState(28); ((ExprContext)_localctx).op = match(5);
									}
									break;
								case 8:
									{
									setState(30); ((ExprContext)_localctx).op = match(8);
									}
									break;
								default :
									throw new NoViableAltException(this);
							}
							setState(34); ((ExprContext)_localctx).right = expr(4);
							 ((ExprContext)_localctx).expression =  new Operation((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).left.expression, ((ExprContext)_localctx).right.expression); 
							}
							break;

						case 2:
							{
							_localctx = new ExprContext(_parentctx, _startState, _p);
							_localctx.addChild(_prevctx);
							_localctx.left = _prevctx;
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(38);
							if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
							setState(44);
							//_errHandler.sync(this);
							switch ( _input.LA(1) ) {
								case 4:
									{
									setState(40); ((ExprContext)_localctx).op = match(4);
									}
									break;
								case 6:
									{
									setState(42); ((ExprContext)_localctx).op = match(6);
									}
									break;
								default :
									throw new NoViableAltException(this);
							}
							setState(46); ((ExprContext)_localctx).right = expr(3);
							 ((ExprContext)_localctx).expression =  new Operation((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).left.expression, ((ExprContext)_localctx).right.expression); 
							}
							break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		"\3\n8\2\0\7\0\2\1\7\1\1\0\0\1\0\0\1\0\1\0\1\1\0\1\1\0\1\1\0\1\1\0\1\1"+
		"\1\1\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\1\1\1\1\0"+
		"\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\1\1\5\1\b\1\n\1\f\1\66\t\1\1\1\2\0\2\0"+
		"\0/\0\4\1\0\0\0\1\67\5\uffff\0\0\2\30\1\0\0\0\3\6\1\0\0\0\3\20\1\0\0\0"+
		"\3$\1\0\0\0\3\60\1\0\0\0\4\6\3\2\1\0\6\b\6\0\uffff\0\b\t\5\uffff\0\0\t"+
		"\1\1\0\0\0\n\f\6\1\uffff\0\f\16\5\7\0\0\16\20\3\2\1\0\20\22\5\3\0\0\22"+
		"\23\6\1\uffff\0\23\31\1\0\0\0\24\26\5\t\0\0\26\31\6\1\uffff\0\30\n\1\0"+
		"\0\0\30\24\1\0\0\0\31\64\1\0\0\0\32 \4\1\0\1\34!\5\5\0\0\36!\5\b\0\0 "+
		"\34\1\0\0\0 \36\1\0\0\0!\"\1\0\0\0\"$\3\2\1\0$%\6\1\uffff\0%\63\1\0\0"+
		"\0&,\4\1\1\1(-\5\4\0\0*-\5\6\0\0,(\1\0\0\0,*\1\0\0\0-.\1\0\0\0.\60\3\2"+
		"\1\0\60\61\6\1\uffff\0\61\63\1\0\0\0\62\32\1\0\0\0\62&\1\0\0\0\63\66\1"+
		"\0\0\0\64\62\1\0\0\0\64\65\1\0\0\0\65\3\1\0\0\0\66\64\1\0\0\0\5\30\1 "+
		"\1,\1\62\1\64\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}