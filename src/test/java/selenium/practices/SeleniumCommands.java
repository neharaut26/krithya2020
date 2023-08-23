package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
//
WebElement element =driver.findElement(By.xpath("//input[@id='radio1']"));
	element.click();
	Thread.sleep(2000);
WebElement element1 = driver.findElement(By.xpath("//input[@name='gender' and @value='female'] "));
element1.click();

System.out.println(driver.findElement(By.xpath("//input[@value='ReadThisText']")).getText());
//driver.findElement(By.id("prompt")).click();

System.out.println(driver.findElements(By.xpath("//button[@type='button']")).size());
//or
List<WebElement> elements = driver.findElements(By.tagName("button"));
System.out.println(	elements.size());
System.out.println(	driver.getCurrentUrl());
//getpagesource will return total code of html web browser
//System.out.println(	driver.getPageSource());
System.out.println(	driver.getTitle());
	}

}
