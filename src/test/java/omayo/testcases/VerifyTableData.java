package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import utilities.Utility;

public class VerifyTableData extends BaseCode {
	@Test
	public void VerifyTableData() {
	ArrayList data=Utility.tableContentfetch(driver, "//table[@id='table1']/tbody/tr/td");
		//array list
	ArrayList<String> originalData=new ArrayList<>();
	originalData.add("Kishore");
	originalData.add("25");
	originalData.add("mum");
	originalData.add("Manish");
	originalData.add("25");
	originalData.add("Pune");
	originalData.add("Praveen");
	originalData.add("29");
	originalData.add("Bangalore");
	originalData.add("Dheepthi");
	originalData.add("31");
	originalData.add("Mumbai");
	assertEquals(data, originalData);
}
}
