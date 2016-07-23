package main.model;

import main.tree.IdExp;

public class IdExpModel implements IdExp {

	private String identifier;
	
	@Override
	public String getId() {
		return identifier;
	}
	
	public IdExpModel(String id) {
		identifier = id;
	}
}
