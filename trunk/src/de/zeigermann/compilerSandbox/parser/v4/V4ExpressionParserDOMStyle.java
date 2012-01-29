package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.parser.ExpressionParser;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.atomContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.exprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.opExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.parenExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.startContext;


public class V4ExpressionParserDOMStyle extends ExpressionParser {

	public Expression parseExpression(String expr) {
		CharStream input = new ANTLRInputStream(expr);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.setBuildParseTree(true);
		startContext ctx = parser.start();
		// System.out.println("ctx="+ctx.toStringTree(parser));
		ExprParseTreeWalker parseTreeWalker = new ExprParseTreeWalker();
		Expression expression = parseTreeWalker.start(ctx);
		return expression;
	}

	// parsing stuff like that
	// (start (expr (expr (atom 3)) * (expr ( (expr (expr (atom 1)) + (expr
	// (atom 2))) ))) <EOF>)
	static class ExprParseTreeWalker {

		Expression start(startContext ctx) {
			exprContext exprCtx = (exprContext) ctx.getChild(0);
			Expression expr = expr(exprCtx);
			return expr;
		}

		Expression expr(exprContext ctx) {
			if (ctx instanceof parenExprContext) {
				return expr((parenExprContext) ctx);
			} else if (ctx instanceof atomExprContext) {
				return expr((atomExprContext) ctx);
			} else if (ctx instanceof opExprContext) {
				return expr((opExprContext) ctx);
			}
			throw new IllegalArgumentException("Unknown rule type for " + ctx);
		}

		Expression expr(parenExprContext ctx) {
			Expression parentExpr = expr(ctx.e);
			return parentExpr;
		}

		Expression expr(atomExprContext ctx) {
			Expression atom = atom(ctx.a);
			return atom;
		}

		Expression expr(opExprContext ctx) {
			Expression leftExpr = expr(ctx.left);
			String op = ctx.op.getText();
			Expression rightExpr = expr(ctx.right);
			Operation operation = new Operation(op, leftExpr, rightExpr);
			return operation;
		}

		Expression atom(atomContext ctx) {
			Number number = new Number(ctx.i.getText());
			return number;
		}
	}

}
