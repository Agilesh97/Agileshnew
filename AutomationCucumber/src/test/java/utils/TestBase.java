package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
 
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws InterruptedException{
		
		if(driver == null) { //the driver will be initialized only once for the particular test,
			                 //if already driver is open it will skip the below codes and return the driver
			
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		}
		return driver;
	}
}
