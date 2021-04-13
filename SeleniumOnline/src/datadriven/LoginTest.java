package datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basics.Reusable;

public class LoginTest {

	static WebDriver driver =null;
	String path;
	static ExcelReader excel;
	String sheet_TestCases="TestCases";
	String sheet_TestData="TestData";
	@BeforeSuite
	public void beforeSuite() throws IOException, InterruptedException{
		String exePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
		path=System.getProperty("user.dir")+"//src//datadriven//Login.xlsx";
		excel=new ExcelReader(path);
		Thread.sleep(3000);
	}

	//Verify the page title in Login page
	@Test
	public void TC_Login_01() throws Exception{
		String testcaseID=Reusable.getMethodName();
		boolean isSkip = false;
		try{
			int rowNumber = excel.getFirstDataRowNum(sheet_TestCases, "TCID", testcaseID);
			String runMode = excel.getCellData(sheet_TestCases, "Run", rowNumber);
			if (runMode.contentEquals("No") || runMode.isEmpty()){
				isSkip = true;
			}
			if (isSkip) {
				throw new SkipException("Skip this Test Case");
			}
			int rowNum=excel.getRowNum(sheet_TestData, testcaseID);
			String expectedTitle=excel.getCellData(sheet_TestData, "TestData1", rowNum);
			String actualTitle=driver.getTitle();
			//Assert.assertEquals(expectedTitle, actualTitle);
			if(actualTitle.equals(expectedTitle)){
				System.out.println("Actual and Expected Page titles are Equal...");
				excel.setCellData(sheet_TestCases, testcaseID, "Result", "PASS");
			}
			else{
				excel.setCellData(sheet_TestCases, testcaseID, "Result", "FAIL");
			}
			
		}
		catch(Exception e){
			if(isSkip){
				excel.setCellData(sheet_TestCases, testcaseID, "Result", "SKIP");
			}
			else{
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "FAIL");
			}
			throw e;
			//throw new Exception(e.getMessage());
		}
	}
	//Verify the validation messages when clicking on Sign In button without entering user name and password
	@Test
	public void TC_Login_02() throws Exception{
		String testcaseID=Reusable.getMethodName();
		System.out.println("testcaseID value: "+testcaseID);
		boolean isSkip = false;
		try{
			isSkip = Reusable.isSkip(excel, sheet_TestCases, testcaseID);
			if (isSkip) {
				throw new SkipException("Skip this Test Case");
			}
			
			driver.findElement(By.id("BtnLogin")).click();
			String actualErrUserName=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword=driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			
			int rowNum=excel.getRowNum(sheet_TestData, testcaseID);
			String expectedErrUserName=excel.getCellData(sheet_TestData, "TestData1", rowNum);
			String expectedErrPassword=excel.getCellData(sheet_TestData, "TestData2", rowNum);
			
			Assert.assertEquals(actualErrUserName, expectedErrUserName);
			Assert.assertEquals(actualErrPassword, expectedErrPassword);
			Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "PASS");
		}
		catch(Exception e){
			if(isSkip){
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "SKIP");
			}
			else{
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "FAIL");
			}
			
			throw e;
		}
	}
	
	//Verify the validation message when clicking on Sign In button without entering valid user name
	@Test
	public void TC_Login_03() throws Exception{
		String testcaseID=Reusable.getMethodName();
		boolean isSkip = false;
		try{
			isSkip = Reusable.isSkip(excel, sheet_TestCases, testcaseID);
			if (isSkip) {
				throw new SkipException("Skip this Test Case");
			}
			
			int rowNum=excel.getRowNum(sheet_TestData, testcaseID);
			String username=excel.getCellData(sheet_TestData, "UserName", rowNum);
			String password=excel.getCellData(sheet_TestData, "Password", rowNum);
			
			driver.findElement(By.id("TxtEmail")).sendKeys(username);
			driver.findElement(By.id("TxtPassword")).sendKeys(password);
			driver.findElement(By.id("BtnLogin")).click();
			
			String expectedMsg=excel.getCellData(sheet_TestData, "TestData1", rowNum);
			Assert.assertEquals(driver.findElement(By.id("divemail")).getText(),expectedMsg);
			Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "PASS");
		}
		catch(Exception e){
			if(isSkip){
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "SKIP");
			}
			else{
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "FAIL");
			}
			throw new Exception(e.getMessage());
		}
		
	}
	//Verify the validation message when clicking on Sign In button without entering valid password
	@Test
	public void TC_Login_04() throws Exception{
		String testcaseID=Reusable.getMethodName();
		boolean isSkip = false;
		try{
			isSkip = Reusable.isSkip(excel, sheet_TestCases, testcaseID);
			if (isSkip) {
				throw new SkipException("Skip this Test Case");
			}
			Reusable.clear(driver, By.id("TxtEmail"));
			int rowNum=excel.getRowNum(sheet_TestData, testcaseID);
			String username=excel.getCellData(sheet_TestData, "UserName", rowNum);
			String password=excel.getCellData(sheet_TestData, "Password", rowNum);
			driver.findElement(By.id("TxtEmail")).sendKeys(username);
			driver.findElement(By.id("TxtPassword")).sendKeys(password);
			driver.findElement(By.id("BtnLogin")).click();
			
			String expectedMsg=excel.getCellData(sheet_TestData, "TestData1", rowNum);
			Assert.assertEquals(driver.findElement(By.id("divemail")).getText(),expectedMsg);
			Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "PASS");
			
		}
		catch(Exception e){
			if(isSkip){
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "SKIP");
			}
			else{
				Reusable.setResultInExcel(excel, sheet_TestCases, testcaseID, "FAIL");
			}
			throw new Exception(e.getMessage());
		}
		
	}
	
}
