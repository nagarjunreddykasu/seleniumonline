package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private XSSFCell cell;
	String path;

	public ExcelReader(String path) throws IOException {
		this.path=path;
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
	}

	public int getRowCount(String sheetName) {
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		int count = sheet.getLastRowNum() + 1;
		return count;
	}

	public int getRowNum(String sheetName, String TestcaseName) {
		try {
			int index = workbook.getSheetIndex(sheetName);
			int row_Num = 0;
			sheet = workbook.getSheetAt(index);
			int rowCount = getRowCount(sheetName);
			for (int i = 0; i < rowCount; i++) {
				cell = sheet.getRow(i).getCell(0);
				if (!cell.getStringCellValue().equals("")) {
					if (cell.getStringCellValue().trim().equals(TestcaseName.trim())) {
						row_Num = i;
					}
				}
			}
			return row_Num;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public String getCellData(String sheetName, String colName, int rowNum) {
		int index = workbook.getSheetIndex(sheetName);
		int col_Num = 0;
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(0);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
				col_Num = i;
				break;
			}
		}
		row = sheet.getRow(rowNum);
		cell = row.getCell(col_Num);
		return cell.getStringCellValue();
	}

	public int getRowCount(String sheetName, String colName, String methodName) {
		ArrayList<Integer> rows = new ArrayList<>();
		for (int i = 1; i < getRowCount(sheetName); i++) {
			String tcid = getCellData(sheetName, colName, i);
			if (tcid.equals(methodName)) {
				rows.add(i);
			}
		}
		return rows.size();
	}

	// returns number of columns in a sheet
	public int getColumnCount(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		return row.getLastCellNum();
	}

	public int getFirstDataRowNum(String sheetName, String colName, String methodName) {
		for (int i = 1; i < getRowCount(sheetName); i++) {
			String tcid = getCellData(sheetName, colName, i);
			if (tcid.equals(methodName)) {
				return i;
			}
		}
		return -1;
	}

	public int getLastDataRowNum(String SheetName, String colName, String methodName, int firstRow) {
		for (int i = firstRow; i <= getRowCount(SheetName); i++) {
			String tcid = getCellData(SheetName, colName, i);
			if (i == getRowCount(SheetName)) {
				if (tcid.contentEquals(methodName)) {
					return i;
				}
			}
			if (!tcid.contentEquals(methodName)) {
				return i - 1;
			}
		}
		return -1;
	}
//Set Cell Data based on the test case id and column Name 
	public void setCellData(String sheetname, String testcaseName, String columnName, String status) throws IOException {
		int sheetIndex = workbook.getSheetIndex(sheetname);
		sheet = workbook.getSheetAt(sheetIndex);
		int rowNumber = sheet.getLastRowNum();
		int caseRowNumber = 0;
		for (int k = 0; k <= rowNumber; k++) {
			cell = sheet.getRow(k).getCell(0);

			if (cell != null && cell.getCellType() != CellType.BLANK) {
				String cname = sheet.getRow(k).getCell(0).getStringCellValue();
				if (cname.equals(testcaseName)) {
					caseRowNumber = k;
					break;
				}

			}

		}
		int colNumber = sheet.getRow(0).getLastCellNum();
		int ColumnNumber = 0;
		for (int j = 0; j <= colNumber; j++) {
			cell = sheet.getRow(caseRowNumber).getCell(j);

			if (cell != null) {
				String colName = sheet.getRow(0).getCell(j).getStringCellValue();
				if (columnName.equals(colName)) {
					ColumnNumber = j;
					break;
				}
			}
		}
		sheet.getRow(caseRowNumber).createCell(ColumnNumber).setCellValue(status);
		FileOutputStream fileOutput = new FileOutputStream(path);
		workbook.write(fileOutput);
		fileOutput.close();

	}
	
	public static void main(String[] args) throws IOException {
		ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"//testdata//TestData.xlsx");
		System.out.println("Row Count: "+excel.getRowCount("Sheet1"));
		int rowNum=excel.getRowNum("Sheet1", "TC_Login_03");
		System.out.println("Row Number of test case: "+rowNum);
		System.out.println("Test Data for specified column and row: "+excel.getCellData("Sheet1", "UserName", rowNum));
		System.out.println(excel.getFirstDataRowNum("Sheet1", "TCID", "TC_Login_03"));
		
	}
	
	
		
}
