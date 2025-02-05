package com.opencart.qa.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.qa.base.TestBase;
import com.opencart.qa.pages.HomePage;
import com.opencart.qa.pages.LoginPage;

public class LoginPageTestCase extends TestBase {
	
	LoginPage LoginPage;
	HomePage  homePage;
	
	
	public LoginPageTestCase() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
	    LoginPage = new LoginPage();
	    homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		String LoginTitle = LoginPage.ValidateLoginPageTitle();
		Assert.assertEquals(LoginTitle,"Account Login");
	}
	@Test(priority=2)
	public void OpenCartImageTest() throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		boolean Flag = LoginPage.ValidateOpencartImage();
		Assert.assertTrue(Flag);
	}
	
	@Test(priority=3)
	public void ValidateSignButtonTest() throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		LoginPage.ValidateSignUpInLoginPage();
	}
	
	@Test(priority=4)
	public void LoginTest() throws InterruptedException {
		 
			 homePage.OpenLoginPage();
			 Thread.sleep(1000);
			 homePage=LoginPage.Login(prop.getProperty("Emailid"),prop.getProperty("password"));		
	}
	
	@Test(priority=5)
	public void OpenOrderHistoryPageTest()throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		homePage=LoginPage.Login(prop.getProperty("Emailid"),prop.getProperty("password"));
		Thread.sleep(1000);
		LoginPage.OpenOrderHistorypageWithLogin();
		Thread.sleep(1000);
	}
	
	/*
	@Test(priority=5)
	public void OpenForgotPageTest()throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		LoginPage.OpenForgottPage();
		Thread.sleep(1000);
	} 
	@Test(priority=6)
	public void OpenRegisterLinkTest()throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		LoginPage.OpenregisterPage();
		Thread.sleep(1000);
	}
	
	@Test(priority=7)
	public void OpenLoginLinkTest() throws InterruptedException {
		
		homePage.OpenLoginPage();
		Thread.sleep(1000);
		LoginPage.OpenwithlinkbuttonloginPage();
	}
	*/
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
