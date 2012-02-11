package de.zeigermann.compilerSandbox.parser.v4.byhand;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.ExprV4Context;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.atomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.exprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.opExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.parenExprContext;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.startContext;

public class ParseTreeVisitor implements ExprV4Visitor {

	ExprV4Listener listener;
	
    public ParseTreeVisitor(ExprV4Listener listener) {
		super();
		this.listener = listener;
	}

	private void visitChildren(ExprV4Context ctx) {
		List<ExprV4Context> children = ctx.getChildren();
		for (ExprV4Context child : children) {
			child.accept(this);
		}
	}
	
    public void visit(opExprContext ctx) {
		listener.enterEveryRule(ctx);
		listener.enterRule(ctx);
		visitChildren(ctx);
		listener.exitRule(ctx);
		listener.exitEveryRule(ctx);
    }

	public void visit(startContext ctx) {
		listener.enterEveryRule(ctx);
		listener.enterRule(ctx);
		visitChildren(ctx);
		listener.exitRule(ctx);
		listener.exitEveryRule(ctx);
	}

	public void visit(atomExprContext ctx) {
		listener.enterEveryRule(ctx);
		listener.enterRule(ctx);
		visitChildren(ctx);
		listener.exitRule(ctx);
		listener.exitEveryRule(ctx);
	}

	public void visit(exprContext ctx) {
		listener.enterEveryRule(ctx);
		listener.enterRule(ctx);
		visitChildren(ctx);
		listener.exitRule(ctx);
		listener.exitEveryRule(ctx);
	}

	public void visit(parenExprContext ctx) {
		listener.enterEveryRule(ctx);
		listener.enterRule(ctx);
		visitChildren(ctx);
		listener.exitRule(ctx);
		listener.exitEveryRule(ctx);
	}
}