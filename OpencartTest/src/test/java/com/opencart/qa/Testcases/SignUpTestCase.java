package com.opencart.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.qa.base.TestBase;
import com.opencart.qa.pages.HomePage;
import com.opencart.qa.pages.SignUpPage;

public class SignUpTestCase extends TestBase {
	
	SignUpPage signuppage;
	HomePage homepage;
	
	
	public SignUpTestCase() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		signuppage = new SignUpPage();
		homepage = new HomePage();
	}

	@Test(priority=1)
	public void OpenSignUpPageTest()throws InterruptedException {
		signuppage.ValidateSignUpPage();
	}
	@Test(priority=2)
	public void SignUpPageTitleTest() throws InterruptedException {
		 
		 signuppage.ValidateSignUpPage();
		 Thread.sleep(1000);
		 String SignUpTitle=signuppage.ValidateSignUpPageTitle();
		 Assert.assertEquals(SignUpTitle,"Register Account");
	}
	@Test(priority=3)
	public void SignUpLogoImageTest()throws InterruptedException {
		signuppage.ValidateSignUpPage();
		Thread.sleep(1000);
		Boolean Flag = signuppage.ValidateSignUpImageLogo();
		Assert.assertTrue(Flag);
	}
	
	@Test(priority=4)
	public void newSignUpUserTest()throws InterruptedException {
		signuppage.ValidateSignUpPage();
		Thread.sleep(1000);
		homepage=signuppage.ValidateSignUp("Dinesh", "Patil", "opencart2@yopmail.com", "123456");
		
	}

	@AfterMethod
	public void QuitBrowser(){
		driver.quit();
	}
}
