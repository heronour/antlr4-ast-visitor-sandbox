package parser;
import interpreter.InterpreterVisitor;
import ast.Expression;

public abstract class ExpressionParser {
    
    public abstract Expression parseExpression(String expr);
    
    public int evaluate(Expression expression) {
		InterpreterVisitor interpreterVisitor = new InterpreterVisitor();
		expression.accept(interpreterVisitor);
		int result = interpreterVisitor.getResult();
		return result;
    }
}
