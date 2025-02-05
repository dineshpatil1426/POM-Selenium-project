package com.Ecommerce.qa.Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[1]/span")
	WebElement HeaderTitle;
	@FindBy(xpath = "//button[@class='Header-module--iconButton--db197 Header-module--iconContainer--8ecbb']")
	WebElement SearchButton;
	@FindBy(xpath = "//a[@class='Header-module--iconContainer--8ecbb Header-module--hideOnMobile--911ac']")
	WebElement WishlistButton;
	@FindBy(xpath = "//a[@class='Header-module--iconContainer--8ecbb Header-module--hideOnMobile--911ac']")
	WebElement Loginicon;
	@FindBy(xpath = "//button[@class='Header-module--iconButton--db197 Header-module--iconContainer--8ecbb Header-module--bagIconContainer--c659b']")
	WebElement Cartdrawer;
	@FindBy(xpath = "//div[@class='Drawer-module--iconContainer--250fe ']")
	WebElement btnCloseOfcartdrawer;
	@FindBy(xpath = "//h2[@class='Hero-module--title--b7d95']")
	WebElement HeroSectionText;
	@FindBy(xpath = "//button[@class='Button-module--button--c17ef Button-module--primary--2e17d Hero-module--ctaButton--06285 undefined']")
	WebElement HeroSectionShopButton;
	@FindBy(xpath = "//div[@class='ProductCollection-module--root--b594c']")
	WebElement ProductCollectionGrid;
	@FindBy(xpath = "//div[@class='ProductCard-module--imageContainer--00924']")
	WebElement NewArriavalProduct;
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/main/div[5]/div/div/div/a")
	WebElement btnLuxuryKnitwearshopNow;
	@FindBy(linkText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
	WebElement lnkjouraldetail;
	@FindBy(linkText ="About Us")
	WebElement lnkaboutus;
	@FindBy(xpath = "//div[@class='Brand-module--root--7bb0e']")
	WebElement logoicon;
	@FindBy(linkText = "Journal")
	WebElement lnkFooterJournal;
	@FindBy(linkText = "Privacy Policy")
	WebElement lnkfooterPrivacyPolicy;
	
	
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomePageTitle() {
		
		return driver.getCurrentUrl();
	}

	public boolean VerifyHeaderTitle() {
		
		return HeaderTitle.isDisplayed();
		
	}
	
	public void VerifySearchButton() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		Thread.sleep(3000);
		SearchButton.click();
		System.out.println("Search Button clickable successfully");
		Thread.sleep(3000);
		SearchButton.click();
	}
	
	public WishListPage ClickonWishlisticon() throws InterruptedException {
		
		Thread.sleep(3000);
		WishlistButton.click();
		return new WishListPage();
		
	}
	
	public LoginPage ClickOnLoginIcon() throws InterruptedException {
		
		Thread.sleep(3000);
		Loginicon.click();
		return new LoginPage();
	}
	
	public void OpenCartdrawer() throws InterruptedException {
		
		Thread.sleep(2000);
		Cartdrawer.click();
		Thread.sleep(2000);
		btnCloseOfcartdrawer.click();
		
	}
	
	public String HeroSectionTextVerify() throws InterruptedException {
		
		Thread.sleep(2000);
		return HeroSectionText.getText();
		
	}
	public void HeroSectionShopButtonVerify()throws InterruptedException {
		
		Thread.sleep(2000);
		HeroSectionShopButton.click();
		
	}
	
	public void PageScrollDownForMenu()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,1000)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	
	public void NewCollectionSectionVerify() throws InterruptedException {
		
		Thread.sleep(2000);
		PageScrollDownForMenu();
		Thread.sleep(3000);
		ProductCollectionGrid.click();
		
		
	}
	
	
	public void PageScrollDownForNewarrivals()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,2250)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	
	public void  NewArrivalsSectionVerify() throws InterruptedException  {
		
		Thread.sleep(2000);
		PageScrollDownForNewarrivals();
		Thread.sleep(3000);
		NewArriavalProduct.click();
		
	}
	
	public void PageScrollDownForLuxuryKnitwear()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,3000)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	public void  LuxuryKnitwearSectionVerify() throws InterruptedException  {
		
		Thread.sleep(2000);
		PageScrollDownForLuxuryKnitwear();
		Thread.sleep(3000);
		btnLuxuryKnitwearshopNow.click();
	}
	
	public void PageScrollDownForJournalSection()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,5100)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	public void  JournalSectionVerify() throws InterruptedException  {
		
		Thread.sleep(2000);
		PageScrollDownForJournalSection();
		Thread.sleep(3000);
		lnkjouraldetail.click();
		
	}
	
	public void PageScrollDownForFooterSection()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,7200)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	
	public void  FooterSectionVerify() throws InterruptedException {
		
		//Click on About us 
		Thread.sleep(2000);
		PageScrollDownForFooterSection();
		Thread.sleep(3000);
		lnkaboutus.click();
		Thread.sleep(2000);
		logoicon.click();
		
		//click on journal
		Thread.sleep(2000);
		PageScrollDownForFooterSection();
		Thread.sleep(3000);
		lnkFooterJournal.click();
		Thread.sleep(2000);
		logoicon.click();
		
		//Click on Privacy Policy
		Thread.sleep(2000);
		PageScrollDownForFooterSection();
		Thread.sleep(3000);
		lnkfooterPrivacyPolicy.click();
		Thread.sleep(2000);
		logoicon.click();
		
		
		
		
		
	}
	
	
}
