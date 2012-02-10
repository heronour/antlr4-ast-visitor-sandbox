
package de.zeigermann.compilerSandbox.parser.v4;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class BlankExprV4Listener implements ExprV4Listener {
	@Override public void enterRule(ExprV4Parser.opExprContext ctx) { }
	@Override public void exitRule(ExprV4Parser.opExprContext ctx) { }

	@Override public void enterRule(ExprV4Parser.startContext ctx) { }
	@Override public void exitRule(ExprV4Parser.startContext ctx) { }

	@Override public void enterRule(ExprV4Parser.atomExprContext ctx) { }
	@Override public void exitRule(ExprV4Parser.atomExprContext ctx) { }

	@Override public void enterRule(ExprV4Parser.exprContext ctx) { }
	@Override public void exitRule(ExprV4Parser.exprContext ctx) { }

	@Override public void enterRule(ExprV4Parser.parenExprContext ctx) { }
	@Override public void exitRule(ExprV4Parser.parenExprContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}