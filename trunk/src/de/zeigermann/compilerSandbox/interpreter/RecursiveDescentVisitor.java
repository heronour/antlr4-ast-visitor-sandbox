package interpreter;

import ast.Expression;
import ast.Node;
import ast.Number;
import ast.Operation;
import ast.Operation.Operator;

public class RecursiveDescentVisitor {

	public Integer eval(Number number) {
		return number.getValue();
	}

	public Integer eval(Node node) {
		if (node instanceof Expression) {
			return eval((Expression) node);
		} else {
			throw new IllegalArgumentException("Node " + node
					+ "kann nicht verarbeitet werden");
		}
	}

	public Integer eval(Expression expression) {
		if (expression instanceof Number) {
			return eval((Number) expression);
		} else if (expression instanceof Operation) {
			return eval((Operation) expression);
		} else {
			throw new IllegalArgumentException("Expression " + expression
					+ "kann nicht verarbeitet werden");
		}
	}

	public Integer eval(Operation operation) {
		Operator currentOperator = operation.getOperator();
		final Integer left = eval(operation.getLeft());
		final Integer right = eval(operation.getRight());
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
			throw new IllegalArgumentException("Unknown operator "
					+ currentOperator);
		}
		return result;
	}

}
