package com.fannie.selenium_works;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utils.Util;

public class RegistrationElearningTest {
	
	String URL = "http://elearning.upskills.in";
	WebDriver driver;
	
	@Before
	public void setUp(){
//		1. load driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Test
	public void registerInElearningTest() {
		
		//Xpath Ids
				String userName = "login";
				String password = "password";
				String loginButton = "form-login_submitAuth";
				
				String validateUserXpath = "//*[@id=\"homepage-course\"]/div/p[1]/strong";
				
				String menuDropDown = "//*[@id=\"navbar\"]/ul[2]/li[2]/a";
				String logoutButton = "logout_button";
				
//				2. open browser
				driver.get(URL);
				
				driver.findElement(By.id(userName)).clear();
				driver.findElement(By.id(userName)).sendKeys("naveenkumar");
				
				driver.findElement(By.id(password)).clear();
				driver.findElement(By.id(password)).sendKeys("testing@123");
				
				driver.findElement(By.id(loginButton)).click();
				
				String headingText = driver.findElement(By.xpath(validateUserXpath)).getText();
				
				System.out.println(headingText);
				assertEquals("naveen kumar", headingText);
				
				driver.findElement(By.xpath(menuDropDown)).click();
				Util.sleep(1000);
				
				driver.findElement(By.id(logoutButton)).click();
		
	}
	
	@After
	public void tearDown(){
		Util.sleep(3000);
		driver.quit();
	}
	
	public void registerInElearningTestFail(){
		
	}

}