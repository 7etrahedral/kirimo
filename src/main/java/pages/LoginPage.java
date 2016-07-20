package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.PagesUtility;

/**
 * Created by wib_ on 6/25/16.
 */
public class LoginPage extends PagesUtility {

    private String loginInstruction = "textViewLoginDesc";
    private String userNameField = "username";
    private String passWordField = "password";
    private String loginButton = "action";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername(String username) {
        sendKeysText(getFieldTextElement(userNameField), username);
    }

    public void inputPassword(String password) {
        sendKeysText(getFieldTextElement(passWordField), password);
    }

    public void clickLoginButton() {
        clickElement(getElementLocator(loginButton));
    }

    public void getInstructionText() {
        isWaitElementforPresent(getLocator(loginInstruction));
    }

    public void getUsernameTextField() {
        isWaitElementforPresent(getLocator(userNameField));
    }

    public void getPasswordTextField() {
        isWaitElementforPresent(getLocator(passWordField));
    }

    public void getLoginButton() {
        isWaitElementforPresent(getLocator(loginButton));
    }

}
