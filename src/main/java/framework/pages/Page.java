package framework.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

import framework.utility.LogFactory;
import framework.webdriver.WebDriverFactory;

/*
 * Abstract class representation of a Page in the UI with additional features. Page object pattern
 * @author Taras Lytvyn
 */
public abstract class Page {

	private static final Logger LOG = LogFactory.getLogger(Page.class);
	
	protected WebDriver webDriver;
	
	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */
	
	public Page() {
		this.webDriver = WebDriverFactory.getDriver();
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public String getTitle() {
		return webDriver.getTitle();
	}
	
	public String getPageUrl() {
		String pageUrl = webDriver.getCurrentUrl();
		LOG.info("Current page url is: " + pageUrl);
		return pageUrl;
	}
	
}
