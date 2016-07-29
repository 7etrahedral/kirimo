package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/29/16.
 */
public class OrderHistoryPage extends PagesUtility {

    private String orderHistoryTitle = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[1]";
    private String showOrderText = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]";
    private String chooseDateLinkText = "choose_date";
    private String firstOrder = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]";

    public OrderHistoryPage(WebDriver driver) {
        super (driver);
    }

    public void getOrderHistoryTitle() {
        isWaitElementforPresent(getXPathElementLocator(orderHistoryTitle));
    }

    public void getShowOrderText() {
        isWaitElementforPresent(getXPathElementLocator(showOrderText));
    }

    public void getChooseDateLinkText() {
        isWaitElementforPresent(getIDElementLocator(chooseDateLinkText));
    }

    public void clickChooseDateLinkText() {
        clickElement(getIDElementLocator(chooseDateLinkText));
    }

    public void getFirstOrder() {
        isWaitElementforPresent(getXPathElementLocator(firstOrder));
    }

}
