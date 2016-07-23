package main.model;

import main.tree.CompoundStatement;
import main.tree.Statement;

public class CompoundStatementModel implements CompoundStatement {
	
	private Statement firstStatement;
	private Statement sndStatement;
	
	@Override
	public Statement getFirstStatement() {
		return firstStatement;
	}
	
	@Override
	public String getSyntaxTrivia() {
		return ";";
	}
	
	@Override
	public Statement getSecondStatement() {
		return sndStatement;
	}
	
	public CompoundStatementModel(Statement firstStatement, Statement sndStatement) {
		this.firstStatement = firstStatement;
		this.sndStatement = sndStatement;
	}
}
