package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfPracticeForCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http:/omayo.blogspot.com");
WebElement bike =	driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
WebElement bicycle=	driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
WebElement car=	driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
bike.click();
Thread.sleep(2000);
car.click();
bicycle.click();
System.out.println("bicycle is selected?"+bicycle.isSelected());
System.out.println("car is selected?="+car.isSelected());
System.out.println("bicycle is displayed?"+bicycle.isDisplayed());
System.out.println(driver.findElement(By.xpath("//h2[text()='TestDoubleClick']")).isDisplayed());
System.out.println(driver.findElement(By.xpath("//h2[text()='TestDoubleClick']")).getText());

WebElement text =driver.findElement(By.xpath("//h2[normalize-space()='Delayed-Button-Dropdown']"));
System.out.println(text.getAccessibleName());
System.out.println(text.getAriaRole());
System.out.println(text.getText());
System.out.println(text.isEnabled());
System.out.println(text.getAttribute("class"));

WebElement al =driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
al.sendKeys("kakde111@gmail.com");
System.out.println(al.getAttribute("value"));






		
	}

}
