
package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExprV4Listener extends ParseTreeListener<Token> {
	void enter(ExprV4Parser.opExprContext ctx);
	void exit(ExprV4Parser.opExprContext ctx);

	void enter(ExprV4Parser.startContext ctx);
	void exit(ExprV4Parser.startContext ctx);

	void enter(ExprV4Parser.atomExprContext ctx);
	void exit(ExprV4Parser.atomExprContext ctx);

	void enter(ExprV4Parser.exprContext ctx);
	void exit(ExprV4Parser.exprContext ctx);

	void enter(ExprV4Parser.parenExprContext ctx);
	void exit(ExprV4Parser.parenExprContext ctx);
}