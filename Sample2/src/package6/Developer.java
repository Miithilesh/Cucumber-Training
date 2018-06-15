package package6;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Developer {
	@Given("^I a \"([a-zA-Z]{1,})\"$")
	public void i_am_dev(String test)
	{
		System.out.println(test);
	
	}
	@When("I fix \"([a-zA-Z]{1,})\"")
	public void i_fix_def(String defect)
	{
		System.out.println(defect);
	}
	@Then("I get appreciated by \"([a-zA-Z]{1,})\"")
	public void i_get_appreciated(String post)
	{
		System.out.println(post);
	}

}
