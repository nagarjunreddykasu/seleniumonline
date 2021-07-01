package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
		String path=System.getProperty("user.dir")+"//src//datadriven//TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		//To get number of sheets available in excel file
		int sheets=workbook.getNumberOfSheets();
		System.out.println("Sheets count: "+sheets);

		//To get row count in specified sheet in excel file
		int index = workbook.getSheetIndex("Sheet1");
		XSSFSheet sheet = workbook.getSheetAt(index);
		int rowCount = sheet.getLastRowNum() + 1;
		System.out.println("Row Count: "+rowCount);

		//TO get row number of specified test case in sheet
		int rowNum = 0;
		for(int i = 0; i < rowCount; i++) {
			XSSFCell cell = sheet.getRow(i).getCell(0);
			if(cell.getStringCellValue().equals("TC_Login_03")) {
				rowNum = i;
				break;
			}
		}

		//To get Column count in the specified sheet
		int colNum = 0;
		XSSFRow row = sheet.getRow(0);
		int colCount=row.getLastCellNum();
		System.out.println("Columns count: "+colCount);
		
		//To get data from specified column name and row number
		for (int i = 0; i < colCount; i++) {
			if (row.getCell(i).getStringCellValue().equals("UserName")) {
				colNum = i;
				break;
			}
		}
		row = sheet.getRow(rowNum);
		XSSFCell cell = row.getCell(colNum);
		String username=cell.getStringCellValue();
		System.out.println(username);
		
		
		//To add/update data based on Column name and Row name (Test case name)
		for (int i = 0; i < colCount; i++) {
			if (sheet.getRow(0).getCell(i).getStringCellValue().equals("Result")) {
				colNum = i;
				break;
			}
		}

		sheet.getRow(rowNum).createCell(colNum).setCellValue("PASS");
		FileOutputStream fileOutput = new FileOutputStream(path);
		workbook.write(fileOutput);
		fileOutput.close();

		workbook.close();

	}

}
