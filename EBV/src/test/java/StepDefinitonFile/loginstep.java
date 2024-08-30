package StepDefinitonFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstep {

	public WebDriver driver;

@Given("user is on loginpage and click Username Textbox")
public void user_is_on_loginpage_and_click_username_textbox() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ebvuat.internal.genyusgroup.com/login");
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ebv-admin@genyus.dev");
	
	
}
@Then("user clicks the password field")
public void user_clicks_the_password_field() {
   
	driver.findElement(By.xpath("//*[@id=\"password\"]"));
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@123");
}
@Then("user clicks signin icon")
public void user_clicks_signin_icon() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div/form/button")).click();
	Thread.sleep(8000);
	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/div/nav/a/div/svg")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div/div/div/button[1]/a")).click();
    //driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div/div/table/thead/tr[1]/th/div/div[2]/button[3]/p/span")).click();
	WebElement eli = driver.findElement(By.xpath("//*[text()='Eligibility']"));
	
	eli.click();
	Actions act = new Actions(driver);
	WebElement EV = driver.findElement(By.xpath("//*[text()='Eligibility Verification']"));
	act.moveToElement(EV).click();
	act.perform();
    Thread.sleep(4000);
	
	WebElement newe = driver.findElement(By.xpath("//*[text()='New']"));
	act.moveToElement(newe);
	act.click();
	act.build().perform();
	
	WebElement firstname = driver.findElement(By.id("firstName"));
	firstname.click();
	firstname.sendKeys("cluBITS");
	
	WebElement lastname = driver.findElement(By.id("lastName"));
	lastname.click();
	lastname.sendKeys("solutions");
	
	WebElement DOB = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div/div[1]/div[3]/div/div/div/input"));
	DOB.click();
	DOB.sendKeys("02/04/1980");
	
	WebElement memberID = driver.findElement(By.id("memberId"));
	memberID.click();
	memberID.sendKeys("57668687677");
	
	WebElement groupID = driver.findElement(By.id("groupId"));
	groupID.click();
	groupID.sendKeys("87654678");
	
	
	
	WebElement Relationship = driver.findElement(By.id("relationship"));
	Select sc = new Select(Relationship);
	sc.selectByIndex(2);
	
	WebElement proceduretype = driver.findElement(By.id("procedureType"));
	Select se = new Select(proceduretype);
	se.selectByIndex(3);
	
	WebElement procedurecode = driver.findElement(By.id("procedureCode"));
    Select sb = new Select(procedurecode);
	sb.selectByVisibleText("D2390");
	
	WebElement provider = driver.findElement(By.id("provider"));
	Select sn = new Select(provider);
	sn.selectByValue("1171d85a-b727-4846-bb35-18a6cdf12d0b");
	
	WebElement insurancepayer = driver.findElement(By.id("insurancePayer"));
	Select sj = new Select(insurancepayer);
	sj.selectByValue("AARP Dental Insurance Plan");
	
	
	WebElement submit = driver.findElement(By.xpath("//*[text()='Submit']"));
	act.moveToElement(submit);
	act.click();
	act.perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Yes']")).click();
	
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search content']"));
	act.moveToElement(search);
	act.click();
	act.perform();
	search.sendKeys("clubits");
	
//	Thread.sleep(4000);
//	driver.close();
   
	
	
	
	
	
	
	//user clicks logout
	
    //driver.findElement(By.xpath("/html/body/div/div[1]/nav[1]/div/div/ul/li[4]/a/div/img")).click();
	Thread.sleep(2000);
}
@Then("user click signout and user signed out from the application")
public void user_click_signout_and_user_signed_out_from_the_application() {
	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav[1]/div/div/ul/li[4]/div/button")).click();
	//driver.close();
}

//@Given("User login with Invalid username")
//public void user_login_with_invalid_username() throws InterruptedException {
//	
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://ebvuat.internal.genyusgroup.com/login");
//	Thread.sleep(3000);
//	
//	driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
//	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("CluBITSsolutions");
//	
//}
//@Then("pass Invalid password")
//public void pass_invalid_password() {
//	driver.findElement(By.xpath("//*[@id=\"password\"]"));
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@123456");
//	}
//@Then("Click Signin")
//public void click_signin() throws InterruptedException {
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div/form/button")).click();
//	Thread.sleep(4000);
//	driver.close();
//
//}
}
