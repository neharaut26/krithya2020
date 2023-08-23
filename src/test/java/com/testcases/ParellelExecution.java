package com.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Utility;

public class ParellelExecution {
WebDriver driver;
	@BeforeMethod
	public void SetUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get(Utility.getProperty("url1"));

		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyTitle() {
		assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
	}
	@Test 
	public void dataDrivenn() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("neha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("neha");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement login = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(login.getText(), "Login Successfully");
	}
	@Test
	public void tablecontent() {
		//.out.println(driver.getCurrentUrl());
		assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/test/newtours/index.php");
		
	}
	
	
	
	

	@AfterMethod
	public void closedBrowser() {
		driver.quit();
	
	}
}
