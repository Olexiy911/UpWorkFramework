package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import enteties.User;
import enteties.UserRepo;
import framework.pages.home.HomePage;
import framework.pages.home.UserHomePage;
import framework.pages.navigation.Navigation;
import ru.yandex.qatools.allure.annotations.Issue;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;


public class LoginTest extends TestBase {
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Login Test")
	public void loginTest()  {
		User user = new UserRepo().getValidUser();
		UserHomePage page = new Navigation().clickLogin().setName(user).setPassword(user).clickLogin();
		Assert.assertEquals(page.getUserName(),user.getName()+" "+user.getSurname());
	}
	
	@Test
	@TestCaseId("renata.pereira.982")
	@Issue("autotestinfo")
	@Title("Sign Up button test")
	public void signUpButtonTest() {
		new HomePage().scroll();
		Assert.assertFalse(new Navigation().isSignUp(), "Sign Up button wasn't at Home Page");
	}
	
	@Test
	@TestCaseId("alex.wallpaper")
	@Title("Login button test")
	public void loginButtonTest() {
		Assert.assertTrue(new Navigation().isLogin(), "Login button wasn't at Home Page");
	}
}
