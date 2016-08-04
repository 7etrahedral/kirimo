package TestCase;

import org.testng.annotations.Test;
import pages.*;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import utilities.LoginLogout;

/**
 * Created by wib_ on 7/29/16.
 */
public class TestOrderPage extends LoginLogout {

    private DrawerMenu drawerMenu;
    private OrderPage orderPage;
    private YourRoutesPage yourRoutesPage;

    @Stories("As a user I want to be able to order page")
    @TestCaseId("TC_KRM_002_001")
    @Title("Verify user is able to access order page")
    @Test(priority = 0)
    public void accessOrderPage() {
        drawerMenu = new DrawerMenu(ad);
        orderPage = new OrderPage(ad);
        yourRoutesPage = new YourRoutesPage(ad);

        /**
         * Open Order page
         */
        drawerMenu.clickDrawerButton();
        drawerMenu.clickOrderButton();
    }

    @Stories("As a user I want to be able to click show remote link text")
    @TestCaseId("TC_KRM_002_002")
    @Title("Verify user is able to click show remote link text")
    @Test(priority = 1)
    public void clickShowRouteLinkText() {
        orderPage.clickKirimoButton();
        orderPage.clickShowRouteLinkText();
    }

    @Stories("As a user I want to be able to verify Your Route page")
    @TestCaseId("TC_KRM_002_003")
    @Title("Verify user is able to verify Your Route page")
    @Test(priority = 2)
    public void verifyYourRoutesPage() {
        yourRoutesPage.getBackButton();
    }

}
