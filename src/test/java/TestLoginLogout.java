import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by wib_ on 6/30/16.
 */
public class TestLoginLogout {

    protected AndroidDriver ad;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        File appDir = new File("/Users/ogilvydigital/Documents/apk");
        File app = new File(appDir, "kirimo-V.1.0.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("deviceName", "Nexus 6P");

        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.kirimo.driver");
        capabilities.setCapability("appActivity", "com.kirimo.driver.SplashActivity");

        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", true);

        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(ad, 10);

        ad.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        ad.quit();
    }

    @Test
    public void verifyInstruction() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.kirimo.driver:id/textViewLoginDesc")));
//        loginpage.getInstructionText();
    }

}
