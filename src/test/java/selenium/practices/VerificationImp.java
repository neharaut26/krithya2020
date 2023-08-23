package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationImp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement maleradiobutoon =driver.findElement(By.xpath("//input[@id='radio1']"));
		maleradiobutoon.click();
//isSelecte is use for whether that radio button is checked,if it is check returns true
		System.out.println(maleradiobutoon.isSelected());
		WebElement femaleradiobutoon =driver.findElement(By.xpath("//input[@id='radio2']"));
		System.out.println(femaleradiobutoon.isSelected());
		
		
//isDisplayed is use to check whether that webelement is present on web or not	
		System.out.println(femaleradiobutoon.isDisplayed());
		WebElement orangecheckbox =driver.findElement(By.xpath("//input[@id='checkbox1']"));
		System.out.println(orangecheckbox.isSelected());
		WebElement bluecheckbox =driver.findElement(By.xpath("//input[@id='checkbox2']"));
		System.out.println( bluecheckbox.isSelected());
	System.out.println(driver.findElement(By.xpath("//input[@id='rotb']")).isDisplayed());
//isEnable is use to check whther  we can write or not in webelemrnt and can we click burron 
	//or not and apply to all WE
	System.out.println(driver.findElement(By.xpath("//input[@type='text' and @name='textboxn']")).isEnabled());
	System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
	System.out.println(driver.findElement(By.id("tb2")).isEnabled());
	}	
}