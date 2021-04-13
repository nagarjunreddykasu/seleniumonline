package testng;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Log4JTest2 {
	static WebDriver driver =null;
	@BeforeSuite
	public void beforeSuite(){
		String exePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
		DOMConfigurator.configure("log4j.xml");
	}
	//Verify the page title in Login page
	@Test
	public void TC_Login_01() throws Exception{
		String actualTitle=null;
		try{
			String expectedTitle="Circulus - Login";
			actualTitle=driver.getTitle();
			System.out.println("Actual page title: "+actualTitle);
			//Assert.assertEquals(actualTitle,expectedTitle);
			if(expectedTitle.equals(actualTitle)){
				System.out.println("Actual and Expected Page titles are Equal...");
				Log.info("TC_Login_01 --> Actual and Expected Page titles are Equal...");
			}
			else{
				Log.error("TC_Login_01 --> Actual and Expected Page titles are NOT Equal...");
				throw new Exception("TC_Login_01 --> Actual and Expected Page titles are NOT Equal...");
			}
			
		}
		catch(Exception e){
			Log.error(e.getLocalizedMessage());
			throw new Exception(e.getMessage());
		}
	}
	
	@AfterSuite
	public void afterSuite(){
		driver.close();
	}

}
