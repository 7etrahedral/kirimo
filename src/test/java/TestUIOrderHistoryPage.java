import org.testng.annotations.Test;
import pages.DrawerMenu;
import pages.OrderHistoryPage;
import utilities.LoginLogout;

/**
 * Created by wib_ on 7/29/16.
 */
public class TestUIOrderHistoryPage extends LoginLogout {

    DrawerMenu drawerMenu;
    OrderHistoryPage orderHistoryPage;

    @Test(priority = 0)
    public void accessOrderHistoryPage() {
        /**
         * Open Order History page
         */
        drawerMenu = new DrawerMenu(ad);
        drawerMenu.clickDrawerButton();
        drawerMenu.clickOrderHistoryButton();
    }

    @Test(priority = 1)
    public void verifyAllElementOrderHistoryPage() {
        orderHistoryPage = new OrderHistoryPage(ad);

        orderHistoryPage.getOrderHistoryTitle();
        orderHistoryPage.getShowOrderText();
        orderHistoryPage.getChooseDateLinkText();
        orderHistoryPage.getFirstOrder();
    }

}
