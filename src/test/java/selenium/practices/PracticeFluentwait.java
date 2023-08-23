package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class PracticeFluentwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http:/omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Check this']")).click();
WebElement mroption=	driver.findElement(By.xpath("//input[@id='dte']"));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(TimeoutException.class);
		wait.withTimeout(Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(mroption));
		mroption.click();
		
		
	}

}
