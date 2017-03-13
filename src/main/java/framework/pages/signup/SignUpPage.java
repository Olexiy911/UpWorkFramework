package framework.pages.signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.enterapplication.LoginPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SignUpPage extends Page {
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'/login')]")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//hgroup[@class='text-center']")
	private WebElement signUpPageTitle;
	
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
	
	
	@Step("Click on Hire")
	public CreateHireAccountPage clickHire(){
		hirePageButton.click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
	
	@Step("Click on Work")
	public CreateWorkAccountPage clickWork(){
		workPageButton.click();
		return PageFactory.initElements(webDriver, CreateWorkAccountPage.class);
	}
	
}
