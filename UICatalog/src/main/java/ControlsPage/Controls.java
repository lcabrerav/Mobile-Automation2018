package ControlsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Controls {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")public static WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")public static WebElement standarSlider;

}
