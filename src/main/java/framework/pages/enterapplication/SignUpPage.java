package framework.pages.enterapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class SignUpPage extends Page {
	
	@FindBy(how = How.XPATH, using = "//*[@class='col-md-5'][2]/a")
	private WebElement loginButton;
	
	
	
	@FindBy(how = How.XPATH, using = "//h1[1][@class='m-xs-top-bottom']")
	private WebElement signUpPageTitle;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='col-md-5'][1]/a")
	private WebElement hirePageButton;
	
	@FindBy(how = How.XPATH, using = "//*[@class='col-md-5'][2]/a")
	private WebElement workPageButton;
	
	
	public SignUpPage(WebDriver webDriver) {
		  super(webDriver);
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
