package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automation3 {
	public WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browser,String url) {
		if(browser.equalsIgnoreCase("firefox")){
			String exePath = System.getProperty("user.dir") + "//drivers//geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			String exePath = System.getProperty("user.dir") + "//drivers//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			String exePath = System.getProperty("user.dir") + "//drivers//IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability("ignoreProtectedModeSettings", true);
			options.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(options);
		}else if (browser.equalsIgnoreCase("edge")) {
			String exePath = System.getProperty("user.dir") + "//drivers//msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", exePath);
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//Verify the page title in Login page
	@Test
	public void TC_Login_01() throws Exception{
		try{
			String expectedTitle="Circulus - Login";
			String actualTitle=driver.getTitle();
			System.out.println("Actual page title: "+actualTitle);
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Actual and Expected Page titles are Equal...");
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}

	// Verify the validation messages when clicking on Submit button without entering user name and password
	@Test
	public void TC_Login_02() throws Exception {
		try {
			String expectedErrUserName = "Please enter Username / Email Address.";
			String expectedErrPassword = "Please enter Password.";
			driver.findElement(By.id("BtnLogin")).click();
			Thread.sleep(2000);
			String actualErrUserName = driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword = driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			System.out.println("Actual validation message for User Name: " + actualErrUserName);
			System.out.println("Actual validation message for Password: " + actualErrPassword);
			Assert.assertEquals(expectedErrUserName, actualErrUserName);
			Assert.assertEquals(expectedErrPassword, actualErrPassword);
			System.out.println("Actual and Expected validation messages are Equal...");
		} catch (Exception e){
			throw new Exception(e.getMessage());
		}
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}

}
