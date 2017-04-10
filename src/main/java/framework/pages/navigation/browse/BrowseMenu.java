package framework.pages.navigation.browse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;

public class BrowseMenu extends Page{

	
	@FindBy(how = How.XPATH, using = "//li[1][contains(@class,'tile')]//a[@class='tile-title font-gotham-bold ng-scope']")   
	private WebElement browseCategoriesButton;
	
	@FindBy(how = How.XPATH, using = "//li[2][contains(@class,'tile')]//a[@class='tile-title font-gotham-bold ng-scope']")   
	private WebElement browseFreelancersButton;
	
	@FindBy(how = How.XPATH, using = "//li[3][contains(@class,'tile')]//a[@class='tile-title font-gotham-bold ng-scope']")   
	private WebElement browseJobsButton;
	
	@FindBy(how = How.XPATH, using = "//li[4][contains(@class,'tile')]//a[@class='tile-title font-gotham-bold ng-scope']")   
	private WebElement trendingSkillsButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/hiring')]")   
	private WebElement browseHiringResourcesButton;

	
	public BrowseMenu(){
		PageFactory.initElements(webDriver, this);
	}
	
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
