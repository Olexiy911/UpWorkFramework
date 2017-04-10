package homepage;

import org.testng.annotations.Test;

import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class SearchFieldTest extends TestBase{

	@Test
	@TestCaseId("100006407850172")
	@Title("Web Developers Test")
	public void searchsdTest() {
		
		new HomePage().clickSearchField();
		
	
		/*WebDevelopersPage webpage = new WebDevelopersPage();
		Assert.assertTrue(webpage.isWebDevelopersPage(), "Is Displayed Web Developers Title");
		webpage.clickHome();*/
	}
}
