package SearchBarPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class SearchBar extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Use of UIWebView\"]\n")
                public static WebElement searchBarButton;

    public void clickSearch() { searchBarButton.click();}


}
