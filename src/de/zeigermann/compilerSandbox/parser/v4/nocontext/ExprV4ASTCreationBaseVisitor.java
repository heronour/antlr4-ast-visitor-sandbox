
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class ExprV4ASTCreationBaseVisitor<T> extends ParseTreeVisitor<T> implements ExprV4ASTCreationVisitor<T> {
	@Override public T visitStart(ExprV4ASTCreationParser.StartContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpr(ExprV4ASTCreationParser.ExprContext ctx) { return visitChildren(ctx); }
}