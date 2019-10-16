package com.fannie.selenium_works;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class JavaScriptAndMultipSelectTest {
	
	String URL = "http://elearning.upskills.in";
	WebDriver driver;
	WaitTypes waitTypes;
	GenericMethods genericMethods;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME);
		genericMethods = new GenericMethods(driver);
	}
	
	@After
	public void tearDown(){
		Util.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void testScrollAndSelectMultipleTest(){
		driver.get(URL);
		
		//scroll
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//1st arg is X-axis
		//2nd arg is Y-axis
		jsExecutor.executeScript("window.scroll(0, 600)");
		
		Util.sleep(4000);
	}

}
