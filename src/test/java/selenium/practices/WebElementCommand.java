package selenium.practices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q' and @title='search']"));
		searchbox.sendKeys("helloneha");
		searchbox.clear();

		System.out.println(driver.findElement(By.xpath("(//button[@name='samename'])[1]")).getText());
		// this will return the text written on web element.
		System.out.println(driver.findElement(By.xpath("//h2[text()='HTML Form']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@id='alert2']")).isDisplayed());
		System.out.println(driver.findElements(By.tagName("input")).size());
		System.out
				.println(driver.findElement(By.cssSelector("div#post-body-9023929218208337252")).getAttribute("class"));

		System.out.println(driver.findElement(By.cssSelector("div#post-body-9023929218208337252")).getText());
//this method will return properties of css element 
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));

//this method will return the name of web element what it is exctly doing
		System.out.println(driver.findElement(By.xpath("//input[@id='alert1']")).getAccessibleName());
//this method return the role of that element .
		
		System.out.println(driver.findElement(By.xpath("//input[@id='alert1']")).getAriaRole());
		//this method will find location of web element about and y axis
	
		File file=searchbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("src/test/resources/screenshots/textboxscreenshot.png"));
		System.out.println(searchbox.getSize().getHeight());
		System.out.println(searchbox.getSize().getHeight());
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("helllo");
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("input.gsc-search-button")).click();
		
	}
	}


