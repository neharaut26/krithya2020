package selenium.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertMassage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:/omayo.blogspot.com");
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		//control goes to alert
	Alert al=	driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(al.getText());
	
	//to reject the alert
	//al.dismiss();
	driver.findElement(By.xpath("//input[@id='alert1']")).click();
	Alert al1= driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(al1.getText());
	al.accept();
	}

}
