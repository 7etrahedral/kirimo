package TestCase;

import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import utilities.LoginLogout;

/**
 * Created by wib_ on 6/23/16.
 */
public class TestLoginLogout extends LoginLogout {

    @Stories("As a user I want to be able to log out")
    @TestCaseId("TC_KRM_001_002")
    @Title("Verify user is able to log out")
    @Test(priority = 0)
    public void testLogout() throws Exception {
        logout();
    }

    @Stories("As a user I want to be able to log in")
    @TestCaseId("TC_KRM_001_001")
    @Title("Verify user is able to log in")
    @Test(priority = 1)
    public void testLogin() throws Exception {
        login();
    }

}
