package pages;

import org.openqa.selenium.By;

public class Constants {

	// YAHOO HOME PAGE
	public static By YAHOOHOME_TEXTBOX = By.xpath("//input[@id='uh-search-box']");
	public static By YAHOOHOME_SEARCH_BUTTON = By.id("uh-search-button");

	// YAHOO SEARCH PAGE
	public static By YAHOOSEARCH_SELENIUM_HQ = By.xpath("//a[contains(text(),'Selenium - Official Site')]");
	public static By YAHOOSEARCH_RESULT_COUNT = By.xpath("//div[@id='web']/ol/li");

}
