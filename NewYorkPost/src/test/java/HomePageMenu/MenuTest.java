package HomePageMenu;

import HomePage.HomePageMenu;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends Base {

    HomePageMenu homePageMenu;
    @BeforeMethod
    public void init (){
        homePageMenu = PageFactory.initElements(ad,HomePageMenu.class);
    }
    @Test(priority = 2, enabled = false)
    public void menuSearchBoxTest() throws InterruptedException {
        homePageMenu.setMenuSearchBox();
    }
    @Test(priority = 1, enabled = false)
    public void topNewsTest(){
        homePageMenu.setTopNews();
    }
    @Test(priority = 0, enabled = false)
    public void menuNewsTest() throws InterruptedException {
        homePageMenu.setMenuNews();
    }
    @Test(priority = 3, enabled = false)
    public void notificationTest(){
        homePageMenu.setNotifications();
    }
    @Test(priority = 4, enabled = true)
    public void signUpTest() throws InterruptedException {
        homePageMenu.setSignUp();
    }

}
