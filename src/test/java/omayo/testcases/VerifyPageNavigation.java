package omayo.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import omayoblogs.pages.HomePage;
import omayoblogs.pages.Selenium143Page;
import utilities.Utility;

public class VerifyPageNavigation extends BaseCode {
	
	
HomePage page;
Selenium143Page Page143;
@Test
public void navigateToOtherPage() {
	page = new HomePage(driver);
	page.clickOnLink();
	String ParentWindowHandle=Utility.SwitchtoNewWindow(driver);
	 Page143=new Selenium143Page(driver);
	String text= Page143.whatIsSeleniumLink();
	assertEquals(text,"What is Selenium?");
	driver.close();
	Utility.returnToParentWindow(driver, ParentWindowHandle);
	assertEquals(driver.getCurrentUrl(),"https://omayo.blogspot.com/");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
