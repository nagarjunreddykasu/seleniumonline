package suite.MavenProject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Reusable;
import database.SQLServerDB;

public class JobTitlesComparison {
	static SQLServerDB db=null;
	@Parameters({"browser", "url" })
	@Test
	public void TC_JobTItles(String browser,String url) throws Exception{
		try{
			Reusable.launchApp(browser, url);
			Reusable.click(By.linkText("Sign Up"));
			//To get the Expected values from DB
			db=new SQLServerDB();
			ArrayList<String> expectedOptions=db.getJobTitles();
			System.out.println("Expected values of Job Title drop down list: "+expectedOptions);
			
			//To get Actual Options
			ArrayList<String> actualOptions=Reusable.getDropdownValues(By.id("ddlJobTitle"));
			
			actualOptions.remove(0);
			System.out.println("Actual values from Job Title: "+actualOptions);
			
			//Comparing both actual & expected options
			ArrayList<String> unmatched=Reusable.compareArrayLists(expectedOptions, actualOptions);
			System.out.println("Unmatched values: "+unmatched);
		}catch(Exception e){
			throw e;
		}
		
	}

}
