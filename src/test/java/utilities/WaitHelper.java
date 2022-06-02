package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    public WebDriver driver;
    public WebDriverWait wait;

    public WaitHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void WaitForElement(WebElement element, long timeOutInSeconds) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void WaitForElementClickable(WebElement element, long timeOutInSeconds) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
