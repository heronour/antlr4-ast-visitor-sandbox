import static org.junit.Assert.assertEquals;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNState;
import org.antlr.v4.runtime.atn.RuleTransition;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import de.zeigermann.compilerSandbox.parser.v4.ExprV4BaseListener;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Lexer;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.startContext;
import de.zeigermann.compilerSandbox.parser.v4.V4ExpressionParserRegenerate;

public class ParserTest {
	@Test
	public void regenerateV4() throws Exception {
		V4ExpressionParserRegenerate expressionParser = new V4ExpressionParserRegenerate();
		String expression = "3 *   (1 + \n 2)";
		String regeneratedExpression = expressionParser
				.regenerateExpression(expression);
		assertEquals(expression, regeneratedExpression);
	}

	@Test
	public void regenerateV4Changed() throws Exception {
		V4ExpressionParserRegenerate expressionParser = new V4ExpressionParserRegenerate();
		String expression = "3 *   (1 + \n 2)";
		String regeneratedExpression = expressionParser
				.regenerateExpressionChange(expression);
		String expectedExpression = expression.replace('3', '4')
				.replace('2', '3').replace('1', '2');
		assertEquals(expectedExpression, regeneratedExpression);
	}

	@Test
	public void expectedTokens() throws Exception {
		String expression = "(3 * (1 + 2) - 1) / 4";
		CharStream input = new ANTLRInputStream(expression);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.setBuildParseTree(true);

		final String[] tokenNames = parser.getTokenNames();
		ExprV4BaseListener listener = new ExprV4BaseListener() {

			private void dumpParsedStuff(Token stop) {
				final String regenerated;
				if (stop != null) {
					regenerated = tokens.toString(0, stop.getTokenIndex());
				} else {
					regenerated = "NULL";
				}
				System.out.println("Stuff parsed up to this point:"
						+ regenerated);
			}

			@Override
			public void enter(atomExprContext ctx) {
				System.out.println("************** entering atom alternative "+ctx.toString(parser));
				dumpFollowtokens(parser, ctx);
			}
			
			@Override
			public void exit(atomExprContext ctx) {
				System.out.println("------------- exiting atom alternative "+ctx.toString(parser));
				dumpFollowtokens(parser, ctx);
			}
			
			@Override
			public void enterEveryRule(ParserRuleContext<Token> ctx) {
				System.out.println("entering rule "+ctx.toString(parser));
				dumpFollowtokens(parser, ctx);
			}

			@Override
			public void exitEveryRule(ParserRuleContext<Token> ctx) {
				System.out.println("exiting rule "+ctx.toString(parser));
				dumpFollowtokens(parser, ctx);
			}

			@Override
			public void visitTerminal(ParserRuleContext<Token> ctx, Token symbol) {
				System.out.println("token rule "+ctx.toString(parser));
				System.out.println("Found token=" + symbol.getText());
				dumpParsedStuff(symbol);
				dumpFollowtokens(parser, ctx);
			}

		};
		parser.addParseListener(listener);

		startContext start = parser.start();
		System.out.println("\n\n =========================================\n\n");
		ParseTreeWalker.DEFAULT.walk(listener, start);

	}

	private void dumpFollowtokens(final ExprV4Parser parser,
			ParserRuleContext<?> ctx) {
		final String[] tokenNames = parser.getTokenNames();
		IntervalSet expectedTokens = parser.getExpectedTokensWithinCurrentRule();
		List<Integer> list = expectedTokens.toList();
		System.out.println("These are the tokens that can follow now");
		for (int position : list) {
			if (position > 0 && position < tokenNames.length) {
				System.out.println(tokenNames[position]);
			} else {
				System.out.println(position);

			}
		}
	}
}
