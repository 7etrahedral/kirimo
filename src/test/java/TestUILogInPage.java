import jdk.management.resource.internal.inst.ThreadRMHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

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

    @Test
    public void verifyInstruction() throws Exception {
        loginpage.getInstructionText();
        Thread.sleep(1000);
    }

}
