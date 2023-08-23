package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	

	
	public static String getProperty(String key) throws IOException 
	{
		File file = new File("src/test/resources/data/master.properties");
		FileInputStream inputstream = new FileInputStream(file);
		//to read a property file we use property class
		Properties properties = new Properties();
		properties.load(inputstream);
		
		return properties.getProperty(key);
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File ("src/test/resources/data/registerform.xlsx");
		FileInputStream inputstream=new FileInputStream(file);
		
		//this is use to get workbook from file
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		//this will use to get sheet from workbook
	XSSFSheet sheet=	workbook.getSheet("sheet1");
	
	//it will return last row then we can find number of rows from this
	int rowlast=sheet.getLastRowNum();
	for(int r=0;r<=rowlast;r++) 
	{
		XSSFRow Rows=sheet.getRow(r);
	int lastcellno=	Rows.getLastCellNum(
			
			
			);
	for(int c=0;c<lastcellno;c++) {
		XSSFCell celldata = Rows.getCell(c);
		/*
		 * switch(celldata.getCellType()) { case
		 * STRING:System.out.println(celldata.getStringCellValue());
		 * 
		 * case NUMERIC:System.out.println(celldata.getNumericCellValue()); }
		 * System.out.println(" | ");
		 */
	System.out.print( celldata.getStringCellValue()+" ");
	}
	System.out.println("    ");
	}
	}
	public static ArrayList<String> dropdownSelectorAndOptions(WebElement lctrselector,String[] options) {
		Select select = new Select(lctrselector);
		ArrayList<String> selectedoptions =new ArrayList<>();
		for(String option : options ) {
		select.selectByVisibleText(option);
	}
		List<WebElement> selected=select.getAllSelectedOptions();
		for(WebElement e:selected) {
			selectedoptions.add(e.getText());
		}
		return selectedoptions;
	}
	//second options 
	public static String SwitchtoNewWindow(WebDriver driver) {
		String ParentWindowHandle=driver.getWindowHandle();
		Set<String> allWindowHandle=driver.getWindowHandles();
		for( String handle:allWindowHandle) {
			if(!(handle.equals(ParentWindowHandle))) {
				driver.switchTo().window(handle);
			}
			}
		return ParentWindowHandle;
	}
	public static void returnToParentWindow(WebDriver driver,String OldWindow) {
		driver.switchTo().window(OldWindow);
	}
//this is regarding to table 
	public static ArrayList tableContentfetch(WebDriver driver,String tablexpath) {
		List<WebElement> table=driver.findElements(By.xpath(tablexpath));
		ArrayList<String> dataStoreInArray=new ArrayList<>();
		for(WebElement tablecontent:table) {
			dataStoreInArray.add((tablecontent).getText());
		}
		return dataStoreInArray;
	}
	//this is for singledropdown
	public static WebElement dropdownSelector(WebElement locator,String options) {
		
		Select selectOption=new Select(locator);
		
		selectOption.selectByVisibleText(options);
		
		
	WebElement option=	selectOption.getFirstSelectedOption();
		return option;
	}
	
	
	
	public void UnorderList(WebElement Selector,String[] list) {
		for(String listdata:list) {
			
		}
	}
}

