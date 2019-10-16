package com.fannie.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fannie.utils.Driver;

public class DriverFactory {
	
	public static WebDriver getDriver(String name){
		name = name.toUpperCase();
		
		WebDriver driver = null;
		if(name.equals(Driver.CHROME)){
			System.setProperty(Driver.CHROME_DRIVER_KEY, Driver.CHROME_DRIVER_VALUE);
			driver = new ChromeDriver();
		}else if(name.equals(Driver.FIREFOX)){
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
}
