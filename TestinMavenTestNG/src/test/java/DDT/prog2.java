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

public class prog2 {

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
		
		
		
		Row row=sheet.getRow(2);
		
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
	}

}
