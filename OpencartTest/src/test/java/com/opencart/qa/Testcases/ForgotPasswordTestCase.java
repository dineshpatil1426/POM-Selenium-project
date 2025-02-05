package com.opencart.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.qa.base.TestBase;
import com.opencart.qa.pages.ForgotpasswordPage;
import com.opencart.qa.pages.HomePage;
import com.opencart.qa.pages.LoginPage;

public class ForgotPasswordTestCase extends TestBase {
 
	ForgotpasswordPage forgotpage;
	LoginPage LoginPage;
	HomePage homePage;
	
	public ForgotPasswordTestCase() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
	    LoginPage = new LoginPage();
	    homePage = new HomePage();
	    forgotpage = new ForgotpasswordPage();
	    
	}
	
	@Test(priority=1)
	public void ForgotPasswordTest() throws InterruptedException {
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		forgotpage.ValidateForgotpasswordPage();
		
	}
	@Test(priority=2)
	public void ForgotPasswordTitleTest() throws InterruptedException {
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		forgotpage.ValidateForgotpasswordPage();
		Thread.sleep(1000);
		String ForgotPasswordTitle=forgotpage.ValidateForgotPasswordTitle();
		Assert.assertEquals(ForgotPasswordTitle,"Forgot Your Password?");
	} 
	@Test(priority=3)
	public void ForgotPasswordEamilTest() throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		forgotpage.ValidateForgotpasswordPage();
		Thread.sleep(1000);
		forgotpage.ValidateforgotPasswordEmail("talivog731@datingel.com");
	}
	
	@Test(priority=4)
	public void VerifyBackButton()throws InterruptedException {
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		forgotpage.ValidateForgotpasswordPage();
		Thread.sleep(1000);
		forgotpage.ValidateBackButton();
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	
}
