package compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.backend.CompilerVisitor;
import de.zeigermann.compilerSandbox.backend.Executable;
import de.zeigermann.compilerSandbox.parser.ExpressionParser;
import de.zeigermann.compilerSandbox.parser.v4.V4DirectCompiler;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserListenerStyle;

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
	public void compileComplexV4() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParserListenerStyle();
		Expression expression = expressionParser
				.parseExpression("(3 * (1 + 2) - 1) / 4");

		CompilerVisitor compilerVisitor = new CompilerVisitor();
		Executable executeable = compilerVisitor.compile(expression);
		int result = executeable.execute();
		assertEquals(2, result);
	}

	@Test
	public void compileV4NoAST() throws Exception {
		V4DirectCompiler compiler = new V4DirectCompiler();
		Executable executable = compiler
				.parseExpression("(3 * (1 + 2) - 1) / 4");
		int result = executable.execute();
		assertEquals(2, result);
	}
}
