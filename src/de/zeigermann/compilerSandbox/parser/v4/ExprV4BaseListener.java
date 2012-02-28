
package de.zeigermann.compilerSandbox.parser.v4;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExprV4BaseListener implements ExprV4Listener {
	@Override public void enterOpExpr(ExprV4Parser.OpExprContext ctx) { }
	@Override public void exitOpExpr(ExprV4Parser.OpExprContext ctx) { }
	@Override public void enterAtomExpr(ExprV4Parser.AtomExprContext ctx) { }
	@Override public void exitAtomExpr(ExprV4Parser.AtomExprContext ctx) { }
	@Override public void enterParenExpr(ExprV4Parser.ParenExprContext ctx) { }
	@Override public void exitParenExpr(ExprV4Parser.ParenExprContext ctx) { }
	@Override public void enterStart(ExprV4Parser.StartContext ctx) { }
	@Override public void exitStart(ExprV4Parser.StartContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParseTree.TerminalNode<Token> node) { }
	@Override public void visitErrorNode(ParseTree.ErrorNode<Token> node) { }
}