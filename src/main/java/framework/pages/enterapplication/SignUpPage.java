package framework.pages.enterapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
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
	
	
	public SignUpPage() {
		  super();
		 }
	
	
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
	public HirePage Hire(){
		hirePageButton.click();
		return PageFactory.initElements(webDriver, HirePage.class);
	}
	
	@Step("Click on Work")
	public WorkPage Work(){
		workPageButton.click();
		return PageFactory.initElements(webDriver, WorkPage.class);
	}
	
}
