package omayo.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import omayoblogs.pages.HomePage;

public class CheckBoxMultipleVerify extends BaseCode {
	SoftAssert verify = new SoftAssert();
	HomePage page;

	@Test
	public void verifyAllBOxesGetCheckOrNot() throws InterruptedException {
		page = new HomePage(driver);

		List<WebElement> checkboxes = page.multipleCheckBox();
		for (WebElement box : checkboxes) {

			verify.assertTrue(box.isSelected());

		}

		verify.assertAll();
	}
	//to verify whether two checkboxes r selected or not.
	@Test
	public void verifyIfTwoCheckBoxesIsSelectedOrNot() throws InterruptedException {
		page=new HomePage(driver);
		
		List<WebElement> checkboxes =	page.getTwoCheckboxes();
int totalboxes=		checkboxes.size();

		for( int i=0;i<totalboxes;i++) {
			if(i<2 ) {
				verify.assertTrue(checkboxes.get(i).isSelected(),"TWO BOXES R NOT SELECTED");
			}
		}
		Thread.sleep(2000);
	}
	//public void 
}
