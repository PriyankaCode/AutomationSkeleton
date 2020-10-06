package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@smoketest2")
	public void before_validation() {
		System.out.println("D");
	}
	
	@After("@smoketest2")
	public void after_validation() {
		System.out.println("F");
	}

}
