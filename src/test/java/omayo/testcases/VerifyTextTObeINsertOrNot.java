package omayo.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;

public class VerifyTextTObeINsertOrNot extends BaseCode{
	HomePage home;
@Test
public void verifyTextTObeINsertOrNot() {
home= new HomePage(driver);
home.TextArea();
SoftAssert verify= new SoftAssert();
//verify.assertTrue(true);
verify.assertAll();
}
}
