package omayo.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;

public class CheckBoxMultipleVerify extends BaseCode{
	SoftAssert verify=new SoftAssert();
	HomePage page;
@Test
public void verifyAllBOxesGetCheckOrNot() throws InterruptedException {
	page=new HomePage(driver);
	
	List<WebElement> checkboxes=page.multipleCheckBox();
	for(WebElement box:checkboxes ) {
		
		verify.assertTrue(box.isSelected());
		
		
	}
	
	verify.assertAll();
	
	
	
}
}

