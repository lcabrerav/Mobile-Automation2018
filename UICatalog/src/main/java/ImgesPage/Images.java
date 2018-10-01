package ImgesPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Images extends Base {
   @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Duration\"]")public static WebElement imageDuration;
    public void imageDurationFunction(){
        imageDuration.click();
    }
}
