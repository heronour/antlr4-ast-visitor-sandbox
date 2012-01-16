package ast;

import visitor.Visitor;

public abstract class Node {
	public abstract void accept(Visitor visitor);

	public abstract void visitChildren(Visitor visitor);
}
