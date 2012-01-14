package visitor;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import parser.ExpressionParser;
import parser.V3ExpressionParser;

import ast.Expression;
import ast.Node;
import ast.Number;
import ast.Operation;
import ast.Operation.Operator;

public class VisitorTest {

	@Test
	public void flat() throws Exception {
		ExpressionParser expressionParser = new V3ExpressionParser();
		Expression expression = expressionParser.parseExpression("3 * (1 + 2)");
		final StringBuilder buffer = new StringBuilder();
		FlatVisitor visitor = new FlatVisitor() {

			@Override
			protected void visitFlat(Node node) {
				buffer.append(".");
			}
		};
		expression.accept(visitor);
		assertEquals(".....", buffer.toString());
	}
}
