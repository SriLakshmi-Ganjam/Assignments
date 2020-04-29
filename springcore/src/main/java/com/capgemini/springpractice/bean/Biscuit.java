package com.capgemini.springpractice.bean;

public class Biscuit {
	private String name;
	private String type;
	
	public Biscuit() {
		System.out.println("This is biscuit constructor");
	}

	public Biscuit(String name, String type) {
		//super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void eat() {
		System.out.println("dip biscuit in chai");
	}
	
	

}
