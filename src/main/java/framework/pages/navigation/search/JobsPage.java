package framework.pages.navigation.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.Step;

public class JobsPage extends Page{
	
	public JobsPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='search-status break']")   
	private WebElement jobsTitle;
	
	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand']")
	private WebElement upWorkButton;
	
	@Step("Is Freelancer Search Page opened")
	public boolean isJobsPage() {
		return jobsTitle.isDisplayed();
	}
	
	@Step("Click on UpWork")
	public HomePage clickHome(){
		upWorkButton.click();		
		return PageFactory.initElements(webDriver, HomePage.class);    
	}

}
