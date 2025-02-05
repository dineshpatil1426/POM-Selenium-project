package com.Ecommerce.qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.qa.base.TestBase;
import com.Ecommerce.qa.util.Testutil;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[@class='Header-module--iconContainer--8ecbb Header-module--hideOnMobile--911ac']")
	WebElement Loginicon;
	@FindBy(xpath="//button[@class='Button-module--button--c17ef Button-module--secondary--e788d Button-module--fullWidth--737a0']")
	WebElement btnSignUp;
	@FindBy(id="firstName")
	WebElement txtFirstName;
	@FindBy(id ="lastName")
	WebElement txtLastName;
	@FindBy(id ="email")
	WebElement txtEmailid;
	@FindBy(id="password")
	WebElement txtpassword;
	@FindBy(xpath ="//*[@id=\"gatsby-focus-wrapper\"]/main/div[2]/div[1]/form/button[1]")
	WebElement btnlogin;
	@FindBy(xpath ="//a[@class='login-module--forgotLink--0d638']")
	WebElement lnkforgotPassword;
	@FindBy(xpath ="//*[@id=\"gatsby-focus-wrapper\"]/main/div[1]/form/div[2]/button")
	WebElement btnResetpassword;
	
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void PageScrollDownForsignup()throws InterruptedException {
		
		try {
			
			Thread.sleep(3000);
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,200)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	public void CrateSignup(String FirstName,String LastName,String Email,String Password) throws InterruptedException {
		
		Thread.sleep(3000);
		Loginicon.click();
		Thread.sleep(3000);
		btnSignUp.click();
		Thread.sleep(3000);
		PageScrollDownForsignup();
		Thread.sleep(3000);
		txtFirstName.sendKeys(FirstName);
		Thread.sleep(2000);
		txtLastName.sendKeys(LastName);
		Thread.sleep(2000);
        txtEmailid.sendKeys(Email);
        Thread.sleep(2000);
        txtpassword.sendKeys(Password);
        Thread.sleep(2000);
        btnSignUp.click();
        Thread.sleep(3000);
			
	}
	
	public void LoginWithData(String lnEmail,String lnpwd) throws InterruptedException {
		
		Thread.sleep(3000);
		Loginicon.click();
		Thread.sleep(3000);
		
		txtEmailid.sendKeys(lnEmail);
		Thread.sleep(3000);
		txtpassword.sendKeys(lnpwd);
		Thread.sleep(3000);
		btnlogin.click();
		Thread.sleep(5000);
		
		
		
	}
	
	
	public void VerifyForgotpassword(String FgEmail) throws InterruptedException {
		
		Thread.sleep(3000);
		Loginicon.click();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		lnkforgotPassword.click();
		Thread.sleep(3000);
		
		
		txtEmailid.sendKeys(FgEmail);
		Thread.sleep(5000);
		btnResetpassword.click();
		
		
	}
	
}
