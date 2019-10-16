package com.fannie.selenium_works;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class RegistrationExplicitWaitTest {

	String URL = "http://elearning.upskills.in";
	WebDriver driver;
	WaitTypes waitTypes;

	@Before
	public void setUp() {
		// 1. load driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		waitTypes = new WaitTypes(driver);
	}

	@Test
	public void registerInElearningTest() {
		driver.get(URL);

		// Xpath Ids
		String userName = "login";
		String password = "password";
		String loginButton = "form-login_submitAuth";

		// String validateUserXpath =
		// "//*[@id=\"homepage-course\"]/div/p[1]/strong";
		//
		// String menuDropDown = "//*[@id=\"navbar\"]/ul[2]/li[2]/a";
		// String logoutButton = "logout_button";

		waitTypes.waitForElementToBeVisible(By.id(userName), 10).sendKeys("naveenkumar");
		waitTypes.waitForElementToBeVisible(By.id(password), 10).sendKeys("testing@123");
		waitTypes.waitForElementToBeClickable(By.id(loginButton), 10).click();

		Util.sleep(5000);
	}

	@After
	public void tearDown() {
		Util.sleep(3000);
		driver.quit();
	}
}
