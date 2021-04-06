package testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AssertionsTest {
	
	
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
	//Verify the page title in Login page
	@Test
	public void TC_Login_01() throws Exception{
		try{
			String expectedTitle="Circulus - Login";
			String actualTitle=driver.getTitle();
			System.out.println("Actual page title: "+actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			ArrayList<String> al1=new ArrayList<>();
			al1.add("element1");
			al1.add("element2");
			al1.add("element3");
			
			ArrayList<String> al2=new ArrayList<>();
			al2.add("element1");
			al2.add("element3");
			al2.add("element2");
			
			Assert.assertEquals(al1, al2);
			System.out.println("Actual and Expected Page titles are Equal...");
			
			Assert.assertTrue(expectedTitle.equals(actualTitle));
			Assert.assertFalse(!expectedTitle.equals(actualTitle));
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	

}
