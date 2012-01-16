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

public class V3InterpreterTest {
	@Test
	public void simpleCalc() throws Exception {
		Number number1 = new Number(1);
		Number number2 = new Number(2);
		Number number3 = new Number(3);

		Operation operationPlus = new Operation(Operator.PLUS, number1, number2);
		Operation operationMul = new Operation(Operator.MULTIPLY, number3,
				operationPlus);

		InterpreterVisitor interpreterVisitor = new InterpreterVisitor();
		operationMul.accept(interpreterVisitor);
		int result = interpreterVisitor.getResult();
		assertEquals(9, result);
	}

	@Test
	public void eval() throws Exception {
		ExpressionParser expressionParser = new V3ExpressionParser();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");
		int result = expressionParser.evaluate(expression);
		assertEquals(9, result);
	}

	@Test
	public void evalWithStructureVisitor() throws Exception {
		ExpressionParser expressionParser = new V3ExpressionParser();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");

		StructureInterpreterVisitor interpreterVisitor = new StructureInterpreterVisitor();
		expression.accept(interpreterVisitor);
		int result = interpreterVisitor.getResult();
		assertEquals(9, result);
	}

	@Test
	public void evalWithRecursiveDescentVisitor() throws Exception {
		ExpressionParser expressionParser = new V3ExpressionParser();
		// Expression expression =
		// expressionParser.parseExpression("3 * (1 + 2)");
		Node expression = expressionParser.parseExpression("3 * (1 + 2)");

		RecursiveDescentVisitor interpreterVisitor = new RecursiveDescentVisitor();
		int result = interpreterVisitor.eval(expression);
		assertEquals(9, result);
	}

	@Test
	public void evalWithPolymorphicDispatchVisitor() throws Exception {
		ExpressionParser expressionParser = new V3ExpressionParser();
		// Expression expression =
		// expressionParser.parseExpression("3 * (1 + 2)");
		Node expression = expressionParser.parseExpression("3 * (1 + 2)");

		PolymorphicDispatchVisitor interpreterVisitor = new PolymorphicDispatchVisitor();
		int result = interpreterVisitor.eval(expression);
		assertEquals(9, result);
	}

}
