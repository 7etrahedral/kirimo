import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.AndroidSetup;

import java.net.MalformedURLException;

/**
 * Created by wib_ on 6/25/16.
 */
public class TestUILogInPage extends AndroidSetup {

    LoginPage loginpage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        androidSetUp();
        loginpage = new LoginPage(ad);
    }

    @AfterClass
    public void tearDown() {
        ad.quit();
    }

    @Test(priority = 0)
    public void verifyInstruction() throws Exception {
        loginpage.getInstructionText();
    }

    @Test(priority = 1)
    public void verifyUsername() throws Exception {
        loginpage.getUsernameTextField();
    }

    @Test(priority = 2)
    public void verifyPassword() throws Exception {
        loginpage.getPasswordTextField();
    }

    @Test(priority = 3)
    public void verifyLoginButton() throws Exception {
        loginpage.getLoginButton();
    }

}
