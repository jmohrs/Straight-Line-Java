package main.tree;

public interface OpExp {
	
	public Expression getFirstArgument();
	
	public BINOP getOperator();
	
	public Expression getSecondArgument();

}
