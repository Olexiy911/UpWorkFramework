package invalid.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import enteties.User;
import enteties.UserRepo;
import framework.pages.enterapplication.LoginPage;
//import framework.pages.home.UserHomePage;
import framework.pages.navigation.Navigation;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class InvalidLoginTest extends TestBase{

	@Test
	@TestCaseId("100006407850172")
	@Title("Error information")
	public void invalidLoginTest()  {
		User invaliduser = new UserRepo().getInValidUser();
		new Navigation().clickLogin().setName(invaliduser).setPassword(invaliduser).clickLogin();
		Assert.assertTrue(new LoginPage().isErrorInformation(), "Error information is displayed!");
	}
}
