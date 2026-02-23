package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactUsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactUsTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactUsPage contactUsPage;
	TestUtil testUtil;
	
	public ContactUsTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		testUtil = new TestUtil();
		contactUsPage = new ContactUsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactUsPage.contactUsPageElement();
	}
	
	@Test(priority =1)
	public void contactUsLabelTest() {
//		contactUsPage.VerifyConatactUsLabel();
		
		Assert.assertTrue(contactUsPage.VerifyConatactUsLabel());
	}
	
	@Test(priority =2)
	public void contactUsNumberTest() {
		Assert.assertTrue(contactUsPage.VerifyConatactUsLabel());
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
