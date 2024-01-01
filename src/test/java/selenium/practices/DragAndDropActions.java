package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement denmark = driver.findElement(By.id("box102"));
		Actions act =new Actions(driver);
		act.dragAndDrop(rome, denmark).perform();

	}

}
