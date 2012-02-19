
package de.zeigermann.compilerSandbox.parser.v4.nocontext;

import de.zeigermann.compilerSandbox.ast.*;
import de.zeigermann.compilerSandbox.ast.Number;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class ExprV4ASTCreationBaseVisitor<T> extends ParseTreeVisitor<T> implements ExprV4ASTCreationVisitor<T> {
	public T visitStart(ExprV4ASTCreationParser.StartContext ctx) { visitChildren(ctx); return null; }

	public T visitExpr(ExprV4ASTCreationParser.ExprContext ctx) { visitChildren(ctx); return null; }
}