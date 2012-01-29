package parser.v4;

import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.ExpressionParser;
import parser.v4.ExprV4Parser.atomContext;
import parser.v4.ExprV4Parser.opExprContext;
import parser.v4.ExprV4Parser.startContext;
import ast.Expression;
import ast.Number;
import ast.Operation;

public class V4ExpressionParserListenerStyle extends ExpressionParser {

	public Expression parseExpression(String expr) {
		CharStream input = new ANTLRInputStream(expr);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		ExpressionASTConstructorListener listener = new ExpressionASTConstructorListener();
		parser.addParseListener(listener);
		parser.start();
		return listener.expression;
	}

	static class ExpressionASTConstructorListener extends BlankExprV4Listener {

		Expression expression;
		private final Stack<Expression> stack = new Stack<Expression>();

		@Override
		public void exitRule(startContext ctx) {
			expression = stack.pop();
		}

		@Override
		public void exitRule(atomContext ctx) {
			final Number number = new Number(ctx.i.getText());
			stack.push(number);
		}

		@Override
		public void exitRule(opExprContext ctx) {
			final Expression expr;
			String op = ctx.op.getText();
			Expression rightExpr = stack.pop();
			Expression leftExpr = stack.pop();
			Operation operation = new Operation(op, leftExpr, rightExpr);
			expr = operation;
			stack.push(expr);
		}

	}
}
