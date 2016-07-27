import org.testng.annotations.Test;
import pages.Drawer;
import pages.LoginPage;
import pages.PopUpMessage;
import utilities.AndroidSetup;

import java.net.MalformedURLException;

/**
 * Created by wib_ on 6/23/16.
 */
public class TestLoginLogout extends AndroidSetup {

    private LoginPage loginPage;
    private Drawer drawer;
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
        drawer = new Drawer(ad);
        popUpMessage = new PopUpMessage(ad);

        drawer.clickDrawerButton();
        drawer.clickLogoutButton();
        popUpMessage.clickOKConfirmation();
        loginPage.getInstructionText();
    }

}
