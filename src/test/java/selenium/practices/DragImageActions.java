package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragImageActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
WebElement item1=driver.findElement(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"][1]"));
WebElement item2=driver.findElement(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"][2]"));

WebElement item3=driver.findElement(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"][3]"));
WebElement trash=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	

Actions act = new Actions(driver);
	act.dragAndDrop(item1, trash).perform();
	act.dragAndDrop(item2, trash).perform();
	act.dragAndDrop(item3, trash).perform();
	
	}

}
