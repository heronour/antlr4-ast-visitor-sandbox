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
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserDOMStyle;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserListenerStyle;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserListenerWalkerStyle;
import de.zeigermann.compilerSandbox.parser.v4.nocontext.V4ExpressionParser;



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
