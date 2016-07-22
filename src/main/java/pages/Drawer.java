package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/22/16.
 */
public class Drawer extends PagesUtility  {

    private String drawerButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]";
    private String logoutButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView[1]";
    private String warningOKButton = "buttonDefaultPositive";
    private String warningCancelButton= "buttonDefaultNegative";

    public Drawer (WebDriver driver) {
        super(driver);
    }

    public void clickDrawerButton() {
        clickElement(getXPathElementLocator(drawerButton));
    }

    public void clickLogoutButton() {
        clickElement(getXPathElementLocator(logoutButton));
    }

    public void clickOKConfirmation() {
        clickElement(getXPathElementLocator(warningOKButton));
    }

    public void clickCancelConfirmation() {
        clickElement(getXPathElementLocator(warningCancelButton));
    }
}
