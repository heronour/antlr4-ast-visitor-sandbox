
package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExprV4Listener extends ParseTreeListener<Token> {
	void enterOpExpr(ExprV4Parser.OpExprContext ctx);
	void exitOpExpr(ExprV4Parser.OpExprContext ctx);

	void enterAtomExpr(ExprV4Parser.AtomExprContext ctx);
	void exitAtomExpr(ExprV4Parser.AtomExprContext ctx);

	void enterParenExpr(ExprV4Parser.ParenExprContext ctx);
	void exitParenExpr(ExprV4Parser.ParenExprContext ctx);

	void enterStart(ExprV4Parser.StartContext ctx);
	void exitStart(ExprV4Parser.StartContext ctx);
}