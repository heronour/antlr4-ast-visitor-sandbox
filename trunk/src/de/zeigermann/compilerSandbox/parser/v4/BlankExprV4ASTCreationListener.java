
package de.zeigermann.compilerSandbox.parser.v4;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class BlankExprV4ASTCreationListener implements ExprV4ASTCreationListener {
	@Override public void enterRule(ExprV4ASTCreationParser.startContext ctx) { }
	@Override public void exitRule(ExprV4ASTCreationParser.startContext ctx) { }

	@Override public void enterRule(ExprV4ASTCreationParser.exprContext ctx) { }
	@Override public void exitRule(ExprV4ASTCreationParser.exprContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}