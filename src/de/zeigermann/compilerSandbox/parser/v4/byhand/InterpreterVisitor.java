package de.zeigermann.compilerSandbox.parser.v4.byhand;

import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.exprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.opExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.parenExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.startContext;

class InterpreterVisitor implements ExprV4Visitor<Integer> {

	@Override
	public Integer visit(opExprContext ctx) {
		final String operator = ctx.op.getText();
		final int left = ctx.left.accept(this);
		final int right = ctx.right.accept(this);
		final int result;
		if (operator.equals("+")) {
			result = left + right;
		} else if (operator.equals("-")) {
			result = left - right;
		} else if (operator.equals("*")) {
			result = left * right;
		} else if (operator.equals("/")) {
			result = left / right;
		} else {
			throw new IllegalArgumentException("Unknown operator " + operator);
		}
		return result;
	}

	@Override
	public Integer visit(startContext ctx) {
		return ctx.e.accept(this);
	}

	@Override
	public Integer visit(atomExprContext ctx) {
		int value = Integer.parseInt(ctx.i.getText());
		return value;
	}

	@Override
	public Integer visit(exprContext ctx) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Integer visit(parenExprContext ctx) {
		return ctx.e.accept(this);
	}
}