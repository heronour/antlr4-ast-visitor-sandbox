package visitor;

import ast.Node;
import ast.Number;
import ast.Operation;

public abstract class FlatVisitor extends StructureVisitorAdapter {

	
	protected abstract void visitFlat(Node node);
	
	
	@Override
	protected void visitBefore(Number number) {
		visitFlat(number);
	}

	@Override
	protected void visitBefore(Operation operation) {
		visitFlat(operation);
	}

}
