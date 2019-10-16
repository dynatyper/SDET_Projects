package com.fannie.selenium_works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterElearning02 {
	
	
	

	public static void main(String[] args) {
		
		
		//Xpath Ids
		String userName = "login";
		String password = "password";
		String loginButton = "form-login_submitAuth";
		
		String validateUserXpath = "//*[@id=\"homepage-course\"]/div/p[1]/strong";
		
		String menuDropDown = "//*[@id=\"navbar\"]/ul[2]/li[2]/a";
		String logoutButton = "logout_button";
		
		//*[@id="password"]
		//*[@id="form-login_submitAuth"]
		
		
		String URL = "http://elearning.upskills.in";
		WebDriver driver;
		
//		1. load driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		2. open browser
		driver.get(URL);
		
		driver.findElement(By.id(userName)).clear();
		driver.findElement(By.id(userName)).sendKeys("naveenkumar");
		
		driver.findElement(By.id(password)).clear();
		driver.findElement(By.id(password)).sendKeys("testing@123");
		
		driver.findElement(By.id(loginButton)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(menuDropDown)).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id(logoutButton)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
}
