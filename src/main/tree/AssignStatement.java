package main.tree;

public interface AssignStatement extends Statement {
	
	public IdExp getId();
	
	public String getSyntaxTrivia();
	
	public Expression getExpression();

}
