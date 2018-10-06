package HomePageMenu;

import HomePage.HomePageMenu;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotificationsTest extends Base {

    HomePageMenu homePageMenu;
    @BeforeMethod
    public void initElements(){
        homePageMenu = PageFactory.initElements(ad, HomePageMenu.class);
    }
    @Test
    public void breakingNewsNotificationsTest() throws InterruptedException {
        homePageMenu.setBreakingNewsNotification();
    }
    @Test
    public void newYorkNotificationsTest() throws InterruptedException{
        homePageMenu.setNewYorkMetroNotifications();
    }
    @Test
    public void sportsNotificationTest() throws InterruptedException{
        homePageMenu.setSportsNotifications();
    }
    @Test
    public void editorsPicksNotificationsTest() throws InterruptedException{
        homePageMenu.setEditorPickNotifications();
    }
    @Test
    public void pageSixNotificationsTest() throws InterruptedException{
        homePageMenu.setPageSixNotifications();
    }
    @Test
    public void privacyPolicyTest() throws InterruptedException{
        homePageMenu.privacyPolicy();
    }
    @Test
    public void termsAndConditionsTest() throws InterruptedException{
        homePageMenu.termsAndConditions();
    }
}
