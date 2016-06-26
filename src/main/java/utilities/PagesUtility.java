package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by wib_ on 6/25/16.
 */
public class PagesUtility {

    protected WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(driver, 10);

    public PagesUtility(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void waitVisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public By getLocator(String loc) {
        return By.id("com.kirimo.driver:id/"+loc);
//        return By.id(loc);
    }

    protected boolean isWaitElementforPresent(By by) {
        try {
            waitVisibilityOfElement(by);
            return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }

}
