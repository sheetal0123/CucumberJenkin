package pages;

import org.openqa.selenium.WebDriver;


public class YahooHomePage extends AbstractPage {

	public YahooHomePage(WebDriver driver) {
		super(driver);
	}

	public static void searchForKeyword(String keyword) {
		sleep(3000);
		waitForPresenceOfElement(Constants.YAHOOHOME_TEXTBOX);
		System.out.println("----------------Home Title:" + getTitleName());
		enterText(Constants.YAHOOHOME_TEXTBOX, keyword);
		clickElement(Constants.YAHOOHOME_SEARCH_BUTTON);
		// return new YahooSearchPage(driver);
	}


}
