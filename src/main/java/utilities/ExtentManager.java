package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Created by wib_ on 8/2/16.
 */
public class ExtentManager {

    public String captureScreenShot(WebDriver uwd, String screenShotName) {
        try {
            File source = ((TakesScreenshot)uwd).getScreenshotAs(OutputType.FILE);
            String dest = "./screenshot/" + screenShotName + ".png";
            File destination = new File(dest);
            FileUtils.copyFile(source, destination);
            return(dest);
        }
        catch (Exception e) {
            System.out.println(e);
            return e.getMessage();
        }
    }

    public void statusReport(ITestResult srresult, WebDriver wdsr, ExtentTest srtest) {
        String screencapture_path = captureScreenShot(wdsr, srresult.getName());
        String image_path = srtest.addScreenCapture(screencapture_path);

        /**
         * if the result is pass
         */
        if(srresult.getStatus()==ITestResult.SUCCESS) {
            srtest.log(LogStatus.PASS, srresult.getName(), image_path);
            srtest.getRunStatus();
        }
        /**
         * if the result is fail
         */
        else if(srresult.getStatus()==ITestResult.FAILURE) {
            srtest.log(LogStatus.FAIL, srresult.getName(), image_path+srresult.getThrowable());
            srtest.getRunStatus();
        }
        /**
         * if the test is skipped
         */
        else if(srresult.getStatus()==ITestResult.SKIP) {
            srtest.log(LogStatus.SKIP, srresult.getName(), image_path);
            srtest.getRunStatus();
        }
    }

    public String reportPath(String classname) {
        String rptpath = "./" + classname +".html";

        return rptpath;
    }

}
