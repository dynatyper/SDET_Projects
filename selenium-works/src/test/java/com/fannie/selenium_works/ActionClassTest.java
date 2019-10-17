package com.fannie.selenium_works;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class ActionClassTest {

	String URL = "http://tasyah.com/";
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
	public void actionTest(){
		driver.get(URL);
		
		String menuItemXpath = "//*[@id=\"menu_category_Menu_VIfWm2LT_439\"]/a";
		String subMenuItem = "//*[@id=\"menu_category_Menu_VIfWm2LT_439\"]/ul/li[1]/a/span";
		
		WebElement menuItemElement = genericMethods.getElement(menuItemXpath, "xpath");
		Actions actions = new Actions(driver);
		
		actions.moveToElement(menuItemElement).perform();
		
		Util.sleep(2000);
		
		genericMethods.getElement(subMenuItem, "xpath").click();
		
		Util.sleep(4000);
	}
	
	@Test
	public void clickLoginDropdownTest(){
		driver.get(URL);
		
		String accountMenu = "//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a";
		String subMenuItemLogin = "//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[1]/a/span";
		
		WebElement menuItemElement = genericMethods.getElement(accountMenu, "xpath");
		Actions actions = new Actions(driver);
		
		actions.moveToElement(menuItemElement).perform();
		
		Util.sleep(2000);
		
		genericMethods.getElement(subMenuItemLogin, "xpath").click();
		
		Util.sleep(4000);
	}

}
