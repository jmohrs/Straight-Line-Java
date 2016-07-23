package main.model;

import java.util.List;

import main.tree.Expression;
import main.tree.PrintStatement;

public class PrintStatementModel implements PrintStatement {

	public List<Expression> arguments;
	
	@Override
	public List<Expression> getArguments() {
		return arguments;
	}
	
	public PrintStatementModel(List<Expression> args) {
		arguments = args;
	}
}
