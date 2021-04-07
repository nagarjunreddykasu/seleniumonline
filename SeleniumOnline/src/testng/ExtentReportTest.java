package testng;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basics.Reusable;

public class ExtentReportTest {
	
	/*
	 ExtentSparkReporter
	 ExtentReports
	 ExtentTest
	 */
	public static ExtentSparkReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest extentTest;
	@BeforeSuite
	public void beforeSuite(){
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//ExtentReport.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Automation Test Results");
		reporter.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.setSystemInfo("Selenium Version", "3.141.59");
		reports.setSystemInfo("Author", "Nagarjun Reddy K");
		reports.attachReporter(reporter);	
	}
	
	
	
	static WebDriver driver =null;
	@BeforeClass
	public void beforeClass(){
		String exePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
	}
	//Verify the page title in Login page
	@Test
	public void TC_Login_01() throws Exception{
		try{
			extentTest=reports.createTest("Verify the page title in Login page");
			String expectedTitle="Circulus - Login1";
			String actualTitle=driver.getTitle();
			System.out.println("Actual page title: "+actualTitle);
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Actual and Expected Page titles are Equal...");
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	//Verify the validation messages when clicking on Sign In button without entering user name and password
	@Test
	public void TC_Login_02() throws Exception{
		try{
			extentTest=reports.createTest("Verify the validation messages when clicking on Sign In button without entering user name and password");
			String expectedErrUserName="Please enter Username / Email Address.";
			String expectedErrPassword="Please enter Password.";
			
			driver.findElement(By.id("BtnLogin")).click();
			String actualErrUserName=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword=driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			System.out.println("Actual validation message for User Name: "+actualErrUserName);
			System.out.println("Actual validation message for Password: "+actualErrPassword);
			Assert.assertEquals(expectedErrUserName, actualErrUserName);
			Assert.assertEquals(expectedErrPassword, actualErrPassword);
			System.out.println("Actual and Expected validation messages are Equal...");
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
			String methodName=result.getMethod().getMethodName();
			
			String exceptionMessage=Arrays.toString(result.getThrowable().getStackTrace());
			extentTest.fail("<details><summary><font color=red>Exception occurred. Click here to see details.</font></summary>"+exceptionMessage+"</details> \n");
			
			String path=Reusable.takeScreenshot(driver);
			extentTest.fail("<b><font color=red>Screenshot of Failure</font></b>", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			
			String logText="Test Method "+methodName+" Failed";
			Markup markup=MarkupHelper.createLabel(logText, ExtentColor.RED);
			extentTest.log(Status.FAIL, markup);
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			String methodName=result.getMethod().getMethodName();
			String logText="Test Method "+methodName+" Success";
			Markup markup=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			extentTest.log(Status.PASS, markup);
		}
		else{
			String methodName=result.getMethod().getMethodName();
			String logText="Test Method "+methodName+" Skipped";
			Markup markup=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			extentTest.log(Status.SKIP, markup);
		}
	}
	
	@AfterSuite
	public void afterSuite(){
		reports.flush();
		driver.quit();
	}
	
	
	
	
	
	

}
