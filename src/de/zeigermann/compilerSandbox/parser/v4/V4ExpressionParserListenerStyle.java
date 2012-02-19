package de.zeigermann.compilerSandbox.parser.v4;

import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.parser.ExpressionParser;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.AtomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.OpExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.StartContext;


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
	
	static class ExpressionASTConstructorListener extends ExprV4BaseParseListener {

		Expression expression;
		private final Stack<Expression> stack = new Stack<Expression>();

		@Override
		public void exitStart(StartContext ctx) {
			expression = stack.pop();
		}

		@Override
		public void exitAtomExpr(AtomExprContext ctx) {
			final Number number = new Number(ctx.i.getText());
			stack.push(number);
		}

		@Override
		public void exitOpExpr(OpExprContext ctx) {
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
