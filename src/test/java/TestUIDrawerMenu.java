import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.LoginPage;
import pages.ProfilePage;
import utilities.AndroidSetup;

/**
 * Created by wib_ on 7/28/16.
 */
public class TestUIDrawerMenu extends AndroidSetup {

    private ProfilePage profilePage;
    private LoginPage loginPage;
    private DrawerMenu drawerMenu;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @Test(priority = 0)
    public void accessDrawerMenu() {
        loginPage = new LoginPage(ad);

        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();

        drawerMenu = new DrawerMenu(ad);

        /**
         * Open drawerMenu menu
         */
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
