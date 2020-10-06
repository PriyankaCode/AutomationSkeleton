package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class stepDefinition2 {
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		System.out.println("User is on Login Page");
	}
	
	@When("^User sign in with Username and Password$")
	public void user_sign_in_with_Username_and_Password() {
		System.out.println("User sign in with Username and Password");
	}
	
	@Then("^Home Page is displayed$")
	public void homepage_is_displayed() {
		System.out.println("Home Page is displayed");
	}
	
	@And("^Company Logo is displayed$")
	public void company_logo_is_displayed() {
		System.out.println("Company Logo is displayed");
	}
	
	
	@When("User clicks on {} button")
	public void user_clicks_on_button(String button) {
		System.out.println("User clicks on "+ button+ " button");
		}

	@When("User enters sign up info")
	public void user_enters_sign_up_info(List<List<String>> data) {
		//List<List<String>> data = dataTable.asLists();
	  System.out.println("From List<String> data");
	  System.out.println(data.get(0).get(0) + " " +data.get(1).get(0));
	  System.out.println(data.get(0).get(1)+ " " +data.get(1).get(1));
	  System.out.println(data.get(0).get(2)+ " "+data.get(1).get(2));
	  System.out.println(data.get(0).get(3)+ " "+data.get(1).get(3));
	}
	
	@When("User enters sign up info map")
	public void user_enters_sign_up_info_map(Map<String, String> dataTable) {
		  System.out.println("From Map<String,String>");
		System.out.println(dataTable.get("FirstName"));
		System.out.println(dataTable.get("LastName"));
		System.out.println(dataTable.get("Email"));
		System.out.println(dataTable.get("Phone"));
	}

	
}
