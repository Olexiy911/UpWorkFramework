package browsemenu;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.enterapplication.AccountantsConsultantsPage;
import framework.pages.enterapplication.CustomerServiceAgentsPage;
import framework.pages.enterapplication.DesignersandCreativesPage;
import framework.pages.enterapplication.MobileDevelopersPage;
import framework.pages.enterapplication.SalesMarketingExpertsPage;
import framework.pages.enterapplication.ViewAllCategoriesPage;
import framework.pages.enterapplication.VirtualAssistantsPage;
import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.enterapplication.WritersPage;
import framework.pages.navigation.Navigation;
import framework.pages.navigation.browse.BrowseCategories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import testbase.TestBase;

public class BrowseCategoriesTest extends TestBase{

	@Test
	@TestCaseId("100006407850172")
	@Title("Web Developers Test")
	public void webDevelopersTest() {
		new Navigation().clickBrowse();
		
		new BrowseCategories().clickWebDevelopers();
	
		WebDevelopersPage webdevelopers = new WebDevelopersPage();
		Assert.assertTrue(webdevelopers.isWebDevelopersPage(), "Is Displayed Web Developers Title");
		webdevelopers.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Mobile Developers Test")
	public void mobileDevelopersTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickMobileDevelopers();
	
		MobileDevelopersPage mobiledevelopers = new MobileDevelopersPage();
		Assert.assertTrue(mobiledevelopers.isMobileDevelopersPage(), "Is Displayed Mobile Developers Title");
		mobiledevelopers.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Designers and Creatives Test")
	public void designersandCreativesTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickDesignersandCreatives();
	
		DesignersandCreativesPage designersandcreatives = new DesignersandCreativesPage();
		Assert.assertTrue(designersandcreatives.isDesignersandCreativesPage(), "Is Displayed Designers and Creatives Title");
		designersandcreatives.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Writers Test")
	public void writersTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickWriters();
	
		WritersPage writers = new WritersPage();
		Assert.assertTrue(writers.isWritersPage(), "Is Displayed Writers Title");
		writers.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Virtual Assistants Test")
	public void virtualAssistantsTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickVirtualAssistants();
	
		VirtualAssistantsPage virtualassistants = new VirtualAssistantsPage();
		Assert.assertTrue(virtualassistants.isVirtualAssistantsPage(), "Is Displayed Virtual Assistants Title");
		virtualassistants.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Customer Service Agents Test")
	public void customerServiceAgentsTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickCustomerServiceAgents();
	
		CustomerServiceAgentsPage customerserviceagents = new CustomerServiceAgentsPage();
		Assert.assertTrue(customerserviceagents.isCustomerServiceAgents(), "Is Displayed Customer Service Agents Title");
		customerserviceagents.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Sales Marketing Experts Test")
	public void salesMarketingExpertsTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickSalesMarketingExperts();
	
		SalesMarketingExpertsPage salesmarketingexperts = new SalesMarketingExpertsPage();
		Assert.assertTrue(salesmarketingexperts.isSalesMarketingExperts(), "Is Displayed Sales Marketing Experts Title");
		salesmarketingexperts.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("Accountants Consultants Test")
	public void accountantsConsultantsTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickAccountantsConsultants();
	
		AccountantsConsultantsPage accountantsconsultants = new AccountantsConsultantsPage();
		Assert.assertTrue(accountantsconsultants.isAccountantsConsultants(), "Is Displayed Accountants Consultants Title");
		accountantsconsultants.clickHome();
	}
	
	@Test
	@TestCaseId("100006407850172")
	@Title("View All Categories Test")
	public void viewAllCategoriesTest() {
		new Navigation().clickBrowse();
		new BrowseCategories().clickViewAllCategories();
	
		ViewAllCategoriesPage viewallcategories = new ViewAllCategoriesPage();
		Assert.assertTrue(viewallcategories.isViewAllCategoriesPage(), "Is Displayed View All Categories Title");
		viewallcategories.clickHome();
	}
}
