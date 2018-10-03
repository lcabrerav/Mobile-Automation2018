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
    public void menuTest() throws InterruptedException {
        homePageMenu.setMenuSearchBox();
    }
}
