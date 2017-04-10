package framework.pages.navigation.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.Step;

public class FreelancerPage extends Page{
	
	public FreelancerPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='oSearchContractorsHeader']")   
	private WebElement freelancerTitle;
	
	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand']")
	private WebElement upWorkButton;

	
	@Step("Is Freelancer Search Page opened")
	public boolean isFreelancerPage() {
		return freelancerTitle.isDisplayed();
	}
	
	@Step("Click on UpWork")
	public HomePage clickHome(){
		upWorkButton.click();		
		return PageFactory.initElements(webDriver, HomePage.class);    
	}
}
