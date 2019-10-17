package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElearningPOM {

	private WebDriver driver;
	
	public ElearningPOM(WebDriver driver){
		this.driver = driver;
	}
	
	public void sendUsername(String emailId) {
		driver.findElement(By.id("form-login_submitAuth")).clear();
		driver.findElement(By.id("form-login_submitAuth")).sendKeys(emailId);	
	}
	
	public void sendPassword(String password) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public void clickLogin(){
		driver.findElement(By.id("")).click();
	}
	
}
