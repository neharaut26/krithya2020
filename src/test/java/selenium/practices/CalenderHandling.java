package selenium.practices;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utility;

public class CalenderHandling {

	public static void main(String[] args) throws IOException, InterruptedException {
		CalenderHandling date = new CalenderHandling();
		date.selectDate("1","20");

	}
	

	public void selectDate(String month, String date) throws IOException, InterruptedException {
		WebDriver driver;
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		driver = drop.methodDriver();
		driver.get(Utility.getProperty("demoCalender"));
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//input[@id='departure']/../span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][" + month
				+ "]//div[@class='DayPicker-Day']//p[text()='" + date + "']")).click();
	}

}
