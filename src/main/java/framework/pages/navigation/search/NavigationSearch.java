package framework.pages.navigation.search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class NavigationSearch extends Page{

	public NavigationSearch() {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'search visible-md')]//*[@class='button']")   
	private WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'active')]//label[@for='search-freelancers']")   
	private WebElement findFreelancerButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'active')]//label[@for='search-jobs']")   
	private WebElement findJobsButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'container')]//input[@name='q']")   
	private WebElement searchField;
	
	
	@Step("Get Search Placeholder")
	public String getSearchPlaceholder(){
		return searchField.getAttribute("placeholder");	
	}
	
	
	@Step("Click on Search Field Button")
	public NavigationSearch clickSearchButton(){
		searchButton.click();
		return PageFactory.initElements(webDriver, NavigationSearch.class);
	}
	
	@Step("Find Freelancer Button on Freelancer Search in Navigation")										
	public NavigationSearch clickFindFreelancer(){
		findFreelancerButton.click();
		return PageFactory.initElements(webDriver, NavigationSearch.class);
	}
	
	@Step("Find Jobs Button on Freelancer Search in Navigation")										
	public NavigationSearch clickFindJobs(){
		findJobsButton.click();
		return PageFactory.initElements(webDriver, NavigationSearch.class);
	}
	
	
	
	@Step("Click on Search Field")										
	public NavigationSearch clickSearchField(){
		searchField.click();
		return PageFactory.initElements(webDriver, NavigationSearch.class);
	}

	
	@Step("Set Value and Click on Search Field")                                     	
	public NavigationSearch sendFreelancerSearch(String search){
		searchField.sendKeys(search);
		searchField.sendKeys(Keys.ENTER);
		return PageFactory.initElements(webDriver, NavigationSearch.class);
	}
	
}
