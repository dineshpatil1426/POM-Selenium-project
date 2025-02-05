package com.opencart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.opencart.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		try {
		 	prop =new Properties();
			FileInputStream ip = new FileInputStream("/Users/macmini/Documents/Selenium new/selenium script/OpencartTest/src/main/java/com/opencart"
						+"/qa/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException Path Error...");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IOException Path Error...");
		}
	}



	public static void initialization() {
		
	    String browserName  =prop.getProperty("browser");
	    
	    if(browserName.equals("chrome")){
	    	
	    	System.out.println("Check browser Name is =>" + browserName);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*"); 
			System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/OpencartTest/drivers/chromedriver");
			driver = new ChromeDriver();
	    	
	    }else if(browserName.equals("FF")) {
	    	
	    	System.setProperty("webdriver.gecko.driver", "/Users/macmini/Documents/Selenium new/selenium script/OpencartTest/drivers/geckodriver");
			driver = new FirefoxDriver();
	    }
	    
	    
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
} 
