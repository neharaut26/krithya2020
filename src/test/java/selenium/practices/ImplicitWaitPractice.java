package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitPractice {
	
	public static void main(String[] args) {
		ImplicitWaitPractice w1 =new ImplicitWaitPractice();
		w1.WebdriverIntialize();

	}
	



	public void WebdriverIntialize() {
		WebDriver  driver;
		HandledropdwnByUsingMethod s1 = new HandledropdwnByUsingMethod();
		driver=s1.methodDriver();
		driver.manage().window().maximize();
		driver.get("http:/omayo.blogspot.com/");
		//use of implicit wait
		//driver.findElement(By.xpath(""));
		//explicit wait
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement Dropdwn=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		js.executeScript("arguments[0].scrollIntoView(true);",Dropdwn);
		
		Dropdwn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
		WebElement gmail =driver.findElement(By.xpath("//a[text()='Gmail']"));
		wait.until(ExpectedConditions.elementToBeClickable(gmail));
		gmail.click();
	
		
	
	}	
	
}
