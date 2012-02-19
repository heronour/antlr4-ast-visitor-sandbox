package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.zeigermann.compilerSandbox.ast.Expression;
import de.zeigermann.compilerSandbox.ast.Number;
import de.zeigermann.compilerSandbox.ast.Operation;
import de.zeigermann.compilerSandbox.parser.ExpressionParser;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.AtomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.ExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.OpExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.ParenExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.StartContext;


public class V4ExpressionParserDOMStyle extends ExpressionParser {

	public Expression parseExpression(String expr) {
		CharStream input = new ANTLRInputStream(expr);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.setBuildParseTree(true);
		StartContext ctx = parser.start();
		// System.out.println("ctx="+ctx.toStringTree(parser));
		ExprParseTreeWalker parseTreeWalker = new ExprParseTreeWalker();
		Expression expression = parseTreeWalker.start(ctx);
		return expression;
	}

	// parsing stuff like that
	// (start (expr (expr (atom 3)) * (expr ( (expr (expr (atom 1)) + (expr
	// (atom 2))) ))) <EOF>)
	static class ExprParseTreeWalker {

		Expression start(StartContext ctx) {
			ExprContext exprCtx = (ExprContext) ctx.getChild(0);
			Expression expr = expr(exprCtx);
			return expr;
		}

		Expression expr(ExprContext ctx) {
			if (ctx instanceof ParenExprContext) {
				return expr((ParenExprContext) ctx);
			} else if (ctx instanceof AtomExprContext) {
				return expr((AtomExprContext) ctx);
			} else if (ctx instanceof OpExprContext) {
				return expr((OpExprContext) ctx);
			}
			throw new IllegalArgumentException("Unknown rule type for " + ctx);
		}

		Expression expr(ParenExprContext ctx) {
			Expression parentExpr = expr(ctx.e);
			return parentExpr;
		}

		Expression expr(AtomExprContext ctx) {
			Number number = new Number(ctx.i.getText());
			return number;
		}

		Expression expr(OpExprContext ctx) {
			Expression leftExpr = expr(ctx.left);
			String op = ctx.op.getText();
			Expression rightExpr = expr(ctx.right);
			Operation operation = new Operation(op, leftExpr, rightExpr);
			return operation;
		}
	}

}
