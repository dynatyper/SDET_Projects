package com.fannie.selenium.pom.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.factory.DriverFactory;
import com.fannie.pom.RegistrationPOM;
import com.fannie.utils.Driver;
import com.fannie.utils.ScreenShot;
import com.fannie.utils.Util;

public class RegistrationPOMTest {
	
	private String URL = "http://naveenks.com/selenium/RegForm.html";
	private WebDriver driver;
	private ScreenShot screenShot;
	private RegistrationPOM regPOM;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME);
		regPOM = new RegistrationPOM(driver);
		screenShot = new ScreenShot(driver);
	}
	
	@After
	public void tearDown(){
		Util.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void test() {
		driver.get(URL);
		
		regPOM.sendEmail("somelongemail@email.com");
		regPOM.sendPassword("testing@123");
		regPOM.sendConfirmPassword("testing@123");
		regPOM.sendFirstName("Kevin");
		regPOM.sendLastName("Name");
		
		screenShot.captureScreenShot();
	}

}
