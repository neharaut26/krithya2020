package omayo.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;

public class RadioButton extends BaseCode {
	HomePage home;

	@Test
	public void verifybutoongetselectedornot() {
		home = new HomePage(driver);
		WebElement button = home.MaleRadioButton();
		button.click();
		String value=	button.getAttribute("value");
		SoftAssert verify = new SoftAssert();
		verify.assertTrue(button.isSelected(), "plz select any button");
		verify.assertEquals(value, "male", "value is wrong");
		WebElement button1 = home.FeMaleRadioButton();
		button1.click();
		
		verify.assertTrue(button1.isSelected(), "plz select any button");
		verify.assertFalse(button.isSelected());
		verify.assertAll();// home.FeMaleRadioButton();
	
	
	}
	@Test
	public void Verify3buttonisSelectingornot() throws InterruptedException {
		home = new HomePage(driver);
		
		home.radioButtonThree();
	}
	
	
	
	
	

}
