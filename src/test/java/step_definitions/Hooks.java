package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.AbstractPage;

public class Hooks {

	public static WebDriver driver;
	public static String cmdDriver;

	@Before
	public void beforeScenario() {
		AbstractPage.getDriverFromCMD();
	}

	@After
	public void afterScenario() {
		// System.out.println("after");
	}
}
