package selfpractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");

	}

}
