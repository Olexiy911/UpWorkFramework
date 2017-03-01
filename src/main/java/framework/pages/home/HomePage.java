package framework.pages.home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import framework.pages.Page;
import framework.pages.enterapplication.AccountantsConsultantsPage;
import framework.pages.enterapplication.CustomerServiceAgentsPage;
import framework.pages.enterapplication.DesignersandCreativesPage;
import framework.pages.enterapplication.MobileDevelopersPage;
import framework.pages.enterapplication.SalesMarketingExpertsPage;
import framework.pages.enterapplication.SearchResultPage;
import framework.pages.enterapplication.SeeAllCategoriesPage;
import framework.pages.enterapplication.VirtualAssistantsPage;
import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.enterapplication.WritersPage;
import framework.pages.navigation.search.SearchMenu;
import framework.utility.LogFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends Page {
	
	private static final Logger LOG = LogFactory.getLogger(HomePage.class);

	
	//TODO FindBy all elements
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'search visible-md')]//*[@class='button']")
	private WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'search visible-md')]//*[@name='q']")
	private WebElement searchField;
	
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/developers')]")
	private WebElement webDevelopersButton;

	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/mobile-developers')]")
	private WebElement mobileDevelopersButton;
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/designers')]")
	private WebElement designersandCreativesButton;
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/writing')]")
	private WebElement writersButton;
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/administrative-support')]")
	private WebElement virtualAssistantsButton;
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/customer-service')]")
	private WebElement customerServiceAgentsButton;
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/sales-marketing')]")
	private WebElement salesMarketingExpertsButton;
	
	@FindBy(how = How.XPATH, using = "//main//a[contains(@href,'/accounting-consulting')]")
	private WebElement accountantsConsultantsButton;
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='See All Categories']")
	private WebElement seeAllCategoriesButton;
	
	
	public HomePage() {
		super();
	}
	
	
	/*
	 * Search elements
	 */
	@Step("Click on Search Field Button")
	public SearchMenu clickSearch(){
		searchButton.click();
		return PageFactory.initElements(webDriver, SearchMenu.class);
	}
	
	@Step("Search Field")
	public SearchResultPage search(String search){
		searchField.sendKeys(search);
		searchField.sendKeys(Keys.ENTER);
		return PageFactory.initElements(webDriver, SearchResultPage.class);
	}
	
	
	@Step("Get Search Placeholder")
	public String getSearchPlaceholder(){
		return searchField.getAttribute("placeholder");	
	}
	
	
	public WebDevelopersPage clickWebDevelopers(){
		webDevelopersButton.click();
		return PageFactory.initElements(webDriver, WebDevelopersPage.class);
	}
	
	public MobileDevelopersPage clickMobileDevelopers(){
		mobileDevelopersButton.click();
		return PageFactory.initElements(webDriver, MobileDevelopersPage.class);
	}
	
	public DesignersandCreativesPage clickDesignerandCreatives(){
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
	
	public AccountantsConsultantsPage AccountantsConsultants(){
		accountantsConsultantsButton.click();
		return PageFactory.initElements(webDriver, AccountantsConsultantsPage.class);
	}
	
	
	public SeeAllCategoriesPage SeeAllCategories(){
		seeAllCategoriesButton.click();
		return PageFactory.initElements(webDriver, SeeAllCategoriesPage.class);
	}
}