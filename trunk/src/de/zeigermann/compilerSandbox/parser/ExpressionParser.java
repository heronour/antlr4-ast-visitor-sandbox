package de.zeigermann.compilerSandbox.parser;
import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.interpreter.InterpreterVisitor;

public abstract class ExpressionParser {
    
    public abstract Expression parseExpression(String expr);
    
    public int evaluate(Expression expression) {
		InterpreterVisitor interpreterVisitor = new InterpreterVisitor();
		expression.accept(interpreterVisitor);
		int result = interpreterVisitor.getResult();
		return result;
    }
}
