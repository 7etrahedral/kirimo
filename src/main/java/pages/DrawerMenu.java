package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/22/16.
 */
public class DrawerMenu extends PagesUtility  {

    private String drawerButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]";
    private String profilePicture = "drawerImage";
    private String fullName = "full_name";
    private String userName = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.TextView[1]";
    private String orderButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView[1]";
    private String orderHistoryButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView[1]";
    private String paymentButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView[1]";
    private String instructionButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView[1]";
    private String profileButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView[1]";
    private String logoutButton = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView[1]";

    public DrawerMenu(WebDriver driver) {
        super(driver);
    }

    public void getDrawerButton() {
        isWaitElementforPresent(getXPathElementLocator(drawerButton));
    }

    public void clickDrawerButton() {
        clickElement(getXPathElementLocator(drawerButton));
    }

    public void getProfilePicture() {
        isWaitElementforPresent(getIDElementLocator(profilePicture));
    }

    public void getFullName() {
        isWaitElementforPresent(getIDElementLocator(fullName));
    }

    public void getUserName() {
        isWaitElementforPresent(getXPathElementLocator(userName));
    }

    public void getOrderButton() {
        isWaitElementforPresent(getXPathElementLocator(orderButton));
    }

    public void clickOrderButton() {
        clickElement(getXPathElementLocator(orderButton));
    }

    public void getOrderHistoryButton() {
        isWaitElementforPresent(getXPathElementLocator(orderHistoryButton));
    }

    public void clickOrderHistoryButton() {
        clickElement(getXPathElementLocator(orderHistoryButton));
    }

    public void getPaymentButton() {
        isWaitElementforPresent(getXPathElementLocator(paymentButton));
    }

    public void clickPaymentButton() {
        clickElement(getXPathElementLocator(paymentButton));
    }

    public void getInstructionButton() {
        isWaitElementforPresent(getXPathElementLocator(instructionButton));
    }

    public void clickInstructionButton() {
        clickElement(getXPathElementLocator(instructionButton));
    }

    public void getProfileButton() {
        isWaitElementforPresent(getXPathElementLocator(profileButton));
    }

    public void clickProfileButton() {
        clickElement(getXPathElementLocator(profileButton));
    }

    public void getLogoutButton() {
        isWaitElementforPresent(getXPathElementLocator(logoutButton));
    }

    public void clickLogoutButton() {
        clickElement(getXPathElementLocator(logoutButton));
    }
}
