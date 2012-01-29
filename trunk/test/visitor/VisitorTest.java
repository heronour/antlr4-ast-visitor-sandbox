package visitor;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.ast.Node;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.ast.Operation.Operator;
import de.zeigermann.compilerSandbox.parser.ExpressionParser;
import de.zeigermann.compilerSandbox.parser.V3ExpressionParser;
import de.zeigermann.compilerSandbox.visitor.FlatVisitor;



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
