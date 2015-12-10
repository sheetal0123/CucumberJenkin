package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class YahooSearchPage extends AbstractPage {

	public YahooSearchPage(WebDriver driver) {
		super(driver);
	}

	public static void verifySearchPage() {
		System.out.println("----------------SRP Title:" + getTitleName());
		System.out.println("----------------Count:" + getSize(Constants.YAHOOSEARCH_RESULT_COUNT));
		Assert.assertTrue("Search result is not 10", getSize(Constants.YAHOOSEARCH_RESULT_COUNT) == 10);
	}

}
