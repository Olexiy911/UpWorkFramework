package signup;

import org.testng.Assert;
import org.testng.annotations.Test;

import enteties.User;
import enteties.UserRepo;
import framework.pages.navigation.Navigation;
import framework.pages.signup.CreateHireAccountPage;
import framework.pages.signup.SignUpPage;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;


public class SignUpTest extends TestBase{

	
	@Test
	@TestCaseId("100006407850172")
	@Title("Sign Up Test")
	public void loginTest() {
		User seconduser = new UserRepo().getValidSecondUser();
		SignUpPage page = new Navigation().clickSignUp();
		//Assert.assertTrue(new SignUpPage().isSignUpPage(), "Is Sign Up Page Displayed");
		page.clickHire().clickIndividualSignUp();
		
	/*	new CreateHireAccountPage().setName(seconduser)
				.setSurname(seconduser).setEmail(seconduser).setPassword(seconduser)
				.clickPrivacyPolicy().clickGetStarted();*/
	}

}
