package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Utility;

public class Demo {
	@Test
	public void dataUser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.getProperty("url1"));
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("neha");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("neha");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		WebElement login = driver.findElement(By.xpath("//h3[text()=\"Login Successfully\"]"));
		if(login.getText().equals("Login Successfully")) {
			System.out.println("log in successfully.");
		}
		
		
	}
	}


