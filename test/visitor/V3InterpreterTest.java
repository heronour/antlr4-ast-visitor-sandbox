package visitor;

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
