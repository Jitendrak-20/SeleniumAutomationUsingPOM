package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactUsPage extends TestBase{
	
	
	@FindBy(xpath ="//a[contains (text(), 'Contact Us')]")
	WebElement contactUsPageElement;
	
	@FindBy(xpath = "//span[contains (text() , 'Contact Us')]")
			WebElement conatactUsLabel;
	
	
	@FindBy(xpath = "//span[contains (text() , '012345 6781199')]")
	WebElement conatactUsNumber;
	
	
	
	public ContactUsPage() { 
		PageFactory.initElements(driver, this); 
		} 
	
	public void contactUsPageElement() {
		contactUsPageElement.click();
	}
	
	public boolean VerifyConatactUsLabel(){ 
		return  conatactUsLabel.isDisplayed();
		} 
	
	public boolean VerifyConatactNumber(){ 
		return  conatactUsNumber.isDisplayed();
		} 

}
