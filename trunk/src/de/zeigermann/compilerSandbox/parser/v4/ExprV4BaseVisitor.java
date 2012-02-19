
package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class ExprV4BaseVisitor<T> extends ParseTreeVisitor<T> implements ExprV4Visitor<T> {
	public T visitOpExpr(ExprV4Parser.OpExprContext ctx) { visitChildren(ctx); return null; }

	public T visitAtomExpr(ExprV4Parser.AtomExprContext ctx) { visitChildren(ctx); return null; }

	public T visitParenExpr(ExprV4Parser.ParenExprContext ctx) { visitChildren(ctx); return null; }

	public T visitStart(ExprV4Parser.StartContext ctx) { visitChildren(ctx); return null; }
}