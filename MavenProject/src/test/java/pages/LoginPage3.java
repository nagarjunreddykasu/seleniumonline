package pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ExcelReader;

public class LoginPage3 {
	public ExcelReader xlLogin;
	Map<String, String> testdata;
	public final String sheet_TestCases = "TestCases";
	public final String sheet_TestData = "TestData";
	
	@FindBy(id="TxtEmail")
	public WebElement username;
	
	@FindBy(id="TxtPassword")
	public WebElement password;
	
	@FindBy(id="BtnLogin")
	public WebElement btnLogin;
	
	
	@FindBy(xpath="//*[@id='Div1']/div[2]/div")
	public WebElement errorUserName;
	
	@FindBy(xpath="//*[@id='Div1']/div[4]/div")
	public WebElement errorPassword;
	
	@FindBy(id="divemail")
	public WebElement errorUserPassword;
	
	@FindBy(className="form-control")
	public List<WebElement> options;
	
	public LoginPage3(WebDriver driver) throws IOException{
		//To load Login.xlsx file
		xlLogin=new ExcelReader(System.getProperty("user.dir") + "//src//test//java//testdata//Login.xlsx");
		PageFactory.initElements(driver, this);
	}
	
	public String getTCDescription(ExcelReader xls_obj, String sheetName, String methodName) {
		int rowNum = xls_obj.getFirstDataRowNum(sheetName, "TCID", methodName);
		return xls_obj.getCellData(sheetName, "Description", rowNum);
	}
	
	public Map<String, String> getTestData(ExcelReader xls_obj, String sheetName, String testCaseID) {
		testdata = new HashMap<String, String>();
		int rowNum = xls_obj.getFirstDataRowNum(sheetName, "TCID", testCaseID);

		testdata.put("UserName", xls_obj.getCellData(sheetName, "UserName", rowNum));
		testdata.put("Password", xls_obj.getCellData(sheetName, "Password", rowNum));
		testdata.put("TestData1", xls_obj.getCellData(sheetName, "TestData1", rowNum));
		testdata.put("TestData2", xls_obj.getCellData(sheetName, "TestData2", rowNum));
		
		return testdata;
	}
	
	
	
	

}
