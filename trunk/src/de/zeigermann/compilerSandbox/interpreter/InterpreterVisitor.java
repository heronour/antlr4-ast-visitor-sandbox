package de.zeigermann.compilerSandbox.interpreter;

import java.util.Stack;

import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.ast.Operation.Operator;
import de.zeigermann.compilerSandbox.visitor.Visitor;




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
