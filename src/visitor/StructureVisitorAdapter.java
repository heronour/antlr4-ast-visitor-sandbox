package visitor;

import ast.Number;
import ast.Operation;

public class StructureVisitorAdapter extends StructureVisitor {

	@Override
	protected void visitAfter(Number number) {
	}

	@Override
	protected void visitBefore(Number number) {
	}

	@Override
	protected void visitAfter(Operation operation) {
	}

	@Override
	protected void visitBefore(Operation operation) {
	}

}
