package utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.DrawerMenu;
import pages.LoginPage;
import pages.PopUpMessage;

/**
 * Created by wib_ on 7/29/16.
 */
public class LoginLogout extends AndroidSetup {

    private LoginPage loginPage;
    private DrawerMenu drawerMenu;
    private PopUpMessage popUpMessage;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @BeforeClass
    public void login() {
        loginPage = new LoginPage(ad);

        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();
    }

    public void logout() throws Exception {
        drawerMenu = new DrawerMenu(ad);
        popUpMessage = new PopUpMessage(ad);

        drawerMenu.clickDrawerButton();
        drawerMenu.clickLogoutButton();
        popUpMessage.clickOKConfirmation();
        loginPage.getInstructionText();
    }

}
