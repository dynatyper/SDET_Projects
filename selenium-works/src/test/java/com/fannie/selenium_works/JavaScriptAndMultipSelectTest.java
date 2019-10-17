package com.fannie.selenium_works;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class JavaScriptAndMultipSelectTest {
	
	String URL = "https://html.com/attributes/select-multiple/";
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
		jsExecutor.executeScript("window.scroll(0, 900)");
		
		Util.sleep(4000);
		
		String selectXpath = "//*[@id=\"post-291\"]/div/div[2]/select";
		WebElement selectElement = genericMethods.getElement(selectXpath, "xpath");
		
		Select select = new Select(selectElement);
		select.selectByIndex(0);
		Util.sleep(1000);
		select.selectByIndex(3);
		
		Util.sleep(1000);
		select.selectByValue("Lesser");
		
		Util.sleep(1000);
		select.deselectAll();
		
		select.selectByVisibleText("Greater flamingo");
		select.selectByVisibleText("Andean flamingo");
		
		List<WebElement> selectedList = select.getAllSelectedOptions();
		
		System.out.println("Number of selected items: " + selectedList.size());
		for(WebElement element : selectedList){
			System.out.println(element.getText());
		}
		
	}

}
