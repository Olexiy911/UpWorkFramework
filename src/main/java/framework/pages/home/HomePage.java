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
import framework.pages.enterapplication.SeeAllCategoriesPage;
import framework.pages.enterapplication.VirtualAssistantsPage;
import framework.pages.enterapplication.WebDevelopersPage;
import framework.pages.enterapplication.WritersPage;
import framework.utility.LogFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends Page {
	
	public HomePage() {
		PageFactory.initElements(webDriver, this);
	}
	
	
	private static final Logger LOG = LogFactory.getLogger(HomePage.class);

	
	//TODO FindBy all elements
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'row')]//input")           //<-----
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
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'pricing-title')]/p")
	private WebElement pricingTitle;
	
	
	@Step("Search Field")
	public SearchOptions clickSearchField(){
		searchField.sendKeys("QA");
		searchField.sendKeys(Keys.ENTER);
		return PageFactory.initElements(webDriver, SearchOptions.class);
	}
	
	
	@Step("Click on Web Developers Button")
	public WebDevelopersPage clickWebDevelopers(){
		webDevelopersButton.click();
		return PageFactory.initElements(webDriver, WebDevelopersPage.class);
	}
	
	@Step("Click on Mobile Developers Button")
	public MobileDevelopersPage clickMobileDevelopers(){
		mobileDevelopersButton.click();
		return PageFactory.initElements(webDriver, MobileDevelopersPage.class);
	}
	
	@Step("Click on Designers and Creatives Button")
	public DesignersandCreativesPage clickDesignerandCreatives(){
		designersandCreativesButton.click();
		return PageFactory.initElements(webDriver, DesignersandCreativesPage.class);
	}
	
	@Step("Click on Writers Button")
	public WritersPage clickWriters(){
		writersButton.click();
		return PageFactory.initElements(webDriver, WritersPage.class);
	}
	
	@Step("Click on Virtual Assistants Button")
	public VirtualAssistantsPage clickVirtualAssistants(){
		virtualAssistantsButton.click();
		return PageFactory.initElements(webDriver, VirtualAssistantsPage.class);
	}
	
	@Step("Click on Customer Service Agents Button")
	public CustomerServiceAgentsPage clickCustomerServiceAgents(){
		customerServiceAgentsButton.click();
		return PageFactory.initElements(webDriver, CustomerServiceAgentsPage.class);
	}

	@Step("Click on Sales Marketing Experts Button")
	public SalesMarketingExpertsPage clickSalesMarketingExperts(){
		salesMarketingExpertsButton.click();
		return PageFactory.initElements(webDriver, SalesMarketingExpertsPage.class);
	}
	
	@Step("Click on Accountants Consultants Button")
	public AccountantsConsultantsPage AccountantsConsultants(){
		accountantsConsultantsButton.click();
		return PageFactory.initElements(webDriver, AccountantsConsultantsPage.class);
	}
	
	@Step("Click on See All Categories Button")
	public SeeAllCategoriesPage SeeAllCategories(){
		seeAllCategoriesButton.click();
		return PageFactory.initElements(webDriver, SeeAllCategoriesPage.class);
	}
	
	@Step("Click Pricing Title")     //<--------------------------------------------------
	public String getPricingTitle(){
		return pricingTitle.getText();
	}
	
}