package framework.pages.navigation.browse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.enterapplication.DataScienceAnalyticsPage;
import framework.pages.enterapplication.EngineeringArchitecturePage;
import framework.pages.enterapplication.ItNetworkingPage;
import framework.pages.enterapplication.WebMobileSoftwareDevPage;

public class BrowseFreelancers extends Page{


	@FindBy(how = How.XPATH, using = "")   
	private WebElement browseCategoriesButton;

	@FindBy(how = How.XPATH, using = "")   
	private WebElement itNetworkingButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement dataScienceAnalyticsButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement engineeringArchitectureButton;
	
	
	
	public WebMobileSoftwareDevPage clickBrowseCategories(){
		browseCategoriesButton.click();
		return PageFactory.initElements(webDriver, WebMobileSoftwareDevPage.class);
	}
	
	public ItNetworkingPage clickItNetworking(){
		itNetworkingButton.click();
		return PageFactory.initElements(webDriver, ItNetworkingPage.class);
	}

	public DataScienceAnalyticsPage clickDataScienceAnalytics(){
		dataScienceAnalyticsButton.click();
		return PageFactory.initElements(webDriver, DataScienceAnalyticsPage.class);
	}
	
	public EngineeringArchitecturePage clickEngineeringArchitecture(){
		engineeringArchitectureButton.click();
		return PageFactory.initElements(webDriver, EngineeringArchitecturePage.class);
	}
}
