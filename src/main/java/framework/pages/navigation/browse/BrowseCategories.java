package framework.pages.navigation.browse;

import org.openqa.selenium.WebDriver;
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

public class BrowseCategories extends Page{

	public BrowseCategories(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "")   
	private WebElement webDevelopersButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement mobileDevelopersButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement designersandCreativesButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement writersButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement virtualAssistantsButton;

	@FindBy(how = How.XPATH, using = "")   
	private WebElement customerServiceAgentsButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement salesMarketingExpertsButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement accountantsConsultantsButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement viewAllCategoriesButton;
	
	
	
	public WebDevelopersPage clickWebDevelopers(){
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
