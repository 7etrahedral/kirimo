package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/29/16.
 */
public class YourRoutesPage extends PagesUtility {

    private String backButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]";
    private String youRoutesTitle= "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[1]";

    public YourRoutesPage (WebDriver driver) {
        super (driver);
    }

    public void getBackButton() {
        isWaitElementforPresent(getXPathElementLocator(backButton));
    }

    public void clickBackButton() {
        clickElement(getXPathElementLocator(backButton));
    }

    public void getYourRoutesTitle() {
        isWaitElementforPresent(getXPathElementLocator(youRoutesTitle));
    }
}
