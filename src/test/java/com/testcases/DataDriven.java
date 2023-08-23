package com.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Utility;

public class DataDriven {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void launching() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Utility.getProperty("url1"));

		driver.manage().window().maximize();
	}

	@Test(dataProvider = "userData")
	public void dataDrivenn(String name, String pass) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement login = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(login.getText(), "Login Successfully");
	}

	@DataProvider(name = "userData")
	public String[][] data1() {
		String user[][] = { { "neha", "neha" }, { "user2", "password2" }, { "user3", "password3" } };
		return user;

	}

	@AfterMethod(alwaysRun = true)
	public void closedBrowser() {
		driver.quit();
	}

}
