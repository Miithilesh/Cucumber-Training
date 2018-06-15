package package5;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class Stepdefinition5 {
	
	@Given("^I have to enter \"([0-9]+)\" in calc")
	public void I_Enter_50_in_the_calculator(int num)
	{
		System.out.println("I have to enter 50");
		System.out.println(num);
	}
	
	@And("^I click \"([a-zA-Z]{1,})\" symbol")
	public void I_press_Add(String operator)
	{
		System.out.println("I click minus symbol");
		System.out.println(operator);
		
	}
	
	
	@Given("^I am going to enter \"([0-9]+)\" in calc")
	public void Iamgoingtoenter60(int num1)
	{
		System.out.println("I am going to enter 60");
		System.out.println(num1);
	}
	
	@And("^I am going \"([a-zA-Z]{1,})\" symbol")
	public void Iamgoingminussymbol(String operator1)
	{
		System.out.println("I am going minus symbol");
		System.out.println(operator1);
		
	}
	

}
