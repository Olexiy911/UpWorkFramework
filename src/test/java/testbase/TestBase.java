package testbase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import framework.pages.navigation.Navigation;
import framework.utility.PropertyLoader;
import framework.webdriver.WebDriverFactory;


public class TestBase {

	protected WebDriver webDriver;
	
	protected Navigation homePage;

	@BeforeMethod
	@Parameters({ "browserName" })
	public void setup(String browserName) throws Exception {
		
		webDriver = WebDriverFactory.getInstance(browserName);   //"firefox"
		webDriver.get(PropertyLoader.getUrl());
		webDriver.manage().window().maximize();
		homePage = PageFactory.initElements(webDriver, Navigation.class);
	}


}