package testbase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import framework.pages.home.HomePage;
import framework.utility.PropertyLoader;
import framework.webdriver.WebDriverFactory;



public class TestBase {

	private WebDriver webDriver;
	
	protected HomePage homePage;

	@BeforeMethod
	@Parameters({ "browserName" })
	public void setup(String browserName) throws Exception {
		webDriver = WebDriverFactory.getInstance(browserName);
		webDriver.get(PropertyLoader.getUrl());
		homePage = PageFactory.initElements(webDriver, HomePage.class);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		if (webDriver != null) {
			WebDriverFactory.killDriverInstance();
		}
	}

}