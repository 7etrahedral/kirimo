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
    }

    @AfterClass
    public void tearDown() {
        ad.quit();
    }

    @Test
    public void verifyInstruction() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.kirimo.driver:id/textViewLoginDesc")));
        loginpage.getInstructionText();
    }

}
