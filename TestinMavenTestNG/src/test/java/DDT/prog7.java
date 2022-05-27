package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class prog7 {

	@Test

	public void test() throws IOException {

		FileInputStream fis = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		Row row = sheet.getRow(0);

		String url = sheet.getRow(2).getCell(0).getStringCellValue();

		System.out.println(url);

	}

}
