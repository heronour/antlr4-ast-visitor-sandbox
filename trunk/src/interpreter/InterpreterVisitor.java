package interpreter;

import java.util.Stack;

import visitor.Visitor;

import ast.Number;
import ast.Operation;
import ast.Operation.Operator;


public class InterpreterVisitor implements Visitor {

	private final Stack<Integer> stack = new Stack<Integer>();

	@Override
	public void visit(Number number) {
		stack.push(number.getValue());
	}

	@Override
	public void visit(Operation operation) {
		operation.visitChildren(this);
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
