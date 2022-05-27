package DDT;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prog4 {

	@Test

	public void getsheetdetails() throws IOException {

		FileInputStream fis = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		int sheetcount = workbook.getNumberOfSheets();

		System.out.println("total sheetcounts are = " + sheetcount);

		String sheetname = workbook.getSheetName(0);

		for (int i = 0; i < sheetcount; i++) {

			System.out.println(workbook.getSheetName(i));

		}

		// **** Get Sheet info

		Sheet sheet = workbook.getSheet("Sheet1");
		
		// **** Row info

		int rowcount = sheet.getLastRowNum();

		System.out.println("total row counts are = " + rowcount);
		
		
		
		Row row=sheet.getRow(1);
		
		// get cell info
		
		int cellcount=row.getLastCellNum();
		
		System.out.println("total cell counts are = "+cellcount);
		
		Cell cell=row.getCell(3);
		
		//get cell value
		
		String cellvalue=cell.getStringCellValue();
		
		System.out.println("cellvalue is = "+cellvalue);
		
		for(int i=0;i<cellcount;i++) {
			
			System.out.println("all cell values are = "+row.getCell(i).getStringCellValue());
		}
	
		//update cell value
		
	    FileOutputStream fos=new FileOutputStream("F:\\\\AUTOMATIONCLASSES\\\\Excel files\\\\Automation-sheet1.xlsx");
	    
	    row.createCell(4).setCellValue("Pass");
	    workbook.write(fos);
	    
	    fos.flush();
	   
	    fos.close();
	    
	    System.out.println("updated excel");
	}
}

	

