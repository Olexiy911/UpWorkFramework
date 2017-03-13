package framework.pages.signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import enteties.User;
import framework.pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class CreateHireAccountPage extends Page {

	@FindBy(how = How.XPATH, using = "//h1[1]")
	private WebElement hireAccountPageTitle;
	
	@FindBy(how = How.XPATH, using = "//ul[contains(@class,'nav')]/li[@class='active']")
	private WebElement individualSignUpButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='firstName_84441']")
	private WebElement username;
	
	@FindBy(how = How.XPATH, using = "//*[@id='lastName_84315']")
	private WebElement usersurname;
	
	@FindBy(how = How.XPATH, using = "//*[@id='email_31155']")
	private WebElement useremail;
	
	@FindBy(how = How.XPATH, using = "//*[@id='password_36733']")
	private WebElement userpassword;
	
	@FindBy(how = How.XPATH, using = "//label[contains(@for,'termsAccepted')]/span[@class='checkbox-replacement-helper']")
	private WebElement privacyPolicy;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement getStartedButton;
	
	
	public CreateHireAccountPage (){
		PageFactory.initElements(webDriver, this);
	}
	
	
	@Step("Is Hire Account Page opened")
	public boolean isCreateHireAccountPage(){
		return hireAccountPageTitle.isDisplayed();
	}
	
	@Step("Click on Get Started")
	public CreateHireAccountPage clickIndividualSignUp(){
		individualSignUpButton.click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
	
	@Step("Set user Name")
	public CreateHireAccountPage setName(User user){
		username.sendKeys(user.getInvalidName());
		return this;
	}
	
	@Step("Set user Surname")
	public CreateHireAccountPage setSurname(User user){
		usersurname.sendKeys(user.getInvalidSurname());
		return this;
	}
	
	@Step("Set user Email")
	public CreateHireAccountPage setEmail(User user){
		useremail.sendKeys(user.getInvalidEmail());
		return this;
	}
	
	@Step("Set user Password")
	public CreateHireAccountPage setPassword(User user){
		userpassword.sendKeys(user.getInvalidPassword());
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
