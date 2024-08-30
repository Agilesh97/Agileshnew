package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("/html/body/div/div/div[1]/div/div/div/div/div/div[1]/div[2]/input");
	By productname = By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);
	}
	
	public void getsearchText(String name) {
		
		driver.findElement(search).getText();
	}
	public String getProductName() {
		
		return driver.findElement(productname).getText();
	}
	
	
}
