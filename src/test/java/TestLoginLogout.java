import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.LoginPage;
import pages.PopUpMessage;
import utilities.AndroidSetup;

/**
 * Created by wib_ on 6/23/16.
 */
public class TestLoginLogout extends AndroidSetup {

    private LoginPage loginPage;
    private DrawerMenu drawerMenu;
    private PopUpMessage popUpMessage;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @Test(priority = 0)
    public void login() {
        loginPage = new LoginPage(ad);

        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();
    }

    @Test(priority = 1)
    public void logout() throws Exception {
        drawerMenu = new DrawerMenu(ad);
        popUpMessage = new PopUpMessage(ad);

        drawerMenu.clickDrawerButton();
        drawerMenu.clickLogoutButton();
        popUpMessage.clickOKConfirmation();
        loginPage.getInstructionText();
    }

}
