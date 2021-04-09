package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static void main(String[] args) throws IOException {
		
		
		//Workbook Sheet Row Cell
		//.xlsx					.xls
		//XSSFWorkbook			HSSFWorkbook
		//XSSFSheet				HSSFSheet
		//XSSFRow				HSSFRow
		//XSSFCell				HSSFCell
		
		String path=System.getProperty("user.dir")+"//src//datadriven//TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		
		//To get number of sheets available in excel file
		int sheetsCount=workbook.getNumberOfSheets();
		System.out.println("Total Sheets: "+sheetsCount);
		
		//To get Row count in specified sheet
		int index=workbook.getSheetIndex("Sheet1");
		XSSFSheet sheet=workbook.getSheetAt(index);
		int rowCount=sheet.getLastRowNum()+1;
		System.out.println("Row Count: "+rowCount);
		
		//To get row number of specified test case  "TC_Login_03"
		int rowNum=0;
		for(int i=0;i<rowCount;i++){
			XSSFCell cell=sheet.getRow(i).getCell(0);//TCID 	TC_Login_01	TC_Login_02	TC_Login_03
			if(cell.getStringCellValue().equals("TC_Login_03")){
				rowNum=i;
				break;
			}
		}
		
		System.out.println("Row Number of Test case: "+(rowNum+1));
		
		//To get Column count in the specified sheet
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		System.out.println("Column count: "+colCount);
		
		//To get data from specified column and row number
		int colNum=0;
		for(int i=0;i<colCount;i++){
			if(row.getCell(i).getStringCellValue().equals("UserName")){
				colNum=i;
				break;
			}
		}
		
		row=sheet.getRow(rowNum);
		String username=row.getCell(colNum).getStringCellValue();
		System.out.println(username);
		
		
		workbook.close();

	}

}
