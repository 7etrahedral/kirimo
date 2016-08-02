package TestCase;

import org.testng.annotations.Test;
import pages.*;
import utilities.LoginLogout;

/**
 * Created by wib_ on 7/28/16.
 */
public class TestUIInstructionPage extends LoginLogout {

    private InstructionPage instructionPage;
    private DrawerMenu drawerMenu;

    @Test(priority = 0)
    public void accessInstructionPage() {
        /**
         * Open drawer menu
         */
        drawerMenu = new DrawerMenu(ad);
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
