package framework.pages.navigation.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;

public class BrowseMenu extends Page{

	public BrowseMenu(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement browseCategoriesButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement browseFreelancersButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement browseJobsButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement trendingSkillsButton;
	
	@FindBy(how = How.XPATH, using = "")   
	private WebElement browseHiringResourcesButton;

	
	
	public BrowseCategories clickBrowseCategories(){
		browseCategoriesButton.click();
		return PageFactory.initElements(webDriver, BrowseCategories.class);
	}
	
	public BrowseFreelancers clickBrowseFreelancers(){
		browseFreelancersButton.click();
		return PageFactory.initElements(webDriver, BrowseFreelancers.class);
	}
	
	public BrowseJobs clickBrowseJobs(){
		browseJobsButton.click();
		return PageFactory.initElements(webDriver, BrowseJobs.class);
	}
	
	public TrendingSkills clickTrendingSkills(){
		trendingSkillsButton.click();
		return PageFactory.initElements(webDriver, TrendingSkills.class);
	}
	
	public BrowseHiringResources clickBrowseHiringResources(){
		browseHiringResourcesButton.click();
		return PageFactory.initElements(webDriver, BrowseHiringResources.class);
	}
	
	
}
