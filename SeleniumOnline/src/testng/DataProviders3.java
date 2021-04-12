package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviders3 {
	WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browser,String url){
		String exePath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(dataProvider="getData")
    public void TC_Login_01(String username, String password, String flag) throws InterruptedException {
		driver.findElement(By.id("TxtEmail")).sendKeys(username);
		driver.findElement(By.id("TxtPassword")).sendKeys(password);
		driver.findElement(By.id("BtnLogin")).click();
		Thread.sleep(2000);
		String expectedMsg="Invalid Username / Email Address or Password.";
		String expInvalidEmailMsg="Please enter a valid Username / Email Address.";
		String expectedErrUserName="Please enter Username / Email Address.";
		String expectedErrPassword="Please enter Password.";
		
		switch(flag){
		case "invuser":
			Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid User...");
			break;
		case "invpwd":
			Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid Password...");
			break;
		case "invEmail":
			Assert.assertEquals(expInvalidEmailMsg, driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid Email...");
			break;
		case "blank":
			String actualErrUserName=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword=driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			Assert.assertEquals(expectedErrUserName, actualErrUserName);
			Assert.assertEquals(expectedErrPassword, actualErrPassword);
			System.out.println("Actual and Expected validation messages are Equal for blank credentials...");
			break;
			
		}

		Thread.sleep(2000);
		driver.findElement(By.id("TxtEmail")).clear();
		driver.findElement(By.id("TxtPassword")).clear();
		
    }
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
	
	@DataProvider
    public Object[][] getData() {
        return new Object[][]{{"nkasu@frontier.com","xeno@123$","invpwd"}, {"nkasu@gmail.com","Test@123","invuser"},
        	{"nagarjun","Abc@1234","invEmail"},{"","","blank"}};
    }

}