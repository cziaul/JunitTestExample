package com.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImpleTest {
	
	/*
	 * Select the variable and press Cntl+1 to create local variable
	 */

	
	private GreetingImple greeting;
	@Before
	public void setup(){
		/*
		 * select the line and Press Alt+Arrow Key
		 */
		greeting = new GreetingImple();
	}

	@Test
	public void greetShouldReturnAValidOutput() {
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_for_NameIsNull(){
		greeting.greet(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_for_NameIsBlank(){
		greeting.greet("");
	}
	
	@After
	
	public void cleanUp(){
		greeting = null;
	}
}
