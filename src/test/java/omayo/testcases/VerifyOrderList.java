package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import omayoblogs.pages.HomePage;
@Test
public class VerifyOrderList extends BaseCode{
	HomePage home;
	public void VerifyOrderList() {
		
		home=new HomePage(driver);	
		assertEquals(home.orderlist(),Arrays.asList("One","Two","Three","Four","Five","Six"));
			
			

		}
	}

