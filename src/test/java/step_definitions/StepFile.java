package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AbstractPage;
import pages.YahooHomePage;
import pages.YahooSearchPage;

public class StepFile {

	WebDriver driver;
	Hooks hooks;
	YahooHomePage yahooHomePage;
	YahooSearchPage yahooSearchPage;

	@Given("^user is on application home page$")
	public void user_is_on_application_home_page() throws Throwable {
		driver = AbstractPage.getDriver();
		YahooHomePage.navigateToApplication(driver);
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String arg1) throws Throwable {
		YahooHomePage.searchForKeyword(arg1);
	}

	@Then("^user verify results$")
	public void user_verify_results() throws Throwable {
		YahooSearchPage.verifySearchPage();
	}

	@Then("^user close the application$")
	public void user_close_the_application() throws Throwable {
		AbstractPage.closeApplication();
	}

}
