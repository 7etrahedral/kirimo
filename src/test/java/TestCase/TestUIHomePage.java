package TestCase;

import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.HomePage;
import utilities.LoginLogout;

/**
 * Created by wib_ on 7/29/16.
 */
public class TestUIHomePage extends LoginLogout {

    private DrawerMenu drawerMenu;
    private HomePage homePage;

    @Test(priority = 0)
    public void verifyAllComponentshomePage() {
        homePage = new HomePage(ad);

        homePage.getOrderTitle();
        homePage.getKirimoButton();
    }

    @Test(priority = 1)
    public void verifyAllComponentsKirimoButton() {
        homePage.clickKirimoButton();

        homePage.getShowRouteLinkText();
        homePage.getShowRouteImageButton();
        homePage.getSortCardLinkText();
        homePage.getSortCardImageButton();
        homePage.getScanLinkText();
        homePage.getScanImageButton();
        homePage.getXImageButton();
    }

}
