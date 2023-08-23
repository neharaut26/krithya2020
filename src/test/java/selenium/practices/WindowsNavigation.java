package selenium.practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsNavigation {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.makemytrip.com");
	driver.navigate().back();
	driver.navigate().forward();
	
	//to launch new window or tap
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com");
	Thread.sleep(5000);
		driver.quit();
	}

}
