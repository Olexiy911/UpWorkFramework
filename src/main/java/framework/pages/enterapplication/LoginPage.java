package framework.pages.enterapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import enteties.User;
import framework.pages.Page;
import framework.pages.home.UserHomePage;
import framework.pages.signup.SignUpPage;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage extends Page {
	
	@FindBy(how = How.XPATH, using = "//h1[1]")
	private WebElement loginPageTitle;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login_username']")
	private WebElement userNameField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login_password']")
	private WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'hidden')]/button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//*[@class='checkbox-replacement-helper']")
	private WebElement rememberCheckBox;
	

	@FindBy(how = How.XPATH, using = "//a[text()='Sign up']")
	private WebElement signUpButton;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'hidden')]/a[text()='Forgot password?']")
	private WebElement forgotPassword;
	
	
	
	@Step("Is Login Page opened")
	public boolean isLoginPage(){
		return loginPageTitle.isDisplayed();
	}
	
	@Step("Set user name")
	public LoginPage setName(User user){
		userNameField.sendKeys(user.getName());
		return this;
	}
	
	@Step("Set user pass")
	public LoginPage setPassword(User user){
		passwordField.sendKeys(user.getPassword());
		return this;
	}
	
	@Step("Click on Login Button")
	public UserHomePage clickLogin(){
		loginButton.click();
		return PageFactory.initElements(webDriver, UserHomePage.class);
	}
	
	
	@Step("Click on Sign Up Button")
	public SignUpPage clickSignUpPage(){
		signUpButton.click();
		return PageFactory.initElements(webDriver, SignUpPage.class);
	}
	
	@Step("Click on Sign Up Button")
	public ForgotPasswordPage clickForgotPasswordPage(){
		forgotPassword.click();
		return PageFactory.initElements(webDriver, ForgotPasswordPage.class);
	}
}
