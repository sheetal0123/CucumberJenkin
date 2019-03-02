package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AbstractPage;
import pages.YahooHomePage;
import pages.YahooSearchPage;
import org.junit.*;

public class StepFile {

	WebDriver driver;
	Hooks hooks;
	// YahooHomePage yahooHomePage;
	// YahooSearchPage yahooSearchPage;

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

	@Given("^background text$")
	public void background_text() throws Throwable {
		System.out.println("*********Background step file*********");
	}

	@Then("^test1$")
	public void test1() throws Throwable {
		System.out.println("*********step file test 1");
	}

	@Then("^test2$")
	public void test2() throws Throwable {
		System.out.println("*********step file test 2");
	}

	@Then("^test3$")
	public void test3() throws Throwable {
		System.out.println("*********step file test 3");
	}

	@SuppressWarnings("deprecation")
	@Then("^test4$")
	public void test4() throws Throwable {
		System.out.println("*********step file test 4");
		//Assert.assertEquals(true, false);
	}

	@Then("^test5$")
	public void test5() throws Throwable {
		System.out.println("*********step file test 5");
	}

}
