package framework.pages.enterapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.home.HomePage;
import ru.yandex.qatools.allure.annotations.Step;

public class ViewAllCategoriesPage extends Page{

	public ViewAllCategoriesPage(){
		PageFactory.initElements(webDriver, this);
	}	
	
	@FindBy(how = How.XPATH, using = "//h1[1]")
	private WebElement viewAllCategoriesPageTitle;
	
	@FindBy(how = How.XPATH, using = "//img[@alt='Upwork']")
	private WebElement upWorkButton;
	
	@Step("Is Web Developers Page opened")
	public boolean isViewAllCategoriesPage(){
		return viewAllCategoriesPageTitle.isDisplayed();
	}
	
	@Step("Click on UpWork")
	public HomePage clickHome(){
		upWorkButton.click();		
		return PageFactory.initElements(webDriver, HomePage.class);    
	}

}
