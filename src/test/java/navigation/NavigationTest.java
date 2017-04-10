package navigation;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.enterapplication.BecomeFreelancerPage;
import framework.pages.enterapplication.HowItWorksPage;
import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.navigation.Navigation;
import framework.pages.navigation.browse.BrowseCategories;
import framework.pages.navigation.search.FreelancerPage;
import framework.pages.navigation.search.JobsPage;
import framework.pages.navigation.search.NavigationSearch;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class NavigationTest extends TestBase{
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Web Developers Test")
	public void browseTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickWebDevelopers();
	
		WebDevelopersPage webpage = new WebDevelopersPage();
		Assert.assertTrue(webpage.isWebDevelopersPage(), "Is Displayed Web Developers Title");
		webpage.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Freelancer Search Test")
	public void freelancerTest() {
		new NavigationSearch().clickSearchButton().clickFindFreelancer().clickSearchField().sendFreelancerSearch("QA");
		FreelancerPage freelancerpage = new FreelancerPage();
		Assert.assertTrue(freelancerpage.isFreelancerPage(), "Is Displayed Freelancer Title");
		freelancerpage.clickHome();
	}	
	
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Jobs Search Test")
	public void jobsTest() {
		new NavigationSearch().clickSearchButton().clickFindJobs().clickSearchField().sendFreelancerSearch("QA");
		JobsPage jobspage = new JobsPage();
		Assert.assertTrue(jobspage.isJobsPage(), "Is Displayed Jobs Title");
		jobspage.clickHome();
	}
	
	
	@Test
	@TestCaseId("100006407850172")
	@Title("How it Works Test")
	public void howItWorksTest() {
		HowItWorksPage page = new Navigation().clickHowItWorks();
		Assert.assertTrue(page.isHowItWorksPage(), "Is Displayed How It Works Title");
		page.clickHome();
	}
	
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Become Freelancer Test")
	public void becomeFreelancerTest() {
		BecomeFreelancerPage page = new Navigation().clickBecomeFreelancer();
		Assert.assertTrue(page.isBecomeFreelancerPage(), "Is Displayed Become Freelancer Title");
		page.clickHome();
	}
}
