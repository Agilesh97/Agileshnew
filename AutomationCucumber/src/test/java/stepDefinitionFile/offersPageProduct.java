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
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class offersPageProduct {
	public WebDriver driver;
	public String offerspageproductname;
	TestContextSetUp testcontextsetup;
	PageObjectManager pageObjectManager;

	public offersPageProduct(TestContextSetUp testcontextsetup) {
		
		this.testcontextsetup = testcontextsetup;
	}


@Then("User searched for {string} shortname in offers page")
public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
   
	switchToOfferspage();
	OffersPage offersPage =testcontextsetup.pageObjectManager.getoffersPage();
    offersPage.searchItem(shortname);
    Thread.sleep(2000);
    offerspageproductname = offersPage.getProductName();
}
public void switchToOfferspage() {
	
	//if switched to offers page-->skip below part
	//if(testcontextsetup.driver.getcurrenturl().equalsignorecase("https:rahulshettyacademy.com/selenium");
	//this would be helpful in code reusability
	
	Landingpage landingpage = testcontextsetup.pageObjectManager.getLandingPage(); //object creation is done in testcontextsetup class
	landingpage.selectTopDeals();
	testcontextsetup.genericUtils.SwitchWindowToChild();
}
@Then("validate product name in offers page matches with landing page")
public void validate_product_name_in_offers_page_matches_with_landing_page() {
	
	Assert.assertEquals(offerspageproductname, testcontextsetup.landingpageproductname);
}

}
