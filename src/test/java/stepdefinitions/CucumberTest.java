package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest {
	
	@Given("^this is my first given$")
	public void firstGiven() throws Throwable {
		System.out.println("First is executed!");
	}

	@When("^this is my second when$")
	public void secondWhen() throws Throwable {
		System.out.println("Second is executed!");
	}

	@Then("^this is my third then$")
	public void thirdThen() throws Throwable {
		System.out.println("Third is executed!");
	}
	
}