package framework.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.enterapplication.BecomeFreelancerPage;
import framework.pages.signup.SignUpPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SearchOptions extends Page{

	public SearchOptions() {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='steps']")   
	private WebElement popupWindow;
	
	
	@FindBy(how = How.XPATH, using = "//h2[@class='h2-small m-y-40']")   
	private WebElement searchOptionsTitle;
	
	@FindBy(how = How.XPATH, using = "//p[@class='text-long m-b-40']")   
	private WebElement tellUsText;
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary m-b-80']")
	private WebElement hireForProjectButton;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default m-b-80']")
	private WebElement workAsFreelancerButton;
	
	
	@FindBy(how = How.XPATH, using = "//p[@class='text-center m-b-0']")
	private WebElement wantToText;
	
	@FindBy(how = How.XPATH, using = "//a[@class='font-gotham-medium']")
	private WebElement becomeFreelancerButton;
	
	
	@Step("Is Popup Window opened")
	public boolean isPopupWindow(){
		return popupWindow.isDisplayed();
	}
	
	
	@Step("Is Search Options Title")
	public String getTitle(){
		return searchOptionsTitle.getText();
	}
	
	@Step("Is 'Tell us a little more about your project.' text")
	public String getTellUsText(){
		return tellUsText.getText();
	}
	
	
	@Step("Click on Hire for a Project Button")
	public LetsStartOptions clickHireForProjectButton(){
		hireForProjectButton.click();		
		return PageFactory.initElements(webDriver, LetsStartOptions.class);    
	}

	@Step("Click on Work as a Freelancer Button")
	public SignUpPage clickWorkAsFreelancerButton(){
		workAsFreelancerButton.click();		
		return PageFactory.initElements(webDriver, SignUpPage.class);    
	}
	
	
	@Step("Get 'Want to get hired for projects?' text")      //<--------------------------------------------------
	public String getWantToText(){
		return wantToText.getText();
	}
	
	
	/*@Step("Get 'Want to get hired for projects?' text")      //<--------------------------------------------------
	public String getFreelancerText(){
		return freelancerText.getText();
	}*/
	
	
	@Step("Click on Work as a Freelancer Button")
	public BecomeFreelancerPage clickBecomeFreelancerButton(){
		becomeFreelancerButton.click();		
		return PageFactory.initElements(webDriver, BecomeFreelancerPage.class);    
	}
	
	
}
