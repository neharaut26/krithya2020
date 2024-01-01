package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utility;

public class KeyBoardMultipleActions {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		driver=drop.methodDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		//we have to write text in it
		//input.sendKeys("neha kakde");
		Actions act = new Actions(driver);
		
		//we have to select that text and copy that text
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		if(input.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("content is copied");
		}else {
			System.out.println("contet is not copied");
			
		}
		
		
		driver.close();				
	}

}
