package omayo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseCode {
	WebDriver driver;
	@BeforeMethod
public WebDriver launchingUrl() throws IOException {
	//System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get(Utility.getProperty("url"));
	driver.manage().window().maximize();
	return driver;
}
	@AfterMethod
public void BrowserClose() {
	
	//driver.quit();
}


}

