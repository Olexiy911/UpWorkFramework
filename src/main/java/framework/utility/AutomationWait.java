package framework.utility;

import framework.webdriver.WebDriverFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationWait {

	public static void waitPageLoad() {

		WebDriverFactory.getDriver().manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}

	public static WebElement waitForElementVisible(int seconds, By by) {
		return new WebDriverWait(WebDriverFactory.getDriver(), seconds)
				.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static boolean waitTitleContains(String title) {
		return new WebDriverWait(WebDriverFactory.getDriver(), 10).until(ExpectedConditions.titleContains(title));
	}

	public static WebElement waitForElement(int seconds, By by) {
		return (new WebDriverWait(WebDriverFactory.getDriver(), seconds))
				.until(ExpectedConditions.elementToBeClickable(by));

	}
	
	public static WebElement waitForElementClickable(int seconds,WebElement element) {
		return new WebDriverWait(WebDriverFactory.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void wait(int time) {
		try {
			synchronized (AutomationWait.class) {
				Thread.sleep(time);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
