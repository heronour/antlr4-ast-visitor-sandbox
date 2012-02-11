package de.zeigermann.compilerSandbox.parser.v4.byhand;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.zeigermann.compilerSandbox.parser.v4.ExprV4Lexer;
import de.zeigermann.compilerSandbox.parser.v4.byhand.ExprV4Parser.startContext;

public class V4ExpressionParserVisitorStyle {

	public int interpret(String expr) {
		CharStream input = new ANTLRInputStream(expr);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.setBuildParseTree(true);
		startContext start = parser.start();
		DirectInterpreterListener listener = new DirectInterpreterListener();
		start.accept(new ParseTreeVisitor(listener));
		return listener.getResult();
	}

}
