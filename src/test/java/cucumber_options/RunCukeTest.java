package cucumber_options;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features", 
		glue = "step_definitions", 
		monochrome = true, 
		dryRun = false,
		tags = {"~@ignore"},
		plugin = {
				"pretty",
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json",
			}
		)
public class RunCukeTest {

}

//	"html:target/site/cucumber-pretty",
//  "junit:target/junitreport.xml",

//pro plugin:   "io.cucumber.pro.JsonReporter12:default",