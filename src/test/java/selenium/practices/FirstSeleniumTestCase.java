package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestCase {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver" ,"src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		//driver.manage().window().maximize();
		//driver.close();
		//to find webelement
		WebElement element= driver.findElement(By.name("userid"));
		element.sendKeys("hi");
		Thread.sleep(2000);
		element.clear();
		WebElement element1 = driver.findElement(By.id("link1"));
		element1.click();
		//WebElement element2 =  driver.findElement(By.xpath("//button[@value='LogIn']"));
	System.out.println(driver.findElements(By.xpath("//button[@type='button']")).size());
	}
}

