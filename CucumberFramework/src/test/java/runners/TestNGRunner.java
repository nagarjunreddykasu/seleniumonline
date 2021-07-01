package runners;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import base.Reusable;
import base.Setup;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src/test/java/features"},glue={"definitions"},plugin = {"pretty", "html:target/cucumber.html"},monochrome=true,tags="@regression")
public class TestNGRunner extends AbstractTestNGCucumberTests{
	@BeforeSuite
	public void loadFiles() throws IOException{
		Setup.initialize();
		System.out.println("Before Suite method is executed");
	}
	
	@AfterSuite
	public void tearDown(){
		Setup.reports.flush();
		Reusable.quit();
	}

}
