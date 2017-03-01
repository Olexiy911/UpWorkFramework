package framework.pages.enterapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import enteties.User;
import framework.pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class ForgotPasswordPage extends Page{
	
	@FindBy(how = How.XPATH, using = "//*[@id='login']")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//*[@id='main']/header")
	private WebElement forgotPasswordPageTitle;
	
	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	private WebElement emailAddress;
	
	@FindBy(how = How.XPATH, using = "//*[@id='submit']")
	private WebElement retrievePasswordButton;
	
	
	public ForgotPasswordPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Step("Click on Log in")
	public LoginPage Login(){
		loginButton.click();
		return PageFactory.initElements(webDriver, LoginPage.class);
	}
	
	
	@Step("Is Forgot Password opened")
	public boolean isForgotPasswordPage(){
		return forgotPasswordPageTitle.isDisplayed();
	}
	
	
	@Step("Set user name")								//<-----------------------------
	public ForgotPasswordPage setEmail(User email){
		emailAddress.sendKeys(email.getEmail());
		return this;
	}
	
	@Step("Click on Retrieve Password")
	public ForgotPasswordPage clickRetrievePassword(){
		retrievePasswordButton.click();
		return PageFactory.initElements(webDriver, ForgotPasswordPage.class);
	}

}
