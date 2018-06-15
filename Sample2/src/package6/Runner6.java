package package6;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:src/package6/output/cucumber-html-report",
		"json:src/package6/output/cucumber.json",
		"junit:src/package6/output/cucmber-result.xml"},
		//features = {"src/package6/Tester.feature"},
		tags = {"@smoke and @Sanity"})
		
public class Runner6 {

}
