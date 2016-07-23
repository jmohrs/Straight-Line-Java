package main.lexer.tree;

import java.util.List;

public interface PrintStatement extends Statement {
	
	public List<Expression> getArguments();
	
}
