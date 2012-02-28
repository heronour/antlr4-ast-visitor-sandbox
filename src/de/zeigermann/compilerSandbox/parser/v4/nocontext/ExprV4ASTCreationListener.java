
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExprV4ASTCreationListener extends ParseTreeListener<Token> {
	void enterStart(ExprV4ASTCreationParser.StartContext ctx);
	void exitStart(ExprV4ASTCreationParser.StartContext ctx);
	void enterExpr(ExprV4ASTCreationParser.ExprContext ctx);
	void exitExpr(ExprV4ASTCreationParser.ExprContext ctx);
}