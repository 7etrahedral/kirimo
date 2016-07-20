import org.openqa.selenium.By;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.net.MalformedURLException;

/**
 * Created by wib_ on 6/23/16.
 */
public class TestLoginLogout extends AndroidSetup {

    private LoginPage loginPage;
    private String usernameValid;
    private String passwordValid;

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
        loginPage = new LoginPage(ad);
        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();
    }
/*
    @Test(priority = 1)
    public void logout() {

    }
*/
}
