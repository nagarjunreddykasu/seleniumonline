package suite.MavenProject;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Log;
import base.Reusable;
import base.Setup;
import database.SQLServerDB;
import pages.SignUpPage;

public class SignUpTest {

	String sheet_TestCases;
	String sheet_TestData;
	String className;
	SignUpPage signupPage;
	static SQLServerDB db=null;


	@BeforeClass
	@Parameters({"browser", "url" })
	public void beforeClass(String browser, String url) throws IOException {
		className = this.getClass().getSimpleName();
		signupPage=new SignUpPage();
		sheet_TestCases = signupPage.sheet_TestCases;
		sheet_TestData = signupPage.sheet_TestData;		
		Reusable.launchApp(browser, url);
	}

	//Verify the page title in Login page
	@Test
	public void TC_SignUp_01() throws Exception{
		String testcaseID=Reusable.getMethodName();
		boolean isSkip = false;
		try{
			isSkip=Reusable.isSkip(signupPage.xlSignUp, sheet_TestCases, testcaseID);
			if (isSkip) {
				throw new SkipException("Skip this Test Case");
			}
			String description=signupPage.getTCDescription(signupPage.xlSignUp, sheet_TestCases, testcaseID);
			Setup.extentTest=Setup.reports.createTest(description);
			Setup.extentTest.assignCategory(className);

			Reusable.click(signupPage.prop.getProperty("signup"));

			int rowNum=signupPage.xlSignUp.getRowNum(sheet_TestData, testcaseID);
			String expectedTitle=signupPage.xlSignUp.getCellData(sheet_TestData, "TestData1", rowNum);

			String actualTitle=Reusable.getTitle();
			//Assert.assertEquals(expectedTitle, actualTitle);
			if(actualTitle.equals(expectedTitle)){
				System.out.println("Actual and Expected Page titles are Equal...");
				Log.info("Actual and Expected Page titles are Equal...");
				signupPage.xlSignUp.setCellData(sheet_TestCases, testcaseID, "Result", "PASS");
			}
			else{
				Log.error("Actual and Expected Page titles are NOT Equal");
				signupPage.xlSignUp.setCellData(sheet_TestCases, testcaseID, "Result", "FAIL");
				throw new Exception("Actual and Expected Page titles are NOT Equal");
			}

		}
		catch(Exception e){
			if(isSkip){
				signupPage.xlSignUp.setCellData(sheet_TestCases, testcaseID, "Result", "SKIP");
			}
			throw e;
		}
	}

	@Test
	public void TC_SignUp_02() throws Exception{
		String testcaseID=Reusable.getMethodName();
		boolean isSkip = false;
		ArrayList<String> expectedOptions;
		ArrayList<String> actualOptions;
		ArrayList<String> unmatched;
		try{
			isSkip=Reusable.isSkip(signupPage.xlSignUp, sheet_TestCases, testcaseID);
			if (isSkip) {
				throw new SkipException("Skip this Test Case");
			}
			String description=signupPage.getTCDescription(signupPage.xlSignUp, sheet_TestCases, testcaseID);
			Setup.extentTest=Setup.reports.createTest(description);
			Setup.extentTest.assignCategory(className);

			//To get the Expected values from DB
			db=new SQLServerDB();
			expectedOptions=db.getJobTitles();
			System.out.println("Expected values of Job Title drop down list: "+expectedOptions);

			//To get Actual values from Job Titles drop down list
			actualOptions=Reusable.getDropdownValues(signupPage.prop.getProperty("jobtitle"));
			actualOptions.remove(0);
			//Comparing both actual & expected options
			unmatched=Reusable.compareArrayLists(expectedOptions, actualOptions);
			System.out.println("Unmatched values: "+unmatched);
			if(unmatched.size()<=0){
				System.out.println("Actual and Expected drop down values are Equal.");
				Log.info("Actual and Expected drop down values are Equal.");
				signupPage.xlSignUp.setCellData(sheet_TestCases, testcaseID, "Result", "PASS");
			}
			else{
				Log.error("Actual and Expected drop down values are NOT Equal. Unmatched values: "+unmatched);
				signupPage.xlSignUp.setCellData(sheet_TestCases, testcaseID, "Result", "FAIL");
				throw new Exception("Actual and Expected drop down values are NOT Equal. Unmatched values: "+unmatched);
			}
		}
		catch(Exception e){
			if(isSkip){
				signupPage.xlSignUp.setCellData(sheet_TestCases, testcaseID, "Result", "SKIP");
			}
			throw e;
		}
	}
	
	@AfterClass
	public void afterClass(){
		Reusable.close();
	}

}
