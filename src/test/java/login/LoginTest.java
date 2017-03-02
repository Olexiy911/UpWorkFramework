package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import enteties.User;
import enteties.UserRepo;
import framework.pages.home.UserHomePage;
import framework.pages.navigation.Navigation;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class LoginTest extends TestBase {

	@Test
	@Title("Login Test")
	public void LoginTest() {
		User user = new UserRepo().getValidUser();
		UserHomePage page = new Navigation().clickLogin().setName(user).setPassword(user).clickLogin();
		Assert.assertEquals(page.getUserName(), user.getSurName());
	}
}
