package Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before 
	public void netBankingSetUp() {
		
		System.out.println("setup entries in netbanking database");
	}
	
	@After
	public void teardown() {
		
		System.out.println("clear the entries");
	}
	
	public void mortgageSetUp() {
		
		System.out.println("setup the entries in mortgage database");
	}

}
