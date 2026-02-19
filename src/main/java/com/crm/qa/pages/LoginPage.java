package com.crm.qa.pages; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 
import com.crm.qa.base.TestBase; 

public class LoginPage extends TestBase { 
	//Page Factory OR 
	@FindBy(name ="loginname") 
	WebElement username; 
	
	@FindBy(name = "password") 
	WebElement password; 
	
	@FindBy(xpath = "//button[@title='Login']") 
	WebElement loginBtn; 
	
	@FindBy(xpath ="//button[contains(text(),'continue')]") 
	WebElement signupBtn; 
	
	@FindBy(xpath ="//img[contains(@src,'resources/image/18/7a/8.png')]") 
	WebElement logo; 
	
	public LoginPage() { 
		PageFactory.initElements(driver, this); 
		} 
	
	public String validateLoginPageTitle() { 
		return driver.getTitle(); 
		} 
	
	public boolean websiteLogo() { 
		return logo.isDisplayed(); 
		} 
	
	public HomePage login(String un, String pwd) { 
		username.sendKeys(un); 
		password.sendKeys(pwd); 
		loginBtn.click(); 
		return new HomePage(); 
		
		} 
	}
