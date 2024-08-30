package stepDefinitionFile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Landingpage;
import utils.TestContextSetUp;

public class LandingPageProduct {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerspageproductname;
	TestContextSetUp testcontextsetup;
	
	public LandingPageProduct(TestContextSetUp testcontextsetup) {
		        
		this.testcontextsetup= testcontextsetup;
	}

@Given("User is on Greencart landing page")
public void user_is_on_greencart_landing_page() throws InterruptedException {
 

	
}

@When("User searched with shortname {string} and extract actual name of product")
public void user_searched_with_shortname_and_extract_actual_name_of_product(String shortname) throws InterruptedException {
 
	Landingpage landingpage = testcontextsetup.pageObjectManager.getLandingPage();
	landingpage.searchItem(shortname);
	Thread.sleep(2000);
    testcontextsetup.landingpageproductname =landingpage.getProductName().split("-")[0].trim();
    System.out.println(landingpageproductname + " is extracted from home page");
    
}


}
