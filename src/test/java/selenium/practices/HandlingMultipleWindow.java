package selenium.practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		
		//getwindowhandle()method will return handle of current window 
	String currentwindow	= driver.getWindowHandle();
	//this method will return all other window handles
Set<String> allwindows= driver.getWindowHandles();
for(String handle:allwindows) {
	if(!(handle.equals(currentwindow))) {
		driver.switchTo().window(handle);
	}
		
}



System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();
System.out.println(driver.findElement(By.xpath("//a[text()='Index Page']")).getText());

driver.navigate().back();
driver.findElement(By.xpath("//a[text()='What should I know prior to learning Selenium?']")).click();
driver.switchTo().window(currentwindow);
WebElement valuee=driver.findElement(By.cssSelector("textarea#ta1"));
valuee.sendKeys("hello i m neha ");
System.out.println(valuee.getAttribute("value"));

	}

}
