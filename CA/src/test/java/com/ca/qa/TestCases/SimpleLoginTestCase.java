package com.ca.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ca.qa.Pages.SimpleLogin;
import com.ca.qa.base.TestBase;
import com.ca.qa.util.Testutil;

public class SimpleLoginTestCase extends TestBase {
	
	Testutil testutil;
	SimpleLogin Slogin;
	
	public SimpleLoginTestCase() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		testutil = new Testutil();
		Slogin = new SimpleLogin();
	}
/*	
	@Test(priority = 1)
	public void verifyhomePageTitle() {
		String HomeTitlepage =Slogin.verifyhomePageTitle();
		Assert.assertEquals(HomeTitlepage,"Manière De Voir Canada | For the Tastemakers.");
	}
	
	@Test(priority = 2)
	public void ClosePopup() throws InterruptedException {
		
		Slogin.ClosePopUp();
	}
*/	
	@Test(priority = 3)
	public void LoginProcess() throws InterruptedException {
		
		Slogin.ClosePopUp();
		Thread.sleep(2000);
		Slogin.OpenLoginPage("testbyteam2@yopmail.com","123456789");
	}
	
	@AfterMethod
	public void closedriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
