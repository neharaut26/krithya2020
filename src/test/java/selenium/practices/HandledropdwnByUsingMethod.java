package selenium.practices;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledropdwnByUsingMethod {

	public static void main(String[] args) {
		HandledropdwnByUsingMethod drop = new HandledropdwnByUsingMethod();
		drop.handledropdown("France");
	}

	public void handledropdown(String country) {
		WebDriver driver = methodDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/mv/en");
		driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
		for (WebElement countryname : countries) {
			if (countryname.getText().equalsIgnoreCase(country)) {
				countryname.click();
			}
		}
	}

	public WebDriver methodDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		//driver.get("http://omayo.blogspot.com/");
	}

}
