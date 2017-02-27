package framework.menuhometests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.schoolcourses.ManualQATestingPage;
import framework.testcase.TestBase;

public class SchoolHomeMenuTestSuite extends TestBase {
	
	private String manualQACourseNameUrl = "course/test-base-course";

	@Test
	// TS 3.1
	public void checkCitiesListTest() {
		ManualQATestingPage manualQATestingPage = homePage.openCourse("Lviv QA School", manualQACourseNameUrl,
				ManualQATestingPage.class);
		
		Assert.assertTrue(manualQATestingPage.getPageUrl().contains(manualQACourseNameUrl), 
				"Manual QA Testing Course page was not opened");
	}

}