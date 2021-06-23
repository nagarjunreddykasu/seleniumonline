package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import base.ExcelReader;

public class SignUpPage {
	public final String sheet_TestCases = "TestCases";
	public final String sheet_TestData = "TestData";
	public ExcelReader xlSignUp;
	public Properties prop;
	Map<String, String> testdata;
	
	public SignUpPage() throws IOException{
		//To load Login.xlsx file
		xlSignUp=new ExcelReader(System.getProperty("user.dir") + "//src//test//java//testdata//SignUp.xlsx");
		//To load login.properties file
		FileInputStream login = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//configuration//signup.properties");
		prop = new Properties();
		prop.load(login);
		System.out.println("signup.properties file has been successfully loaded.");
	}
	
	public String getTCDescription(ExcelReader xls_obj, String sheetName, String methodName) {
		int rowNum = xls_obj.getFirstDataRowNum(sheetName, "TCID", methodName);
		return xls_obj.getCellData(sheetName, "Description", rowNum);
	}
	
	public Map<String, String> getTestData(ExcelReader xls_obj, String sheetName, String testCaseID) {
		testdata = new HashMap<String, String>();
		int rowNum = xls_obj.getFirstDataRowNum(sheetName, "TCID", testCaseID);

		testdata.put("TestData1", xls_obj.getCellData(sheetName, "TestData1", rowNum));
		testdata.put("TestData2", xls_obj.getCellData(sheetName, "TestData2", rowNum));
		
		return testdata;
	}

}
