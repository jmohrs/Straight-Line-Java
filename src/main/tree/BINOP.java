package main.tree;

public enum BINOP {
	
	PLUS("+"),
	MINUS("-"),
	MULT("*"),
	DIV("/");
	
	private String operator;
	
	BINOP(String binop){
		operator = binop;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}
