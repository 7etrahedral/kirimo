package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/28/16.
 */
public class OrderPage extends PagesUtility{

    private String orderTitle = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[1]";
    private String kirimoButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]";
    private String showRouteLinkText = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]";
    private String showRouteImageButton = "fab_route";
    private String sortCardLinkText = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[2]";
    private String sortCardImageButton = "fab_sort";
    private String scanLinkText = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[3]";
    private String scanImageButton = "fab_scan";
    private String xImageButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageButton[4]";

    public OrderPage(WebDriver driver) {
        super (driver);
    }

    public void getOrderTitle() {
        isWaitElementforPresent(getXPathElementLocator(orderTitle));
    }

    public void getKirimoButton() {
        isWaitElementforPresent(getXPathElementLocator(kirimoButton));
    }

    public void clickKirimoButton() {
        clickElement(getXPathElementLocator(kirimoButton));
    }

    public void getShowRouteLinkText() {
        isWaitElementforPresent(getXPathElementLocator(showRouteLinkText));
    }

    public void clickShowRouteLinkText() {
        clickElement(getXPathElementLocator(showRouteLinkText));
    }

    public void getShowRouteImageButton() {
        isWaitElementforPresent(getIDElementLocator(showRouteImageButton));
    }

    public void clickShowRouteImageButton() {
        clickElement(getIDElementLocator(showRouteImageButton));
    }

    public void getSortCardLinkText() {
        isWaitElementforPresent(getXPathElementLocator(sortCardLinkText));
    }

    public void clickSortCardLinkText() {
        clickElement(getXPathElementLocator(sortCardLinkText));
    }

    public void getSortCardImageButton() {
        isWaitElementforPresent(getIDElementLocator(sortCardImageButton));
    }

    public void clickSortCardImageButton() {
        clickElement(getIDElementLocator(sortCardImageButton));
    }

    public void getScanLinkText() {
        isWaitElementforPresent(getXPathElementLocator(scanLinkText));
    }

    public void clickScanLinkText() {
        clickElement(getXPathElementLocator(scanLinkText));
    }

    public void getScanImageButton() {
        isWaitElementforPresent(getIDElementLocator(scanImageButton));
    }

    public void clickScanImageButton() {
        clickElement(getIDElementLocator(scanImageButton));
    }

    public void getXImageButton() {
        isWaitElementforPresent(getXPathElementLocator(xImageButton));
    }

    public void clickXImageButton() {
        clickElement(getXPathElementLocator(xImageButton));
    }

}
