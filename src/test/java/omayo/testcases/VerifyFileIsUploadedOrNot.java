package omayo.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;

public class VerifyFileIsUploadedOrNot extends BaseCode {
HomePage page;
@Test
public void VerifyFileIsUploadedOrNot() {
	page =new HomePage(driver);
	WebElement file=page.fileUpload();
	SoftAssert verify=new SoftAssert();
	verify.assertAll();
}
}
