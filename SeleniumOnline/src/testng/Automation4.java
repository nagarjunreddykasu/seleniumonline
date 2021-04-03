package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basics.Reusable;

public class Automation4 {
	@BeforeClass
	@Parameters({"browser","url"})
	public void beforeClass(String browser, String url) {
		Reusable.launchApp(browser,url);
	}

	//Verify the page title in Login page
	@Test
	public void TC_Login_01() throws Exception{
		try{
			String expectedTitle="Circulus - Login";
			String actualTitle=Reusable.getDriver().getTitle();
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
			Reusable.getDriver().findElement(By.id("BtnLogin")).click();
			Thread.sleep(2000);
			String actualErrUserName = Reusable.getDriver().findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword = Reusable.getDriver().findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
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
		Reusable.getDriver().quit();
	}

}
