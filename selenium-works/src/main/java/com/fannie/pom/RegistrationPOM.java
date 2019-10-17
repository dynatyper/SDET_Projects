package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPOM {

	private WebDriver driver;
	
	public RegistrationPOM(WebDriver driver){
		this.driver = driver;
	}
	
	public void sendEmail(String emailId) {
		driver.findElement(By.id("inputEmail")).clear();
		driver.findElement(By.id("inputEmail")).sendKeys(emailId);	
	}
	
	public void sendPassword(String password) {
		driver.findElement(By.id("inputPassword")).clear();
		driver.findElement(By.id("inputPassword")).sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmPassword) {
		driver.findElement(By.id("confirmPassword")).clear();
		driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);	
	}
	
	public void sendFirstName(String firstName) {
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys(firstName);
	}
	
	public void sendLastName(String lastName) {
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys(lastName);
	}
	
	
}
