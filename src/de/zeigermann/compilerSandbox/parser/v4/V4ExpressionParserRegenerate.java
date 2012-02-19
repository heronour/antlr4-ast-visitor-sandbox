package de.zeigermann.compilerSandbox.parser.v4;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenRewriteStream;

import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.AtomExprContext;
import de.zeigermann.compilerSandbox.parser.v4.ExprV4Parser.StartContext;


public class V4ExpressionParserRegenerate {
    
    public String regenerateExpression(String expr) {
    	CharStream input = new ANTLRInputStream(expr);
    	ExprV4Lexer lexer = new ExprV4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		StartContext ctx = parser.start();
		Token start = ctx.getStart();
		Token stop = ctx.getStop();
		String regenerated = tokens.toString(start, stop);
		
		return regenerated;
    }
    
    public String regenerateExpressionChange(String expr) {
    	CharStream input = new ANTLRInputStream(expr);
    	ExprV4Lexer lexer = new ExprV4Lexer(input);
    	final TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		ExprV4Parser parser = new ExprV4Parser(tokens);
		parser.addParseListener(new ExprV4BaseParseListener() {
			@Override
			public void exitAtomExpr(AtomExprContext ctx) {
				Token tINT = ctx.i;
				String text = tINT.getText();
				int value = Integer.parseInt(text);
				int newValue = value + 1;
				String newText = Integer.toString(newValue);
				tokens.replace(tINT, newText);
			}
		});
		StartContext ctx = parser.start();
		
		Token start = ctx.getStart();
		Token stop = ctx.getStop();
		String regenerated = tokens.toString(start, stop);
		return regenerated;
    }
}
