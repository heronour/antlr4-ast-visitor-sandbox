package interpreter;

import org.eclipse.xtext.util.PolymorphicDispatcher;

import ast.Node;
import ast.Number;
import ast.Operation;
import ast.Operation.Operator;

public class PolymorphicDispatchVisitor {

	private PolymorphicDispatcher<Integer> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("eval", this);

	public Integer eval(Node node) {
		return dispatcher.invoke(node);
	}

	public Integer eval(Number number) {
		return number.getValue();
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
