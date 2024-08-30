package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
	public WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@type='search']");
	By productname = By.cssSelector("h4.product-name");
	By topdeals = By.linkText("Top Deals");
	
	public void searchItem(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);
	}
	
	public void getsearchText(String name) {
		
		driver.findElement(search).getText();
	}
	public String getProductName() {
		
		return driver.findElement(productname).getText();
	}
    public void selectTopDeals() {
		
		driver.findElement(topdeals).click();
	}
}
