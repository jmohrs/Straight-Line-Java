package main.model;

import main.tree.EseqExp;
import main.tree.Expression;
import main.tree.Statement;

public class EseqExpModel implements EseqExp {

	private Statement stm;
	private Expression exp;
	
	
	@Override
	public Statement getStatement() {
		return stm;
	}
	
	@Override
	public String getSyntaxTrivia() {
		return ",";
	}
	
	@Override
	public Expression getExpression() {
		return exp;
	}
	
	public EseqExpModel(Statement stm, Expression exp) {
		super();
		this.stm = stm;
		this.exp = exp;
	}
}
