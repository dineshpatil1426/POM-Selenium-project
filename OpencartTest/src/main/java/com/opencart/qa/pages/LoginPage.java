package com.opencart.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.opencart.qa.base.TestBase;



public class LoginPage extends TestBase {
	
	//Page Factory-OR:
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement MyAccount;
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement Loginlnk;
	@FindBy(xpath ="//img[contains(@class,'img-fluid')]")
	WebElement OpencartLogo;
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement txtEmailid;
	@FindBy(xpath ="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath ="//button[@type='submit']")
	WebElement btnLogin;
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement btnnewSignup;
	@FindBy(xpath ="//a[contains(text(),'Forgotten Password')]")
	WebElement lnkforgotpassword;
	@FindBy(xpath ="//a[contains(text(),'Register')]")
	WebElement lnkRegister;
	@FindBy(xpath ="//a[contains(text(),'Login')]")
	WebElement lnklogin;
	@FindBy(xpath = "//a[contains(text(),'Order History')]")
	WebElement lnkorderHistory;
	
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateOpencartImage() {
		return OpencartLogo.isDisplayed();
	}
	
	public void OpenLoginPage() {
		MyAccount.click();
		Loginlnk.click();
	}
	
	public SignUpPage ValidateSignUpInLoginPage()throws InterruptedException {
		
		btnnewSignup.click();
		Thread.sleep(2000);
		return new SignUpPage();
	}
	
	public HomePage Login(String Emailid, String Password)throws InterruptedException {
		
		try {
			txtEmailid.sendKeys(Emailid);
			txtPassword.sendKeys(Password);
			btnLogin.click();
			
		} catch (Exception e) {
			System.out.println("Error Message");
		}
		return new HomePage();
		
	}
	
	public void OpenOrderHistorypageWithLogin()throws InterruptedException {
		
			Thread.sleep(1000);
			MyAccount.click();
			Thread.sleep(1000);
			lnkorderHistory.click();
	}
	
	
	public void OpenForgottPage()throws InterruptedException {
		
		Thread.sleep(1000);
		lnkforgotpassword.click();
		
	}
	
	public void OpenregisterPage()throws InterruptedException {
		
		Thread.sleep(1000);
		lnkRegister.click();
		
	}
	public void OpenwithlinkbuttonloginPage()throws InterruptedException {
		
		Thread.sleep(1000);
		lnklogin.click();
		
	}
	
}
