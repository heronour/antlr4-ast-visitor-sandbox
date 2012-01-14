package parser.v4;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.v4.ExprV4Parser.startContext;
import ast.Expression;

public class V4ExpressionParserListenerWalkerStyle extends V4ExpressionParserListenerStyle {
	
    public Expression parseExpression(String expr) {
    	CharStream input = new ANTLRInputStream(expr);
    	ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.setBuildParseTree(true);
		startContext ctx = parser.start();
		System.out.println("ctx="+ctx.toStringTree(parser));

		ExpressionASTConstructorListener listener = new ExpressionASTConstructorListener();
		ParseTree tree = ctx;
		ParseTreeWalker.DEFAULT.walk(listener, tree);
		
    	return listener.expression;
    }
}