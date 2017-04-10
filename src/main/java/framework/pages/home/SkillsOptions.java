package framework.pages.home;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.pages.Page;
import framework.pages.enterapplication.BecomeFreelancerPage;
import ru.yandex.qatools.allure.annotations.Step;

public class SkillsOptions extends Page{

	public SkillsOptions() {
		PageFactory.initElements(webDriver, this);          //конструктори
	}
	
	@FindBy(how = How.XPATH, using = "//li[@class='ng-scope']")
	private  List<WebElement> typesofwork;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='bg-cloud step-title']")
	private WebElement categoryTitle;
	
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	private WebElement nextButton;
	
	@FindBy(how = How.XPATH, using = "//span[@class='up-icon icon-prev']")
	private WebElement backButton;
	
	
	@FindBy(how = How.XPATH, using = "//input[@class='form-control ng-pristine ng-valid ng-empty ng-touched']")
	private WebElement skillsSearch;
	
	
	@FindBy(how = How.XPATH, using = "//p[@class='text-center m-b-0']")
	private WebElement wantToText;
	
	@FindBy(how = How.XPATH, using = "//a[@class='font-gotham-medium']")
	private WebElement becomeFreelancerButton;
	
	
	
	@Step("Is Skills Window opened")
	public String getTitle(){
		return categoryTitle.getText();
	}
	
	@Step("Click on Work Type {1} Checkbox")
	public SkillsOptions selectWorkType(String workType){
		HashMap<String,WebElement> worktypes = new HashMap<String,WebElement>();
		for(WebElement element:typesofwork){
			worktypes.put(element.findElement(By.tagName("span")).getText().trim(), element.findElement(By.tagName("input")));
		}
		
		worktypes.get(workType).click();
		return this;    
	}
	
	@Step("Click Next Button")
	public ProjectDurationOptions clickNext(){
		nextButton.click();		
		return PageFactory.initElements(webDriver, ProjectDurationOptions.class);    
	}
	
	@Step("Click Back Button")
	public CategoryOptions clickBack(){
		backButton.click();		
		return PageFactory.initElements(webDriver, CategoryOptions.class);    
	}
	
	
	@Step("Is Error Message Displayed")
	public boolean isSkillsSearch(){
		return skillsSearch.isDisplayed();					//<--------------------
	}
	
	
	@Step("Is 'Want to get hired for projects?' text")      //<--------------------------------------------------
	public String getWantToText(){
		return wantToText.getText();
	}
	
	@Step("Click on Work as a Freelancer Button")
	public BecomeFreelancerPage clickBecomeFreelancerButton(){
		becomeFreelancerButton.click();		
		return PageFactory.initElements(webDriver, BecomeFreelancerPage.class);    
	}
}
