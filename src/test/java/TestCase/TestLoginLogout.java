package TestCase;

import org.testng.annotations.*;
import utilities.LoginLogout;

/**
 * Created by wib_ on 6/23/16.
 */
public class TestLoginLogout extends LoginLogout {

    @Test(priority = 0)
    public void testLogout() throws Exception {
        logout();
    }

    @Test(priority = 1)
    public void testLogin() {
        login();
    }

}
