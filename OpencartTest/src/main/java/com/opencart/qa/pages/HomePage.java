package com.opencart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.qa.base.TestBase;

public class HomePage extends TestBase {

		//Page Factory-OR:
	
		@FindBy(xpath="//span[contains(text(),'My Account')]")
		WebElement MyAccount;
		@FindBy(xpath="//a[contains(text(),'Login')]")
		WebElement Loginlnk;
		@FindBy(xpath ="//img[contains(@class,'img-fluid')]")
		WebElement OpencartLogo;
		
		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String ValidateHomePageTitle() {
			return driver.getTitle();
		}
		
		public boolean ValidateOpencartImage() {
			return OpencartLogo.isDisplayed();
		}
		
		public void OpenLoginPage() throws InterruptedException {
			
			MyAccount.click();
			Thread.sleep(3000);
			Loginlnk.click();
			Thread.sleep(3000);
		}
	
}
