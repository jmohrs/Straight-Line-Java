package main.interpreter.functional;

import java.util.Map;

import main.interpreter.Interpreter;
import main.tree.AssignStatement;
import main.tree.CompoundStatement;
import main.tree.EseqExp;
import main.tree.Expression;
import main.tree.IdExp;
import main.tree.OpExp;
import main.tree.PrintStatement;
import main.tree.Statement;

public class FunctionalInterpreter implements Interpreter {
	
	private Map<String, Integer> env;

	@Override
	public void eval(Statement stm) {
		return;
	}

	@Override
	public void eval(CompoundStatement stm) {
		eval(stm.getFirstStatement());
		eval(stm.getSecondStatement());
	}

	@Override
	public void eval(AssignStatement stm) {
		String id = stm.getId().getId();
		if (env.containsKey(id)) {
			return;
		}
		
		int val = eval(stm.getExpression());
		env.put(id, val);
	}

	@Override
	public void eval(PrintStatement stm) {
		for (Expression exp: stm.getArguments()) {
			int val = eval(exp);
			System.out.println("" + val);
		}
	}

	@Override
	public int eval(Expression exp) {
		return Integer.MAX_VALUE;
	}

	@Override
	public int eval(IdExp exp) {
		if (env.containsKey(exp.getId())) {
			return env.get(exp.getId());
		}
		else {
			return Integer.MAX_VALUE;
		}
	}

	@Override
	public int eval(OpExp exp) {
		int val1 = eval(exp.getFirstArgument());
		int val2 = eval(exp.getSecondArgument());
		
		if (val1 == Integer.MAX_VALUE || val2 == Integer.MAX_VALUE) return Integer.MAX_VALUE;
		
		int result = 0;
		switch(exp.getOperator()){
			case PLUS:
				result = val1 + val2;
				break;
			case MINUS:
				result = val1 - val2;
				break;
			case MULT:
				result = val1 * val2;
				break;
			case DIV:
				result = val1 / val2;
				break;
		}
		
		return result;
	}

	@Override
	public int eval(EseqExp exp) {
		eval(exp.getStatement());
		return eval(exp.getExpression());
		
	}
}
