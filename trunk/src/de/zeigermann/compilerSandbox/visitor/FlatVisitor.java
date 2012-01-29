package de.zeigermann.compilerSandbox.visitor;

import de.zeigermann.compilerSandbox.ast.Node;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;

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
