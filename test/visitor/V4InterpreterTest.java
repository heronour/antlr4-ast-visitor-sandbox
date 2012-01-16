package visitor;

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

import ast.Expression;
import ast.Node;
import ast.Number;
import ast.Operation;
import ast.Operation.Operator;

public class V4InterpreterTest {
	@Test
	public void evalV4() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParser();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");
		int result = expressionParser.evaluate(expression);
		assertEquals(9, result);
	}

	@Test
	public void evalV4DomStyle() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParserDOMStyle();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");
		int result = expressionParser.evaluate(expression);
		assertEquals(9, result);
	}

	@Test
	public void evalV4Listener() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParserListenerStyle();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");
		int result = expressionParser.evaluate(expression);
		assertEquals(9, result);
	}

	@Test
	public void evalV4WalkerListener() throws Exception {
		ExpressionParser expressionParser = new V4ExpressionParserListenerWalkerStyle();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");
		int result = expressionParser.evaluate(expression);
		assertEquals(9, result);
	}

}
