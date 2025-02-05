package com.Ecommerce.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ecommerce.qa.Pages.HomePage;
import com.Ecommerce.qa.Pages.LoginPage;
import com.Ecommerce.qa.base.TestBase;
import com.Ecommerce.qa.util.Testutil;

public class LoginPageTestCase extends TestBase {
	
	Testutil testutil;
	HomePage homepage;
	LoginPage Login;
	
	
	public LoginPageTestCase() {
		super();
	}
	

	@BeforeMethod
	public void setup() {
		initialization();
		testutil = new Testutil();
		homepage = new HomePage();
		Login = new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyhomePageTitle() {
		String homePagetitle=homepage.verifyhomePageTitle();
		Assert.assertEquals(homePagetitle,"https://ecommercepractice.letskodeit.com/");
	}
	
  //@Test(priority=2)
	public void CreateSignUpVerify() throws InterruptedException {
		
			
			Login.CrateSignup("Dinesh","Patil","Test@gmail.com","123456789");
			
	}	
	
	//@Test(priority=3)
	public void LoginVerify() throws InterruptedException {
		
			
			Login.LoginWithData("Test@gmail.com","123456789");
			
	}
	@Test(priority=4)
  	public void  forgotpassword() throws InterruptedException {
			
				
				Login.VerifyForgotpassword("Test@gmail.com");
				
				
		}
	
	@AfterMethod
	public void CloseDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}
