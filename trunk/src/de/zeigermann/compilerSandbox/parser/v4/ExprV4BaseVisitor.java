
package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class ExprV4BaseVisitor<T> extends ParseTreeVisitor<T> implements ExprV4Visitor<T> {
	@Override public T visitOpExpr(ExprV4Parser.OpExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitAtomExpr(ExprV4Parser.AtomExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitParenExpr(ExprV4Parser.ParenExprContext ctx) { return visitChildren(ctx); }
	@Override public T visitStart(ExprV4Parser.StartContext ctx) { return visitChildren(ctx); }
}