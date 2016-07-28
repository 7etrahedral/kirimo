import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.InstructionPage;
import pages.LoginPage;
import pages.OrderPage;
import utilities.AndroidSetup;

/**
 * Created by wib_ on 7/28/16.
 */
public class TestUIOrderPage extends AndroidSetup {

    private OrderPage orderPage;
    private LoginPage loginPage;
    private DrawerMenu drawerMenu;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @Test(priority = 0)
    public void accessOrderPage() {
        loginPage = new LoginPage(ad);

        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();

        drawerMenu = new DrawerMenu(ad);

        /**
         * Open drawer menu
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
