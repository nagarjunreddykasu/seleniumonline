package definitions;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.aventstack.extentreports.GherkinKeyword;

import base.Log;
import base.Reusable;
import base.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginTest {
	
	public static String scenarioName;
	public static LoginPage loginPage;
	@Before
	public void beforeHook(Scenario scenario){
		scenarioName=scenario.getName();
		System.out.println("Before Hook is executed");
	}
	
	@After
	public void afterHook(Scenario scenario){
		System.out.println("Is Scenario Failed? "+scenario.isFailed());
		if(scenario.isFailed()){
			byte[] screenshotBytes = ((TakesScreenshot) Reusable.getDriver()).getScreenshotAs(OutputType.BYTES);
	        scenario.attach(screenshotBytes, "image/png", "Test Scenario Failed");
		}
		//Setup.reports.flush();
		//Reusable.close();
	}
	
	@Given("user navigates to QA portal")
	public void user_navigates_to_qa_portal() throws ClassNotFoundException {
		Setup.extentTest=Setup.reports.createTest(new GherkinKeyword("Feature"),"Login").assignCategory("Login");
		Setup.childTest=Setup.extentTest.createNode(new GherkinKeyword("Scenario"),scenarioName);
		Setup.childTest.createNode(new GherkinKeyword("Given"),"user navigates to QA portal");
		
		String browser=Setup.general.getProperty("browser");
		String url=Setup.general.getProperty("url");
		if(Reusable.getDriver()==null){
			 Reusable.launchApp(browser, url);
		}
	   
	    loginPage=new LoginPage(Reusable.getDriver());
	    Log.info(url+" is launched in "+browser+" browser");
	}

	@When("user validates Login page title")
	public void user_validates_login_page_title(List<String> list) throws ClassNotFoundException {
		Setup.childTest.createNode(new GherkinKeyword("When"),"user validates Login page title");
		String expectedPageTitle=list.get(1);
		String actualPageTitle=Reusable.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		Log.info(actualPageTitle+" is matched with "+expectedPageTitle);
	}

	@And("user entered \"{}\" username")
	public void user_entered_username(String username) throws ClassNotFoundException {
		Setup.childTest.createNode(new GherkinKeyword("And"),"user entered "+username+" username");
		if(username.isEmpty()){
			System.out.println("username is blank");
		}else{
			Reusable.sendKeys(loginPage.username, username);
		}
		Log.info("user entered "+username);
	}

	@And("user entered \"{}\" password")
	public void user_entered_password(String password) throws ClassNotFoundException {
		Setup.childTest.createNode(new GherkinKeyword("And"),"user entered "+password+" password");
		if(password.isEmpty()){
			System.out.println("password is blank");
		}else{
			Reusable.sendKeys(loginPage.password, password);
		}
		Log.info("user entered "+password);
		
	}

	@And("user clicked on Sign In button")
	public void user_clicked_on_sign_in_button() throws ClassNotFoundException {
		Setup.childTest.createNode(new GherkinKeyword("And"),"user clicked on Sign In button");
		Reusable.click(loginPage.btnLogin);
	}

	@Then("validation message \"{}\" should be displayed for \"{word}\"")
	public void validate_message_should_be_displayed(String validateLogin,String flag) throws ClassNotFoundException, InterruptedException {
		Setup.childTest.createNode(new GherkinKeyword("Then"),"validation message "+validateLogin+" should be displayed for "+flag);
		
		switch(flag){
		case "invuser":
			String actualErrorMessage=Reusable.getText(loginPage.errorUserPassword);
			Assert.assertEquals(actualErrorMessage, validateLogin);
			Log.info(actualErrorMessage+" is matched with "+validateLogin);
			break;
		case "invpwd":
			String actualErrorMessagePwd=Reusable.getText(loginPage.errorUserPassword);
			Assert.assertEquals(actualErrorMessagePwd, validateLogin);
			Log.info(actualErrorMessagePwd+" is matched with "+validateLogin);
			break;
		case "invEmail":
			String actualErrorMessageUserName=Reusable.getText(loginPage.errorUserName);
			Assert.assertEquals(actualErrorMessageUserName, validateLogin);
			Log.info(actualErrorMessageUserName+" is matched with "+validateLogin);
			break;
		case "blank":
			String actualErrorUserName=Reusable.getText(loginPage.errorUserName);
			String actualErrorPassword=Reusable.getText(loginPage.errorPassword);
			String expectedErrorUserName=validateLogin.split(":")[0];
			String expectedErrorPassword=validateLogin.split(":")[1];
			Assert.assertEquals(actualErrorUserName, expectedErrorUserName);
			Assert.assertEquals(actualErrorPassword, expectedErrorPassword);
			break;
		}
		Reusable.delay(2);
		Reusable.clear(loginPage.username);
		Reusable.clear(loginPage.password);
		
	    
	}

}
