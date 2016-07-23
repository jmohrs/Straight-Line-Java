package main.interpreter;

import main.tree.AssignStatement;
import main.tree.CompoundStatement;
import main.tree.EseqExp;
import main.tree.Expression;
import main.tree.IdExp;
import main.tree.OpExp;
import main.tree.PrintStatement;
import main.tree.Statement;

public interface Interpreter {
	
	public void eval(Statement stm);
	
	public void eval(CompoundStatement stm);
	
	public void eval(AssignStatement stm);
	
	public void eval(PrintStatement stm);
	
	public int eval(Expression exp);
	
	public int eval(IdExp exp);
	
	public int eval(OpExp exp);
	
	public int eval(EseqExp exp);
}
