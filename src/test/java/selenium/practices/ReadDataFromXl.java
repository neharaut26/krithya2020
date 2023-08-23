package selenium.practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//as above takes all the claseexs fron=m this we take a * 
import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromXl {

	public static void main(String[] args) throws IOException {
		// File file = new File("src/test/resources/data/studentsdata.xlsx");
		File xlfilepath = new File("src/test/resources/data/nehadata.xlsx");

		// it makes xl file redable it represents that xl file
		FileInputStream inputstream = new FileInputStream(xlfilepath);

		// get the workbook from xl file
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);

		// from this we are able to get sheet
		XSSFSheet sheet = workbook.getSheet("data");
		// anotherway
		// XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		//to find no of rows we have to find firstlast rowno
		int row =sheet.getLastRowNum();
		
		//to find column 
		int colm=	sheet.getRow(1).getLastCellNum();
		
		//by using for loop we find no of rows 
		
		  for(int i=0;i<=row;i++){
		   //represents first row of sheet
		    XSSFRow Row =sheet.getRow(i); 
		    
		  for(int c=0;c<colm;c++) 
		  { XSSFCell celldata= Row.getCell(c); 
		  
		  //from this we get type of celldata.
		  //celldata.getCellType();
		  
		  switch(celldata.getCellType()) {
		  case
		  STRING:System.out.print(celldata.getStringCellValue()+"   ");break; case
		  NUMERIC:System.out.print(celldata.getNumericCellValue()+"  ");break; case
		  BOOLEAN:System.out.print(celldata.getBooleanCellValue()+" "); 
		  }
		  
		  } System.out.println(); }
	
		 
		//by using iterator 
		//this will take row in iterator.
		/*
		 * Iterator Row=sheet.iterator(); while(Row.hasNext()) { //it will return the
		 * first row XSSFRow firstrow =(XSSFRow) Row.next(); //it will return cell from
		 * row Iterator cell=firstrow.cellIterator(); while(cell.hasNext()) { //it will
		 * return celldata XSSFCell celldata=(XSSFCell) cell.next();
		 * switch(celldata.getCellType()) { case
		 * STRING:System.out.print(celldata.getStringCellValue());break; case
		 * NUMERIC:System.out.print(celldata.getNumericCellValue());break; case
		 * BOOLEAN:System.out.print(celldata.getBooleanCellValue()); }
		 * 
		 * System.out.print (" | "); } System.out.println(); }
		 */
			
	}}
		
	


