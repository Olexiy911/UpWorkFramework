package login;

import org.junit.Test;

import enteties.User;
import enteties.UserRepo;
import framework.pages.navigation.Navigation;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class LoginTest extends TestBase {

	@Test
	@Title("Login Test")
	public void LoginTest() {
		User user = new UserRepo().getValidUser();
		new Navigation().clickLogin().setName(user).setPassword(user).clickLogin();
	}
}
