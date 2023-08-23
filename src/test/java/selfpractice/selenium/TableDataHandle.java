package selfpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/omayo.blogspot.com");
		driver.manage().window().maximize();
		List<WebElement> tablealldata=	driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		List<WebElement> tableheading=	driver.findElements(By.xpath("//table[@id='table1']//thead//tr//th"));
		for(WebElement t:tableheading) {
		System.out.print(t.getText()+" " );
		}
		System.out.println();
	for(WebElement data:tablealldata) {
		
		System.out.println(data.getText());
		List<WebElement> unorderlist=	driver.findElements(By.xpath("//div[@class='widget-content']//ul"));
		for(WebElement list2:unorderlist) {
			System.out.println(list2.getText().isEmpty());
		
		}
		
		
		
	}
	}

}
