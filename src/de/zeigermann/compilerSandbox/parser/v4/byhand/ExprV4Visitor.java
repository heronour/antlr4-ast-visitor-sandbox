package de.zeigermann.compilerSandbox.parser.v4.byhand;

import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.exprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.opExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.parenExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.startContext;

public interface ExprV4Visitor<R> {
	R visit(opExprContext ctx);
	R visit(startContext ctx);
	R visit(atomExprContext ctx);
	R visit(exprContext ctx);
	R visit(parenExprContext ctx);
}