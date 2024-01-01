package com.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import selenium.practices.HandledropdwnByUsingMethod;
import utilities.Utility;

public class SoftAssertion {
	WebDriver driver;
	@Test
	public void softAssertion() throws IOException {

	
	HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
	driver=drop.methodDriver();
	driver.get(Utility.getProperty("url"));
	driver.manage().window().maximize();
	
	//soft assertion 
	SoftAssert verify= new SoftAssert();
	verify.assertEquals("omayo (QcFox.com)", "omayo (QAFox.com)");
	verify.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("http://omayo.blogspot.com/"));

	WebElement butn=  driver.findElement(By.xpath("//button[text()='Button2']"));
verify.assertTrue(	butn.getText().equalsIgnoreCase("Button2"));
	//this will true if the conditio is true
	
	 
	 verify.assertAll();
	 
	}
	
}
