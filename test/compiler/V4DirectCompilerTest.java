package compiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.zeigermann.compilerSandbox.backend.Executable;
import de.zeigermann.compilerSandbox.parser.v4.V4DirectCompiler;

public class V4DirectCompilerTest {
	@Test
	public void compile() throws Exception {
		V4DirectCompiler compiler = new V4DirectCompiler();
		Executable executable = compiler
				.parseExpression("(3 * (1 + 2) - 1) / 4");
		int result = executable.execute();
		assertEquals(2, result);
	}
}
