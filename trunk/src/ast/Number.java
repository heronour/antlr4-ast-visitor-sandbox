package ast;

import visitor.Visitor;

public class Number extends Expression {

	private final Integer value;
	
	public Number(String value) {
		this(Integer.parseInt(value));
	}
	public Number(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void visitChildren(Visitor visitor) {
	}

	public Integer getValue() {
		return value;
	}

}
