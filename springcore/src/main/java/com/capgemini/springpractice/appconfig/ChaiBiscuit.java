package com.capgemini.springpractice.appconfig;

import org.springframework.context.annotation.Bean;

import com.capgemini.springpractice.bean.Biscuit;
import com.capgemini.springpractice.bean.Chai;


public class ChaiBiscuit {
	
	@Bean
	public Chai getChai() {
		Chai c = new Chai();
		c.setName("3roses");
		c.setPrice(250);
		return c;
		
	}

	@Bean
	public Biscuit getBiscuit() {
		Biscuit biscuit= new Biscuit();
		biscuit.setName("Digestive");
		biscuit.setType("Cream");
		return biscuit;
	}

}
