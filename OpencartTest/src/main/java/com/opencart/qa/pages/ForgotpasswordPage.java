package com.opencart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.qa.base.TestBase;

public class ForgotpasswordPage extends TestBase {
	 
	@FindBy(xpath = "//a[contains(text(),'Forgotten Password')]")
	WebElement lnkForgotpassword;
	@FindBy(xpath ="//h1[contains(text(),'Forgot Your Password?')]")
	WebElement ForgotpasswordTitle;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtForgotPasswordemail;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnforgot;
	@FindBy(xpath ="//a[@class='btn btn-light']")
	WebElement btnBack;
	
	public ForgotpasswordPage() {
		
		PageFactory.initElements(driver,this);
	}

public void ValidateForgotpasswordPage() throws InterruptedException {
		
		lnkForgotpassword.click();
		Thread.sleep(1000);
	}
	
	public String ValidateForgotPasswordTitle() {
		
		return driver.getTitle();
	}
	public void ValidateforgotPasswordEmail(String ForgotEmail)throws InterruptedException {
		
		txtForgotPasswordemail.sendKeys(ForgotEmail);
		Thread.sleep(1000);
		btnforgot.click();
	}
	public void ValidateBackButton()throws InterruptedException {
		btnBack.click();
	}
}
