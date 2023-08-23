package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadInSelenium {

	public static void main(String[] args) {
		WebDriver driver;
		HandledropdwnByUsingMethod s1 = new HandledropdwnByUsingMethod();
		driver=s1.methodDriver();
		driver.get("http:/omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement file =driver.findElement(By.xpath("//input[@id='uploadfile']"));
		
		
		file.sendKeys("C:/Users/ABC/Desktop/krithya/java theory qn.docx");
		
	}

}
