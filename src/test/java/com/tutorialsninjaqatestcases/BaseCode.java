package com.tutorialsninjaqatestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Utility;


public class BaseCode {
	
WebDriver driver;
	@BeforeMethod
	public WebDriver launchingUrl() throws IOException {
		driver= new ChromeDriver();
		driver.get(Utility.getProperty("url2"));
		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterMethod
	public void BrowereClose() {
		driver.quit();

	}
}
