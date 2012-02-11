package de.zeigermann.compilerSandbox.parser.v4.byhand;

import java.util.Stack;

import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.opExprContext;

class DirectInterpreterListener extends BlankExprV4Listener {
	public Integer getResult() {
		return stack.pop();
	}
	private final Stack<Integer> stack = new Stack<Integer>();

	@Override
	public void exitRule(atomExprContext ctx) {
		int value = Integer.parseInt(ctx.i.getText());
		stack.push(value);
	}

	@Override
	public void exitRule(opExprContext ctx) {
		final String operator = ctx.op.getText();
		final int right = stack.pop();
		final int left = stack.pop();
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
		stack.push(result);
	}
}