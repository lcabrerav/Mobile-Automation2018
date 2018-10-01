package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {
 @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]") public static WebElement imageButton;
 @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]") public static WebElement Button;
    public void clickbuttons(){
        Button.click();
    }
    public void setImageButton(){
        imageButton.click();
    }
}
