package definitions;

import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.TestNGRunner;

public class SignUpTest {
	
	public static String scenarioName;
	@Before
	public void beforeHook(Scenario scenario){
		scenarioName=scenario.getName();
	}
	
	//public static String scenarioName=LoginTest.scenarioName;
	
	@Given("user navigates to Sign Up page")
	public void user_navigates_to_sign_up_page() throws ClassNotFoundException {
		TestNGRunner.extentTest=TestNGRunner.reports.createTest(new GherkinKeyword("Feature"),"Sign Up").assignCategory("Sign Up");
		TestNGRunner.childTest=TestNGRunner.extentTest.createNode(new GherkinKeyword("Scenario"),scenarioName);
		TestNGRunner.childTest.createNode(new GherkinKeyword("Given"),"user navigates to Sign Up page");
	   System.out.println("@Given -- user navigates to Sign Up page");
	}

	@When("user validates Sign Up page title")
	public void user_validates_sign_up_page_title() throws ClassNotFoundException {
		TestNGRunner.childTest.createNode(new GherkinKeyword("When"),"user validates Sign Up page title");
	   System.out.println("@When -- user validates Sign Up page title");
	}

	@And("user clicked on Register button without entering mandatory fields")
	public void user_clicked_on_register_button_without_entering_mandatory_fields() throws ClassNotFoundException {
		TestNGRunner.childTest.createNode(new GherkinKeyword("And"),"user clicked on Register button without entering mandatory fields");
	   System.out.println("@And -- user clicked on Register button without entering mandatory fields");
	}

	@Then("verify validation message")
	public void verify_validation_message() throws ClassNotFoundException {
		TestNGRunner.childTest.createNode(new GherkinKeyword("Then"),"verify validation message");
	   System.out.println("@Then -- verify validation message");
	}

	@And("user entered data in all mandatory fields")
	public void user_entered_data_in_all_mandatory_fields() throws ClassNotFoundException {
		TestNGRunner.childTest.createNode(new GherkinKeyword("And"),"user entered data in all mandatory fields");
	    System.out.println("@And -- user entered data in all mandatory fields");
	}

	@And("user clicked on Register button")
	public void user_clicked_on_register_button() throws ClassNotFoundException {
		TestNGRunner.childTest.createNode(new GherkinKeyword("And"),"user clicked on Register button");
	   System.out.println("@And -- user clicked on Register button");
	}

	@Then("user shouldbe successfully registered")
	public void user_shouldbe_successfully_registered() throws ClassNotFoundException {
		TestNGRunner.childTest.createNode(new GherkinKeyword("Then"),"user shouldbe successfully registered");
	   System.out.println("@Then -- user shouldbe successfully registered");
	}

}
