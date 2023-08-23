package omayo.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;
import utilities.Utility;

public class VerifySingleDropdown extends BaseCode{
	HomePage home;
@Test
public void verifySinledropdown() {
	home=new HomePage(driver);
	//home.singleDropdown();
	String option= "doc 2";
	String option2 = "doc 2";

	WebElement selectedoption=Utility.dropdownSelector(home.singleDropdown(), option);
	String option1 	=selectedoption.getText();
	SoftAssert verify=new SoftAssert();
	verify.assertEquals(option1, option2);
	verify.assertAll();
	
}

}

