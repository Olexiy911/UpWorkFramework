package framework.pages.navigation.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.Step;

public class SearchMenu extends Page{

	public SearchMenu(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'search visible-md')]//label[@for='search-freelancers']")   
	private WebElement findFreelancersButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'search visible-md')]//label[@for='search-jobs']")   
	private WebElement findJobsButton;

	
	@Step("Click on Find Freelancers")
	public HomePage clickFindFreelancers(){
		findFreelancersButton.click();
		return PageFactory.initElements(webDriver, HomePage.class);
	}
	
	@Step("Click on Find Jobs")
	public HomePage clickFindJobs(){
		findJobsButton.click();
		return PageFactory.initElements(webDriver, HomePage.class);
	}

}
