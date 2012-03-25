// $ANTLR ANTLRVersion> ExprV4Lexer.java generatedTimestamp>

package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprV4Lexer extends Lexer {
	public static final int
		T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, INT=9, WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>", "<INVALID>", "<INVALID>",
		"')'", "'+'", "'*'", "'-'", "'('", "'/'", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", "WS"
	};


	public ExprV4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN);
	}

	@Override
	public String getGrammarFileName() { return "ExprV4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }


	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch ( ruleIndex ) {
			case 0 : T__5_action((RuleContext)_localctx, actionIndex); break;

			case 1 : T__4_action((RuleContext)_localctx, actionIndex); break;

			case 2 : T__3_action((RuleContext)_localctx, actionIndex); break;

			case 3 : T__2_action((RuleContext)_localctx, actionIndex); break;

			case 4 : T__1_action((RuleContext)_localctx, actionIndex); break;

			case 5 : T__0_action((RuleContext)_localctx, actionIndex); break;

			case 6 : INT_action((RuleContext)_localctx, actionIndex); break;

			case 7 : WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void WS_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 0 : _channel = HIDDEN;  break;
		}
	}
	public void INT_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__1_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__0_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__3_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__5_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__2_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__4_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\n+\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6"+
		"\2\7\7\7\1\0\1\0\1\1\1\1\1\2\1\2\1\3\1\3\1\4\1\4\1\5\1\5\1\6\0\4\6\b\6"+
		"\13\6\f\6!\1\7\0\4\7\b\7\13\7\f\7\'\1\7\1\7\b\1\3\uffff\3\4\uffff\5\5"+
		"\uffff\7\6\uffff\t\7\uffff\13\b\uffff\r\t\uffff\17\n\0\1\0\1\3\t\n\r\r"+
		"  *\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t\1\0\0\0\0\13\1"+
		"\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\1\21\1\0\0\0\3\23\1\0\0\0\5\25\1\0\0\0"+
		"\7\27\1\0\0\0\t\31\1\0\0\0\13\33\1\0\0\0\r\37\1\0\0\0\17%\1\0\0\0\21\22"+
		"\5)\0\0\22\2\1\0\0\0\23\24\5+\0\0\24\4\1\0\0\0\25\26\5*\0\0\26\6\1\0\0"+
		"\0\27\30\5-\0\0\30\b\1\0\0\0\31\32\5(\0\0\32\n\1\0\0\0\33\34\5/\0\0\34"+
		"\f\1\0\0\0\35 \2\609\0\37\35\1\0\0\0 !\1\0\0\0!\37\1\0\0\0!\"\1\0\0\0"+
		"\"\16\1\0\0\0#&\7\0\0\0%#\1\0\0\0&\'\1\0\0\0\'%\1\0\0\0\'(\1\0\0\0()\1"+
		"\0\0\0)*\6\7\0\0*\20\1\0\0\0\3\0\1!\1\'\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}