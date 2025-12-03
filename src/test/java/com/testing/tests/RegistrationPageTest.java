package com.testing.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.basetest.BaseTest;




public class RegistrationPageTest extends BaseTest {
	
	
	
	@BeforeMethod
	public void setupPage() {
		
//		Open Registration Page
		
		
		homePage.openRegistrationPage();
		
	}
	@Test
	public void isLogoPresentTest() {
		Assert.assertTrue(registrationPage.verifyLogo(),"Error- Logo is not available");
	}
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(registrationPage.getTitle(), "Automation Test Store", "Error- Page title is wrong | Actual title is:"+registrationPage.getTitle());
	}
	

}
