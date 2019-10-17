package com.fannie.selenium_works;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.ScreenShot;
import com.fannie.utils.Util;

public class SelectMultipleElementsDatePickerTest {
	
	String URL = "https://www.expedia.com/";
	WebDriver driver;
	ScreenShot screenShot;
	GenericMethods genericMethods;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME);
		genericMethods = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
	}
	
	@After
	public void tearDown(){
		Util.sleep(3000);
		driver.quit();
	}
	

	@Test
	public void datePickerTest() {
		
		driver.get(URL);
		genericMethods.getElement("tab-flight-tab-hp", "id").click();
		
		String originPlace = "Washington, DC (IAD-Washington Dulles Intl.)";
		String destPlace = "Minsk, Belarus (MSQ-Minsk Intl.)";
		
		String originElementPath = "flight-origin-hp-flight";
		String destElementPath = "flight-destination-hp-flight";
		
		String departDate = "flight-departing-hp-flight";
		
		genericMethods.getElement(originElementPath, "id").clear();		
		genericMethods.getElement(originElementPath, "id").sendKeys(originPlace);
		
		genericMethods.getElement(destElementPath, "id").clear();		
		genericMethods.getElement(destElementPath, "id").sendKeys(destPlace);
		
		genericMethods.getElement(departDate, "id").click();
		
		Util.sleep(2000);
		
		String xpathDates = "//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div[2]/div[2]/table/tbody/tr/td/button[not(@disabled)]";
		
		List<WebElement> activeDateElements = genericMethods.getElementAsList(xpathDates, "xpath");
		System.out.println("Active number of Dates in the Month: " + activeDateElements.size());
		
		List<String> activeDateElementsAsString = new ArrayList<String>();
		System.out.println("These are the elements of the list: " + activeDateElements);
		
		for(WebElement element : activeDateElements){
			System.out.println("Date is " + element.getText());
			activeDateElementsAsString.add(element.getText());
		}
		
		for(String date : activeDateElementsAsString){
			
		}
		
		
		
		
		
		
	}
	
	@Test
	public void datePickerWithChildrenTest() {
		//Add children and ages to the script
		driver.get(URL);
		genericMethods.getElement("tab-flight-tab-hp", "id").click();
		
		String originPlace = "Washington, DC (IAD-Washington Dulles Intl.)";
		String destPlace = "Minsk, Belarus (MSQ-Minsk Intl.)";
		
		String originElementPath = "flight-origin-hp-flight";
		String destElementPath = "flight-destination-hp-flight";
		
		String departDate = "flight-departing-hp-flight";
		
		genericMethods.getElement(originElementPath, "id").clear();		
		genericMethods.getElement(originElementPath, "id").sendKeys(originPlace);
		
		genericMethods.getElement(destElementPath, "id").clear();		
		genericMethods.getElement(destElementPath, "id").sendKeys(destPlace);
		
		genericMethods.getElement(departDate, "id").click();
		
		Util.sleep(2000);
		
		String xpathDates = "//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div[2]/div[2]/table/tbody/tr/td/button[not(@disabled)]";
		
		
	}

}
