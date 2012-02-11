package visitorByHand;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.zeigermann.compilerSandbox.parser.v4.byhand.*;

public class ByHandVisitorTest {
	@Test
	public void compile() throws Exception {
		V4ExpressionParserVisitorStyle interpreter = new V4ExpressionParserVisitorStyle();
		int result = interpreter.interpret("(3 * (1 + 2) - 1) / 4");
		assertEquals(2, result);
	}
}
