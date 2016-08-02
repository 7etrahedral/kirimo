package TestCase;

import org.testng.annotations.Test;
import pages.*;

/**
 * Created by wib_ on 7/29/16.
 */
public class TestOrderPage extends TestLoginLogout {

    private DrawerMenu drawerMenu;
    private OrderPage orderPage;
    private YourRoutesPage yourRoutesPage;

    @Test(priority = 0)
    public void login() {
        drawerMenu = new DrawerMenu(ad);
        orderPage = new OrderPage(ad);
        yourRoutesPage = new YourRoutesPage(ad);

        /**
         * Open Order page
         */
        drawerMenu.clickDrawerButton();
        drawerMenu.clickOrderButton();
    }

    @Test(priority = 1)
    public void clickShowRouteLinkText() {
        orderPage.clickKirimoButton();
        orderPage.clickShowRouteLinkText();
    }

    @Test(priority = 2)
    public void verifyYourRoutesPage() {
        yourRoutesPage.getBackButton();
    }

}
