package ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import visitor.Visitor;

public class Operation extends Expression {

	public static enum Operator {
		PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");
		
		static Operation.Operator toOperator(String operator) {
			if (operator.equals(PLUS.symbol)) {
				return Operation.Operator.PLUS;
			}
			if (operator.equals(MINUS.symbol)) {
				return Operation.Operator.MINUS;
			}
			if (operator.equals(MULTIPLY.symbol)) {
				return Operation.Operator.MULTIPLY;
			}
			if (operator.equals(DIVIDE.symbol)) {
				return Operation.Operator.DIVIDE;
			}
			throw new IllegalArgumentException("No such operator " + operator);
		}
		
		final String symbol;
		
		Operator(String symbol) {
			this.symbol = symbol;
		}
		
	}

	private final Operator operator;
	private final Expression left;
	private final Expression right;

	public Operation(String operator, Expression left, Expression right) {
		this(Operator.toOperator(operator), left, right);
	}

	public Operation(Operator operator, Expression left, Expression right) {
		super();
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void visitChildren(Visitor visitor) {
		left.accept(visitor);
		right.accept(visitor);
	}
	
	@Override
	public List<Node> getAllContents() {
		List<Node> contents = new ArrayList<Node>();
		contents.addAll(super.getAllContents());
		contents.add(left);
		contents.addAll(left.getAllContents());
		contents.add(right);
		contents.addAll(right.getAllContents());
		return contents;
	}

	@Override
	public List<Node> getContents() {
		List<Node> contents = new ArrayList<Node>();
		contents.addAll(super.getAllContents());
		contents.add(left);
		contents.add(right);
		return contents;
	}

	public Operator getOperator() {
		return operator;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

}
