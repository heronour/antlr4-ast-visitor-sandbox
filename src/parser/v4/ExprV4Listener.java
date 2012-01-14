
package parser.v4;

import ast.*;
import ast.Number;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ExprV4Listener extends ParseTreeListener<Token> {
	void enterRule(ExprV4Parser.atomContext ctx);
	void exitRule(ExprV4Parser.atomContext ctx);
	void enterRule(ExprV4Parser.opExprContext ctx);
	void exitRule(ExprV4Parser.opExprContext ctx);
	void enterRule(ExprV4Parser.startContext ctx);
	void exitRule(ExprV4Parser.startContext ctx);
	void enterRule(ExprV4Parser.atomExprContext ctx);
	void exitRule(ExprV4Parser.atomExprContext ctx);
	void enterRule(ExprV4Parser.exprContext ctx);
	void exitRule(ExprV4Parser.exprContext ctx);
	void enterRule(ExprV4Parser.parenExprContext ctx);
	void exitRule(ExprV4Parser.parenExprContext ctx);
}