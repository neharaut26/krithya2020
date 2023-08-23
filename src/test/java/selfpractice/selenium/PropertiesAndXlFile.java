package selfpractice.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesAndXlFile {
	public static void main(String []args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PropertiesAndXlFile.property("url"));
		PropertiesAndXlFile .readxl();
		
	}
	
	

	public static String  property(String key) throws IOException {
		File file=new File("src/test/resources/data/neha.properties");
		FileInputStream inputstream =new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(inputstream);
		return properties.getProperty(key);

	}
	
	public static List<String> readxl() throws IOException {
		
		List<String> exelData = new ArrayList<String>();
		File file = new File("src/test/resources/data/registerform.xlsx");
		
		FileInputStream inputstream =new  FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream); 
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		
		int row=sheet.getLastRowNum();
		int colm=	sheet.getRow(1).getLastCellNum();
		for(int r=1;r<=row;r++) {
			XSSFRow firstrow=sheet.getRow(r);
			for(int c=0;c<colm;c++) {
			//XSSFCell celldata=	firstrow.getCell(c);
			exelData.add(firstrow.getCell(c).toString());
			//System.out.println(exelData);
		//String data=	celldata.toString();
		/*
		 * switch(celldata.getCellType()) { case
		 * STRING:System.out.print(celldata.getStringCellValue()+"   ");break; case
		 * NUMERIC:System.out.print(celldata.getNumericCellValue()+"  ");break; case
		 * BOOLEAN:System.out.print(celldata.getBooleanCellValue()+" "); }
		 */
			  
			  } 
			 }
		
		workbook.close();
			return exelData;
			}
		
	
	

	
}
