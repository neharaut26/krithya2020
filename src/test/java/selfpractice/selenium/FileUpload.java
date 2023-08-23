package selfpractice.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/omayo.blogspot.com");
		driver.manage().window().maximize();
WebElement file=driver.findElement(By.xpath("//input[@id='uploadfile']"));
//this is for scroll to that element.
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)", file);
file.sendKeys("C:\\Users\\ABC\\Desktop\\krithya\\Neha resume.docx");
System.out.println(file.getAttribute("value"));

	}

}
