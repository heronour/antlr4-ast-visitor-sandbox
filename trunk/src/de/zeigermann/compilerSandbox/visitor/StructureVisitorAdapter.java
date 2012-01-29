package de.zeigermann.compilerSandbox.visitor;

import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;

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
