package com.ca.qa.Pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ca.qa.base.TestBase;

public class SimpleLogin extends TestBase {
	
	
	@FindBy(xpath = "//*[@id=\"pge_wQ10MdPO0\"]/div[1]")
	WebElement btnCloseOfNewsletter;
	@FindBy(xpath = "//*[@id=\"custom_country_selector\"]/div[2]/div[1]")
	WebElement btnCloseOfCountry;
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/header/div[4]/div/div[3]/ul/li[2]/a")
	WebElement WishlistIcon;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/div")
	WebElement Emailid;
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[3]/div")
	WebElement Password ;
	@FindBy(name="login-submit") 
	WebElement btnlogin;
	
	
	/*
	@FindBy (xpath ="//*[@id='field-login-email']")
	WebElement Emailid;
	@FindBy (xpath ="//*[@id='field-login-password']")
	WebElement Password;
	@FindBy (xpath ="//*[@id='customer_login']/div[4]/input")
    WebElement btnlogin;	
	*/
	
	
  
	
	public SimpleLogin() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomePageTitle() {
		
		return driver.getTitle();
	}
	
	public void ClosePopUp() throws InterruptedException {
		
		btnCloseOfNewsletter.click();
		Thread.sleep(3000);
		btnCloseOfCountry.click();
		Thread.sleep(2000);
	}
	
	public void OpenLoginPage(String EmailAddress1,String password1) throws InterruptedException {
		
		WishlistIcon.click();
		PageScrollDownForMenu();
		//Thread.sleep(3000);
		
		/*
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Emailid =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer_login\"]/div[2]/div")));
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/div")).sendKeys(EmailAddress1);
		Thread.sleep(3000);
		*/
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Emailid.sendKeys(EmailAddress1);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	
		Password.sendKeys(password1);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		btnlogin.click();
			
		
		
		/*
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Emailid.sendKeys(EmailAddress);
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Password.sendKeys(password);
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		btnlogin.click();
		*/
	}
	
	public void PageScrollDownForMenu()throws InterruptedException {
		
		try { 
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,200)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	

}
