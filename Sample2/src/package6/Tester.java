package package6;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {
	@Given("^I am a \"([a-zA-Z]{1,})\"$")
	public void I_am_a_Tester(String test)
	{
		System.out.println(test);
		
	}
	@And("I do good \"([a-zA-Z]{1,})\"")
	public void I_do_good_Testing(String good)
	{
		System.out.println(good);
	}
	@When("I find \"([a-zA-Z]{1,})\"")
	public void I_find_defects(String defects)
	{
		System.out.println(defects);
	}
	@Then("^Then get appreciated by \"([a-zA-Z]{1,})\"$")
	public void I_get_app_by_manager(String app)
	{
		System.out.println(app);
	}
	@And("salary \"([a-zA-Z]{1,})\"")
	public void salary_increases(String sal)
	{
		System.out.println(sal);
	}
}
