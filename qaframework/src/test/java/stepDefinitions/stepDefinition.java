package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	@Given("validate the browser")
	public void validate_the_browser() {
	   System.out.println("A");
	}

	@When("Browser is triggered")
	public void browser_is_triggered() {
		 System.out.println("B");
	}

	@Then("check if browser is started")
	public void check_if_browser_is_started() {
		 System.out.println("C");
	}

}
