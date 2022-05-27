package DDT;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class prog6 {

	@Test(priority = 1)

	public void getsheetcount() throws IOException {

		FileInputStream fis = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet2.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int sheetcount = wb.getNumberOfSheets();

		System.out.println("total sheet counts are :- " + sheetcount);

		for (int i = 0; i < sheetcount; i++) {

			System.out.println(wb.getSheetName(i));
		}

		Sheet sheet = wb.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();

		System.out.println("total row counts are : - " + rowcount);

		Row row = sheet.getRow(2);

		int cellcount = row.getLastCellNum();

		System.out.println("total cell counts are :- " + cellcount);

		Cell cell = row.getCell(2);

		System.out.println(cell.getStringCellValue());
		
		//update cell value
		
		FileOutputStream fos=new FileOutputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet2.xlsx");
		
		sheet.getRow(1);
		
		row.createCell(4).setCellValue("pass");
		
		wb.write(fos);
		
		fos.flush();
		
		fos.close();
		
		System.out.println("excel file updated");

	}
}
