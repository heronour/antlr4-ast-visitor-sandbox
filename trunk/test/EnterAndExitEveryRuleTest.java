import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import de.zeigermann.compilerSandbox.parser.v4.ExprV4BaseListener;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Lexer;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.startContext;

import static org.junit.Assert.assertEquals;

public class EnterAndExitEveryRuleTest {
	// Grammar:
	//
	// start
	// : e=expr
	// EOF
	// ;
	//
	// expr
	// : '(' e=expr ')' -> parenExpr
	// | left=expr (op='*'|op='/') right=expr -> opExpr
	// | left=expr (op='+'|op='-') right=expr -> opExpr
	// | i=INT -> atomExpr
	// ;

	@Test
	public void expectedTokens() throws Exception {
		String expression = "(3 * (1 + 2) - 1) / 4";
		CharStream input = new ANTLRInputStream(expression);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.setBuildParseTree(true);

		ExprV4BaseListenerExtension listener = new ExprV4BaseListenerExtension(
				parser);
		parser.addParseListener(listener);

		listener.entered = 0;
		listener.exited = 0;
		startContext start = parser.start();
		int enteredWhileParsing = listener.entered;
		int exitedWhileParsing = listener.exited;

		listener.entered = 0;
		listener.exited = 0;
		ParseTreeWalker.DEFAULT.walk(listener, start);
		int enteredWhileWalking = listener.entered;
		int exitedWhileWalking = listener.exited;

		assertEquals(12, enteredWhileWalking);
		assertEquals(12, exitedWhileWalking);
		assertEquals(12, exitedWhileParsing);
		assertEquals(12, enteredWhileParsing); // FAILS, only one rule entered while parsing

	}

	private final class ExprV4BaseListenerExtension extends ExprV4BaseListener {
		ExprV4Parser parser;
		int entered = 0;
		int exited = 0;

		private ExprV4BaseListenerExtension(ExprV4Parser parser) {
			this.parser = parser;
		}

		@Override
		public void exitEveryRule(ParserRuleContext<Token> ctx) {
			exited++;
		}

		@Override
		public void enterEveryRule(ParserRuleContext<Token> ctx) {
			entered++;
		}
	}

}
