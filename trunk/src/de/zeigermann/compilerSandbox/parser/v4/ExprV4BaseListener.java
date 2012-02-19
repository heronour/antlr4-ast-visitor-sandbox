
package de.zeigermann.compilerSandbox.parser.v4;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class ExprV4BaseListener implements ExprV4Listener {
	public void enterOpExpr(ExprV4Parser.OpExprContext ctx) { }
	public void exitOpExpr(ExprV4Parser.OpExprContext ctx) { }

	public void enterAtomExpr(ExprV4Parser.AtomExprContext ctx) { }
	public void exitAtomExpr(ExprV4Parser.AtomExprContext ctx) { }

	public void enterParenExpr(ExprV4Parser.ParenExprContext ctx) { }
	public void exitParenExpr(ExprV4Parser.ParenExprContext ctx) { }

	public void enterStart(ExprV4Parser.StartContext ctx) { }
	public void exitStart(ExprV4Parser.StartContext ctx) { }

	public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}