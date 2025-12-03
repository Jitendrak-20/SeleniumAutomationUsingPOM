package com.testing.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testing.base.BasePage;
import com.testing.pages.RegistrationPage;
import com.testing.pages.SignInPage;
import com.testing.pages.HomePage;

public class BaseTest {
	
	public BasePage basePage;
	public WebDriver driver;
	public RegistrationPage registrationPage;
	public SignInPage signInPage;
	public HomePage homePage;
	
	@BeforeMethod
	public void baseSetup() {
		
		
		basePage = new BasePage();
		driver = basePage.getDriver("chrome");
		driver.get("url of the App");
		
		
		registrationPage = new RegistrationPage();
		signInPage = new SignInPage();
		
		
	}
	@AfterMethod
	
	public void closeBrowser() {
		basePage.quitDriver();
	}
	

}
