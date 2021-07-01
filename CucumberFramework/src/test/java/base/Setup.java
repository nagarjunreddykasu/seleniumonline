package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Setup {
	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest extentTest;
	public static ExtentTest childTest;
	public static Properties general=null;

	public static void initialize() throws IOException{
		//To Load log4j.xml file
		DOMConfigurator.configure("log4j.xml");

		// To load General.properties file
		FileInputStream gen=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//configuration//General.properties");
		general=new Properties();
		general.load(gen);

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

}
