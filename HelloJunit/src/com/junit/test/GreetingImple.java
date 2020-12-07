package com.junit.test;

public class GreetingImple implements Greeting {

	public String greet(String name) {
		
		if( name ==null || name.length()==0){
			throw new IllegalArgumentException();
		}
		
		return "Hello "+name;
	}

}
