package com.fannie.utils;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	private WebDriver driver;
	
	public ScreenShot(WebDriver driver){
		this.driver = driver;
	}

	public void captureScreenShot(String fileName) {
		
		String path = "C:\\Users\\Huser\\Pictures\\screenShots\\";
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		try{		
		FileUtils.copyFile(file, new File(path + fileName));
		}catch(Exception e){
			
		}		
	}
	
	public void captureScreenShot() {
		String path = "C:\\Users\\Huser\\Pictures\\screenShots\\";
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		try{
		Calendar calendar = GregorianCalendar.getInstance();
		String fileName = 
				calendar.get(Calendar.DATE) + "-" + 
				calendar.get(Calendar.HOUR) + "-" + 
				calendar.get(Calendar.MINUTE) + "-" + 
				calendar.get(Calendar.SECOND) + ".png";
		
		FileUtils.copyFile(file, new File(path + fileName));
		}catch(Exception e){
			
		}
	}
}
