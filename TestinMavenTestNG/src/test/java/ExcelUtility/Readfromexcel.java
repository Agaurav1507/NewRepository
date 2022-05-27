package ExcelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Readfromexcel {
	
	
	
	public Readfromexcel() throws IOException{
		
		
	FileInputStream fis = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

	Workbook wb = new XSSFWorkbook(fis);

	Sheet sheet = wb.getSheet("Sheet1");

	Row row = sheet.getRow(0);

	String url = sheet.getRow(2).getCell(0).getStringCellValue();
	
	String username=sheet.getRow(2).getCell(1).getStringCellValue();
	
    }

}
