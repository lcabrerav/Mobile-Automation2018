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
    @Test
    public void menuSearchBoxTest() throws InterruptedException {
        homePageMenu.setMenuSearchBox();
    }
    @Test
    public void topNewsTest(){
        homePageMenu.setTopNews();
    }
    @Test
    public void menuNewsTest() throws InterruptedException {
        homePageMenu.setMenuNews();
    }
    @Test
    public void notificationTest(){
        homePageMenu.setNotifications();
    }
    @Test
    public void signUpTest() throws InterruptedException {
        homePageMenu.setSignUp();
    }
    @Test
    public void sportsNewsTest() throws InterruptedException{
        homePageMenu.setSportsLastestNews();
    }
    @Test
    public void photoTest()throws InterruptedException{
        homePageMenu.setPhotos();
    }
    @Test
    public void photo1Test() throws InterruptedException{
        homePageMenu.setPhotos1();
    }
    @Test
    public void photo2Test() throws InterruptedException{
        homePageMenu.setPhoto2();
    }
}
