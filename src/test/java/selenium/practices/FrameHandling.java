package selenium.practices;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;
import java.io.IOException;

public class FrameHandling {

	public static void main(String[] args) throws IOException {
	//	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
	//	this is use to go under frame
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));
		
		
		driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();
	System.out.println(driver.findElement(By.xpath("//a[@id='b-getorpost']")).getText());
	//this will use to come out of frame 
	
	
	driver.switchTo().defaultContent();
	
		

	}

}
