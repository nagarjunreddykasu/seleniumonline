package runner;

import java.time.LocalDateTime;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src/test/java/features"},glue={"definitions"},plugin={"pretty","html:target/cucumber-report.html"},monochrome=true,tags="@regression")
public class TestNGRunner extends AbstractTestNGCucumberTests{

	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest extentTest;
	public static ExtentTest childTest;

	@BeforeSuite
	public void beforeSuite(){
		//Extent Report configuration
		reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"//reports//ExtentReport_"+LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "")+".html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Automation Test Results");
		reporter.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.setSystemInfo("Selenium Version", "3.141.59");
		reports.setSystemInfo("Project Name", "<Project Name>");
		reports.attachReporter(reporter);
	}
	
	@AfterSuite
	public void afterSuite(){
		reports.flush();
	}

}
