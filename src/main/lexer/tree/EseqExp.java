package main.lexer.tree;

public interface EseqExp extends Expression {
	
	public Statement getStatement();
	
	public String getSyntaxTrivia();
	
	public Expression getExpression();
}