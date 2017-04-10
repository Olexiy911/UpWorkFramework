package framework.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.pages.Page;
import ru.yandex.qatools.allure.annotations.Step;

public class UserHomePage extends Page{

	@FindBy(how = How.XPATH, using = "//span[@class='organization-selector']")
	private WebElement userHomePage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger']")
	private WebElement errorInformation;
	
	
	
	@Step("Is User Home Page opened")
	public boolean isUserHomePage(){
		return userHomePage.isDisplayed();
	}
	
	@Step("Get loget User")
	public String getUserName(){
		return userHomePage.getText();
	}
	
	@Step("Is Error Information Displayed")
	public boolean isErrorInformation(){
		return errorInformation.isDisplayed();
	}
}
