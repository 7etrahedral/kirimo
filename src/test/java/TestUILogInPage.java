import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.AndroidSetup;

/**
 * Created by wib_ on 6/25/16.
 */
public class TestUILogInPage extends AndroidSetup {

    LoginPage loginpage;

    @Test
    public void verifyLoginPageComponents() {
        loginpage = new LoginPage(ad);

        loginpage.getInstructionText();
        loginpage.getUsernameTextField();
        loginpage.getPasswordTextField();
        loginpage.getLoginButton();
        }

    /*
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
*/
}
