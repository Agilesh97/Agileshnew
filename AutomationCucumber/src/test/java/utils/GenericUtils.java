package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		
		this.driver = driver;
	}

	public void SwitchWindowToChild() {
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentwindow = i1.next();  //on calling i1,the 0th index id will be return which is parent window. i1 will be null but putting next it will direct the 0th index
	    String childwindow = i1.next();
	    driver.switchTo().window(childwindow);
	}
}
