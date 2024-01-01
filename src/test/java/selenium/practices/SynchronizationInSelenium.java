package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http:/omayo.blogspot.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement checkbutton=driver.findElement(By.xpath("//button[text()='Check this']"));
	System.out.println(checkbutton.getText());
	js.executeScript("arguments[0].scrollIntoView(true);", checkbutton);
	checkbutton.click();
	
	

	//explicit wait to wait until its click
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
	
	WebElement mrOption=driver.findElement(By.xpath("//input[@id='dte']"));
	wait.until(ExpectedConditions.elementToBeClickable(mrOption));
	
	mrOption.click();
	
	//when any webelement is not clicckeble we use javascript to click it
	driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
	
	WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
	//we use javascipt to click it bcs it will not click by explicit wait also by normal click
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", gmail);

	}

}
