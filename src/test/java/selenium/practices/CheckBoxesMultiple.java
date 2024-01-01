package selenium.practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxesMultiple {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.omayo.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to check a only single webelement
		// bydefault book has checked so we have to unchecked this by clicking over it

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='Book']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", checkbox1);
		checkbox1.click();


		// select a all checkboxes
		Thread.sleep(2000);

		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//div[@class='widget-content']//input [@name='accessories']"));
		/*
*/
		// select multiple checkboxes
		
		 /* for(int j=0;j<allCheckboxes.size();j++) {
		 String value=allCheckboxes.get(j).getAttribute("value");
		 
		  if(value.equals("Laptop")||value.equals("Pen")) {
		  allCheckboxes.get(j).click();
		  }*/
		 
		// by using for.....Each
		/*
		 * for (WebElement onebyone : allCheckboxes) { String valu1e =
		 * onebyone.getAttribute("value"); if (valu1e.equals("Pen") ||
		 * valu1e.equals("Laptop")) { onebyone.click(); } }
		 */
		// select last two checkboxes
		/*
		 * for(int b=allCheckboxes.size()-2;b<allCheckboxes.size();b++) {
		 * allCheckboxes.get(b).click(); }
		 */
		
		//select first two checkboxes 
		
		
		
		 int totalboxes=allCheckboxes.size(); 
		 for(int c=0;c<totalboxes;c++) 
		 { if(c<2)
		 allCheckboxes.get(c).click(); }
		 
		
	  
	 

	}
	}

