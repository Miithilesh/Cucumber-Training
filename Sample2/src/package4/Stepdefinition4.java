package package4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class Stepdefinition4 {
	
	@Given("^I have to enter [0-9]+")
	public void I_Enter_50_in_the_calculator()
	{
		System.out.println("I have to enter 50");
	}
	
	@And("^I click minus symbol")
	public void I_press_Add()
	{
		System.out.println("I click minus symbol");
		
	}
	
	
	@Given("^I am going to enter [0-9]+")
	public void Iamgoingtoenter60()
	{
		System.out.println("I am going to enter 60");
	}
	
	@And("^I am going minus symbol")
	public void Iamgoingminussymbol()
	{
		System.out.println("I am going minus symbol");
		
	}
	

}
