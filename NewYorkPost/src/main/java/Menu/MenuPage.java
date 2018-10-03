package Menu;

import HomePage.HomePageMenu;
import common.Base;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MenuPage extends Base {
    HomePageMenu homePageMenu;

    List<WebElement> elements = new ArrayList<WebElement>();
    public void page() throws InterruptedException {
        homePageMenu.clickMenu();
        sleep(2);
        elements= ad.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]");
    }
    public LatestStories getLatestStories() throws InterruptedException {
        page();
        elements.get(1).click();
        return new LatestStories();
    }
}
