package visitor;

import ast.Number;
import ast.Operation;

public interface Visitor {

	void visit(Number number);

	void visit(Operation operation);

}
