
package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExprV4Visitor<T> {
	T visitOpExpr(ExprV4Parser.OpExprContext ctx);
	T visitAtomExpr(ExprV4Parser.AtomExprContext ctx);
	T visitParenExpr(ExprV4Parser.ParenExprContext ctx);
	T visitStart(ExprV4Parser.StartContext ctx);
}