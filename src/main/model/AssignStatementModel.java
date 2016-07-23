package main.model;

import main.tree.AssignStatement;
import main.tree.Expression;
import main.tree.IdExp;

public class AssignStatementModel implements AssignStatement {
	
	private IdExp id;
	private Expression expression;
	
	@Override
	public IdExp getId() {
		return id;	
	}
	
	@Override
	public String getSyntaxTrivia() {
		return ":=";
	}
	
	@Override
	public Expression getExpression() {
		return expression;
	}

	public AssignStatementModel(IdExp id, Expression expression) {
		super();
		this.id = id;
		this.expression = expression;
	}
}
