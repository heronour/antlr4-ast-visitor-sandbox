
package de.zeigermann.compilerSandbox.parser.v4;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExprV4ASTCreationListener extends ParseTreeListener<Token> {
	void enterRule(ExprV4ASTCreationParser.startContext ctx);
	void exitRule(ExprV4ASTCreationParser.startContext ctx);

	void enterRule(ExprV4ASTCreationParser.exprContext ctx);
	void exitRule(ExprV4ASTCreationParser.exprContext ctx);
}