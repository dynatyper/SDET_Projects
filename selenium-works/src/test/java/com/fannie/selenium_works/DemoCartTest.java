package com.fannie.selenium_works;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utils.Util;

public class DemoCartTest {
	
	String URL = "https://demostore.x-cart.com/";
	WebDriver driver;
	
	@Before
	public void setUp(){
//		1. load driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown(){
		Util.sleep(3000);
		driver.quit();
	}

	@Test
	public void demoCartTest() {
		driver.get(URL);
		
		driver.findElement(By.linkText("Shipping")).click();
		
		Util.sleep(2000);
		
		driver.findElement(By.partialLinkText("Contact")).click();
		Util.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Naveen");
		driver.findElement(By.id("email")).sendKeys("adith.naveen@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("Testing");
		driver.findElement(By.id("message")).sendKeys("Some message");
		
		
	}

}
