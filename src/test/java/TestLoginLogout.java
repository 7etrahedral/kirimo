import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Drawer;
import pages.LoginPage;
import utilities.AndroidSetup;

import java.net.MalformedURLException;

/**
 * Created by wib_ on 6/23/16.
 */
public class TestLoginLogout extends AndroidSetup {

    private LoginPage loginPage;
    private Drawer drawer;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        androidSetUp();
        loginPage = new LoginPage(ad);
        drawer = new Drawer(ad);
    }

    @AfterClass
    public void tearDown() {
        ad.quit();
    }

    @Test(priority = 0)
    public void login() {
        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();
    }

    @Test(priority = 1)
    public void logout() throws Exception {
        drawer.clickDrawerButton();
        drawer.clickLogoutButton();
        drawer.clickOKConfirmation();
        loginPage.getInstructionText();
    }

}
