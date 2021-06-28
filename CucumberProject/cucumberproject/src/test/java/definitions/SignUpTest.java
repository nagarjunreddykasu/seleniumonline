package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpTest {
	@Given("user navigates to Sign Up page")
	public void user_navigates_to_sign_up_page() {
	   System.out.println("@Given -- user navigates to Sign Up page");
	}

	@When("user validates Sign Up page title")
	public void user_validates_sign_up_page_title() {
	   System.out.println("@When -- user validates Sign Up page title");
	}

	@And("user clicked on Register button without entering mandatory fields")
	public void user_clicked_on_register_button_without_entering_mandatory_fields() {
	   System.out.println("@And -- user clicked on Register button without entering mandatory fields");
	}

	@Then("verify validation message")
	public void verify_validation_message() {
	   System.out.println("@Then -- verify validation message");
	}

	@And("user entered data in all mandatory fields")
	public void user_entered_data_in_all_mandatory_fields() {
	    System.out.println("@And -- user entered data in all mandatory fields");
	}

	@And("user clicked on Register button")
	public void user_clicked_on_register_button() {
	   System.out.println("@And -- user clicked on Register button");
	}

	@Then("user shouldbe successfully registered")
	public void user_shouldbe_successfully_registered() {
	   System.out.println("@Then -- user shouldbe successfully registered");
	}

}
