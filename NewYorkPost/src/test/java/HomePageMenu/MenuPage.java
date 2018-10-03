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


}
