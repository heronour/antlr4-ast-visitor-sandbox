package interpreter;

import java.util.Stack;

import visitor.StructureVisitorAdapter;

import ast.Number;
import ast.Operation;
import ast.Operation.Operator;


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
