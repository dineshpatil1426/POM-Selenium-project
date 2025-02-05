package com.opencart.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.qa.base.TestBase;
import com.opencart.qa.pages.HomePage;


public class HomePageTestCase extends TestBase {
	
	HomePage homepage;
	
	
	public HomePageTestCase() {
		super();
	}

	
	@BeforeMethod
	public void setUp(){
		initialization();
	    homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String HomePageTitle = homepage.ValidateHomePageTitle();
		Assert.assertEquals(HomePageTitle, "Your Store");
	} 
	@Test(priority=2)
	public void HomePageLogoImageTest() {
		boolean Flag = homepage.ValidateOpencartImage();
		Assert.assertTrue(Flag);
	}
	@Test(priority=3)
	public void OpenLoginPageTest() throws InterruptedException {
		homepage.OpenLoginPage();
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}
