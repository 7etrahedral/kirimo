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
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        androidSetUp();
    }

    @AfterClass
    public void tearDown() {
        ad.quit();
    }

    @Test(priority = 0)
    public void login() {
        wait = new WebDriverWait(ad, 10);
        loginPage = new LoginPage(ad);
        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();
    }

    @Test(priority = 1)
    public void logout() throws Exception {
        wait = new WebDriverWait(ad, 10);
        drawer.clickDrawerButton();
        drawer.clickLogoutButton();
        drawer.clickOKConfirmation();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.kirimo.driver:id/textViewLoginDesc")));
    }

}
