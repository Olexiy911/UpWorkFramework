package framework.pages.signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import enteties.User;
import framework.pages.Page;
import framework.utility.AutomationWait;
import framework.utility.LogFactory;
import framework.utility.WebDriverListener;
import ru.yandex.qatools.allure.annotations.Step;

public class CreateHireAccountPage extends Page {

	private static final Logger LOG = LogFactory.getLogger(CreateHireAccountPage.class);
	
	@FindBy(how = How.XPATH, using = "//h1[1]")
	private WebElement hireAccountPageTitle;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@data-ng-click,'individual')]")
	 private WebElement individualSignUpButton;
	 
	@FindBy(how = How.XPATH, using = "//a[contains(@data-ng-click,'company')]")
	private WebElement companySignUpButton;
	
	
	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement userpassword;
	
	@FindBy(how = How.XPATH, using = "//label[contains(@for,'termsAccepted')]/span[@class='checkbox-replacement-helper']")
	private WebElement privacyPolicy;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement getStartedButton;
	
	
	public CreateHireAccountPage (){
		if (new CapturePage().isCapture()){
			new CapturePage().clickCapture(); 
		}
		PageFactory.initElements(webDriver, this);
	}
	
	
	@Step("Is Hire Account Page opened")
	public boolean isCreateHireAccountPage(){
		return hireAccountPageTitle.isDisplayed();
	}
	
	@Step("Click on Individual Sign Up")
	public CreateHireAccountPage clickIndividualSignUp(){
		individualSignUpButton.click();
		AutomationWait.wait(5000);
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
	
	@Step("Click on Company Sign Up")
	public CreateHireAccountPage clickCompanySignUp(){
		companySignUpButton.click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
	

	
	@Step("Set user Password")
	public CreateHireAccountPage setPassword(User user){
		userpassword.sendKeys(user.getPassword());
		return this;
	}
	
	@Step("Click on Privacy Policy")
	public CreateHireAccountPage clickPrivacyPolicy(){
		privacyPolicy.click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
	
	@Step("Click on Get Started")
	public CreateHireAccountPage clickGetStarted(){
		getStartedButton.click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
}
