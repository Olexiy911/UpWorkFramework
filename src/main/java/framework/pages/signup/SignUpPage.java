package framework.pages.signup;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import enteties.User;
import framework.pages.Page;
import framework.pages.enterapplication.LoginPage;
import framework.pages.home.LetsStartOptions;
import framework.utility.LogFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class SignUpPage extends Page {

	private static final Logger LOG = LogFactory.getLogger(SignUpPage.class);
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/login')]")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//hgroup[@class='text-center']")
	private WebElement signUpPageTitle;
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='select2-choice ui-select-match ng-scope']")
	private WebElement username;
	
	@FindBy(how = How.XPATH, using = "//a[@class='select2-choice ui-select-match ng-scope']")
	private WebElement usersurname;
	
	@FindBy(how = How.XPATH, using = "//a[@class='select2-choice ui-select-match ng-scope']")
	private WebElement useremail;
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='select2-choice ui-select-match ng-scope']")
	private WebElement clickGetStartedButton;
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='select2-choice ui-select-match ng-scope']")
	private WebElement clickCountriesButton;
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='select2-choice ui-select-match ng-scope']")
	private List<WebElement> selectCountries;
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/employer')]")
	private WebElement hirePageButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/contractor')]")
	private WebElement workPageButton;
	
	
	
	
	@Step("Click on Log in")
	public LoginPage Login(){
		loginButton.click();
		return PageFactory.initElements(webDriver, LoginPage.class);
	}
	
	
	@Step("Is Sign Up Page opened")
	public boolean isSignUpPage(){
		return signUpPageTitle.isDisplayed();
	}
	
	
	@Step("Set user Name")
	public SignUpPage setName(User user){
		username.sendKeys(user.getName());
		return this;
	}
	
	@Step("Set user Surname")
	public SignUpPage setSurname(User user){
		usersurname.sendKeys(user.getSurname());
		return this;
	}
	
	@Step("Set user Email")
	public SignUpPage setEmail(User user){
		useremail.sendKeys(user.getEmail());
		return this;
	}
	
	
	@Step("Click on Get Started Button")
	public SignUpPage clickGetStarted(){
		clickGetStartedButton.click();
		return PageFactory.initElements(webDriver, SignUpPage.class);
	}
	
	
	@Step("Select Countries")
	public SignUpPage selectCountries(String countrieName){
		HashMap<String,WebElement> countriesname = new HashMap<String,WebElement>();
		for(WebElement element:selectCountries){
			countriesname.put(element.findElement(By.tagName("li")).getText().trim(), element.findElement(By.tagName("li")));
		}
		countriesname.get(countrieName).click();
		return this;
	}
	
	
	@Step("Click on Countries")
	public SignUpPage clickCountries(){
		clickCountriesButton.click();
		return PageFactory.initElements(webDriver, SignUpPage.class);
	}
	
	
	
	@Step("Click on Hire")
	public CreateHireAccountPage clickHire(){
		hirePageButton.click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
	
	@Step("Click on Work")
	public SignUpPage clickWork(){
		workPageButton.click();
		return PageFactory.initElements(webDriver, SignUpPage.class);
	}
	
}
