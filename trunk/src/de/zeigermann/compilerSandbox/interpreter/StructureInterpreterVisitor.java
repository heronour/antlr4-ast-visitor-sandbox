package de.zeigermann.compilerSandbox.interpreter;

import java.util.Stack;

import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.ast.Operation.Operator;
import de.zeigermann.compilerSandbox.visitor.StructureVisitorAdapter;




public class StructureInterpreterVisitor extends StructureVisitorAdapter {

	private final Stack<Integer> stack = new Stack<Integer>();

	@Override
	protected void visitBefore(Number number) {
		stack.push(number.getValue());
	}

	@Override
	protected void visitAfter(Operation operation) {
		Operator currentOperator = operation.getOperator();
		final Integer right = stack.pop();
		final Integer left = stack.pop();
		final Integer result;
		switch (currentOperator) {
		case PLUS:
			result = left + right;
			break;
		case MINUS:
			result = left - right;
			break;
		case MULTIPLY:
			result = left * right;
			break;
		case DIVIDE:
			result = left / right;
			break;
		default:
			throw new IllegalArgumentException("Unknown operator " + currentOperator);
		}
		stack.push(result);
	}

	public Integer getResult() {
		return stack.pop();
	}
}
