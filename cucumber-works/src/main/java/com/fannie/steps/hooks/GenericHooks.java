package com.fannie.steps.hooks;

import org.junit.After;
import org.junit.Before;

public class GenericHooks {

	@Before
	public void setUp(){
		System.out.println("I am before all the features.");
	}
	
	@After
	public void tearDown(){
		System.out.println("I am after all the features.");
	}
}
