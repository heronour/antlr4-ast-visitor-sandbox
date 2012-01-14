

import static org.junit.Assert.*;
import interpreter.InterpreterVisitor;
import interpreter.PolymorphicDispatchVisitor;
import interpreter.RecursiveDescentVisitor;
import interpreter.StructureInterpreterVisitor;
import junit.framework.Assert;

import org.junit.Test;

import parser.ExpressionParser;
import parser.V3ExpressionParser;
import parser.v4.V4ExpressionParser;
import parser.v4.V4ExpressionParserDOMStyle;
import parser.v4.V4ExpressionParserListenerStyle;
import parser.v4.V4ExpressionParserListenerWalkerStyle;
import parser.v4.V4ExpressionParserRegenerate;

import ast.Expression;
import ast.Node;
import ast.Number;
import ast.Operation;
import ast.Operation.Operator;

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
