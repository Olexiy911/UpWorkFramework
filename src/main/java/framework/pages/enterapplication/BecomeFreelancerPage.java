package framework.pages.enterapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.Step;

public class BecomeFreelancerPage extends Page{

	@FindBy(how = How.XPATH, using = "//span[text()='Create a Free Freelancer Account']")   
	private WebElement becomeFreelanserTitle;
	
	@FindBy(how = How.XPATH, using = "//a[@class='navbar-brand']")
	private WebElement upWorkButton;

	public boolean isBecomeFreelancerPage() {
		return becomeFreelanserTitle.isDisplayed();
	}

	@Step("Click on UpWork")
	public HomePage clickHome(){
		upWorkButton.click();		
		return PageFactory.initElements(webDriver, HomePage.class);    
	}

}
