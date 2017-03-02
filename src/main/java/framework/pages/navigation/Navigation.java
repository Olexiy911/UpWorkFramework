package framework.pages.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.enterapplication.BecomeFreelancerPage;
import framework.pages.enterapplication.HowItWorksPage;
import framework.pages.enterapplication.LoginPage;
import framework.pages.enterapplication.SignUpPage;
import framework.pages.home.HomePage;
import framework.pages.navigation.browse.BrowseMenu;
import ru.yandex.qatools.allure.annotations.Step;

public class Navigation extends Page {

	
	//TODO FindBy for all elements
	
	@FindBy(how = How.XPATH, using = "//img[@alt='Upwork']")
	private WebElement upWorkButton;
	

	
	@FindBy(how = How.XPATH, using = "//a[text()='Become a Freelancer']")   
	private WebElement browseButton;
	
	@FindBy(how = How.XPATH, using = "//a[text()='How it works']")
	private WebElement howItWorksButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='signup']")
	private WebElement signUpButton;
	
	@FindBy(how = How.CSS, using = "a[class$='header-link-login']")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Become a Freelancer']")   
	private WebElement becomeFreelancerButton;
	
	
	public Navigation (){
		PageFactory.initElements(webDriver, Navigation.class);
	}
	
	
	@Step("Click on UpWork Button")
	public HomePage clickHomePage(){
		upWorkButton.click();
		return PageFactory.initElements(webDriver, HomePage.class);//PageFactory ???
	}
	
	
	
	@Step("Click on Browze Menu")
	public BrowseMenu clickBrowse(){
		browseButton.click();
		return PageFactory.initElements(webDriver, BrowseMenu.class);
	}
	
	
	
	@Step("Click on How It Works")
	public HowItWorksPage clickHowItWorks(){
		howItWorksButton.click();		
		return PageFactory.initElements(webDriver, HowItWorksPage.class);    
	}
	
	
	
	@Step("Click on Sign Up")
	public SignUpPage clickSignUp(){
		signUpButton.click();		
		return PageFactory.initElements(webDriver, SignUpPage.class);
	}
	
	
	
	@Step("Click on Ligin")
	public LoginPage clickLogin(){
		loginButton.click();		
		return PageFactory.initElements(webDriver, LoginPage.class);
	}
	
	
	
	@Step("Click on Become a Freelancer")
	public BecomeFreelancerPage clickBecomeFreelancer(){
		becomeFreelancerButton.click();		
		return PageFactory.initElements(webDriver, BecomeFreelancerPage.class);
	}
	
}
