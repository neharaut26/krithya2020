package omayo.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;

public class verifyAllButtons extends BaseCode {
	HomePage home;

	@Test
	public void verifyButtonIsDisable() {
		home = new HomePage(driver);
		WebElement btn=home.enableButton();
	
WebElement btn2=home.disableButton();
btn2.click();
		SoftAssert verify = new SoftAssert();
		verify.assertTrue(btn.isEnabled(), "button is enable");
		verify.assertFalse(btn2.isEnabled(), "button is disable");
		
WebElement btn3=home.hiddenButton();

String text=btn3.getAttribute("value");
verify.assertTrue(btn3.isDisplayed(), "button is disable");
//verify.assertTrue(btn3.isEnabled(), "button is disable");
verify.assertEquals(text, "HiddenButton");
verify.assertAll();
}
}