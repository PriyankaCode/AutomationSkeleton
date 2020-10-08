package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@smoketest2")
	public void setup() {
		System.out.println("D");
	}
	
	@After("@smoketest2")
	public void tearDown() {
		System.out.println("F");
	}

}
