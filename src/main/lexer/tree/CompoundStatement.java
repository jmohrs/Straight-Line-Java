package main.lexer.tree;

public interface CompoundStatement extends Statement {
	
	public Statement getFirstStatement();
	
	public String getSyntaxTrivia();
	
	public Statement getSecondStatement();
}
