package pages;

import org.openqa.selenium.WebDriver;


public class YahooHomePage extends AbstractPage {

	public YahooHomePage(WebDriver driver) {
		super(driver);
	}

	public static YahooSearchPage searchForKeyword(String keyword) {
		sleep(3000);
		waitForPresenceOfElement(Constants.YAHOOHOME_TEXTBOX);
		enterText(Constants.YAHOOHOME_TEXTBOX, keyword);
		clickElement(Constants.YAHOOHOME_SEARCH_BUTTON);
		return new YahooSearchPage(driver);
	}


}
