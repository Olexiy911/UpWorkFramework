package framework.signupstudenttests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.enterapplication.BecomeStudentPage;
import framework.testcase.TestBase;

public class SignUpStudentPageTestSuite extends TestBase {

	@Test
	// TS 1.1
	public void enterSignUpStudentPageView() {
		BecomeStudentPage becomeStudentPage = homePage.clickOnBecomeStudent();
		Assert.assertTrue(becomeStudentPage
				.clickOnSubmitAndCheckWhetherErrorOnSubmitDisplayed());
		Assert.assertTrue(becomeStudentPage.isTelephoneNumberCodeDisplayed());
	}

	@Test
	// TS 1.2
	public void closeSignUpStudentPageView() throws InterruptedException {
		BecomeStudentPage becomeStudentPage = homePage.clickOnBecomeStudent();
		homePage = becomeStudentPage.closeSignUpPage();
		Assert.assertTrue(homePage.isNewsButtonDisplayed(),
				"News button is not displayed");
	}

}
