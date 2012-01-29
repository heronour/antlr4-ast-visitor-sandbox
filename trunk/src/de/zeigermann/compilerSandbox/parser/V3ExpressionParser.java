package de.zeigermann.compilerSandbox.parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import de.zeigermann.compilerSandbox.ast.Expression;


public class V3ExpressionParser extends ExpressionParser {

	public Expression parseExpression(String expr) {
		CharStream input = new ANTLRStringStream(expr);
		ExprLexer lexer = new ExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);
		Expression expression;
		try {
			expression = parser.start();
		} catch (RecognitionException e) {
			throw new RuntimeException(e);
		}
		return expression;
	}

}
