package omayoblogs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium143Page {
WebDriver driver;
public Selenium143Page(WebDriver driver) {
	this.driver=driver;
}

public String whatIsSeleniumLink() {
	return driver.findElement(By.xpath("//a[text()=\"What is Selenium?\"]")).getText();
}
}
