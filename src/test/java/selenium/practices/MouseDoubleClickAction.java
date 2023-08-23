package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement input=driver.findElement(By.xpath("//input[@id='field1']"));
		input.clear();
		input.sendKeys("i m neha");
	WebElement button=	driver.findElement(By.xpath("//button[text()='Copy Text']"));
	Actions act = new Actions(driver);
	act.doubleClick(button).perform();
	
	
	
	}

}
