
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public interface ExprV4ASTCreationParseListener extends ParseListener<Token> {
	void enterStart(ParserRuleContext<Token> ctx);
	void exitStart(ExprV4ASTCreationParser.StartContext ctx);
	void exitExpr(ExprV4ASTCreationParser.ExprContext ctx);
}