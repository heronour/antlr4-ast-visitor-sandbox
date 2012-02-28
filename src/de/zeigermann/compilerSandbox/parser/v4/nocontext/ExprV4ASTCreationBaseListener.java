
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExprV4ASTCreationBaseListener implements ExprV4ASTCreationListener {
	@Override public void enterStart(ExprV4ASTCreationParser.StartContext ctx) { }
	@Override public void exitStart(ExprV4ASTCreationParser.StartContext ctx) { }
	@Override public void enterExpr(ExprV4ASTCreationParser.ExprContext ctx) { }
	@Override public void exitExpr(ExprV4ASTCreationParser.ExprContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParseTree.TerminalNode<Token> node) { }
	@Override public void visitErrorNode(ParseTree.ErrorNode<Token> node) { }
}