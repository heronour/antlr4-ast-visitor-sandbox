package de.zeigermann.compilerSandbox.parser.v4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.zeigermann.compilerSandbox.backend.DirectCompileListener;
import de.zeigermann.compilerSandbox.backend.Executable;


public class V4DirectCompiler {

	public Executable parseExpression(String expr) {
		CharStream input = new ANTLRInputStream(expr);
		ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		DirectCompileListener listener = new DirectCompileListener();
		parser.addParseListener(listener);
		parser.start();
		return listener.getExecutable();
	}
}
