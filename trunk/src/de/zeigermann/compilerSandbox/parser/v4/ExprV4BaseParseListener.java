
package de.zeigermann.compilerSandbox.parser.v4;


import org.antlr.v4.runtime.*;

public class ExprV4BaseParseListener implements ExprV4ParseListener {
	@Override public void enterStart(ParserRuleContext<Token> ctx) { }
	@Override public void exitOpExpr(ExprV4Parser.OpExprContext ctx) { }

	@Override public void exitAtomExpr(ExprV4Parser.AtomExprContext ctx) { }

	@Override public void exitParenExpr(ExprV4Parser.ParenExprContext ctx) { }

	@Override public void exitStart(ExprV4Parser.StartContext ctx) { }

	@Override public void enterNonLRRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}