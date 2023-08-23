package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		Actions actions = new Actions(driver);
		WebElement blogs=driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		//this method is use to hover over it.
		actions.moveToElement(blogs).build().perform();
		
	WebElement textarea	=driver.findElement(By.xpath("//textarea[@id='ta1']"));
		actions.keyDown(textarea, "b").keyUp("b").sendKeys(textarea,"this is yextarea").keyUp(textarea,Keys.SHIFT).build().perform();
	//textarea.sendKeys("hi");
		actions.keyDown("c").keyUp("c").build().perform();
	
	}

}
