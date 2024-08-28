package Stepdef;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintionfile {
	
	
	@Given("user is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	   
		System.out.println("User landed on net banking page");
	}
	@When("user login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String username, String password) {
	    System.out.println(username +"and password is" +password);
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    
		System.out.println("home page is displayed");
		
	}
	@Then("cards displayed")
	public void cards_displayed() {
	
		System.out.println("cards displayed");
		
	}
	@When("user login into application with username {string} and password {string} combination")
	public void user_login_into_application_with_username_and_password_combination(String username, String password) {
	     
		System.out.println(username +"and password is" +password);
	}
	
	//Datadriven Testing
	
	@Given("user is in the practice landing page")
	public void user_is_in_the_practice_landing_page() {
		   
	}

	@When("user signin into application")
	public void user_signin_into_application(List<String> data) {
	    
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
	}
	@Given("Setup the entries in database")
    public void setupEntries() {
		System.out.println("**********");
		System.out.println("setup entries in database");
	}
	@When("launch the browser from config variables")
	public void launchbrowser()
	{
		System.out.println("launch the browser form config variables");
	}
	@When("hit the home page url of banking site")
	public void hiturl() {
		System.out.println("hit the home page url of banking site");
	}
	
}
