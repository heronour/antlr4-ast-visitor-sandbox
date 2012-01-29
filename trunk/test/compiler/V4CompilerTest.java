package compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import parser.ExpressionParser;
import parser.v4.V4ExpressionParserListenerStyle;
import ast.Expression;
import backend.CompilerVisitor;
import backend.Executable;

public class V4CompilerTest {
	@Test
	public void compileV4() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParserListenerStyle();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");

		CompilerVisitor compilerVisitor = new CompilerVisitor();
		Executable executeable = compilerVisitor.compile(expression);
		int result = executeable.execute();
		assertEquals(9, result);
	}
	
	@Test
	@Ignore
	public void compileComplexV4() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParserListenerStyle();
		Expression expression = expressionParser.parseExpression("(3 * (1 + 2) - 1) / 4");

		CompilerVisitor compilerVisitor = new CompilerVisitor();
		Executable executeable = compilerVisitor.compile(expression);
		int result = executeable.execute();
		assertEquals(2, result);
	}

}
