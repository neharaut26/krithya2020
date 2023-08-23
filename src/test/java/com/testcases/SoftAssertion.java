package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import selenium.practices.HandledropdwnByUsingMethod;
import utilities.Utility;

public class SoftAssertion {
	@Test
	public void softAssertion() throws IOException {

	WebDriver driver;
	HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
	driver=drop.methodDriver();
	driver.get(Utility.getProperty("url"));
	driver.manage().window().maximize();
	
	//soft assertion 
	SoftAssert verify= new SoftAssert();
	verify.assertEquals("omayo (QAFox.com)", "omayo (QAFox.com)");
	
	
	//this will true if the conditio is true
	
	 verify.assertTrue(driver.getTitle().equals("omayo (QAFox.com)"));
	 
		
		 //it returns true if condition is false
		 verify.assertNotEquals(driver.getTitle(), "omayo (QAFox.com)", "title1 is equal");
		 
		 //it returns true if condition is false
		  verify.assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"title2 is equal");
	 verify.assertAll();
	}
	
}
