
package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public interface ExprV4ParseListener extends ParseListener<Token> {
	void enterStart(ParserRuleContext<Token> ctx);
	void exitOpExpr(ExprV4Parser.OpExprContext ctx);
	void exitAtomExpr(ExprV4Parser.AtomExprContext ctx);
	void exitParenExpr(ExprV4Parser.ParenExprContext ctx);
	void exitStart(ExprV4Parser.StartContext ctx);
}