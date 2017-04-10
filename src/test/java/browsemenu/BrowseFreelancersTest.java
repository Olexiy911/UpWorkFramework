package browsemenu;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.navigation.Navigation;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class BrowseFreelancersTest extends TestBase{

	@Test
	@TestCaseId("100006407850172")
	@Title("Web Developers Test")
	public void browseFreelancersTest() {
		new Navigation().clickBrowse();
		//new BrowseFreelancers().clickWebDevelopers();
	
		WebDevelopersPage webpage = new WebDevelopersPage();
		Assert.assertTrue(webpage.isWebDevelopersPage(), "Is Displayed Web Developers Title");
		webpage.clickHome();
	}
}
