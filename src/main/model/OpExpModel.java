package main.model;

import main.tree.BINOP;
import main.tree.Expression;
import main.tree.OpExp;

public class OpExpModel implements OpExp {
	
	private Expression firstExp;
	private Expression sndExp;
	private BINOP operator;

	@Override
	public Expression getFirstArgument() {
		return firstExp;
	}

	@Override
	public BINOP getOperator() {
		return operator;
	}

	@Override
	public Expression getSecondArgument() {
		return sndExp;
	}

	public OpExpModel(Expression firstExp, Expression sndExp, BINOP operator) {
		super();
		this.firstExp = firstExp;
		this.sndExp = sndExp;
		this.operator = operator;
	}
}
