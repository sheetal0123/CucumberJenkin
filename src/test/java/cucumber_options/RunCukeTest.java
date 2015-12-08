package cucumber_options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features", 
 glue = "step_definitions", 
		monochrome = true,
		plugin = {
 "pretty",
		"html:target/htmlreport",
		}
		)
public class RunCukeTest {

}




