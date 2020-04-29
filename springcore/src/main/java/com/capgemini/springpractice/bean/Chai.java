package com.capgemini.springpractice.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Chai {
	private String name;
	private double price;
	@Autowired
	private Biscuit biscuit;
	
	public Chai() {
		System.out.println("This is a chai constructor");
		
	}

	public Chai(String name, double price, Biscuit biscuit) {
		super();
		this.name = name;
		this.price = price;
		this.biscuit = biscuit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Biscuit getBiscuit() {
		return biscuit;
	}

	public void setBiscuit(Biscuit biscuit) {
		this.biscuit = biscuit;
	}
	
	
	
	public void drink() {
		System.out.println("drink tea with biscuits-- chai"+name+"---price--"+price);
		biscuit.eat();
	}
	

}
