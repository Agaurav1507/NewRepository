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

public class prog5 {
	
	@Test
	
	public void excelreading() throws IOException {
		
		FileInputStream fis=new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");
		
		Workbook workbook=new XSSFWorkbook(fis);
		
		int sheetcount=workbook.getNumberOfSheets();
		
		System.out.println("total number of sheet = "+sheetcount);
		
		for(int i=0;i<sheetcount;i++) {
			
			System.out.println(workbook.getSheetName(i));
		}
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("total row counts are = "+rowcount);
		
		Row row=sheet.getRow(1);
		
		int cellcount=row.getLastCellNum();
		
		System.out.println("total cell counts are = "+cellcount);
		
		Cell cell=row.getCell(3);
		
		String cellvalue=cell.getStringCellValue();
		
		System.out.println("cell value is ="+cellvalue);
		
		for(int i=0;i<cellcount;i++) {
			
			System.out.println(row.getCell(i).getStringCellValue());
		}
		
		//update cell value
		
		FileOutputStream fos=new FileOutputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");
		
		Row row2=sheet.getRow(2);
		
		row2.createCell(4).setCellValue("failed");
		
		workbook.write(fos);
		
		fos.flush();
		
		fos.close();
		
		System.out.println("updated excel");
		
			
	}

}
