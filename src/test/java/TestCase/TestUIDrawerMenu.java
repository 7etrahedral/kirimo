package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.LoginPage;
import pages.ProfilePage;
import utilities.AndroidSetup;
import utilities.LoginLogout;

/**
 * Created by wib_ on 7/28/16.
 */
public class TestUIDrawerMenu extends LoginLogout {

    private DrawerMenu drawerMenu;

    @Test(priority = 0)
    public void accessDrawerMenu() {
        /**
         * Open Drawer menu
         */
        drawerMenu = new DrawerMenu(ad);
        drawerMenu.clickDrawerButton();
    }

    @Test(priority = 1)
    public void verifyAllComponentsDrawerMenu() {

        /**
         * Check all buttons and elements
         */
        drawerMenu.getProfilePicture();
        drawerMenu.getFullName();
        drawerMenu.getUserName();
        drawerMenu.getOrderButton();
        drawerMenu.getOrderHistoryButton();
        drawerMenu.getPaymentButton();
        drawerMenu.getInstructionButton();
        drawerMenu.getProfileButton();
        drawerMenu.getLogoutButton();
    }

}
