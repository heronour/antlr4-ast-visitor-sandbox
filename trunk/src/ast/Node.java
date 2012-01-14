package ast;

import java.util.Collections;
import java.util.List;

import visitor.Visitor;

public abstract class Node {

	public List<Node> getContents() {
		return Collections.emptyList();
	}

	public List<Node> getAllContents() {
		return Collections.emptyList();
	}

	public abstract void accept(Visitor visitor);

	public abstract void visitChildren(Visitor visitor);
}
