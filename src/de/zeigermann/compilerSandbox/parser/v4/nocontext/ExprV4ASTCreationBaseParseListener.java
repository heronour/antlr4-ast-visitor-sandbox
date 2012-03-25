
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;


import org.antlr.v4.runtime.*;

public class ExprV4ASTCreationBaseParseListener implements ExprV4ASTCreationParseListener {
	@Override public void enterStart(ParserRuleContext<Token> ctx) { }
	@Override public void exitStart(ExprV4ASTCreationParser.StartContext ctx) { }

	@Override public void exitExpr(ExprV4ASTCreationParser.ExprContext ctx) { }

	@Override public void enterNonLRRule(ParserRuleContext<Token> ctx) { }
	@Override public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	@Override public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}