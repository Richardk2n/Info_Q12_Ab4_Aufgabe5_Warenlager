package com.richard.warenlager;

public class Ware {

	private String name;
	
	public Ware(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
