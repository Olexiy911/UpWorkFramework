package navigation;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.enterapplication.BecomeFreelancerPage;
import framework.pages.enterapplication.HowItWorksPage;
//import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.navigation.Navigation;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class NavigationTest extends TestBase{

	@Test
	@TestCaseId("100006407850172")
	@Title("How it Works Test")
	public void howItWorksTest() {
		HowItWorksPage page = new Navigation().clickHowItWorks();
		Assert.assertTrue(page.isHowItWorksPage(), "Is Displayed How It Works Title");
		page.clickHome();
	}
	
	/*
	@Test
	@TestCaseId("100006407850172")
	@Title("Web Developers Test")
	public void browseTest() {
		new Navigation().clickBrowse().clickBrowseCategories().clickWebDevelopers();  //<-----------------------
		
		WebDevelopersPage webpage = new WebDevelopersPage();
		Assert.assertTrue(webpage.isWebDevelopersPage(), "Is Displayed Web Developers Title");
		webpage.clickHome();
	}*/
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Become Freelancer Test")
	public void becomeFreelancerTest() {
		BecomeFreelancerPage page = new Navigation().clickBecomeFreelancer();
		Assert.assertTrue(page.isBecomeFreelancerPage(), "Is Displayed Become Freelancer Title");
		page.clickHome();
	}
}
