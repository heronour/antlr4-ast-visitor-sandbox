
package de.zeigermann.compilerSandbox.parser.v4;


import org.antlr.v4.runtime.*;

public class ExprV4BaseParseListener implements ExprV4ParseListener {
	public void enterStart(ParserRuleContext<Token> ctx) { }
	public void exitOpExpr(ExprV4Parser.OpExprContext ctx) { }

	public void exitAtomExpr(ExprV4Parser.AtomExprContext ctx) { }

	public void exitParenExpr(ExprV4Parser.ParenExprContext ctx) { }

	public void exitStart(ExprV4Parser.StartContext ctx) { }

	public void enterNonLRRule(ParserRuleContext<Token> ctx) { }
	public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}