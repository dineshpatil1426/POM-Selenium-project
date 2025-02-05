package com.opencart.qa.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.qa.base.TestBase;
import com.opencart.qa.util.TestUtil;


public class SignUpPage extends TestBase {
	
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement MyAccount;
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement lnkSignUpbutton;	
	@FindBy(xpath ="//img[contains(@class,'img-fluid')]")
	WebElement OpencartLogo;
	@FindBy(xpath ="//input[@id='input-firstname']")
	WebElement txtFirstName;
	@FindBy(xpath ="//input[@id='input-lastname']")
	WebElement txtLastName;
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement txtEamilId;
	@FindBy(xpath ="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath ="//button[@type='submit']")
	WebElement btnsignup;
	@FindBy(xpath ="//input[@name='agree']")
	WebElement rdagreebutton;
	
	

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ValidateSignUpPage()throws InterruptedException {
		
		Thread.sleep(1000);
		MyAccount.click();
		Thread.sleep(1000);
		lnkSignUpbutton.click();
		Thread.sleep(3000);
	}
	
	public String ValidateSignUpPageTitle() {
		 return driver.getTitle(); 
	}
	
	public boolean ValidateSignUpImageLogo() {
		 return OpencartLogo.isDisplayed();
	}
	
	public HomePage ValidateSignUp(String FName,String LName,String Email,String Pwd) throws InterruptedException{
		
		txtFirstName.sendKeys(FName);
		Thread.sleep(500);
		txtLastName.sendKeys(LName);
		Thread.sleep(500);
		txtEamilId.sendKeys(Email);
		Thread.sleep(500);
		txtPassword.sendKeys(Pwd);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		rdagreebutton.click();
		Thread.sleep(1000);
		btnsignup.click();
		Thread.sleep(500);
		
		
		return new HomePage ();
		
	}
}
