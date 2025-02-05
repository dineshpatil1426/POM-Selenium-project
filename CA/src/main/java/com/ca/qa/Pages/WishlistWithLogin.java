package com.ca.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ca.qa.base.TestBase;

public class WishlistWithLogin extends TestBase {
	
	

	@FindBy (xpath = "//*[@id=\"shopify-section-template--16486951846083__new_home_page_sale_2024_etgCLH\"]/section/div/div[2]/div[1]/a") 
	WebElement WomenCollectionbutton;
	@FindBy(id = "ws-fav-btn")
	WebElement wishlisticon;
	@FindBy(xpath = "//*[@id=\"pge_wQ10MdPO0\"]/div[1]")
	WebElement btnCloseOfNewsletter;
	@FindBy(xpath = "//*[@id=\"custom_country_selector\"]/div[2]/div[1]")
	WebElement btnCloseOfCountry;
	@FindBy(xpath = "//*[@id=\"field-login-email\"]")
	WebElement txtEmailid;
	@FindBy(xpath = "//*[@id=\"field-login-password\"]")
	WebElement txtpassword;
	@FindBy(name = "login-submit")
	WebElement btnLogin;
	
	
	
	
	public WishlistWithLogin() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomePageTitle() {
		
		return driver.getTitle();
	}
	
	
	public void ClickOnWonmenButton(String EmailAddress,String Password) throws InterruptedException {
		
		WomenCollectionbutton.click();
		Thread.sleep(2000);
		PageScrollDownForMenu();
		Thread.sleep(3000);
		btnCloseOfNewsletter.click();
		Thread.sleep(3000);
		btnCloseOfCountry.click();
		Thread.sleep(2000);
		wishlisticon.click();
		Thread.sleep(2000);
		txtEmailid.sendKeys(EmailAddress);
		Thread.sleep(2000);
		txtpassword.sendKeys(Password);
		Thread.sleep(2000);
		btnLogin.click();
		
		
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
