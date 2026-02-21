package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath ="//div[@class='menu_text']")
	WebElement LoggedInUserName;
	
	@FindBy(xpath ="//a[normalize-space()='Contact Us']")
	WebElement ContactUsLink;
	
	@FindBy(xpath ="//a[normalize-space()='Account']")
	WebElement AccountLink;
	
	
	//Initializing the Page Objects
	
		public HomePage() { 
			PageFactory.initElements(driver, this); 
			} 
		
		public String validateHomePageTitle() { 
			return driver.getTitle(); 
			}  
		
		public ContactUsPage clickOnContactLink() {
			ContactUsLink.click();
			return new ContactUsPage();
		}
		
		public AccountPage clickOnAccountLink() {
			AccountLink.click();
			return new AccountPage();
		}
		
		
		
		

}
