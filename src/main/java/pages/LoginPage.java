package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 6/25/16.
 */
public class LoginPage extends PagesUtility {

    private String loginInstruction = "textViewLoginDesc";
    private String usernameField = "username";
    private String passwordField = "password";
    private String loginButton = "action";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername(String username) {
        sendKeysText(getFieldTextElement(usernameField), username);
    }

    public void inputPassword(String password) {
        sendKeysText(getFieldTextElement(passwordField), password);
    }

    public void clickLoginButton() {
        clickElement(getIDElementLocator(loginButton));
    }

    public void getInstructionText() {
        isWaitElementforPresent(getIDElementLocator(loginInstruction));
    }

    public void getUsernameTextField() {
        isWaitElementforPresent(getIDElementLocator(usernameField));
    }

    public void getPasswordTextField() {
        isWaitElementforPresent(getIDElementLocator(passwordField));
    }

    public void getLoginButton() {
        isWaitElementforPresent(getIDElementLocator(loginButton));
    }

}
