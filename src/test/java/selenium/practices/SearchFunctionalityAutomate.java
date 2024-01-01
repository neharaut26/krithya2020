package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFunctionalityAutomate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
WebElement googlesearch =driver.findElement(By.name("q"));
googlesearch.sendKeys("java");
Thread.sleep(2000);
	List<WebElement> javalist=	driver.findElements(By.xpath("//div[@id='Alh6id']//div[@role='presentation']//ul//li"));
	int totalListNo=javalist.size();
	
	for(int i =0;i<javalist.size();i++) {
	String enterdvalue=	javalist.get(i).getText();
	//System.out.println(enterdvalue);
	if(enterdvalue.equals("javatpoint")) {
		javalist.get(i).click();
	}
	}

}
}