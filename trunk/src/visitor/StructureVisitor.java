package visitor;

import ast.Number;
import ast.Operation;

public abstract class StructureVisitor implements Visitor {

	@Override
	public final void visit(Number number) {
		visitBefore(number);
		number.visitChildren(this);
		visitAfter(number);
	}

	protected abstract void visitAfter(Number number);

	protected abstract void visitBefore(Number number);

	@Override
	public final void visit(Operation operation) {
		visitBefore(operation);
		operation.visitChildren(this);
		visitAfter(operation);
	}
	
	protected abstract void visitAfter(Operation operation);

	protected abstract void visitBefore(Operation operation);

}
