package HomePageMenu;

import HomePage.HomePageMenu;
import common.Base;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuPage extends Base {

    HomePageMenu homePageMenu;
    @BeforeMethod
    public void initElements(){
        homePageMenu = PageFactory.initElements(ad,HomePageMenu.class);
    }
    @Test
    public void sportsTest() throws InterruptedException {
        homePageMenu.setSports();
    }
    @Test
    public void pageSixTest() throws InterruptedException{
        homePageMenu.setPageSix();
    }
    @Test
    public void businessTest()throws InterruptedException{
        homePageMenu.setBusiness();
    }
    @Test
    public void entertainmentTest() throws InterruptedException{
        homePageMenu.setEntertainment();
    }
    @Test
    public void opinionTest() throws InterruptedException{
        homePageMenu.setOpinion();
    }
    @Test
    public void menuTest(){
        homePageMenu.clickMenu();
    }
    @Test
    public void livingTest() throws InterruptedException{
        homePageMenu.setLiving();
    }
}
