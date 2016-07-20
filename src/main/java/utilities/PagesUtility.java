package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by wib_ on 6/25/16.
 */
public class PagesUtility {

    protected WebDriver driver;

    public PagesUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void waitVisibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(isElementPresent(locator));
    }

    public By getLocator(String loc) {
        return By.id("com.kirimo.driver:id/"+loc);
    }

    protected boolean isElementPresent(By by) {
        try {
            if (driver.findElement(by).isDisplayed()){
                return true;
            }else{
                return false;
            }
        } catch (NoSuchElementException e) {
            return false;
        }
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
