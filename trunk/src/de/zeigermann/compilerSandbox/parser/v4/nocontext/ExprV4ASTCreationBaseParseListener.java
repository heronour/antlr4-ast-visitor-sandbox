
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;


import org.antlr.v4.runtime.*;

public class ExprV4ASTCreationBaseParseListener implements ExprV4ASTCreationParseListener {
	public void enterStart(ParserRuleContext<Token> ctx) { }
	public void exitStart(ExprV4ASTCreationParser.StartContext ctx) { }

	public void exitExpr(ExprV4ASTCreationParser.ExprContext ctx) { }

	public void enterNonLRRule(ParserRuleContext<Token> ctx) { }
	public void exitEveryRule(ParserRuleContext<Token> ctx) { }
	public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) { }
}