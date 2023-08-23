package selfpractice.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.practices.HandledropdwnByUsingMethod;
import utilities.Utility;

public class SeleniumCommandsJava {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		driver=drop.methodDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		
		//selenim commands 
		System.out.println(driver.getTitle());
		//pageSource
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		WebElement inputbox=driver.findElement(By.id("confirm"));
		inputbox.click();
		
		
	}

}
