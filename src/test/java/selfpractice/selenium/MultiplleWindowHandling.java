package selfpractice.selenium;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.*;
public class MultiplleWindowHandling   {

	public static void main(String[] args) throws IOException  {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/omayo.blogspot.com");
		driver.manage().window().maximize();
	WebElement link=	driver.findElement(By.xpath("//a[@id='selenium143']"));
	link.click();
String parentWindowHandle=driver.getWindowHandle();
Set<String>allallHandles=driver.getWindowHandles();
for(String CurrentWindowHandle:allallHandles) {
	
	if(!(CurrentWindowHandle.equals(parentWindowHandle))){
		driver.switchTo().window(CurrentWindowHandle);
	}
}
WebElement link1=	driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
System.out.println(link1.getText());
link1.click();

	




		
	
	}

}

