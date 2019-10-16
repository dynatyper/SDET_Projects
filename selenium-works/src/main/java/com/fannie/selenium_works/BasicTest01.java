package com.fannie.selenium_works;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class BasicTest01 
{
    public static void main( String[] args ){
    	
    	String URL = "https://www.google.com/";
    	WebDriver driver;
    	
//    	1. load driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Huser\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
//    	2. open browser
    	driver.get(URL);
    	
//    	3. perform operation
    	String title = driver.getTitle();
    	System.out.println("Title -> " + title);
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
//    	4. close browser
    	driver.close();
    }
    
    //
    //
    
    //un:naveenkumar
    //pw:testing@123
}
