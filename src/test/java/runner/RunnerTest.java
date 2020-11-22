package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "json:target/cucumber.json", "html:target/test-output"},
		features = { "features/" }, 
		glue = "stepdefinitions/", 
		tags = "@regression")
public class RunnerTest {

}
