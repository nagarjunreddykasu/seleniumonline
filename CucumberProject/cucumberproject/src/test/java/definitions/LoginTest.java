package definitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



//Ctrl+Shift+o
public class LoginTest {
	
	//Hooks -- @Before and @After
	@Before
	public void setUp(){
		System.out.println("setUp method code");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown method code");
	}
	
	@Before("@sanity")
	public void setUpSanity(){
		System.out.println("setUpSanity method code");
	}
	
	@After("@sanity")
	public void tearDownSanity(){
		System.out.println("tearDownSanity method code");
	}
	
	@Given("user navigates to QA portal")
	public void user_navigates_to_qa_portal() {
		System.out.println("@Given -- user navigates to QA portal");
	}

	@When("user validates Login page title")
	public void user_validates_login_page_title() {
		System.out.println("@When -- user validates Login page title");
	}

	@And("user entered \"{word}\" username")
	public void user_entered_valid_username(String username) {
		 System.out.println("@And -- user entered "+username+" username");
	}

	@And("user entered \"{word}\" password")
	public void user_entered_valid_password(String password) {
		 System.out.println("@And -- user entered "+password+" password");
	}

	@And("user clicked on Sign In button")
	public void user_clicked_on_sign_in_button() {
		System.out.println("@And -- user clicked on Sign In button");
	}
	
	/*@And("user selects age category")
	public void user_selects_age_category(List<String> list) {
		for(int i=1;i<list.size();i++){
			 System.out.println("@And -- user selects age category "+list.get(i));
		}
		
	   // System.out.println("@And -- user selects age category "+list.get(1));
	}*/
	
	@And("user selects age category")
	public void user_selects_age_category(DataTable table) {
		List<Map<String, String>> list=table.asMaps(String.class, String.class);
		for(int i=0;i<list.size();i++){
			 System.out.println("@And -- user selects age category "+list.get(i).get("Age")+" -- Location is: "+list.get(i).get("Location"));
		}
		
	   // System.out.println("@And -- user selects age category "+list.get(0).get("Age")+" -- Location is: "+list.get(0).get("Location"));
	}

	@Then("user \"{word}\" succussfully logged in")
	public void user_shouldbe_succussfully_logged_in(String validateLogin) {
		System.out.println("@Then -- user "+validateLogin+" successfully logged in");
	}

}
