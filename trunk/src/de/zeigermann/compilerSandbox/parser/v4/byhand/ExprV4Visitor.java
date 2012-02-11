package de.zeigermann.compilerSandbox.parser.v4.byhand;

import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.exprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.opExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.parenExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.startContext;

public interface ExprV4Visitor {
	void visit(opExprContext ctx);
	void visit(startContext ctx);
	void visit(atomExprContext ctx);
	void visit(exprContext ctx);
	void visit(parenExprContext ctx);
}