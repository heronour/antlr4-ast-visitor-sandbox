package de.zeigermann.compilerSandbox.visitor;

import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;

public interface Visitor {

	void visit(Number number);

	void visit(Operation operation);

}
