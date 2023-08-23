package selenium.practices;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selfpractice.selenium.PropertiesAndXlFile;
import utilities.Utility;

public class ExelDrivenTestFirst {

	public static void main(String[] args) throws IOException {
		
			List<String> exelDataa=PropertiesAndXlFile .readxl();
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(Utility.getProperty("demoUrl"));
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(exelDataa.get(0));
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(exelDataa.get(1));
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(exelDataa.get(2));
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(exelDataa.get(3));
			
		}
	}


