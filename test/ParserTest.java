

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.ast.Node;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.ast.Operation.Operator;
import de.zeigermann.compilerSandbox.interpreter.InterpreterVisitor;
import de.zeigermann.compilerSandbox.interpreter.PolymorphicDispatchVisitor;
import de.zeigermann.compilerSandbox.interpreter.RecursiveDescentVisitor;
import de.zeigermann.compilerSandbox.interpreter.StructureInterpreterVisitor;
import de.zeigermann.compilerSandbox.parser.ExpressionParser;
import de.zeigermann.compilerSandbox.parser.V3ExpressionParser;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParser;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserDOMStyle;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserListenerStyle;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserListenerWalkerStyle;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserRegenerate;



public class ParserTest {
	@Test
	public void regenerateV4() throws Exception {
		V4ExpressionParserRegenerate expressionParser = new V4ExpressionParserRegenerate();
		String expression = "3 *   (1 + \n 2)";
		String regeneratedExpression = expressionParser.regenerateExpression(expression);
		assertEquals(expression, regeneratedExpression);
	}

	@Test
	public void regenerateV4Changed() throws Exception {
		V4ExpressionParserRegenerate expressionParser = new V4ExpressionParserRegenerate();
		String expression = "3 *   (1 + \n 2)";
		String regeneratedExpression = expressionParser.regenerateExpressionChange(expression);
		String expectedExpression = expression.replace('3', '4').replace('2', '3').replace('1', '2');
		assertEquals(expectedExpression, regeneratedExpression);
	}
}
