package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.PagesUtility;

/**
 * Created by wib_ on 6/25/16.
 */
public class LoginPage extends PagesUtility {

    private String loginInstruction = "textViewLoginDesc";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void getInstructionText() {
        isWaitElementforPresent(getLocator(loginInstruction));
    }

}
