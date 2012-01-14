package parser.v4;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.ExpressionParser;
import parser.v4.ExprV4ASTCreationParser.startContext;
import ast.Expression;

public class V4ExpressionParser extends ExpressionParser  {
	
    public Expression parseExpression(String expr) {
    	CharStream input = new ANTLRInputStream(expr);
    	ExprV4ASTCreationLexer lexer = new ExprV4ASTCreationLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4ASTCreationParser parser = new ExprV4ASTCreationParser(tokens);
		startContext ctx = parser.start();
		return ctx.expr;
    }
}
