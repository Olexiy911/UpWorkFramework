package framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import framework.webdriver.WebDriverFactory;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class TestExecutionListener extends TestListenerAdapter {
	
	private static final Logger LOG = LogFactory.getLogger(TestExecutionListener.class);

	/**
	 * Prints the test results to report.
	 * 
	 * @param result
	 *            the result
	 */
	
	private void printTestResults(ITestResult result) {
		if (result.getParameters().length != 0) {
			String params = null;
			for (Object parameter : result.getParameters()) {
				params += parameter.toString() + ",";
			}
			LOG.info(params);
		}

		String status = null;
		switch (result.getStatus()) {
		case ITestResult.SUCCESS:
			status = "Pass";
			break;
		case ITestResult.FAILURE:
			status = "Failed";
			break;
		case ITestResult.SKIP:
			status = "Skipped";
			break;
		}

		LOG.info(status);
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		printTestResults(arg0);
	}
	
	@Override
	public void onTestSuccess(ITestResult arg0) {
		printTestResults(arg0);
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		printTestResults(arg0);
		testScreenshotOnFinish(WebDriverFactory.getSetDriver());
	}

	@Step("Screenshot after test")
    public void testScreenshotOnFinish(WebDriver driver) {
    	getScreenshot(driver);
    }
    
    @Attachment(value = "Screenshot after failed test", type = "image/png")
    public byte[] getScreenshot(WebDriver driver) {
    	File screenshot = 
    			((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	byte[] screen = null;
    	try {
    		screen = IOUtils.toByteArray(new FileInputStream(screenshot));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return screen;
    }

}
