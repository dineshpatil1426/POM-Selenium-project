package com.Ecommerce.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ecommerce.qa.Pages.HomePage;
import com.Ecommerce.qa.base.TestBase;
import com.Ecommerce.qa.util.Testutil;

public class HomePageTestCase extends TestBase {

	Testutil testutil;
	HomePage homepage;
	
	
	public HomePageTestCase() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		testutil = new Testutil();
		homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void verifyhomePageTitle() {
		String homePagetitle=homepage.verifyhomePageTitle();
		Assert.assertEquals(homePagetitle,"https://ecommercepractice.letskodeit.com/");
	}
	
	@Test(priority=2)
	public void VerifyHeaderText() {
	
		boolean Flag = homepage.VerifyHeaderTitle();
		Assert.assertTrue(Flag);
	}
	
	//@Test(priority=3)
	public void SearchbuttonVerify() throws InterruptedException {
		
		homepage.VerifySearchButton();
	}
	
	//@Test(priority=4)
	public void wishlistIconVerify() throws InterruptedException {
		homepage.ClickonWishlisticon();
	}
	
	//@Test(priority=5)
	public void LoginIconVerify() throws InterruptedException {
		homepage.ClickOnLoginIcon();
	}
	
	//@Test(priority=6)
	public void OpenCartDrawer() throws InterruptedException {
		homepage.OpenCartdrawer();
	}
	//@Test(priority=7)
	public void verifyHeroSection() throws InterruptedException {
		
		String Match =homepage.HeroSectionTextVerify();
		Assert.assertEquals(Match, "Essentials for a cold winter");
	}
	//@Test(priority=8)
	public void HeroSectionShopbuttonVerify()  throws InterruptedException{
		
		homepage.HeroSectionShopButtonVerify();
	}
	//@Test(priority=9)
	public void NewCollectionSection() throws InterruptedException {
		homepage.NewCollectionSectionVerify();
	} 
	//@Test(priority=10)
	public void NewArrailsSection()throws InterruptedException{
		homepage.NewArrivalsSectionVerify();
	}
	//@Test(priority=11)
	public void LuxuryKnitwearSection()throws InterruptedException {
		homepage.LuxuryKnitwearSectionVerify();
	}
	
	//@Test(priority=12)
	public void JournalSectionVerify() throws InterruptedException {
		
		homepage.JournalSectionVerify();
	}
	
	@Test(priority=13)
	public void FooterSection() throws InterruptedException {
		
		homepage.FooterSectionVerify();
	}
	
	@AfterMethod
	public void CloseDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}

