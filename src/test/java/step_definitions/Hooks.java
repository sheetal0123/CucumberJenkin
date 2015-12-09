package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.AbstractPage;

public class Hooks {

	public static WebDriver driver;
	public static String cmdDriver;

	@Before(order = 5)
	public void before1() {
		System.out.println("Before order 5");
		AbstractPage.getDriverFromCMD();
	}

	@Before(order = 10)
	public void before2() {
		System.out.println("Before order 10");
	}

	@After(order = 10)
	public void after2() {
		System.out.println("After order 10");
	}


	@After(order = 5)
	public void after1() {
		System.out.println("After order 5");
	}


}

// output
// Before order 5
// Before order 10
// Step File
// After order 10
// After order 5

// max order = 10000