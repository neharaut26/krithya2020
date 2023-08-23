package com.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import selenium.practices.HandledropdwnByUsingMethod;
import utilities.Utility;

public class HardAssert {
	@Test
	public void hardAssertion() throws IOException {
		WebDriver driver;
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		driver=drop.methodDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		//we dont need to make class and object here.
		assertEquals("omayo (QAFox.com)", "omayo (QAFox.com)");
		
		
		//this will true if the condition is true
		
		 assertTrue(driver.getTitle().equals("omayo (QAFox.com)"));
		 
			
			 //it returns true if condition is false
			 assertNotEquals(driver.getTitle(), "omayo (QAFox.com)", "title1 is equal");
			 
			 //it returns true if condition is false
			  assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"title2 is equal");
		
	}

}
