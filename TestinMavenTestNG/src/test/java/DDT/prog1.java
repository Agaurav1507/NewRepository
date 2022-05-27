package DDT;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class prog1 {

	@Test(groups="regression test")

	public void getsheetcount() throws IOException {

		// *****FileLocation

		FileInputStream location = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		// *****Create an instance of respective workbook class and provide file
		// location to its constructor

		// XSSFWorkbook workbook = new XSSFWorkbook(location);

		// or more generic

		XSSFWorkbook workbook = new XSSFWorkbook(location);

		// **** Get Sheet info

		int sheetcount = workbook.getNumberOfSheets();

		System.out.println("totl sheet counts are = " + sheetcount);

		// get all the sheet names

		// String sheetname=workbook.getSheetName(0);

		// System.out.println(sheetname);

		for (int i = 0; i < sheetcount; i++) {

			System.out.println("all sheets names are = " + workbook.getSheetName(i));
		}
	}

	@Test(groups="smoke test")

	public void getrowcount() throws IOException {
		// *****FileLocation

		FileInputStream location = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		// *****Create an instance of respective workbook class and provide file
		// location to its constructor

		// XSSFWorkbook workbook = new XSSFWorkbook(location);

		// or more generic

		XSSFWorkbook workbook = new XSSFWorkbook(location);

		// **** Get Sheet info

		// XSSFSheet sheet=workbook.getSheet("Sheet1");

		// or more generic way

		Sheet sheet = workbook.getSheet("Sheet1");

		// **** Row info

		int rowcount = sheet.getLastRowNum();

		System.out.println("total row counts are = " + rowcount);

		// for particular raw

		// XSSFRow row=sheet.getRow(0);

		// or more generic

		Row row = sheet.getRow(0);

	}

	@Test(groups="regression test")

	public void getcellcount() throws IOException {

		// *****FileLocation

		FileInputStream location = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		// *****Create an instance of respective workbook class and provide file
		// location to its constructor

		// XSSFWorkbook workbook = new XSSFWorkbook(location);

		// or more generic

		XSSFWorkbook workbook = new XSSFWorkbook(location);

		// **** Get Sheet info

		// XSSFSheet sheet=workbook.getSheet("Sheet1");

		// or more generic way

		Sheet sheet = workbook.getSheet("Sheet1");

		// **** Row info

		int rowcount = sheet.getLastRowNum();

		System.out.println("total row counts are = " + rowcount);

		// for particular raw

		// XSSFRow row=sheet.getRow(0);

		// or more generic

		Row row = sheet.getRow(1);

		// get cell info

		int cellcount = row.getLastCellNum();

		System.out.println("total cell counts are = " + cellcount);

		// get cell

		// XSSFCell cell=row.getCell(2);

		// or more generic

		Cell cell = row.getCell(2);

		// get value form cell

		String cellvalue = cell.getStringCellValue();

		System.out.println("cell value of 2 is = " + cellvalue);

		// get all cell value

		for (int i = 0; i < cellcount; i++) {

			System.out.println(row.getCell(i).getStringCellValue());
		}

	}

}
