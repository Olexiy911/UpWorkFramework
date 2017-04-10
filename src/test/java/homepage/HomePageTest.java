package homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class HomePageTest extends TestBase{

	@Test
	@TestCaseId("100006407850172")
	@Title("Pricing Title Test")
	public void pricingTitleTest() {
		String expectedmsg = "Each option includes access to Upwork's large pool of top-quality freelancers.";
		String currentmsg = new HomePage().getPricingTitle();
		Assert.assertTrue(currentmsg.contains(expectedmsg),
				String.format("Expected value %s, but curent value %s", expectedmsg, currentmsg));
		
	}
}
