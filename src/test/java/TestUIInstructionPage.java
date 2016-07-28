import org.testng.annotations.Test;
import pages.*;
import utilities.AndroidSetup;

/**
 * Created by wib_ on 7/28/16.
 */
public class TestUIInstructionPage extends AndroidSetup {

    private InstructionPage instructionPage;
    private LoginPage loginPage;
    private DrawerMenu drawerMenu;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @Test(priority = 0)
    public void accessInstructionPage() {
        loginPage = new LoginPage(ad);

        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();

        drawerMenu = new DrawerMenu(ad);

        /**
         * Open drawer menu
         */
        drawerMenu.clickDrawerButton();
        drawerMenu.clickInstructionButton();
    }

    @Test(priority = 1)
    public void verifyAllComponentsInstructionPage() {
        instructionPage = new InstructionPage(ad);

        instructionPage.getInstructionTitle();
        instructionPage.getImageLogo();
        instructionPage.getVersion();
    }

}
