package com.fannie.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	private WebDriver driver;
	
	public WaitTypes(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement waitForElementToBeVisible(By locator, int maxTimeOut){
		try {
			WebDriverWait wait = new WebDriverWait(driver, maxTimeOut);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			return element;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// to check if element is clickable
	public WebElement waitForElementToBeClickable(By locator, int maxTimeOut){
		try {
			WebDriverWait wait = new WebDriverWait(driver, maxTimeOut);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			return element;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}
