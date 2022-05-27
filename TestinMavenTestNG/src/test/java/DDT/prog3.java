package DDT;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class prog3 {
	
	@Test
	
	public void excelsheetdetails() throws IOException {
		
		FileInputStream fis=new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");
		
		Workbook workbook=new XSSFWorkbook(fis);
		
		int sheetcount=workbook.getNumberOfSheets();

		System.out.println("total sheet counts are = "+sheetcount);
		System.out.println("sheet names are :- ");
		for(int i=0;i<sheetcount;i++) {
			
			System.out.println(workbook.getSheetName(i));
		}
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("total row counts are = "+rowcount);
		
		Row row=sheet.getRow(1);
		
		int cellcount=row.getLastCellNum();
		
		System.out.println("total cell counts are = "+cellcount);
		
		//Cell cell=row.getCell(3);
		
		for(int i=0;i<cellcount;i++) {
			
			sheet.getRow(i);
			
			System.out.println(row.getCell(i).getStringCellValue());
			
			
		}
	}

}
