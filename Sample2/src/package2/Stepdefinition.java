package package2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {

	@Given("I Enter 30 in the calculator")
	public void I_Enter_50_in_the_calculator()
	{
		System.out.println("I Enter 30 in the calculator");
	}
	
	@And("I press Add")
	public void I_press_Add()
	{
		System.out.println("I press Add");
		
	}
	@When("I have entered 50 in the calculator")
	public void I_have_entered_50_in_the_calculator()
	{
		System.out.println("I have entered 50 in the calculator");
	}
	@And("I press equal symbol")
	public void I_press_equal_symbol()
	{
		System.out.println("I press equal symbol");
	}
	@Then("click Ok symbol")
	public void click_Ok_symbol()
	{
		System.out.println("click Ok symbol");
	}
	
}
