package pages;

import org.openqa.selenium.WebDriver;
import utilities.PagesUtility;

/**
 * Created by wib_ on 7/25/16.
 */
public class ProfilePage extends PagesUtility{
    private String profileImage = "profile_image";
    private String profileImageBg = "profile_image_bg";
    private String profileImageBgOverlay = "profile_image_bg_overlay";
    private String textName = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
    private String fullName = "full_name";
    private String textEmailAddress = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[3]";
    private String email = "email";
    private String textPhoneNumber = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[5]";
    private String phoneNumber = "phone_number";
    private String imageDeliveryWallet = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]";
    private String totalDelivery = "total_delivery";
    private String textCompletedDelivery = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]";
    private String deliveryDate = "registered_at";
    private String imageEarningsWallet = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]";
    private String textRP = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]";
    private String balance = "balance";
    private String textTotalEarningsoFar = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]";
    private String earningDate = "registered_at2";

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void getProfileImage() {
        isWaitElementforPresent(getIDElementLocator(profileImage));
    }

    public void getProfileImageBg() {
        isWaitElementforPresent(getIDElementLocator(profileImageBg));
    }

    public void getProfileImageOverlay() {
        isWaitElementforPresent(getIDElementLocator(profileImageBgOverlay));
    }

    public void getTextName() {
        isWaitElementforPresent(getXPathElementLocator(textName));
    }

    public void getFullName() {
        isWaitElementforPresent(getIDElementLocator(fullName));
    }

    public void getTextEmailAddress() {
        isWaitElementforPresent(getXPathElementLocator(textEmailAddress));
    }

    public void getEmail() {
        isWaitElementforPresent(getIDElementLocator(email));
    }

    public void getTextPhoneNumber() {
        isWaitElementforPresent(getXPathElementLocator(textPhoneNumber));
    }

    public void getPhoneNumber() {
        isWaitElementforPresent(getIDElementLocator(phoneNumber));
    }

    public void getImageDeliveryWallet() {
        isWaitElementforPresent(getXPathElementLocator(imageDeliveryWallet));
    }

    public void getTotalDelivery() {
        isWaitElementforPresent(getIDElementLocator(totalDelivery));
    }

    public void getTextCompletedDelivery() {
        isWaitElementforPresent(getXPathElementLocator(textCompletedDelivery));
    }

    public void getDeliveryDate() {
        isWaitElementforPresent(getIDElementLocator(deliveryDate));
    }

    public void getImageEarningsWallet() {
        isWaitElementforPresent(getXPathElementLocator(imageEarningsWallet));
    }

    public void getTextRP() {
        isWaitElementforPresent(getXPathElementLocator(textRP));
    }

    public void getBalance() {
        isWaitElementforPresent(getIDElementLocator(balance));
    }

    public void getTextTotalEarningsoFar() {
        isWaitElementforPresent(getXPathElementLocator(textTotalEarningsoFar));
    }

    public void getEarningDate() {
        isWaitElementforPresent(getIDElementLocator(earningDate));
    }

}
