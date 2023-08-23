package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.practices.HandledropdwnByUsingMethod;
import utilities.Utility;

public class TestCases {
	@Test
	public  void pageVerify() throws IOException {
		
		WebDriver driver;
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		driver = drop.methodDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		
	}

	
}
