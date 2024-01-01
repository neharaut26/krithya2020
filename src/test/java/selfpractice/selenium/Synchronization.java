
package selfpractice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.practices.HandledropdwnByUsingMethod;

public class Synchronization {

	public static void main(String[] args) {
		WebDriver driver;
		HandledropdwnByUsingMethod s1 = new HandledropdwnByUsingMethod();
		driver=s1.methodDriver();
		driver.get("http:/omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Check this']")).click();
		//explicit wai
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
WebElement mrOption=		driver.findElement(By.xpath("//input[@id='dte']"));
	wait.until(ExpectedConditions.elementToBeClickable(mrOption));
	mrOption.click();
		
		
	}

}
