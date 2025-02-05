package com.ca.qa.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ca.qa.Pages.WishlistWithLogin;
import com.ca.qa.base.TestBase;
import com.ca.qa.util.Testutil;

public class WishlistWithLoginTestcase extends TestBase {

	Testutil testutil;
	WishlistWithLogin WishlistWithLoginPage;
	
	
	public WishlistWithLoginTestcase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testutil = new Testutil();
		WishlistWithLoginPage = new WishlistWithLogin();
	}
	
	@Test(priority = 1)
	public void verifyhomePageTitle() {
		 String HomeTitlepage =WishlistWithLoginPage.verifyhomePageTitle();
		 Assert.assertEquals(HomeTitlepage,"Manière De Voir Canada | For the Tastemakers.");
	}
	
	@Test(priority = 2)
	public void OpenWomenCollectionPage() throws InterruptedException {
		
		WishlistWithLoginPage.ClickOnWonmenButton("testbyteam2@yopmail.com","123456789");
	}
	
	
	@AfterMethod
	public void closedriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
