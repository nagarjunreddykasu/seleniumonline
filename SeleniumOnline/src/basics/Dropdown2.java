package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws Exception {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/login.aspx");

		driver.findElement(By.linkText("Sign Up")).click();

		WebElement jobtitle=driver.findElement(By.id("ddlJobTitle"));

		Select sel=new Select(jobtitle);
		
		List<WebElement> options=sel.getOptions();
		
		ArrayList<String> expectedValues=new ArrayList<>();
		expectedValues.add("Select");
		
		String expected="Select, CEO, President, Owner, Executive Director, CFO, VP Finance, Controller, Director Finance, Other Finance, CIO, COO, CTO, VP IT, Director IT, Other IT, Other";
		
		ArrayList<String> expectedOptions=new ArrayList<>(Arrays.asList(expected.split("\\s,\\s"))); 
		ArrayList<String> actualValues=new ArrayList<>();
		
		//for loop
		for(int i=0;i<options.size();i++){
			actualValues.add(options.get(i).getText());
		}
		
		//for each loop
		//Iterator
		//ListIterator
		
		
		System.out.println(actualValues);
		
		ArrayList<String> unmatched=Reusable.compareArrayLists(expectedValues, actualValues);
		if(unmatched.size()>0){
			System.out.println("There are unmatched values: "+unmatched);
			throw new Exception("There are unmatched values: "+unmatched);
		}
		else{
			System.out.println("All actual and expected values are equal.");
	
		}
		
		
	}

}
