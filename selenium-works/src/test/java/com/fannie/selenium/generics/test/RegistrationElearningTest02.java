package com.fannie.selenium.generics.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.ScreenShot;
import com.fannie.utils.Util;

public class RegistrationElearningTest02 {
	
	private WebDriver driver;
	private String URL = "http://elearning.upskills.in";
	private GenericMethods genericMethods;
	private ScreenShot screenShot;

	@Before
	public void setUp(){
		driver = DriverFactory.getDriver(Driver.CHROME);
		genericMethods = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
	}
	@After
	public void tearDown(){
		Util.sleep(3000);
		driver.close();
		
	}
	@Test
	public void test() {
		driver.get(URL);
		
		genericMethods.getElement("login", "id").sendKeys("naveenkumar");
		genericMethods.getElement("password", "id").sendKeys("testing@123");
		genericMethods.getElement("form-login_submitAuth", "id").click();
		screenShot.captureScreenShot();
		
		
	}

}
