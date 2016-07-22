package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by wib_ on 6/25/16.
 */
public class AndroidSetup {

    protected AndroidDriver ad;

    protected void androidSetUp() throws MalformedURLException{
//        File appDir = new File("/Users/genta/Documents/Job/Kirimo/apk");
        File appDir = new File("/Users/ogilvydigital/Documents/apk");
//        File appDir = new File("D:/wib_/Master/apk/");
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

        ad.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

}