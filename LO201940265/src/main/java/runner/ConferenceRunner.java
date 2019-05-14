package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//This is to get the values
@CucumberOptions(features = "D:\\eclipseenter2\\Module4\\src\\main\\java\\feature\\login.feature", glue = {
		"stepDefinition" })
public class ConferenceRunner {

}
