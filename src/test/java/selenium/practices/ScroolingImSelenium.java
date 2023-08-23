package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Utility;

public class ScroolingImSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		driver =drop.methodDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//this method is use to scroll the roller till the end 
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//to scroll vertically down
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(2000);
		
		//to scroll vertically up
		js.executeScript("window.scrollBy(0,-100)","");
		Thread.sleep(2000);
		//to scroll horizontally right
		js.executeScript("window.scrollBy(100,0)","");
		Thread.sleep(2000);
		//to scroll horizontally left
		js.executeScript("window.scrollBy(-100,0)", "");
		Thread.sleep(2000);
		//this will use to scroll upto that element
	WebElement link =	driver.findElement(By.xpath("//a[text()='Blogger']"));
		js.executeScript("arguments[0].scrollIntoView(true);", link);
	}

}
