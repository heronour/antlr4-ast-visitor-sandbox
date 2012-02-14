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
	public ExprV4ASTCreationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator<Token>(this,_ATN);
	}
	public static class startContext extends ParserRuleContext<Token> {
		public exprContext expr;
		public Token EOF;
		public Expression expression;
		public startContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enter(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exit(this);
		}
	}

	public final startContext start() throws RecognitionException {
		startContext _localctx = new startContext(_ctx, 0);
		enterRule(_localctx, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); ((startContext)_localctx).expr = expr(0);
			((startContext)_localctx).expression =  ((startContext)_localctx).expr.expression;
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
		public Token INT;
		public exprContext expr1;
		public List<exprContext> expr = new ArrayList<exprContext>();
		public int _p;
		public Expression expression;
		public exprContext left;
		public exprContext e;
		public Token op;
		public exprContext right;
		public exprContext(ParserRuleContext<Token> parent, int state) { super(parent, state); }
		public exprContext(ParserRuleContext<Token> parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).enter(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof ExprV4ASTCreationListener ) ((ExprV4ASTCreationListener)listener).exit(this);
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
			setState(22);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case 7:
					{
					setState(10); match(7);
					setState(12); ((exprContext)_localctx).e = expr(0);
					setState(14); match(3);
					 ((exprContext)_localctx).expression =  ((exprContext)_localctx).e.expression; 
					}
					break;
				case INT:
					{
					setState(18); ((exprContext)_localctx).INT = match(INT);
					 ((exprContext)_localctx).expression =  new Number((((exprContext)_localctx).INT!=null?((exprContext)_localctx).INT.getText():null)); 
					}
					break;
				default :
					throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			int _alt72 = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt72!=2 && _alt72!=-1 ) {
				if ( _alt72==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					_prevctx.stop = _input.LT(-1);
					{
					setState(48);
					//_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							_localctx = new exprContext(_parentctx, _startState, _p);
							_localctx.addChild(_prevctx);
							_localctx.left = _prevctx;
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(24);
							if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {3 >= $_p}?");
							setState(30);
							//_errHandler.sync(this);
							switch ( _input.LA(1) ) {
								case 5:
									{
									setState(26); ((exprContext)_localctx).op = match(5);
									}
									break;
								case 8:
									{
									setState(28); ((exprContext)_localctx).op = match(8);
									}
									break;
								default :
									throw new NoViableAltException(this);
							}
							setState(32); ((exprContext)_localctx).right = expr(4);
							 ((exprContext)_localctx).expression =  new Operation((((exprContext)_localctx).op!=null?((exprContext)_localctx).op.getText():null), ((exprContext)_localctx).left.expression, ((exprContext)_localctx).right.expression); 
							}
							break;

						case 2:
							{
							_localctx = new exprContext(_parentctx, _startState, _p);
							_localctx.addChild(_prevctx);
							_localctx.left = _prevctx;
							pushNewRecursionContext(_localctx, RULE_expr);
							_localctx.start = _prevctx.start;
							setState(36);
							if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "failed predicate: {2 >= $_p}?");
							setState(42);
							//_errHandler.sync(this);
							switch ( _input.LA(1) ) {
								case 4:
									{
									setState(38); ((exprContext)_localctx).op = match(4);
									}
									break;
								case 6:
									{
									setState(40); ((exprContext)_localctx).op = match(6);
									}
									break;
								default :
									throw new NoViableAltException(this);
							}
							setState(44); ((exprContext)_localctx).right = expr(3);
							 ((exprContext)_localctx).expression =  new Operation((((exprContext)_localctx).op!=null?((exprContext)_localctx).op.getText():null), ((exprContext)_localctx).left.expression, ((exprContext)_localctx).right.expression); 
							}
							break;
					}
					} 
				}
				setState(52);
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
		"\3\n\66\2\0\7\0\2\1\7\1\1\0\0\1\0\0\1\0\1\0\1\1\0\1\1\0\1\1\0\1\1\1\1"+
		"\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1\0\1\1\1\1\1\1\0\1\1"+
		"\0\1\1\0\3\1\b\1\1\1\0\1\1\1\1\5\1\b\1\n\1\f\1\64\t\1\1\1\2\0\2\0\0.\0"+
		"\4\1\0\0\0\1\65\5\uffff\0\0\2\26\1\0\0\0\3\6\1\0\0\0\3\16\1\0\0\0\3\""+
		"\1\0\0\0\3.\1\0\0\0\4\6\3\2\1\0\6\b\6\0\uffff\0\b\t\5\uffff\0\0\t\1\1"+
		"\0\0\0\n\f\5\7\0\0\f\16\3\2\1\0\16\20\5\3\0\0\20\21\6\1\uffff\0\21\27"+
		"\1\0\0\0\22\24\5\t\0\0\24\27\6\1\uffff\0\26\n\1\0\0\0\26\22\1\0\0\0\27"+
		"\62\1\0\0\0\30\36\4\1\0\1\32\37\5\5\0\0\34\37\5\b\0\0\36\32\1\0\0\0\36"+
		"\34\1\0\0\0\37 \1\0\0\0 \"\3\2\1\0\"#\6\1\uffff\0#\61\1\0\0\0$*\4\1\1"+
		"\1&+\5\4\0\0(+\5\6\0\0*&\1\0\0\0*(\1\0\0\0+,\1\0\0\0,.\3\2\1\0./\6\1\uffff"+
		"\0/\61\1\0\0\0\60\30\1\0\0\0\60$\1\0\0\0\61\64\1\0\0\0\62\60\1\0\0\0\62"+
		"\63\1\0\0\0\63\3\1\0\0\0\64\62\1\0\0\0\5\26\1\36\1*\1\60\1\62\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}