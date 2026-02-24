package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactUsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactUsPage contactUsPage;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority =1)
	public void homePageTitleTest() {
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "My Account","Home Page title not matched");
	}
	
	@Test(priority =2)
	public void verifyCorrectUserNameTest() {
		boolean user = homePage.verifyCorrectUserName();
		Assert.assertTrue(user,prop.getProperty("homePageUserName"));
	}
	
	@Test(priority=3)
	public void verifyContactPageTest() {
		contactUsPage = homePage.clickOnContactLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
