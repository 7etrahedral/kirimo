package TestCase;

import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.OrderPage;
import utilities.LoginLogout;

/**
 * Created by wib_ on 7/28/16.
 */
public class TestUIOrderPage extends LoginLogout {

    private OrderPage orderPage;
    private DrawerMenu drawerMenu;

    @Test(priority = 0)
    public void accessOrderPage() {
        drawerMenu = new DrawerMenu(ad);

        /**
         * Open Order page
         */
        drawerMenu.clickDrawerButton();
        drawerMenu.clickOrderButton();
    }

    @Test(priority = 1)
    public void verifyAllComponentsOrderPage() {
        orderPage = new OrderPage(ad);

        orderPage.getOrderTitle();
        orderPage.getKirimoButton();
    }

    @Test(priority = 2)
    public void verifyAllComponentsKirimoButton() {
        orderPage.clickKirimoButton();

        orderPage.getShowRouteLinkText();
        orderPage.getShowRouteImageButton();
        orderPage.getSortCardLinkText();
        orderPage.getSortCardImageButton();
        orderPage.getScanLinkText();
        orderPage.getScanImageButton();
        orderPage.getXImageButton();
    }

}
