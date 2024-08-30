package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public Landingpage landingpage;
	public OffersPage offersPage;
	public WebDriver driver;
		
  public PageObjectManager(WebDriver driver) {
	  this.driver = driver;
  }
	public Landingpage getLandingPage() {
		
		landingpage = new Landingpage(driver);
		return landingpage;
	}
	public OffersPage getoffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	
	
}
