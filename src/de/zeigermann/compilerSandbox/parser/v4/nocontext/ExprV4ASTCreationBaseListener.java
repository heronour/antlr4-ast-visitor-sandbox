
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class ExprV4ASTCreationBaseListener implements ExprV4ASTCreationListener {
	public void enterStart(ExprV4ASTCreationParser.StartContext ctx) { }
	public void exitStart(ExprV4ASTCreationParser.StartContext ctx) { }

	public void enterExpr(ExprV4ASTCreationParser.ExprContext ctx) { }
	public void exitExpr(ExprV4ASTCreationParser.ExprContext ctx) { }

	public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}