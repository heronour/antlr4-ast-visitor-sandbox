
package de.zeigermann.compilerSandbox.parser.v4;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class ExprV4ASTCreationBaseListener implements ExprV4ASTCreationListener {
	@Override public void enter(ExprV4ASTCreationParser.startContext ctx) { }
	@Override public void exit(ExprV4ASTCreationParser.startContext ctx) { }

	@Override public void enter(ExprV4ASTCreationParser.exprContext ctx) { }
	@Override public void exit(ExprV4ASTCreationParser.exprContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}