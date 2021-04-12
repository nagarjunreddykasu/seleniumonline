package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExcelAutomation {

	static WebDriver driver =null;
	@BeforeSuite
	public void beforeSuite(){
		String exePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
	}
	//Verify the validation messages when clicking on Submit button without entering user name and password
	@Test
	public void TC_Login_01() throws Exception{
		try{
			String path=System.getProperty("user.dir")+"//src//datadriven//TestData.xlsx";
			ExcelReader excel=new ExcelReader(path);
			int rowNum=excel.getRowNum("Sheet1", "TC_Login_01");
			String username=excel.getCellData("Sheet1", "UserName", rowNum);
			driver.findElement(By.id("TxtEmail")).sendKeys(username);
			
			
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}

	@AfterSuite
	public void afterSuite(){
		driver.quit();
	}

}
