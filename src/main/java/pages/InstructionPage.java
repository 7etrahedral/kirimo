package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/28/16.
 */
public class InstructionPage extends PagesUtility {

    private String instructionTitle = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[1]";
    private String imageLogoLayout = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView[1]";
    private String imageLogo = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]";
    private String appVersion = "version";

    public InstructionPage(WebDriver driver) {
        super (driver);
    }

    public void getInstructionTitle() {
        isWaitElementforPresent(getXPathElementLocator(instructionTitle));
    }

    public void getImageLogo() {
        isWaitElementforPresent(getXPathElementLocator(imageLogo));
    }

    public void getVersion() {
        isWaitElementforPresent(getIDElementLocator(appVersion));
    }

}
