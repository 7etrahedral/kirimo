package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/26/16.
 */
public class PopUpMessage extends PagesUtility {

    private String warningOKButton = "buttonDefaultPositive";
    private String warningCancelButton= "buttonDefaultNegative";

    public PopUpMessage (WebDriver driver) {
        super(driver);
    }

    public void clickOKConfirmation() {
        clickElement(getIDElementLocator(warningOKButton));
    }

    public void clickCancelConfirmation() {
        clickElement(getIDElementLocator(warningCancelButton));
    }

}
