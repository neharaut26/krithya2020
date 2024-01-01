package com.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import selenium.practices.HandledropdwnByUsingMethod;
import utilities.Utility;

public class TestCases {
	WebDriver driver;
	@BeforeMethod
	public void launchinUrl() throws IOException {
		
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		 driver=	drop.methodDriver();
	driver.get(Utility.getProperty("url"));
	}
	
	@Test
	public void verifyTitle() {
		String title=driver.getTitle();
		assertEquals(title,"omayo (QAFox.com)","title is wrong");
		assertTrue(title.equals("omayo (QAFox.com)"), "title is wrong");
		//System.out.println("neha");
	}
	
	@Test
	public void verifyInputBox() {
	WebElement inputbox=	driver.findElement(By.xpath("//input[@type='text'][1]"));
	SoftAssert verify=new SoftAssert();
	
	WebElement uploadfile=driver.findElement(By.id("uploadfile"));
	uploadfile.	sendKeys("C:\\Users\\ABC\\Desktop\\krithya\\java theory qn.docx");
	System.out.println("neha");
	verify.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
		
		
	}

	

