package framework.pages.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import framework.pages.Page;
import framework.utility.LogFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class CapturePage extends Page{

	private static final Logger LOG = LogFactory.getLogger(CapturePage.class);
	
	private String captureButton = "//*[@id='recaptcha-anchor']";
	
	
	@Step("Is Capture Present")
	public boolean isCapture(){
		return isPresent(By.xpath(captureButton));
	}
	
	
	@Step("Click on Capture Page")
	public CreateHireAccountPage clickCapture(){
		webDriver.findElement(By.xpath(captureButton)).click();
		return PageFactory.initElements(webDriver, CreateHireAccountPage.class);
	}
}
