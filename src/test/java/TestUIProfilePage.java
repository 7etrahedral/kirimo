import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Drawer;
import pages.LoginPage;
import pages.PopUpMessage;
import pages.ProfilePage;
import utilities.AndroidSetup;

import java.net.MalformedURLException;

/**
 * Created by wib_ on 7/25/16.
 */
public class TestUIProfilePage extends AndroidSetup {

    private ProfilePage profilePage;
    private TestLoginLogout testLoginLogout;
    private LoginPage loginPage;
    private Drawer drawer;
    private PopUpMessage popUpMessage;
    private String usernameValid = "wib";
    private String passwordValid = "wibpass";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        androidSetUp();
        profilePage = new ProfilePage(ad);

        loginPage = new LoginPage(ad);
        drawer = new Drawer(ad);
        popUpMessage = new PopUpMessage(ad);

        loginPage.inputUsername(usernameValid);
        loginPage.inputPassword(passwordValid);
        loginPage.clickLoginButton();
        drawer.clickDrawerButton();
        drawer.clickProfileButton();
    }

    @AfterClass
    public void tearDown() throws Exception {
        drawer.clickDrawerButton();
        drawer.clickLogoutButton();
        popUpMessage.clickOKConfirmation();
        loginPage.getInstructionText();

        ad.quit();
    }

    @Test(priority = 0)
    public void verifyProfileImage() throws Exception {
        profilePage.getProfileImage();
    }

    @Test(priority = 1)
    public void verifyProfileImageBG() throws Exception {
        profilePage.getProfileImageBg();
    }

    @Test(priority = 2)
    public void verifyProfileImageOverlay() throws Exception {
        profilePage.getProfileImageOverlay();
    }

    @Test(priority = 3)
    public void verifyTextName() throws Exception {
        profilePage.getTextName();
    }

    @Test(priority = 4)
    public void verifyFullName() throws Exception {
        profilePage.getFullName();
    }

    @Test(priority = 5)
    public void verifyTextEmailAddress() throws Exception {
        profilePage.getTextEmailAddress();
    }

    @Test(priority = 6)
    public void verifyEmail() throws Exception {
        profilePage.getEmail();
    }

    @Test(priority = 7)
    public void verifyTextPhoneNumber() throws Exception {
        profilePage.getTextPhoneNumber();
    }

    @Test(priority = 8)
    public void verifyPhoneNumber() throws Exception {
        profilePage.getPhoneNumber();
    }

    @Test(priority = 9)
    public void verifyImageDeliveryWallet() throws Exception {
        profilePage.getImageDeliveryWallet();
    }

    @Test(priority = 10)
    public void verifyTotalDelivery() throws Exception {
        profilePage.getTotalDelivery();
    }

    @Test(priority = 11)
    public void verifyTextCompletedDelivery() throws Exception {
        profilePage.getTextCompletedDelivery();
    }

    @Test(priority = 12)
    public void verifyDeliveryDate() throws Exception {
        profilePage.getDeliveryDate();
    }

    @Test(priority = 13)
    public void verifyImageEarningsWallet() throws Exception {
        profilePage.getImageEarningsWallet();
    }

    @Test(priority = 14)
    public void verifyTextRP() throws Exception {
        profilePage.getTextRP();
    }

    @Test(priority = 15)
    public void verifyBalance() throws Exception {
        profilePage.getBalance();
    }

    @Test(priority = 16)
    public void verifyTextTotalEarningsoFar() throws Exception {
        profilePage.getTextTotalEarningsoFar();
    }

    @Test(priority = 17)
    public void verifyEarningDate() throws Exception {
        profilePage.getEarningDate();
    }

}
