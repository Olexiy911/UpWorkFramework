package framework.hometests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.testcase.TestBase;

public class HomePageTestSuite extends TestBase {

	@Test
	// TS 2.1
	public void enterHomePageView() {
		Assert.assertTrue(homePage.isNewsButtonDisplayed(), "News button is not displayed");
	}

}
