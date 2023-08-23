package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;


import omayoblogs.pages.HomePage;
import utilities.Utility;

public class VerifyDropdown extends BaseCode{
	
	HomePage home;
	@Test	
public void verifydropdown() {
		home=new HomePage(driver);
		String[] options= {"Volvo","Swift"};
	ArrayList<String> selectedOptions= Utility.dropdownSelectorAndOptions(home.multiselectdropdownlocator(),options);
	assertEquals(selectedOptions, Arrays.asList("volvo","Swift"));
}
}
