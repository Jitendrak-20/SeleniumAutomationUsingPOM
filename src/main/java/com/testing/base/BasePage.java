package com.testing.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	protected WebDriver driver;
	
	// Constructor
	
	public WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public void quitDriver() {
		driver.quit();
	}
	
	//Common methods 
	
	//Logo
	public boolean verifyLogo() {
		return false;
	}
	
	//Verify Title
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	//CurrentURL
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
