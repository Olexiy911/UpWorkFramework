package framework.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import framework.pages.home.HomePage;
import framework.utility.LogFactory;
import framework.utility.PropertyLoader;
import framework.webdriver.WebDriverFactory;



/*
 * Base class for all the test classes
 * 
 * @author Taras Lytvyn
 */

public class TestBase {
	
	private static final Logger LOG = LogFactory.getLogger(TestBase.class);

	private WebDriver webDriver;
	
	protected HomePage homePage;

	@BeforeMethod
	@Parameters({ "browserName" })
	public void setup(String browserName) throws Exception {
		LOG.info("Navigating to test url");
		webDriver = WebDriverFactory.getInstance(browserName);
		LOG.info("Navigating to test url");
		webDriver.get(PropertyLoader.getUrl());
		homePage = PageFactory.initElements(webDriver, HomePage.class);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (webDriver != null) {
			LOG.info("Killing web driver");
			WebDriverFactory.killDriverInstance();
		}
	}

}