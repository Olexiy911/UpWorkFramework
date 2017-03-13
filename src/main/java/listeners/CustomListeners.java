package listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import framework.webdriver.WebDriverFactory;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class CustomListeners extends TestListenerAdapter{

	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  WebDriverFactory.killDriverInstance();
	
	  }

	  @Override
	  @Step("on Test Failure")
	  public void onTestFailure(ITestResult tr) {
		  WebDriver driver = WebDriverFactory.getDriver();
		  takeScreenshot(driver);
		  if (driver != null) {
				WebDriverFactory.killDriverInstance();
			}
	  }
	  
	  @Attachment(value = "Web Screenshot after test", type = "image/png")
	  public static byte[] getScreenshot(WebDriver driver) {
	      File screenshot = 
	        ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      byte[] screen = null;
	      try {
	       screen = IOUtils.toByteArray(new FileInputStream(screenshot));
	   } catch (IOException e) {
	    e.printStackTrace();
	   }
	   return screen;
	   }
	          
	   @Step("Screenshot of Web Page")
	   public static void takeScreenshot(WebDriver driver) {
	      getScreenshot(driver);
	   }
	   
	   
}
