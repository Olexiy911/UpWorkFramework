package framework.pages.navigation.browse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.enterapplication.AccountantsConsultantsPage;
import framework.pages.enterapplication.CustomerServiceAgentsPage;
import framework.pages.enterapplication.DesignersandCreativesPage;
import framework.pages.enterapplication.MobileDevelopersPage;
import framework.pages.enterapplication.SalesMarketingExpertsPage;
import framework.pages.enterapplication.ViewAllCategoriesPage;
import framework.pages.enterapplication.VirtualAssistantsPage;
import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.enterapplication.WritersPage;
import framework.utility.AutomationWait;

public class BrowseCategories extends Page{

	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/developers')]")   
	private WebElement webDevelopersButton;

	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/mobile-developers')]")   
	private WebElement mobileDevelopersButton;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/designers')]")   
	private WebElement designersandCreativesButton;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/writing')]")   
	private WebElement writersButton;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/administrative-support')]")   
	private WebElement virtualAssistantsButton;

	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/customer-service')]")   
	private WebElement customerServiceAgentsButton;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/sales-marketing')]")   
	private WebElement salesMarketingExpertsButton;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/accounting-consulting')]")   
	private WebElement accountantsConsultantsButton;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tile active']//a[contains(@href,'/freelancer-categories')]")   
	private WebElement viewAllCategoriesButton;
	
	public BrowseCategories(){
		PageFactory.initElements(webDriver, this);
	}
	
	
	
	
	public WebDevelopersPage clickWebDevelopers(){
		webDevelopersButton = AutomationWait.waitForElementClickable(5000, webDevelopersButton);
		webDevelopersButton.click();
		return PageFactory.initElements(webDriver, WebDevelopersPage.class);
	}
	
	public MobileDevelopersPage clickMobileDevelopers(){
		mobileDevelopersButton.click();
		return PageFactory.initElements(webDriver, MobileDevelopersPage.class);
	}
	
	public DesignersandCreativesPage clickDesignersandCreatives(){
		designersandCreativesButton.click();
		return PageFactory.initElements(webDriver, DesignersandCreativesPage.class);
	}
	
	public WritersPage clickWriters(){
		writersButton.click();
		return PageFactory.initElements(webDriver, WritersPage.class);
	}
	
	public VirtualAssistantsPage clickVirtualAssistants(){
		virtualAssistantsButton.click();
		return PageFactory.initElements(webDriver, VirtualAssistantsPage.class);
	}
	
	public CustomerServiceAgentsPage clickCustomerServiceAgents(){
		customerServiceAgentsButton.click();
		return PageFactory.initElements(webDriver, CustomerServiceAgentsPage.class);
	}
	
	public SalesMarketingExpertsPage clickSalesMarketingExperts(){
		salesMarketingExpertsButton.click();
		return PageFactory.initElements(webDriver, SalesMarketingExpertsPage.class);
	}
	
	public AccountantsConsultantsPage clickAccountantsConsultants(){
		accountantsConsultantsButton.click();
		return PageFactory.initElements(webDriver, AccountantsConsultantsPage.class);
	}
	
	public ViewAllCategoriesPage clickViewAllCategories(){
		viewAllCategoriesButton.click();
		return PageFactory.initElements(webDriver, ViewAllCategoriesPage.class);
	}
}
