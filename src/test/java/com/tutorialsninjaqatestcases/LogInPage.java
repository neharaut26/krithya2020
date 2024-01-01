package com.tutorialsninjaqatestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPage extends BaseCode{
	@Test
	public void verifyLogin() {
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("rautneha211@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("neha@#$123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	
	}
	

}
